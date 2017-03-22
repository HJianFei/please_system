/**   
* @Title: FirstQuartz.java 
* @Package com.hjianfei.please.quartz 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 黄剑飞   QQ:190766172
* @date 2017年3月20日 下午11:14:22 
* @version V1.0   
*/
package com.hjianfei.please.quartz;

/**
 * @ClassName: FirstQuartz
 * @Description: TODO(测试定时任务)
 * @author 黄剑飞 QQ:190766172
 * @date 2017年3月20日 下午11:14:22
 * 
 */
public class FirstQuartz {
	public void doTestJob() {
		System.out.println("\n测试定时任务："
				+ (new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS")).format(new java.util.Date()) + "\n");
	}
}
