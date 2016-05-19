package core.web;

import com.jeefw.model.sys.SysUser;

/**
 * @框架唯一的升级和技术支持地址：http://www.web898.com
 */
public class SessionThreadLocal {

	private static ThreadLocal<SysUser> ADMINUSERTHREADLOCAL = new ThreadLocal<SysUser>();

	public static SysUser getThreadSysUser() {
		return ADMINUSERTHREADLOCAL.get();
	}

	public static void setThreadSysUser(SysUser sysUser) {
		ADMINUSERTHREADLOCAL.set(sysUser);
	}

}
