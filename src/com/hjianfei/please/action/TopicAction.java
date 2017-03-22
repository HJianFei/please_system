/**   
* @Title: TopicAction.java 
* @Package com.hjianfei.please.action 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 黄剑飞   QQ:190766172
* @date 2017年3月21日 下午8:15:34 
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

import com.hjianfei.please.entity.Topic;
import com.hjianfei.please.service.TopicService;
import com.hjianfei.please.utils.JSONUtils;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @ClassName: TopicAction
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 黄剑飞 QQ:190766172
 * @date 2017年3月21日 下午8:15:34
 * 
 */
@Controller
@ParentPackage("struts-default")
@Namespace(value = "/topicAction")
@ExceptionMappings({ @ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") })

public class TopicAction extends ActionSupport {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 1L;
	@Resource
	private TopicService topicService;
	private Topic topic;
	Map<String, Object> map = new HashMap<String, Object>();

	/**
	 * @Title: save @Description: TODO(保存主题) @param 设定文件 @return void
	 * 返回类型 @throws
	 */
	@Action(value = "save")
	public void save() {
		try {
			
			topicService.save(topic);
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
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
}
