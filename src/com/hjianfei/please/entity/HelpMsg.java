/**   
* @Title: HelpMsg.java 
* @Package com.hjianfei.please.entity 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 黄剑飞   QQ:190766172
* @date 2017年3月21日 下午7:51:33 
* @version V1.0   
*/
package com.hjianfei.please.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * @ClassName: HelpMsg
 * @Description: TODO(求助信息)
 * @author 黄剑飞 QQ:190766172
 * @date 2017年3月21日 下午7:51:33
 * 
 */
@Entity
@Table(name = "helpMsg")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class HelpMsg implements Serializable {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", length = 11)
	private Integer id; // 编号
	@Column(name = "topic_id", length = 11)
	private Integer topic_id;
	@Column(name = "start_address", length = 25)
	private String start_address;
	@Column(name = "end_address", length = 25)
	private String end_address;
	@Column(name = "question", length = 255)
	private String question;
	@Column(name = "course_name", length = 20)
	private String course_name;
	@Column(name = "start_time", columnDefinition = "DATE")
	private Date start_time;
	@Column(name = "end_time", columnDefinition = "DATE")
	private String end_time;
	@Column(name = "hot", length = 11)
	private Integer hot;
	@Column(name = "user_id", length = 11, nullable = false)
	private Integer user_id;
	@Column(name = "remark", length = 255)
	private String remark;
	public HelpMsg() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HelpMsg(Integer id, Integer topic_id, String start_address, String end_address, String question,
			String course_name, Date start_time, String end_time, Integer hot, Integer user_id, String remark) {
		super();
		this.id = id;
		this.topic_id = topic_id;
		this.start_address = start_address;
		this.end_address = end_address;
		this.question = question;
		this.course_name = course_name;
		this.start_time = start_time;
		this.end_time = end_time;
		this.hot = hot;
		this.user_id = user_id;
		this.remark = remark;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTopic_id() {
		return topic_id;
	}
	public void setTopic_id(Integer topic_id) {
		this.topic_id = topic_id;
	}
	public String getStart_address() {
		return start_address;
	}
	public void setStart_address(String start_address) {
		this.start_address = start_address;
	}
	public String getEnd_address() {
		return end_address;
	}
	public void setEnd_address(String end_address) {
		this.end_address = end_address;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public Integer getHot() {
		return hot;
	}
	public void setHot(Integer hot) {
		this.hot = hot;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "HelpMsg [id=" + id + ", topic_id=" + topic_id + ", start_address=" + start_address + ", end_address="
				+ end_address + ", question=" + question + ", course_name=" + course_name + ", start_time=" + start_time
				+ ", end_time=" + end_time + ", hot=" + hot + ", user_id=" + user_id + ", remark=" + remark + "]";
	}

}
