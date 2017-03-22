/**   
* @Title: UserServiceImpl.java 
* @Package com.hjianfei.please.service.impl 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 黄剑飞   QQ:190766172
* @date 2017年3月20日 下午11:16:45 
* @version V1.0   
*/
package com.hjianfei.please.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hjianfei.please.dao.BaseDAO;
import com.hjianfei.please.entity.User;
import com.hjianfei.please.service.UserService;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 黄剑飞 QQ:190766172
 * @date 2017年3月20日 下午11:16:45
 * 
 */
@Transactional // 启用事务机制
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private BaseDAO<User> baseDAO;

	/*
	 * (非 Javadoc) <p>Title: save</p> <p>Description: </p>
	 * 
	 * @param user
	 * 
	 * @see
	 * com.hjianfei.please.service.UserService#save(com.hjianfei.please.entity.
	 * User)
	 */
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		baseDAO.save(user);

	}

	/*
	 * (非 Javadoc) <p>Title: update</p> <p>Description: </p>
	 * 
	 * @param user
	 * 
	 * @see
	 * com.hjianfei.please.service.UserService#update(com.hjianfei.please.entity
	 * .User)
	 */
	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		baseDAO.update(user);

	}

	/*
	 * (非 Javadoc) <p>Title: findById</p> <p>Description: </p>
	 * 
	 * @param id
	 * 
	 * @return
	 * 
	 * @see com.hjianfei.please.service.UserService#findById(int)
	 */
	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return baseDAO.get(User.class, id);
	}

	/*
	 * (非 Javadoc) <p>Title: delete</p> <p>Description: </p>
	 * 
	 * @param user
	 * 
	 * @see
	 * com.hjianfei.please.service.UserService#delete(com.hjianfei.please.entity
	 * .User)
	 */
	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		baseDAO.delete(user);

	}

	/*
	 * (非 Javadoc) <p>Title: findAllList</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see com.hjianfei.please.service.UserService#findAllList()
	 */
	@Override
	public List<User> findAllList() {
		// TODO Auto-generated method stub
		return baseDAO.find("from User");
	}

}
