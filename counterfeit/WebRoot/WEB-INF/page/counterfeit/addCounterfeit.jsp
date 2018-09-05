 <%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=utf-8"%>
<script>
function loadFile(){
    $("#addForm").form('submit', {
            type:"post",  //提交方式    
            url:"${pageContext.request.contextPath}/counterfeit/fileUpload", //请求url
            success:function(data)
            { //提交成功的回调函数   
                var data =eval('(' + data + ')');
                $.messager.alert({  title:'提示',
                        msg: data.resultMsg,
                               icon:'info',
                        });
            }    
        });  
    }
</script>
<style>
	select{width: 160px;}
</style>
<div style="padding:10px 30px 20px 30px;" >
	<form id="addForm"  method="post" enctype="multipart/form-data" >
		<table cellpadding="5">
			<tr>
				<td>冠字号：</td>
				<td><input  type="text" class="easyui-textbox" id="account" name="counterfeitSerialnum" data-options="required:true"/> </td>
			</tr>
			<tr>
				<td>发布时间：</td>
				<td><input name="dateTime" id="createDate" class="easyui-datebox" data-options="editable:false" ></td>
			</tr>
			<tr>
				<td>设备序列号：</td>
				<td><input type="text" id="counterfeitDeviceid"  name="counterfeitDeviceid"/></td>
			</tr>
			<tr>
				<td>币种：</td>
				<td>
				<input  name="counterfeitCurrency" id="counterfeitCurrency" class="easyui-textbox"  data-options="required:true"/>
				</td>
			</tr>
			<tr>
				<td>版别：</td>
				<td><input type="text" class="easyui-textbox" id="counterfeitBottle" name="counterfeitBottle" data-options="required:true"/></td>
			</tr>
			<tr>
				<td>面额：</td>
				<td><select  class="easyui-combobox" id="counterfeitMoney" name="counterfeitMoney" data-options="required:true">
						<option value="10">10元</option>
						<option value="20">20元</option>
						<option value="50">50元</option>
						<option value="100">100元</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>假币性质：</td>
				<td><select  class="easyui-combobox" id="counterfeitType" name="counterfeitType" data-options="required:true">
						<option value="1">伪造机制假币</option>
						<option value="0">变造拼接假币</option>
	    				</select>
				</td>
			</tr>
			<tr>
				<td>收缴行名称：</td>
				<td>
				<input type="text" class="easyui-textbox" id=counterfeitCapturename name="counterfeitCapturename"/>
				</td>
			</tr>
			<tr>
				<td>收缴行地址：</td>
				<td>
				<input type="text" class="easyui-textbox" id=counterfeitCaptureaddress name="counterfeitCaptureaddress"/>
				</td>
			</tr>
			<tr>
				<td>鉴定结果：</td>
				<td>
				<input id="result" name="result" type="file"/>
				</td>
			</tr>
			<tr>
				<td>图片文件：</td>
				<td>
<!-- 				<input type="text" id=userRoleid name="userRoleid"/> -->
					<input id="file" name="file" type="file" multiple="true"/>
<!-- 					 <input type="button" onclick="loadFile();" value="上传文件" /> -->
				</td>
			</tr>
		</table>
	</form>
</div>
<script>
$(document).ready(function(){

    queryXzqh();   

  })

  function queryXzqh(){
	debugger;
	$("#counterfeitDeviceid").combobox({

 

  url:encodeURI("../device/getDevice"),//获取数据

  // 向服务器请求的模式 

  method : "post",

  valueField: 'device_id',

  textField: 'device_account', 

  });

  }
</script>