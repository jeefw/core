package com.jeefw.security;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.CollectionUtils;
import org.apache.shiro.web.filter.authz.RolesAuthorizationFilter;
import org.apache.shiro.web.util.WebUtils;

public class CustomRolesAuthorizationFilter extends RolesAuthorizationFilter {
    @SuppressWarnings({"unchecked"})
    public boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws IOException {
    	
    	    
        Subject subject = getSubject(request, response);
        String[] rolesArray = (String[]) mappedValue;
        
        String requestURI = WebUtils.getPathWithinApplication(WebUtils.toHttp(request));
        System.out.println("CustomRolesAuthorizationFilter # requestURI:"+requestURI);
        
        
        if (rolesArray == null || rolesArray.length == 0) {
            //no roles specified, so nothing to check - allow access.
            return true;
        }

        Set<String> roles = CollectionUtils.asSet(rolesArray);
        return subject.hasAllRoles(roles);
    }
}
