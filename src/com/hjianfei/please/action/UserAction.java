/**   
* @Title: UserAction.java 
* @Package com.hjianfei.please.action 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 黄剑飞   QQ:190766172
* @date 2017年3月20日 下午11:20:11 
* @version V1.0   
*/
package com.hjianfei.please.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.stereotype.Controller;

import com.hjianfei.please.entity.User;
import com.hjianfei.please.service.UserService;
import com.hjianfei.please.utils.JSONUtils;
import com.hjianfei.please.utils.MD5Util;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @ClassName: UserAction
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 黄剑飞 QQ:190766172
 * @date 2017年3月20日 下午11:20:11
 * 
 */
@Controller
@ParentPackage("struts-default")
@Namespace(value = "/userAction")
@ExceptionMappings({ @ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") })
public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	@Resource
	private UserService userService;
	private User user;
	Map<String, Object> map = new HashMap<String, Object>();

	@Action(value = "save")
	public void save() {
		try {
			user.setPassword(MD5Util.encrypt(user.getPassword()));
			userService.save(user);
			map.put("code", 0);
			map.put("msg", "操作成功");
		} catch (Exception e) {
			map.put("code", 1);
			map.put("msg", "操作失败");
			e.printStackTrace();
		}
		try {
			JSONUtils.toJson(ServletActionContext.getResponse(), map);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
