package com.xinda.counterfeit.utils;

import java.util.List;
import java.util.Map;

/**
 * 
 * @ClassName TreeModel
 * @Description TODO(树结构定义)
 * @author Qin
 * @Date 2018-7-31下午3:00:56
 */
public class TreeModel implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 节点id
	 */
	private Long id;
	/**
	 * 父节点id
	 */
	private Long parenId;
	 /**
	  * 节点名称
	  */
    private String text;
    /**
     * 节点状态
     */
    private String state = "open";
    /**
     * 是否被选中
     */
    private boolean checked;
    /**
     * 子树
     */
    private List<TreeModel> children;
    /**
     * 其它属性
     */
    private Map<String,String> attributes;
    
    /**
     * 图标
     */
    private String iconCls;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParenId() {
		return parenId;
	}

	public void setParenId(Long parenId) {
		this.parenId = parenId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void setState(boolean state){
		this.state = state ? "open" : "closed";
	}

	public boolean getChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public List<TreeModel> getChildren() {
		return children;
	}

	public void setChildren(List<TreeModel> children) {
		this.children = children;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

}
