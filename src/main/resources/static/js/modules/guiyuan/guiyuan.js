var setting = {
    data: {
        simpleData: {
            enable: true,
            idKey: "organId",
            pIdKey: "pid",
            rootPId: -1
        },
        key: {
            url:"nourl",
            name:"organName"

        }
    }
};
var ztree;

var vm = new Vue({
    el:'#rrapp',
    data:{
        showList: true,
        title: null,
        menu:{
            parentName:null,
            pid:0,
            type:1,
            organCode:0
        }
    },
    methods: {
        getMenu: function(){
            //加载菜单树
            $.get(baseURL + "sys/zuzhi/select", function(r){
                ztree = $.fn.zTree.init($("#menuTree"), setting, r.menuList);
                var node = ztree.getNodeByParam("organId", vm.menu.pid);
                ztree.selectNode(node);

                vm.menu.parentName = node.organName;
            })
        },
        add: function(){
            vm.showList = false;
            vm.title = "新增";
            vm.menu = {parentName:null,pid:0,type:1};
            vm.getMenu();
        },
        update: function () {
            var menuId = getMenuId();
            if(menuId == null){
                return ;
            }

            $.get(baseURL + "sys/menu/info/"+menuId, function(r){
                vm.showList = false;
                vm.title = "修改";
                vm.menu = r.menu;

                vm.getMenu();
            });
        },
        del: function () {
            var menuId = getMenuId();
            if(menuId == null){
                return ;
            }

            confirm('确定要删除选中的记录？', function(){
                $.ajax({
                    type: "POST",
                    url: baseURL + "sys/menu/delete",
                    data: "menuId=" + menuId,
                    success: function(r){
                        if(r.code === 0){
                            alert('操作成功', function(){
                                vm.reload();
                            });
                        }else{
                            alert(r.msg);
                        }
                    }
                });
            });
        },
        saveOrUpdate: function () {
            if(vm.validator()){
                return ;
            }

            var url = vm.menu.menuId == null ? "sys/zuzhi/save" : "sys/zuzhi/update";
            $.ajax({
                type: "POST",
                url: baseURL + url,
                contentType: "application/json",
                data: JSON.stringify(vm.menu),
                success: function(r){
                    if(r.code === 0){
                        alert('操作成功', function(){
                            vm.reload();
                        });
                    }else{
                        alert(r.msg);
                    }
                }
            });
        },
        menuTree: function(){
            layer.open({
                type: 1,
                offset: '50px',
                skin: 'layui-layer-molv',
                title: "选择上级机构",
                area: ['300px', '450px'],
                shade: 0,
                shadeClose: false,
                content: jQuery("#menuLayer"),
                btn: ['确定', '取消'],
                btn1: function (index) {
                    var node = ztree.getSelectedNodes();
                    //选择上级菜单
                    vm.menu.pid = node[0].organId;
                    vm.menu.parentName = node[0].organName;
                    console.log(vm.menu.pid)
                    console.log(vm.menu.parentName)
                    layer.close(index);
                }
            });
        },
        reload: function () {
            vm.showList = true;
            Menu.table.refresh();
        },
        validator: function () {
            if(isBlank(vm.menu.organName)){
                alert("机构名称不能为空");
                return true;
            }

            //菜单
            if(vm.menu.organCode === 1 && isBlank(vm.menu.organCode)){
                alert("机构编码不能为空");
                return true;
            }
        }
    }
});


var Menu = {
    id: "organTable",
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
Menu.initColumn = function () {
    var columns = [
        {field: 'selectItem', radio: true},
        {title: '菜单ID', field: 'organId', visible: false, align: 'center', valign: 'middle', width: '80px'},
        {title: '菜单名称', field: 'organName', align: 'center', valign: 'middle', sortable: true, width: '180px'},
        {title: '上级菜单', field: 'parentName', align: 'center', valign: 'middle', sortable: true, width: '100px'}
       ]
    return columns;
};


function getMenuId () {
    var selected = $('#organTable').bootstrapTreeTable('getSelections');
    if (selected.length == 0) {
        alert("请选择一条记录");
        return false;
    } else {
        return selected[0].id;
    }
}


$(function () {
    var colunms = Menu.initColumn();
    var table = new TreeTable(Menu.id, baseURL + "sys/zuzhi/list", colunms);
    table.setExpandColumn(2);
    table.setIdField("organId");
    table.setCodeField("organId");
    table.setParentCodeField("pid");
    table.setExpandAll(false);
    table.init();
    Menu.table = table;
});
