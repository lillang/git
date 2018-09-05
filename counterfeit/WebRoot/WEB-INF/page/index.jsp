<%@ page language="java" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
    <title>人民币鉴定站 </title>
    <jsp:include page="inc.jsp"></jsp:include>
    <style type="text/css">
     body {
	    font-family:helvetica,tahoma,verdana,sans-serif;
	    padding:20px;
	    font-size:13px;
	    margin:0;
	    background: url("img/2.jpg") 0px -180px;
	    background-size:cover;
	 }
     input{width:150px;}
    </style>
    <script>
    var login_logForm;
    var login_loginDialog;
       $(function(){
    	  login_logForm = $('#login_loginForm').form({
				url : 'user/login',
				success : function(data) {
					data = $.parseJSON(data);
					if(data.status != "200"){
						$.messager.show({
							title : '提示',
							msg : data.msg
						});
					} else {
						login_loginDialog.dialog('close');
						window.location.href = 'main';
// 						window.location.href = '${pageContext.request.contextPath}/f/_main.html';//main.html 配置失效
					}	
				}
			});
    	//创建登录框
		login_loginDialog = $('#user_login_loginDialog').show().dialog({
			modal : true,
			title : '人民币鉴定站',
			closable : false,
			buttons : [ {
				text : '登录',
				handler : function(){
					login_logForm.submit();
				}
			} ]
		}).window('center');
       });
       
    </script>
  </head>
  
  <body>
    <div class="easyui-dialog" id="user_login_loginDialog" style="width:310px;height:200px;padding:10px">
      <div style="overflow: hidden;">
			<div align="center">
				<form method="post" id="login_loginForm">
					<table border="0" align="center">
					<tr><th colspan="2">登录系统</th></tr>
						<tr>
							<th>登录名</th>
							<td><input name="userAccount"  class="easyui-validatebox" data-options="required:true,validType:'length[1,32]'"/></td>
						</tr>
						<tr>
							<th>密码</th>
							<td><input type="password" name="userPassword"  class="easyui-validatebox" data-options="required:true,validType:'length[6,16]'"/></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
    </div>
  </body>
</html>
