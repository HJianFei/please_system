/**   
* @Title: TopicServiceImpl.java 
* @Package com.hjianfei.please.service.impl 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 黄剑飞   QQ:190766172
* @date 2017年3月21日 下午8:11:47 
* @version V1.0   
*/
package com.hjianfei.please.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hjianfei.please.dao.BaseDAO;
import com.hjianfei.please.entity.Topic;
import com.hjianfei.please.service.TopicService;

/** 
* @ClassName: TopicServiceImpl 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author 黄剑飞 QQ:190766172 
* @date 2017年3月21日 下午8:11:47 
*  
*/
@Transactional // 启用事务机制
@Service("topicService")
public class TopicServiceImpl implements TopicService{

	@Resource
	private BaseDAO<Topic> baseDAO;
	/* (非 Javadoc) 
	* <p>Title: save</p> 
	* <p>Description: </p> 
	* @param topic 
	* @see com.hjianfei.please.service.TopicService#save(com.hjianfei.please.entity.Topic) 
	*/
	@Override
	public void save(Topic topic) {
		// TODO Auto-generated method stub
		baseDAO.save(topic);
	}

	/* (非 Javadoc) 
	* <p>Title: update</p> 
	* <p>Description: </p> 
	* @param topic 
	* @see com.hjianfei.please.service.TopicService#update(com.hjianfei.please.entity.Topic) 
	*/
	@Override
	public void update(Topic topic) {
		// TODO Auto-generated method stub
		baseDAO.update(topic);
		
	}

	/* (非 Javadoc) 
	* <p>Title: findById</p> 
	* <p>Description: </p> 
	* @param id
	* @return 
	* @see com.hjianfei.please.service.TopicService#findById(int) 
	*/
	@Override
	public Topic findById(int id) {
		// TODO Auto-generated method stub
		return baseDAO.get(Topic.class, id);
	}

	/* (非 Javadoc) 
	* <p>Title: delete</p> 
	* <p>Description: </p> 
	* @param topic 
	* @see com.hjianfei.please.service.TopicService#delete(com.hjianfei.please.entity.Topic) 
	*/
	@Override
	public void delete(Topic topic) {
		// TODO Auto-generated method stub
		baseDAO.delete(topic);
		
	}

	/* (非 Javadoc) 
	* <p>Title: findAllList</p> 
	* <p>Description: </p> 
	* @return 
	* @see com.hjianfei.please.service.TopicService#findAllList() 
	*/
	@Override
	public List<Topic> findAllList() {
		// TODO Auto-generated method stub
		return baseDAO.find("from Topic");
	}

}
