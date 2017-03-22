/**   
* @Title: HelpMsgService.java 
* @Package com.hjianfei.please.service 
* @Description: TODO
* @author 黄剑飞   QQ:190766172
* @date 2017年3月21日 下午9:02:09 
* @version V1.0   
*/
package com.hjianfei.please.service;

import java.util.List;

import com.hjianfei.please.entity.HelpMsg;

/** 
* @ClassName: HelpMsgService 
* @Description: TODO
* @author 黄剑飞 QQ:190766172 
* @date 2017年3月21日 下午9:02:09 
*  
*/
public interface HelpMsgService {
	
	public void save(HelpMsg helpMsg);

	public void update(HelpMsg helpMsg);

	public HelpMsg findById(int id);

	public void delete(HelpMsg helpMsg);

	public List<HelpMsg> findAllList();

}
