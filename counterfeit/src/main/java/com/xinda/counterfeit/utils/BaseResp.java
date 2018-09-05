package com.xinda.counterfeit.utils;
import java.io.Serializable;
import java.util.List;
public class BaseResp<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String			resultCode;
	private String			resultMsg;
	
	private List<T> resultList;
	
	private T result;
	
	public BaseResp(){

	}
	
	public BaseResp(String code, String msg){
		resultCode = code;
		resultMsg = msg;
	}
	
	public BaseResp(String code, String msg, List<T> resultList, T result) {
		resultCode = code;
		resultMsg = msg;
		this.resultList = resultList;
		this.result = result;
	}

	public String getResultCode(){
		return resultCode;
	}

	public void setResultCode(String resultCode){
		this.resultCode = resultCode;
	}

	public String getResultMsg(){
		return resultMsg;
	}

	public void setResultMsg(String resultMsg){
		this.resultMsg = resultMsg;
	}

	public List<T> getResultList() {
		return resultList;
	}

	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}
}