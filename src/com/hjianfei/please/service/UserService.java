/**   
* @Title: UserService.java 
* @Package com.hjianfei.please.service.impl 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 黄剑飞   QQ:190766172
* @date 2017年3月20日 下午11:15:06 
* @version V1.0   
*/
package com.hjianfei.please.service;

import java.util.List;

import com.hjianfei.please.entity.User;

/** 
* @ClassName: UserService 
* @Description: TODO(用户Service) 
* @author 黄剑飞 QQ:190766172 
* @date 2017年3月20日 下午11:15:06 
*  
*/
public interface UserService {
	
	public void save(User user);

	public void update(User user);

	public User findById(int id);

	public void delete(User user);

	public List<User> findAllList();

}
