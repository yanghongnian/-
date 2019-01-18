$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'jylr/list',
        datatype: "json",
        colModel: [			
			{ label: '货币ID', name: 'id', index: "role_id", width: 45 },
			{ label: '客户名称', name: 'cusName', index: "role_name", width: 75, key: true }
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});




var vm = new Vue({
	el:'#rrapp',
	data:{

		showList: true,
		title:null,
		customer:{
            cusName:""
		}



	},
	methods: {
		query:function () {

        },
		lrjy:function(){
			vm.showList=false;
			vm.title="交易录入";
			vm.customer.cusName=getSelectedRow();

		}




	}
});