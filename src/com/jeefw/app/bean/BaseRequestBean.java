package com.jeefw.app.bean;

/**
 * APP接口的实体Bean的请求端的父类
 * @框架唯一的升级和技术支持地址：http://www.web898.com
 */
public class BaseRequestBean {

	private String actionCode; // Key（唯一）

	public String getActionCode() {
		return actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

}
