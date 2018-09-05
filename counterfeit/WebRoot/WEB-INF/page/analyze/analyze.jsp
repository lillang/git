 <%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
 <jsp:include page="../inc.jsp"></jsp:include>
   <style>
   .input{
     width: 170px;
   }
   </style>
<script type="text/javascript">
	
/*加载省市地区*/
function loadAreaFinds(){
	$('#area-combotreeFind').combotree({
		url:'${pageContext.request.contextPath}/counterfeit/area',
		loadFilter:function(data){
			var  ars=[];
			if(data.status=="200"){
				ars=data.data;
			
			}else{
				ars=data;
			}
			return converth(ars);
		},
		
		onChange:function(record){  
		
		//myArray[0]=$('#area-combotree').combotree('getValue');
		
		//$('#cul_num').val(myArray.join(''))
		
			
		},
		onLoadSuccess:function(node,data){  
			
	    }
	});	

}

//将数据转换为树形结构的数据
function converth(ars){
	var addres=[];
	for(var i=0;i<ars.length;i++){
		var ar=ars[i];
		if(ar.children){
			var data={
				id:ar.codeid,
				text:ar.cityName,
				state:'closed',
				children:converth(ar.children)
			};
			addres.push(data);
		}else{
			var data={
				id:ar.codeid,
				text:ar.cityName
			};
			addres.push(data);
		}
	}
 
	return addres;
}
	
	$(function() {
		var arr = [];
		$.ajax({
            type:"post",
            dataType: "json",
            url:'${pageContext.request.contextPath}/counterfeit/analyze',//提供数据的Servlet
            success:function(data){
//                 if(data.status=="200"){
//                 	data=data.data;
//                 }
//                 var browsers = [];
//                 //迭代，把异步获取的数据放到数组中
//                /*  $.each(data,function(i,d){
//                     browsers.push({name:d.name,value:d.value});
//                 	   browsers[i]=d['data'];
//                 	   chart.series[i].setData(browsers);
//                 }); */
//                 for(var i=0;i<data.length;i++)
//                 {
//                     for(var key in data[i]){
//                         browsers.push({"name":key,"y":data[i][key]});  //饼图这里是name和y，条形图和折线图的话是name和data
//                     }
//                 }
//                 chart.series[0].setData(browsers);
// 				alert(data.data.length);
				
            	 $('#gradeContrastDiv').highcharts().series[0].setData(data.data);
                
            },
            error:function(e){
                alert(e);
            }
        });

		
		$('#gradeContrastDiv').highcharts({
	        chart: {
	            plotBackgroundColor: null,
	            plotBorderWidth: null,
	            plotShadow: false,
	            type: 'pie'
	        },
			credits:{
	   	  		enabled:false // 禁用版权信息
			},
	        title: {
	            text: '2017年各省假币收集饼状对比图'
	        },
	        tooltip: {
	            headerFormat: '{series.name}<br>',
	            pointFormat: '{point.name}:{point.y} 占比:<b>{point.percentage:.1f}%</b>'
	        },
	        plotOptions: {
	            pie: {
	                allowPointSelect: true,
	                cursor: 'pointer',
	                dataLabels: {
	                    enabled: true,
	                    format: '<b>{point.name}</b>: {point.percentage:.1f} %',
						style: {
							color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
	                	},
	                },
	                showInLegend: true
	            }
	        },
	        series: [{
	            name: '2017年各省假币收集饼状对比图',
	            colorByPoint: true,
	            data:[]
	        }
	                 ]
	       
	    });
// 		showDate();
	//条形图
		$.ajax({
		    type:"post",
            url:'${pageContext.request.contextPath}/counterfeit/analyze',//提供数据的Servlet
			dataType:"json",
			cache:false,
			async:false,
			success:function(res){
				  var num=[];//假币数量
				  var place=[];//出现地区
				  var carrierName=[];//横坐标
					for(var i = 0; i<res.data.length;i++){
			    	num.push(parseFloat(res.data[i].name));
			    	carrierName.push(res.data[i].name);
			    	place.push(res.data[i].y);
			    };
	  	     $('#container').highcharts({
	  	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           chart: {
	  	            type: 'column'
	  	        },
	  	        title: {
	  	        	text: '2017年各省假币收集条形对比图'
	  	        },
	  	      credits:{
	     	  		enabled:false // 禁用版权信息
	  			},

	  	        subtitle: {
// 	  	            text: '数据来源: wechat.com'
	  	        },
	  	        xAxis: {
	  	            categories: carrierName,
	  	            crosshair: true
	  	        },
	  	        yAxis: {
	  	            min: 0,
	  	            title: {
	  	                text: '假币(张)'
	  	            }
	  	        },
	  	      legend: {
	  	        enabled: false
	  	    },
	  	        tooltip: {
	  	          	pointFormat: '假币总量: <b>{point.y:f} 张</b>',
	  	            shared: true,
	  	            useHTML: true
	  	        },
	  	        plotOptions: {
	  	            column: {
	  	                pointPadding: 0.2,
	  	                borderWidth: 0
	  	            }
	  	        },
	  	        series: [{
	  	          name: '总张数',
	  	          data:num,
	  	        color: 'PaleTurquoise',
	  	        }
	  	        ,{
	  	        	name:'发现地',
	  	        	data:place,
	  	        	color: 'PaleTurquoise',
	  	        },{
	  	        	 dataLabels: {
	  	               enabled: true,
	  	               rotation: -90,
	  	              
	  	               align: 'right',
	  	               format: '{point.y:f}', // :.1f 为保留 1 位小数
	  	               y: 10
	  	           }

	  	        }
	  	        
	  	        ]
	  	        
	  	        
	  	    });
			},error:function(){
				
			}
		});
		$.ajax({
		    type:"post",
            url:'${pageContext.request.contextPath}/counterfeit/analyze',//提供数据的Servlet
			dataType:"json",
			cache:false,
			async:false,
			success:function(res){
				  var num=[];//假币数量
				  var place=[];//出现地区
				  var carrierName=[];//横坐标
					for(var i = 0; i<res.data.length;i++){
			    	num.push(parseFloat(res.data[i].name));
			    	carrierName.push(res.data[i].name);
			    	place.push(res.data[i].y);
			    };
			    $('#line').highcharts({
	                chart: {
	                    type: 'line'
	                },
	                title: {
	                    text: '各省假币折线图'
	                },
	                subtitle: {
// 	                    text: 'Source: 人民币分析平台'
	                },
	                xAxis: {
	                    categories:carrierName
	                },
	                yAxis: {
	                    title: {
	                        text: '假币数量(张)'
	                    },
	                    plotLines: [{
	                        value: 0,
	                        width: 1,
	                        color: '#808080'
	                    }]
	                },
	                credits: {
	                    enabled: false // 清除HighChart logo 
	                },
	                plotOptions: {
	                    series: {
	                        cursor: 'pointer',
	                        events: {
	                            click: function (event) {
	                                $("#result").html("<b>Result : index = " + event.point.x + " , series = " + this.name + ', x = ' + event.point.category + ' ,y = ' + event.point.y + "</b>");//点击显示数据                              
	                            }
	                        }
	                
	                    }
	                },
	                series:[{
	  	  	          name: '总张数',
		  	          data:num,
		  	        color: 'PaleTurquoise',
		  	        }
		  	        ,{
		  	        	name:'发现地',
		  	        	data:place,
		  	        	color: 'PaleTurquoise',
		  	        },{
		  	        	 dataLabels: {
		  	               enabled: true,
		  	               rotation: -90,
		  	              
		  	               align: 'right',
		  	               format: '{point.y:f}', // :.1f 为保留 1 位小数
		  	               y: 10
		  	           }

		  	        }
		  	        
		  	        ]          
	            });
			},error:function(){
				
			}
		});
		
	});
	
	 




</script>
		<script src="${pageContext.request.contextPath}/js/jquery-1.8.2.min.js"></script>
		<script src="${pageContext.request.contextPath}/js/highcharts.js"></script>
		<script src="${pageContext.request.contextPath}/js/exporting.js"></script>
		<script src="${pageContext.request.contextPath}/js/highcharts-zh_CN.js"></script>
<!-- 		<script src="https://img.hcharts.cn/highcharts/highcharts.js"></script> -->
        <script src="https://img.hcharts.cn/highcharts/modules/exporting.js"></script>
        <script src="https://img.hcharts.cn/highcharts-plugins/highcharts-zh_CN.js"></script>
	<!-- <div data-options="region:'north',title:'查询条件',border:false" style="height: 100px;overflow: hidden;background-color: #F4F4F4;">
	    <form id="data_show_searchForm" method="post" data-options="novalidate:true">
	    	<table cellpadding="2">
	    		<tr>
	    			<td>地区:</td>
			    			<td colspan="2">
								<input type="text" id="area-combotreeFind" name="area" class="easyui-textbox" style="width:300px"></input>
								<script type="text/javascript">
			   					loadAreaFinds();
								</script>
					</td>
	    			<td width='20px'></td>
				</tr>
	    	</table>
	    </form>
	    </div> -->
	<div id="gradeContrastDiv" style="min-width:300px;height:380px"></div>
	<div style="height:200px"></div>
	<div id="container" style="min-width:400px;height:400px"></div>
	<div style="height:200px"></div>
	<div id="line" style="min-width:400px;height:400px"></div>
