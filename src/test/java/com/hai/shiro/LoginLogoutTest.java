package com.hai.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.Test;

public class LoginLogoutTest {
	
	@Test
	public void testHelloworld() {
		Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory("F:/sts_workspace/shiro/src/main/resources/shiro.ini");
		org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
		SecurityUtils.setSecurityManager(securityManager);
		
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
		//19999 98888888 99999999
		try {
			subject.login(token);
		} catch (AuthenticationException e) {
			e.printStackTrace();
		}
		
		Assert.assertEquals(true, subject.isAuthenticated()); //¶ÏÑÔÓÃ»§ÒÑ¾­µÇÂ¼
		
		subject.logout();
	}

}
