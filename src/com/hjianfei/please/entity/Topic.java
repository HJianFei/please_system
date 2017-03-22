/**   
* @Title: Topic.java 
* @Package com.hjianfei.please.entity 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 黄剑飞   QQ:190766172
* @date 2017年3月21日 下午7:41:31 
* @version V1.0   
*/
package com.hjianfei.please.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * @ClassName: Topic
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 黄剑飞 QQ:190766172
 * @date 2017年3月21日 下午7:41:31
 * 
 */
@Entity
@Table(name = "topic")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Topic implements Serializable {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", length = 11)
	private Integer id; // 编号
	@Column(name = "topic_name", length = 20)
	private String topic_name;// 名称
	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Topic(Integer id, String topic_name) {
		super();
		this.id = id;
		this.topic_name = topic_name;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTopic_name() {
		return topic_name;
	}
	public void setTopic_name(String topic_name) {
		this.topic_name = topic_name;
	}

	@Override
	public String toString() {
		return "Topic [id=" + id + ", topic_name=" + topic_name + "]";
	}
}
