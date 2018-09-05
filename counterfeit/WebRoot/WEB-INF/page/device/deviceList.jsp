 <%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
 <jsp:include page="../inc.jsp"></jsp:include>
   <style>
   .input{
     width: 170px;
   }
   </style>
<script type="text/javascript">

	$(function() {
		//初始加载数据
		$('#data_datagrid').datagrid({
			url : '../device/getDeviceList',
			queryParams : {
			},
			idField : 'deviceId',
			fit : true,
			fitColumns : false,
			border : false,
			sortName : 'deviceAddress',
			sortOrder : 'asc',
			singleSelect:false,          //是否单选
			rownumbers:true,            //显示行号 
			striped:true,   //斑马线效果
			remoteSort:false,    //是否服务器端排序，设成false才可以在页面进行排序
			nowrap : false,
			pagination : true,
			autoRowHeight:false,
			pageSize : 20,
			columns : [[{
					field : 'deviceId',
					title : '编号',
					hidden : true,
				},{
					field : 'deviceAccount',
					title : '设备序列号',
					sortable : true,
					halign: 'center',
					width : 110
				},{
					field : 'deviceBank',
					title : '网点名称',
					sortable : true,
					halign: 'center',
					width : 180
				},{
					field : 'deviceAddress',
					title : '网点地址',
					sortable : true,
					halign: 'center',
					width : 150
				},{
					field : 'deviceDetailed',
					title : '网点详细地址',
					sortable : true,
					halign: 'center',
					width : 220
					}
				]]
		});
		
	   /**
		* 分页
		*/
		var p = $('#data_datagrid').datagrid('getPager');  
                $(p).pagination({  
                pageSize: 20,//每页显示的记录条数，默认为5  
                pageList: [ 10, 20, 30, 40, 50 ],//可以设置每页记录条数的列表  
                beforePageText: '第',//页数文本框前显示的汉字  
                afterPageText: '页    共 {pages} 页',  
                displayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录'
            }); 
	});


	/**
	 * 查询
	 */
	function data_serarchFun() {
		$('#data_datagrid').datagrid('uncheckAll').datagrid('unselectAll').datagrid('clearSelections');
		$('#data_datagrid').datagrid('load',{    
			deviceAccount : $("#deviceAccount").val(),
			deviceBank : $("#deviceBank").val(),
			deviceDetailed : $("#deviceDetailed").val(),
		});
	}
	
	/**
	 * 清空
	 */
	function data_clear() {
		$('#data_datagrid').datagrid('uncheckAll').datagrid('unselectAll').datagrid('clearSelections');
		$("#deviceAccount").val(""),
		$("#deviceBank").val(""),
		$("#deviceDetailed").val(""),
		data_serarchFun();
	}
	
	//时间控件添加清空
$.fn.datetimebox.defaults.cleanText = '清空';

(function ($) {
    var buttons = $.extend([], $.fn.datetimebox.defaults.buttons);
    buttons.splice(1, 0, {
        text: function (target) {
            return $(target).datetimebox("options").cleanText;
        },
        handler: function (target) {
            $(target).datetimebox("setValue", "");
            $(target).datetimebox("hidePanel");
        }
    });
    $.extend($.fn.datetimebox.defaults, {
        buttons: buttons
    });

})(jQuery);
</script>
<div class="easyui-layout" data-options="fit : true,border : false">
	<div data-options="region:'north',title:'查询条件',border:false" style="height: 60px;overflow: hidden;background-color: #F4F4F4;">
	    <form id="data_show_searchForm" method="post" data-options="novalidate:true">
	    	<table cellpadding="1">
	    		<tr>
	    			<td width='10px'></td>
	    			<td>设备序列号：</td>
	    			<td>
	    				<input id="deviceAccount" class="easyui-numberbox" style="width:100px;" maxlength="13">
	    			</td>
	    			<td width='20px'></td>
	    			<td>网点名称：</td>
	    			<td>
	    				<input id="deviceBank" class="easyui-textbox" style="width:100px;" >
	    			</td>
	    			<td>网点地址：</td>
	    			<td>
	    				<input id="deviceDetailed" class="easyui-textbox" style="width:100px;" >
	    			</td>
	    			<td><a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="data_serarchFun();">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-reload',plain:true" onclick="data_clear();">清空</a></td>
				</tr>
	    	</table>
	    </form>
	</div>
	<div data-options="region:'center',border:false">
		<table id="data_datagrid"></table>
	</div>
</div>