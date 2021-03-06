package com.xinda.counterfeit.utils;

import net.sf.json.JSONArray;

//import java.util.List;

//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @ClassName JsonUtils
 * @Description TODO(自定义响应结构)
 * @author Qin
 * @Date 2018-7-27下午3:57:35
 */
public class BaseResult {

    // 定义jackson对象
//    private static final ObjectMapper MAPPER = new ObjectMapper();

    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;
    
    private JSONArray jsonArray;
    public static BaseResult build(Integer status, String msg, Object data) {
        return new BaseResult(status, msg, data,null);
    }
    public static BaseResult build(Integer status,JSONArray jsonArray) {
        return new BaseResult(status,null,null,jsonArray);
    }
    public static BaseResult ok(Object data) {
        return new BaseResult(data);
    }

    public static BaseResult ok() {
        return new BaseResult(null);
    }

    public BaseResult() {

    }

    public static BaseResult build(Integer status, String msg) {
        return new BaseResult(status, msg, null,null);
    }

    public BaseResult(Integer status, String msg, Object data,JSONArray jsonArray) {
        this.status = status;
        this.msg = msg;
        this.data = data;
        this.jsonArray=jsonArray;
    }

    public BaseResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

//    public Boolean isOK() {
//        return this.status == 200;
//    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

	public JSONArray getJsonArray() {
		return jsonArray;
	}

	public void setJsonArray(JSONArray jsonArray) {
		this.jsonArray = jsonArray;
	}

    /**
     * 将json结果集转化为BaseResult对象
     * 
     * @param jsonData json数据
     * @param clazz BaseResult中的object类型
     * @return
     */
//    public static BaseResult formatToPojo(String jsonData, Class<?> clazz) {
//        try {
//            if (clazz == null) {
//                return MAPPER.readValue(jsonData, BaseResult.class);
//            }
//            JsonNode jsonNode = MAPPER.readTree(jsonData);
//            JsonNode data = jsonNode.get("data");
//            Object obj = null;
//            if (clazz != null) {
//                if (data.isObject()) {
//                    obj = MAPPER.readValue(data.traverse(), clazz);
//                } else if (data.isTextual()) {
//                    obj = MAPPER.readValue(data.asText(), clazz);
//                }
//            }
//            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
//        } catch (Exception e) {
//            return null;
//        }
//    }

    /**
     * 没有object对象的转化
     * 
     * @param json
     * @return
     */
//    public static BaseResult format(String json) {
//        try {
//            return MAPPER.readValue(json, BaseResult.class);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    /**
     * Object是集合转化
     * 
     * @param jsonData json数据
     * @param clazz 集合中的类型
     * @return
     */
//    public static BaseResult formatToList(String jsonData, Class<?> clazz) {
//        try {
//            JsonNode jsonNode = MAPPER.readTree(jsonData);
//            JsonNode data = jsonNode.get("data");
//            Object obj = null;
//            if (data.isArray() && data.size() > 0) {
//                obj = MAPPER.readValue(data.traverse(),
//                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
//            }
//            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
//        } catch (Exception e) {
//            return null;
//        }
//    }

}
