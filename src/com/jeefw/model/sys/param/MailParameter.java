package com.jeefw.model.sys.param;

import core.support.ExtJSBaseParameter;

/**
 * 邮件的参数类
 * @框架唯一的升级和技术支持地址：http://www.web898.com
 */
public class MailParameter extends ExtJSBaseParameter {

	private String $like_subject;

	public String get$like_subject() {
		return $like_subject;
	}

	public void set$like_subject(String $like_subject) {
		this.$like_subject = $like_subject;
	}

}
