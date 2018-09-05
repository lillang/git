package com.xinda.counterfeit.utils;

import java.util.List;

/**
 * 
 * @ClassName EUDataGridResult
 * @Description EasyDateGrid数据结构
 * @author Qin
 * @Date 2018年5月29日下午4:55:25
 */
public class EUDataGridResult {

	private long total;
	private List<?> rows;
	
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
}
