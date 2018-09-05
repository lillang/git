<%@ page language="java" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
    <title>人民币鉴定站</title>
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
	<jsp:include page="inc.jsp"></jsp:include>
	<script type="text/javascript" charset="utf-8"> 
	$(function(){
		$("#west,#center").hide();
		 if('${sessionScope.UserInfo.userName}' == null||'${sessionScope.UserInfo.userName}'=="")
		{
			$.messager.show({
						title : '提示',
						msg : '您还未登录!请登录后操作...'
					});
			   setTimeout(function(){
			      window.location.href = '${pageContext.request.contextPath}';
			   }, 1000);
		}else {
			$("#west,#center").show();
			/* $.messager.show({
				title : '提示',
				width:230,
				height:150,
				msg : function(){
				    var msg ='${sessionScope.session.username}'+' 您好!<br/>';
				     if('${sessionScope.session.latestlogintime}' != null && '${sessionScope.session.latestlogintime}' != ''
				     		&& '${sessionScope.session.latestlogintime}' != '0'){
				       msg += '上次登陆时间: '+ '${sessionScope.session.latestlogintime}' + '<br/>';
				     }else{
				    	 msg += '欢迎你首次登陆系统!~'+'<br/>';
				     }
				     
				     return msg;
				  }
				}); */
// 			var $body = "";	
		}
	});
	
	</script>
  </head>
  
  <body class="easyui-layout" style="min-width: 1000px">
    <div data-options="region:'north',href:'layout/north'" style="height: 60px;overflow: hidden; background: url('img/blue_meigui.jpg') repeat top;background-size:100%;"></div>
	<div id="west" data-options="region:'west',title:'功能导航',href:'layout/menu'" style="width: 200px;overflow: hidden;"></div>
	<div id="center" data-options="region:'center',title:'欢迎使用本系统',href:'layout/center'" style="overflow: hidden;"></div>
	<div data-options="region:'south',href:'layout/south'" style="height: 25px;overflow: hidden;"></div>
  </body>
</html>
