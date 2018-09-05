<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script>
   function logout(flag){
		$.ajax({
		url:'${pageContext.request.contextPath}/user/logout',//?serviceType=logoutAction
		success:function(result){
// 		var r = $.parseJSON(result);
		  if(result.status=="200"){
		   $.messager.show({title:'提示',msg:'您已退出成功!即将返回首页...'});
		   setTimeout(function(){
		      window.location.href = '${pageContext.request.contextPath}';
		   }, 1000);
		  }
		}
		});
	}
   
   function changePwd(){
		$('<div/>').dialog({
			href : '${pageContext.request.contextPath}/f/yewu_changepwd.html',
			width : 300,
			height : 180,
			modal : true,
			title : '${sessionScope.session.username}-修改密码',
			buttons : [ {
				text : '修改密码',
				iconCls : 'icon-edit',
				handler : function() {
					var d = $(this).closest('.window-body');
					$('#user_editpwd_editpwdForm').form('submit', {
						url : '${pageContext.request.contextPath}/changePwdAction.html',
						success : function(result) {
							try {
								var r = $.parseJSON(result);
								if (r.success) {
									d.dialog('destroy');
								}
								$.messager.show({
									title : '提示',
									msg : r.msg
								});
							} catch (e) {
								$.messager.alert('提示', result);
							}
						}
					});
				}
			} ],
			onClose : function() {
				$(this).dialog('destroy');
			}
		});
	}
   
   function editUserInfo(){

		$('<div/>').dialog({
			href : '${pageContext.request.contextPath}/f/user_editinfo.html',
			width : 520,
			height : 400,
			modal : true,
			title : '${sessionScope.session.username}-修改个人信息',
			buttons : [ {
				text : '修改密码',
				iconCls : 'icon-edit',
				handler : function() {
					var d = $(this).closest('.window-body');
					$('#user_editpwd_editpwdForm').form('submit', {
						url : '${pageContext.request.contextPath}/f/user_edit.html',
						success : function(result) {
							try {
								var r = $.parseJSON(result);
								if (r.success) {
									d.dialog('destroy');
								}
								$.messager.show({
									title : '提示',
									msg : r.msg
								});
							} catch (e) {
								$.messager.alert('提示', result);
							}
						}
					});
				}
			} ],
			onClose : function() {
				$(this).dialog('destroy');
			}
		});
	  
   }
</script>
<div style="position: absolute;left: 5px;top:0px;bottom:1px;">
	<img src="img/logo.png" style="height:100%;" />
</div>
<div id="sessionInfoDiv" style="position: absolute;right: 45px;top:10px;">
	<c:if test="${sessionScope.UserInfo.userName != null}">[<strong>${sessionScope.UserInfo.userName}</strong>]，欢迎你！</c:if>
</div>
<div style="position: absolute; right: 0px; bottom: 0px; ">
	 <a href="javascript:void(0);" class="easyui-menubutton"
		data-options="menu:'#layout_north_kzmbMenu',iconCls:'icon-help'">设置</a>
	<a href="javascript:void(0);" class="easyui-menubutton"
		data-options="menu:'#layout_north_zxMenu',iconCls:'icon-back'">注销</a>
</div>
<div id="layout_north_kzmbMenu" style="width: 100px; display: none;">
	<!-- <div onclick="showUserInfo();">个人信息</div>
	<div onclick="editUserInfo();">修改个人信息</div> -->
	<div onclick="changePwd();">修改密码</div>
</div>
<div id="layout_north_zxMenu" style="width: 100px; display: none;">
	<!-- <div class="menu-sep"></div> -->
	<div onclick="logout(true);" data-options="">退出系统</div>
</div>
