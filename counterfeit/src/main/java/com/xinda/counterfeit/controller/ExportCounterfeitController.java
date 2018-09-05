package com.xinda.counterfeit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.xinda.counterfeit.pojo.Area;
import com.xinda.counterfeit.pojo.TbCounterfeit;
import com.xinda.counterfeit.service.AreaService;
import com.xinda.counterfeit.service.CounterfeitService;
import com.xinda.counterfeit.utils.BaseResp;
import com.xinda.counterfeit.utils.EUDataGridResult;
import com.xinda.counterfeit.utils.ExportExcel;


/**
 * 
 * @title: ExportCounterfeitController
 * @Description: 导出excel控制类
 * @author: lilanglang
 * @date:   2018年8月30日
 */
@Controller
@RequestMapping("/exportForm")
public class ExportCounterfeitController {
	@Autowired
	private CounterfeitService counterfeitService;
	@Autowired
	private AreaService areaService;
	/**
	 * Destruction of the servlet. <br>
	 *//*
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	*//**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 *//*
	@RequestMapping("/ecl")
	@ResponseBody
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try{
		response.setContentType("text/html");
		Map<String, Object> param =new HashMap<String, Object>();
			for (Entry<String, String[]> attr : request.getParameterMap().entrySet()) {
	    		for (String attrVal : attr.getValue()) {
	    			if(attrVal != null && !attrVal.equals("")){
	    				param.put(attr.getKey(), java.net.URLDecoder.decode(new String(attrVal.getBytes("iso-8859-1"),"utf-8"),"UTF-8" ));
	    			}	
	    		}
	    	}
			String title="";
			String fileName="";
			String[] rowsName=null;
			List<Object[]> dataList=null;
			 String dataStr=new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			 title = "假币信息汇总表("+dataStr+")";
			 fileName=title;
	         rowsName = new String[]{"序号","发布时间","假币时间","冠字号","币种","版别","面额","假币类型","设备序列号","鉴定行名称","鉴定地址","收缴行名称","收缴行地址"};
			WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
			CounterfeitService counterfeitService = (CounterfeitService)ctx.getBean("CounterfeitService");
			int page=(Integer) request.getAttribute("page");
			int rows=(Integer) request.getAttribute("rows");
			String counterfeitCreateBegindate=(String) request.getAttribute("sendDateBegin");
			String counterfeitCreateEnddate=(String) request.getAttribute("sendDateEnd");
			TbCounterfeit c=new TbCounterfeit();
			EUDataGridResult result=counterfeitService.getCounterfeitList(page, rows, c, counterfeitCreateBegindate, counterfeitCreateEnddate);
			List<TbCounterfeit> list=(List<TbCounterfeit>) result.getRows();
			 	dataList=new ArrayList<Object[]>();
	            for (TbCounterfeit item : list) {
	            	Object[] obj=new Object[rowsName.length];
	            	obj[0]=item.getCounterfeitId();
	            	for (int i = 0; i < obj.length; i++) {
						if(obj[i]==null){
							obj[i]=" ";
						}
					}
	        			dataList.add(obj);
	        		}
	         ExportExcel ex = new ExportExcel(fileName,title, rowsName,  dataList);
	         ex.export(response);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	private String strUp(int data) {
		String resultStr="";
		if((data+"").length()==2){
			resultStr=data+"";
		}else{
			resultStr="0"+data;
		}
		return resultStr;
	}

	*//**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 *//*
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	*//**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 *//*
	public void init() throws ServletException {
		// Put your code here
	}
*/
	@RequestMapping("/ecl")
	public void export(HttpServletRequest request,HttpServletResponse response,Integer page,Integer rows ,TbCounterfeit c,String counterfeitCreateBegindate,String counterfeitCreateEnddate){
		try{
			response.setContentType("text/html");
			Map<String, Object> param =new HashMap<String, Object>();
				for (Entry<String, String[]> attr : request.getParameterMap().entrySet()) {
		    		for (String attrVal : attr.getValue()) {
		    			if(attrVal != null && !attrVal.equals("")){
		    				param.put(attr.getKey(), java.net.URLDecoder.decode(new String(attrVal.getBytes("iso-8859-1"),"utf-8"),"UTF-8" ));
		    			}	
		    		}
		    	}
				String title="";
				String fileName="";
				String[] rowsName=null;
				List<Object[]> dataList=null;
				 String dataStr=new SimpleDateFormat("yyyy-MM-dd").format(new Date());
				 title = "假币信息汇总表("+dataStr+")";
				 fileName=title;
		         rowsName = new String[]{"序号","发布时间","假币上缴时间","冠字号","币种","版别","面额","假币类型","设备序列号","鉴定行名称","鉴定地址","收缴行名称","收缴行地址"};
//				TbCounterfeit c=new TbCounterfeit();
				EUDataGridResult result=counterfeitService.getCounterfeitList(page, rows, c, counterfeitCreateBegindate, counterfeitCreateEnddate);
				List<TbCounterfeit> list=(List<TbCounterfeit>) result.getRows();
				 	dataList=new ArrayList<Object[]>();
		            for (TbCounterfeit item : list) {
		            	Object[] obj=new Object[rowsName.length];
		            	SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");
		            	obj[0]=fmt.format(item.getCounterfeitCreatedate());
		            	obj[1]=item.getCounterfeitCapturedate()!=null?fmt.format(item.getCounterfeitCapturedate()):"未上缴";
		            	obj[2]=item.getCounterfeitSerialnum();
		            	obj[3]=item.getCounterfeitCurrency();
		            	obj[4]=item.getCounterfeitBottle();
		            	obj[5]=item.getCounterfeitMoney();
		            	if(item.getCounterfeitType()==0){
			            	obj[6]="变造拼接假币";
		            	}else if(item.getCounterfeitType()==1){
		            		obj[6]="伪造机制假币";
		            	}
		            	obj[7]=item.getTbDevice().getDeviceAccount();
		            	obj[8]=item.getTbDevice().getDeviceBank();
		            	obj[9]=item.getTbDevice().getDeviceDetailed();
		            	obj[10]=item.getCounterfeitCapturename();
		            	obj[11]=item.getCounterfeitCaptureaddress();
		            	for (int i = 0; i < obj.length; i++) {
							if(obj[i]==null){
								obj[i]=" ";
							}
						}
		        			dataList.add(obj);
		        		}
		         ExportExcel ex = new ExportExcel(fileName,title, rowsName,  dataList);
		         ex.export(response);
			}catch (Exception e) {
				// TODO: handle exception
			}
		
	}
	//导出任务预警表
	@RequestMapping("/exportWarnList")
	public void exportWarnList(HttpServletRequest request, HttpServletResponse response,Integer page,Integer rows ,TbCounterfeit c,String counterfeitCreateBegindate,String counterfeitCreateEnddate,String area){
		try {
			StringBuffer str=new StringBuffer();
			String title="";
			String dataStr=new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			if(area!=null&&area!=""){
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("codeid", area);
			Area areas=areaService.selectName(map);
			str.insert(0,areas.getCityName());
			if(areas.getParentid()!=0){
				map.put("codeid", areas.getParentid());
				areas=areaService.selectName(map);
				str.insert(0,areas.getCityName());
			}if(areas.getParentid()!=0){
				map.put("codeid", areas.getParentid());
				areas=areaService.selectName(map);
				str.insert(0,areas.getCityName());
			}
			title=str+"假币汇总表"+dataStr;
			}else{
				title="全国假币汇总表"+dataStr;
			}
			response.setContentType("text/html");
			Map<String, Object> param =new HashMap<String, Object>();
				for (Entry<String, String[]> attr : request.getParameterMap().entrySet()) {
		    		for (String attrVal : attr.getValue()) {
		    			if(attrVal != null && !attrVal.equals("")){
		    				param.put(attr.getKey(), java.net.URLDecoder.decode(new String(attrVal.getBytes("iso-8859-1"),"utf-8"),"UTF-8" ));
		    			}	
		    		}
		    	}
				
				String fileName="";
				String[] rowsName=null;
				List<Object[]> dataList=null;
				 fileName=title;
		         rowsName = new String[]{"序号","假币出现次数","鉴定行名称","鉴定地址","收缴行名称","收缴行地址"};
//				TbCounterfeit c=new TbCounterfeit();
				EUDataGridResult result=counterfeitService.getCounterfeitListByArea(1, 20, c, counterfeitCreateBegindate, counterfeitCreateEnddate,area==null?area:str.toString());
				List<TbCounterfeit> list=(List<TbCounterfeit>) result.getRows();
				 	dataList=new ArrayList<Object[]>();
		            for (TbCounterfeit item : list) {
		            	Object[] obj=new Object[rowsName.length];
		            	obj[0]=item.getCounterfeitId();
		            	obj[1]=item.getTbDevice().getDeviceBank();
		            	obj[2]=item.getTbDevice().getDeviceDetailed();
		            	obj[3]=item.getCounterfeitCapturename();
		            	obj[4]=item.getCounterfeitCaptureaddress();
		            	for (int i = 0; i < obj.length; i++) {
							if(obj[i]==null){
								obj[i]=" ";
							}
						}
		        			dataList.add(obj);
		        		}
		         ExportExcel ex = new ExportExcel(fileName,title, rowsName,  dataList);
		         ex.export(response);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
