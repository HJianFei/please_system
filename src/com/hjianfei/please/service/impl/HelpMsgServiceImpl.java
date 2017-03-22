/**   
* @Title: HelpMsgServiceImpl.java 
* @Package com.hjianfei.please.service.impl 
* @Description: TODO
* @author 黄剑飞   QQ:190766172
* @date 2017年3月21日 下午9:03:29 
* @version V1.0   
*/
package com.hjianfei.please.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hjianfei.please.dao.BaseDAO;
import com.hjianfei.please.entity.HelpMsg;
import com.hjianfei.please.service.HelpMsgService;

/** 
* @ClassName: HelpMsgServiceImpl 
* @Description: TODO
* @author 黄剑飞 QQ:190766172 
* @date 2017年3月21日 下午9:03:29 
*  
*/
@Transactional // 启用事务机制
@Service("helpMsgService")
public class HelpMsgServiceImpl implements HelpMsgService {

	/* 
	* <p>Title: save</p> 
	* <p>Description: </p> 
	* @param helpMsg 
	* @see com.hjianfei.please.service.HelpMsgService#save(com.hjianfei.please.entity.HelpMsg) 
	*/
	@Resource
	private BaseDAO<HelpMsg> baseDAO;
	@Override
	public void save(HelpMsg helpMsg) {
		// TODO Auto-generated method stub
		baseDAO.save(helpMsg);
		
		
	}

	/* 
	* <p>Title: update</p> 
	* <p>Description: </p> 
	* @param helpMsg 
	* @see com.hjianfei.please.service.HelpMsgService#update(com.hjianfei.please.entity.HelpMsg) 
	*/
	@Override
	public void update(HelpMsg helpMsg) {
		// TODO Auto-generated method stub
		baseDAO.update(helpMsg);
		
	}

	/* 
	* <p>Title: findById</p> 
	* <p>Description: </p> 
	* @param id
	* @return 
	* @see com.hjianfei.please.service.HelpMsgService#findById(int) 
	*/
	@Override
	public HelpMsg findById(int id) {
		// TODO Auto-generated method stub
		return baseDAO.get(HelpMsg.class, id);
	}

	/* 
	* <p>Title: delete</p> 
	* <p>Description: </p> 
	* @param helpMsg 
	* @see com.hjianfei.please.service.HelpMsgService#delete(com.hjianfei.please.entity.HelpMsg) 
	*/
	@Override
	public void delete(HelpMsg helpMsg) {
		// TODO Auto-generated method stub
		baseDAO.delete(helpMsg);
		
	}

	/* 
	* <p>Title: findAllList</p> 
	* <p>Description: </p> 
	* @return 
	* @see com.hjianfei.please.service.HelpMsgService#findAllList() 
	*/
	@Override
	public List<HelpMsg> findAllList() {
		// TODO Auto-generated method stub
		return baseDAO.find("from HelpMsg");
	}

}
