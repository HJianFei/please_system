/**   
* @Title: HibernateUtils.java 
* @Package com.hjianfei.please.utils 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 黄剑飞   QQ:190766172
* @date 2017年3月20日 下午11:24:24 
* @version V1.0   
*/
package com.hjianfei.please.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * @ClassName: HibernateUtils
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 黄剑飞 QQ:190766172
 * @date 2017年3月20日 下午11:24:24
 * 
 */
public class HibernateUtils {
	
	private static SessionFactory sessionFactory;

	private HibernateUtils() {
	}

	static {
		try {

			/** 此方法在Hibernate4中被标记为过时 */
			// sessionFactory = new
			// Configuration().configure().buildSessionFactory();

			/** Hibernate4取得SessionFactory的方法 */
			Configuration config = new Configuration().configure();

			// 在Hibernate4.3.6版本中，ServiceRegistryBuilder被标记为已过时
			// ServiceRegistry serviceRegistry = new
			// ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();//不推荐
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties())
					.build();// 推荐

			sessionFactory = config.buildSessionFactory(serviceRegistry);

		} catch (Throwable e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
