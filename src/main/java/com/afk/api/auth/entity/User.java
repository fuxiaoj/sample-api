package com.afk.api.auth.entity;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * Created by @author fuxj on 2019-7-18 11:18
 */
@Data
@Entity
@Table(name="sys_user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String avatar;

	@Column(name="create_time")
	private Date createTime;

	@Column(name="dept_id")
	private int deptId;

	private String email;

	@Column(name="is_enabled")
	private String isEnabled;

	@Column(name="login_ip")
	private String loginIp;

	@Column(name="login_time")
	private Date loginTime;

	private String name;

	private String password;

	private String phone;

	@Column(name="real_name")
	private String realName;

	private String salt;

	private String sex;

	@Column(name="update_time")
	private Date updateTime;

	@Column(name="user_type")
	private String userType;

	public User() {
	}

}