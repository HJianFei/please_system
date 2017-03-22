/**   
* @Title: User.java 
* @Package com.hjianfei.please.entity 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 黄剑飞   QQ:190766172
* @date 2017年3月20日 下午10:49:32 
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
 * @ClassName: User
 * @Description: TODO(用户表)
 * @author 黄剑飞 QQ:190766172
 * @date 2017年3月20日 下午10:49:32
 * 
 */
@Entity
@Table(name = "user")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", length = 11)
	private Integer id; // 编号

	@Column(name = "user_name", length = 20)
	private String user_name; // 姓名

	@Column(name = "college", length = 25)
	private String college; // 学校名称

	@Column(name = "school_name", length = 25)
	private Integer school_name; // 二级学院

	@Column(name = "register_time", columnDefinition = "DATE")
	private Date register_time; // 注册日期

	@Column(name = "major", length = 25)
	private Double major; // 专业

	@Column(name = "grade", length = 25)
	private Double grade; // 年级

	@Column(name = "phone", length = 25)
	private String phone; // 手机号码

	@Column(name = "email", length = 25)
	private String email; // 邮箱
	
	@Column(name = "password", length = 255)
	private String password; // 密码
	
	@Column(name = "avatar", length = 255)
	private String avatar; // 头像地址

	@Column(name = "rank", length = 25)
	private String rank; // 等级

	@Column(name = "score", length = 11)
	private Integer score; // 积分

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String user_name, String college, Integer school_name, Date register_time, Double major,
			Double grade, String phone, String email, String password, String avatar, String rank, Integer score) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.college = college;
		this.school_name = school_name;
		this.register_time = register_time;
		this.major = major;
		this.grade = grade;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.avatar = avatar;
		this.rank = rank;
		this.score = score;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Integer getSchool_name() {
		return school_name;
	}

	public void setSchool_name(Integer school_name) {
		this.school_name = school_name;
	}

	public Date getRegister_time() {
		return register_time;
	}

	public void setRegister_time(Date register_time) {
		this.register_time = register_time;
	}

	public Double getMajor() {
		return major;
	}

	public void setMajor(Double major) {
		this.major = major;
	}

	public Double getGrade() {
		return grade;
	}

	public void setGrade(Double grade) {
		this.grade = grade;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", user_name=" + user_name + ", college=" + college + ", school_name=" + school_name
				+ ", register_time=" + register_time + ", major=" + major + ", grade=" + grade + ", phone=" + phone
				+ ", email=" + email + ", password=" + password + ", avatar=" + avatar + ", rank=" + rank + ", score="
				+ score + "]";
	}
	
}
