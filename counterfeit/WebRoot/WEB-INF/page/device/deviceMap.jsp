 <%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!doctype html>
<html lang="en" >
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="chrome=1">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">
    <link rel="stylesheet" href="//a.amap.com/jsapi_demos/static/resource/commonStyle.css"/>
    <title>海量麻点</title>
  </head>
  <body >
    <div id="container" class="map" tabindex="0"></div>
    <div class="button-group">
      <input type="button" class="button" value="单一图标" onclick = 'setStyle(0)'/>
      <input type="button" class="button" value="多个图标" onclick = 'setStyle(1)'/>
    </div>
    <script type="text/javascript" src = 'https://a.amap.com/jsapi_demos/static/citys.js'></script> 
    <script type="text/javascript" src = 'https://webapi.amap.com/maps?v=1.4.8&key=88cd1cf66b89638e7a2af0c4c66a82b7'></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.2.min.js" charset="utf-8"></script>
    
    <script type="text/javascript">
    
      var map = new AMap.Map('container', {
        zoom: 4,
        center: [102.342785, 35.312316]
      });
    
      var massMarks = [];
      
      $.ajax({
    	  url:"../counterfeit/map",
    	  success:function(data){
//     		  alert(JSON.stringify(data.jsonArray));
    		  for(var i=0;i<data.jsonArray.length;i++){
	            	var point={'lnglat':[data.jsonArray[i].lng,data.jsonArray[i].lat],'name':data.jsonArray[i].name,'id':data.jsonArray[i].id};
	            	massMarks.push(point);

	            }
    		  alert(JSON.stringify(massMarks));
  					var style = [{
                      url: 'https://a.amap.com/jsapi_demos/static/images/mass0.png',
                      anchor: new AMap.Pixel(6, 6),
                      size: new AMap.Size(11, 11)
                    },{
                      url: 'https://a.amap.com/jsapi_demos/static/images/mass1.png',
                      anchor: new AMap.Pixel(4, 4),
                      size: new AMap.Size(7, 7)
                    },{
                      url: 'https://a.amap.com/jsapi_demos/static/images/mass2.png',
                      anchor: new AMap.Pixel(3, 3),
                      size: new AMap.Size(5, 5)
                    }
                  ];
  		var mass = new AMap.MassMarks(massMarks, {
      			opacity:0.8,
      			zIndex: 222,
      			cursor:'pointer',
      			style:style

			});

                     

	var marker = new AMap.Marker({content:' ',map:map});
			 mass.on('mouseover',function(e){
 	 		 marker.setPosition(e.data.lnglat);
  			 marker.setLabel({content:e.data.name})
				})

			 mass.setMap(map); 
			   var setStyle = function(multiIcon) {
			        if(multiIcon){
			          mass.setStyle(style);
			        }
			        else{
			          mass.setStyle(style[2]);
			        }
			   }
    	  }
      })
      
//      var mass = new AMap.MassMarks(data.jsonArray, {
//     	            opacity:0.8,
//     	            zIndex: 111,
//     	            cursor:'pointer',
//     	            style:style
//     	      });
//       var marker = new AMap.Marker({content:' ',map:map})
//       mass.on('mouseover',function(e){
//         marker.setPosition(e.data.lnglat);
//         marker.setLabel({content:e.data.name})
//       })
//       mass.setMap(map);
//       var setStyle = function(multiIcon) {
//         if(multiIcon){
//           mass.setStyle(style);
//         }else{
//           mass.setStyle(style[2]);
//         }
//       }
    </script>
  </body>
</html>