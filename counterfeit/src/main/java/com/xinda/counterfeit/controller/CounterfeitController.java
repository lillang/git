package com.xinda.counterfeit.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.google.gson.JsonArray;
import com.xinda.counterfeit.pojo.Area;
import com.xinda.counterfeit.pojo.TbCounterfeit;
import com.xinda.counterfeit.pojo.TbDevice;
import com.xinda.counterfeit.service.AreaService;
import com.xinda.counterfeit.service.CounterfeitService;
import com.xinda.counterfeit.service.DeviceService;
import com.xinda.counterfeit.utils.BaseResult;
import com.xinda.counterfeit.utils.EUDataGridResult;
import com.xinda.counterfeit.utils.MapBeans;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/counterfeit")
public class CounterfeitController {
	private static Logger log = Logger.getLogger(CounterfeitController.class);
	@Autowired
	private CounterfeitService counterfeitService;
	@Autowired
	private AreaService areaService;
	@Autowired
	private DeviceService deviceService;

	@RequestMapping(value = "/getCounterfeitList")
	@ResponseBody
	public EUDataGridResult getCounterfeitList(Integer page, Integer rows, TbCounterfeit counterfeit,
			String counterfeitCreateBegindate, String counterfeitCreateEnddate) {
		return counterfeitService.getCounterfeitList(page, rows, counterfeit, counterfeitCreateBegindate,
				counterfeitCreateEnddate);
	}

	@RequestMapping(value = "/getCounterfeitListByArea")
	@ResponseBody
	public EUDataGridResult getCounterfeitListByArea(Integer page, Integer rows, TbCounterfeit counterfeit,
			String counterfeitCreateBegindate, String counterfeitCreateEnddate, String area) {
		String resu = getAreaName(area);
		return counterfeitService.getCounterfeitListByArea(page, rows, counterfeit, counterfeitCreateBegindate,
				counterfeitCreateEnddate, resu);
	}

	@RequestMapping(value = "/fileDown")
	public void fileDown(String path, HttpServletRequest request, HttpServletResponse response) throws IOException {
		String pathString = request.getSession().getServletContext().getRealPath("/");
		String root = new File(pathString).getParentFile().getParentFile().getAbsolutePath();
		// 模拟文件，myfile.txt为需要下载的文件
		String filePath = root +"\\file\\"+ path.substring(0, 4)
				+ "\\" + path.substring(4, 6) + "\\" + path.substring(6, 8) +"\\"+ path.substring(8, 14) +"\\" + path;
		
		// 获取输入流
		InputStream bis = new BufferedInputStream(new FileInputStream(new File(filePath)));
		// 转码，免得文件名中文乱码
		path = URLEncoder.encode(path, "UTF-8");
		// 设置文件下载头
		response.addHeader("Content-Disposition", "attachment;filename=" + path);
		// 1.设置文件ContentType类型，这样设置，会自动判断下载文件类型
		response.setContentType("multipart/form-data");
		BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
		int len = 0;
		while ((len = bis.read()) != -1) {
			out.write(len);
			out.flush();
		}
		out.close();
	}

	@RequestMapping(value = "/delCounterfeit")
	@ResponseBody
	public BaseResult delCounterfeit(TbCounterfeit counterfeit) {
		counterfeitService.updateCounterfeit(counterfeit);
		return BaseResult.build(200, "删除成功");
	}

	@RequestMapping(value = "/delsCounterfeit")
	@ResponseBody
	public BaseResult delsCounterfeit(TbCounterfeit counterfeit) {
		counterfeitService.delCounterfeit(counterfeit);
		return BaseResult.build(200, "删除成功");
	}

	@RequestMapping("/getpath")
	@ResponseBody
	public String getPath(HttpServletRequest request) {
		String pathString = request.getSession().getServletContext().getRealPath("/");
		String root = new File(pathString).getParentFile().getParentFile().getAbsolutePath();
		root = root.replaceAll("\\\\", "/");
		return root;
	}

	@RequestMapping(value = "/fileUpload", method = RequestMethod.POST)
	@ResponseBody
	public BaseResult addCounterfeit(@RequestParam(value = "file") MultipartFile[] files,
			@RequestParam(value = "result") MultipartFile[] resultFile, HttpServletRequest request, HttpSession session,
			TbCounterfeit counterfeit) throws FileNotFoundException {
		// 先上传文件再保存假币信息
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int numcode = (int) ((Math.random() * 9 + 1) * 100000);
		log.info("上传文件开始！");
		long startTime = System.currentTimeMillis();
		// 上传文件保存位置
		String pathString = request.getSession().getServletContext().getRealPath("/");
		String root = new File(pathString).getParentFile().getParentFile().getAbsolutePath();
		String rpath = new File(pathString).getParentFile().getParentFile().getAbsolutePath();
		root += "/file/" + String.valueOf(year) + "/" + String.valueOf(month < 10 ? "0" + month : month) + "/"
				+ String.valueOf(day < 10 ? "0" + day : day) + "/" + String.valueOf(numcode);
		String resultPath = rpath + "/file/" + String.valueOf(year) + "/"
				+ String.valueOf(month < 10 ? "0" + month : month) + "/" + String.valueOf(day < 10 ? "0" + day : day)+ "/" + String.valueOf(numcode);;
		// 判断文件夹是否存在
		File file = new File(root);
		if (!file.isDirectory()) {
			// 创建文件夹
			file.mkdirs();
			log.info("创建文件夹：" + root);
		}
		// 批量上传
		for (int i = 0; i < files.length; i++) {
			if (!files[i].getOriginalFilename().isEmpty()) {
				String path = root + "/" + files[i].getOriginalFilename();
				counterfeit.setCounterfeitPicName(files[i].getOriginalFilename());
				log.info("fileName：" + path);
				File newFile = new File(path);
				try {
					// 上传日志
					files[i].transferTo(newFile);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (files.length == 1)
				return BaseResult.build(201, "请选择图片再上传！");
			{
			}

		}
		String res="";
		for (int i = 0; i < resultFile.length; i++) {
			if (!resultFile[i].getOriginalFilename().isEmpty()) {
				 res=resultFile[i].getOriginalFilename().substring(resultFile[i].getOriginalFilename().indexOf('.'),resultFile[i].getOriginalFilename().length());
				 counterfeit.setCounterfeitResName(String.valueOf(numcode)+res);
				 String path = resultPath + "/" +String.valueOf(year)+ String.valueOf(month < 10 ? "0" + month : month) 
						+ String.valueOf(day < 10 ? "0" + day : day) +String.valueOf(numcode)+res;
				log.info("fileName：" + path);
				File f = new File(path);
				
				try {
					resultFile[i].transferTo(f);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (resultFile.length == 1)
				return BaseResult.build(201, "请选择文件再上传！");
			{
			}

		}
		long endTime = System.currentTimeMillis();
		log.info("运行时间：" + String.valueOf(endTime - startTime) + "ms");
		// 保存假币信息
		counterfeit.setCounterfeitCapturedate(Long.valueOf(String.valueOf(new Date().getTime()).substring(0,10)));
		counterfeit.setCounterfeitRecycle(1);
		counterfeit.setCounterfeitCreatedate(Long.valueOf(String.valueOf(counterfeit.getCounterfeitCreatedate()).substring(0,10)));
		counterfeit.setCounterfeitPicture(String.valueOf(year) + String.valueOf(month < 10 ? "0" + month : month)
				+ String.valueOf(day < 10 ? "0" + day : day) + String.valueOf(numcode));
		counterfeit.setCounterfeitCheckresult(counterfeit.getCounterfeitPicture()+res);
		int result = counterfeitService.insert(counterfeit);
		if (result <= 0) {
			log.error("保存失败");
			return BaseResult.build(202, "保存失败");
		}
		return BaseResult.build(200, "上传成功");
	}

	@RequestMapping("/area")
	@ResponseBody
	public BaseResult getArea(Map<String, Object> param, String area) {
		if (area != null && area != "") {
			param = new HashMap<String, Object>();
			param.put("type", area);
		}
		List<Map<String, Object>> list = areaService.retrieveArea(param);
		return BaseResult.build(200, "", list);
	}

	// 假币分析
	@RequestMapping("/analyze")
	@ResponseBody
	public Map<String, Object> getAnalyze(String area) {
		String resu = getAreaName(area);
		Map<String, Object> map = new HashMap<String, Object>();
		if (resu != null && resu != "") {
			int length = resu.length();
			map.put("areaLength", length);
		} else {
			map.put("areaLength", 3);
		}
		List<TbCounterfeit> list = counterfeitService.selectCountfeitAnalyze(map);
		/*
		 * JSONObject json=new JSONObject(); JSONArray jarray=new JSONArray();
		 * for (TbCounterfeit t : list) { json.put("name",
		 * t.getCounterfeitCaptureaddress());
		 * json.put("y",t.getCounterfeitId()); jarray.add(json); }
		 */
		/*
		 * if(list!=null&&list.size()>0){ return BaseResult.build(200,
		 * "",jarray);
		 * 
		 * } // log.info(resu==null?"各省":resu+"假币集合", list); return
		 * BaseResult.build(201, "没有数据",null);
		 */
		Map<String, Object> maps = new HashMap<String, Object>();
		Map<String, Object> map1 = new HashMap<String, Object>();
		List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
		for (TbCounterfeit tbCounterfeit : list) {
			maps.put("name", tbCounterfeit.getCounterfeitCaptureaddress());
			maps.put("y", tbCounterfeit.getCounterfeitId());
			listMap.add(maps);
			maps = new HashMap<String, Object>();
		}
		map1.put("data", listMap);
		@SuppressWarnings("unused")
		String a = "1";
		return map1;
	}

	public String getAreaName(String area) {
		StringBuffer str = new StringBuffer();
		if (area != null) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("codeid", area);
			Area areas = areaService.selectName(map);
			str.insert(0, areas.getCityName());
			if (areas.getParentid() != 0) {
				map.put("codeid", areas.getParentid());
				areas = areaService.selectName(map);
				str.insert(0, areas.getCityName());
			}
			if (areas.getParentid() != 0) {
				map.put("codeid", areas.getParentid());
				areas = areaService.selectName(map);
				str.insert(0, areas.getCityName());
			}
			return str.toString();
		}
		return area;
	}

	// 创建多及目录
	public File createMultilevelDirectory(String[] directories, String rootPath) {
		if (directories.length == 0) {
			return null;
		}
		File root = new File(rootPath);
		for (int i = 0; i < directories.length; i++) {
			File directory = new File(root, directories[i]);
			directory.mkdir();
			root = directory;
		}
		return root;
	}

	public File createFileWithMultilevelDirectory(String[] directories, String fileName, String rootName)
			throws IOException {
		// 调用上面的创建多级目录的方法
		File filePath = createMultilevelDirectory(directories, rootName);
		File file = new File(filePath, fileName);
		file.createNewFile();
		return file;
	}

	public static void main(String[] args) {
		// 先上传文件再保存假币信息
		// Calendar c=Calendar.getInstance();
		// int day=c.get(Calendar.DAY_OF_MONTH);
		// System.out.println(day);
		System.out.println("0" + 1);
	}
	 public File getTmpFile(String fileName) {
	        File tmpDir = FileUtils.getTempDirectory();
	        System.out.println("========"+tmpDir.getAbsolutePath());
	        return new File(tmpDir, fileName);
	    }
	 @RequestMapping(value="/getpic", method = RequestMethod.GET)  
	 public String getpic(String url, HttpServletResponse response,Model model) throws IOException {  
	     response.setContentType("image/jpg"); // 设置返回内容格式  
	     File file = new File(url);       //括号里参数为文件图片路径  
	     if(file.exists()){   //如果文件存在  
	         InputStream in = new FileInputStream(file);   //用该文件创建一个输入流  
	         OutputStream os = response.getOutputStream();  //创建输出流  
	         byte[] b = new byte[1024];    
	         while( in.read(b)!= -1){   
	         os.write(b);       
	         }  
	         in.close();   
	         os.flush();  
	         os.close();  
	     }  
	     return null;  
	 }  
	 @RequestMapping("/map")
	 @ResponseBody
	 public BaseResult map(){
//		 List<Map<String, Object>> map=new ArrayList<Map<String,Object>>();
//		 Map<String, Object> m=new HashMap<String, Object>();
//		 m.put("lnglat", "114.113498,22.540821");
//		 m.put("name", "湖南省");
//		 m.put("id",1);
		 List<MapBeans> list=new ArrayList<MapBeans>();
		 MapBeans m=new MapBeans();
		 m.setLng(114.113498);
		 m.setLat(22.540821);
		 m.setName("湖南省");
		 m.setId(2);
		 list.add(m);
		 MapBeans ms=new MapBeans();
		 ms.setLng(113.92322);
		 ms.setLat(22.544124);
		 ms.setName("湖北省");
		 ms.setId(2); 
		 list.add(ms);
		 MapBeans ms1=new MapBeans();
		 ms1.setLng(114.085947);
		 ms1.setLat(22.547);
		 ms1.setName("深圳市");
		 ms1.setId(1);
		 list.add(ms1);
		 MapBeans ms2=new MapBeans();
		 ms2.setLng(104.065735);
		 ms2.setLat(30.659462);
		 ms2.setName("成都市");
		 ms2.setId(0);
		 list.add(ms2);
		 JSONArray json=JSONArray.fromObject(list);
		 return BaseResult.build(200,json);
	 }
}
