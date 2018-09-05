function parseXML(text){
	try{ //Internet Explorer
		xmlDoc=new ActiveXObject("Microsoft.XMLDOM");
		xmlDoc.async="false";
		xmlDoc.loadXML(text);
	}catch(e){
		console.info(e.message);
		try{ //Firefox, Mozilla, Opera, etc.
			parser=new DOMParser();
			xmlDoc=parser.parseFromString(text,"text/xml");
		}catch(e){
			alert(e.message);
			return;
		}
	}
//	console.info(xmlDoc.getElementsByTagName("respcode")[0].childNodes[0].nodeValue);
//	console.info(xmlDoc.getElementsByTagName("respmsg")[0].childNodes[0].nodeValue);
	return xmlDoc;
}

function eachXML(xmlDoc){
	var x=xmlDoc.documentElement.childNodes;
	for (var i=0;i<x.length;i++){ 
		if (x[i].nodeType==1){
			//Process only element (nodeType 1) nodes
			document.write(x[i].nodeName + ": ");
			document.write(x[i].childNodes[0]!=null?x[i].childNodes[0].nodeValue:"");
			document.write("<br />");
		} 
	}
}

var loadXML = function(xmlFile){  
    var xmlDoc=null;  
    var agent = navigator.userAgent.toLowerCase();  
    //判断浏览器的类型  
    //支持IE浏览器  
    if(agent.indexOf("msie") > 0){  
        var xmlDomVersions = ['MSXML.2.DOMDocument.6.0','MSXML.2.DOMDocument.3.0','Microsoft.XMLDOM'];  
        for(var i=0;i<xmlDomVersions.length;i++){  
            try{  
                xmlDoc = new ActiveXObject(xmlDomVersions[i]);  
                break;  
            }catch(e){  
            	alert(e.message);
            }  
        }
    } else if(agent.indexOf("firefox") > 0){  //支持firefox浏览器  
        try{  
            xmlDoc = document.implementation.createDocument('','',null);  
        }catch(e){  
        }  
    } else{//谷歌浏览器  
        var oXmlHttp = new XMLHttpRequest() ;  
        oXmlHttp.open( "GET", xmlFile, false ) ;  
        oXmlHttp.send(null) ;   
        return oXmlHttp.responseXML;  
    }  
    if(xmlDoc!=null){  
        xmlDoc.async = false;  
        xmlDoc.load(xmlFile);  
    }   
    return xmlDoc;  
} 