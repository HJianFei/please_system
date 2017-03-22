/**   
* @Title: HelpMsgAction.java 
* @Package com.hjianfei.please.action 
* @Description: TODO
* @author 黄剑飞   QQ:190766172
* @date 2017年3月21日 下午9:06:07 
* @version V1.0   
*/
package com.hjianfei.please.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.stereotype.Controller;

import com.hjianfei.please.entity.HelpMsg;
import com.hjianfei.please.service.HelpMsgService;
import com.hjianfei.please.utils.JSONUtils;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @ClassName: HelpMsgAction
 * @Description: TODO
 * @author 黄剑飞 QQ:190766172
 * @date 2017年3月21日 下午9:06:07
 * 
 */
@Controller
@ParentPackage("struts-default")
@Namespace(value = "/helpMsgAction")
@ExceptionMappings({ @ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") })

public class HelpMsgAction extends ActionSupport {

	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 1L;
	@Resource
	private HelpMsgService helpMsgService;
	private HelpMsg helpMsg;
	Map<String, Object> map = new HashMap<String, Object>();

	/**
	 * 
	 * @Title: save @Description: TODO @param 设定文件 @return void 返回类型 @throws
	 */
	public void save() {
		try {

			helpMsgService.save(helpMsg);
			map.put("code", 0);
			map.put("msg", "操作成功");
		} catch (Exception e) {
			map.put("code", 1);
			map.put("msg", "操作失败");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			JSONUtils.toJson(ServletActionContext.getResponse(), map);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public HelpMsg getHelpMsg() {
		return helpMsg;
	}

	public void setHelpMsg(HelpMsg helpMsg) {
		this.helpMsg = helpMsg;
	}

}
