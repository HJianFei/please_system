/**   
* @Title: TopicService.java 
* @Package com.hjianfei.please.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 黄剑飞   QQ:190766172
* @date 2017年3月21日 下午8:10:50 
* @version V1.0   
*/
package com.hjianfei.please.service;

import java.util.List;

import com.hjianfei.please.entity.Topic;

/**
 * @ClassName: TopicService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 黄剑飞 QQ:190766172
 * @date 2017年3月21日 下午8:10:50
 * 
 */
public interface TopicService {

	public void save(Topic topic);

	public void update(Topic topic);

	public Topic findById(int id);

	public void delete(Topic topic);

	public List<Topic> findAllList();

}
