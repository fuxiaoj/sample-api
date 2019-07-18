package com.afk.api.auth.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * Created by @author fuxj on 2019-7-18 11:18
 */
@Entity
@Table(name="sys_dept")
public class SysDept implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name="del_flag")
	private String delFlag;

	private String email;

	private String leader;

	private String name;

	@Column(name="parent_id")
	private Integer parentId;

	private String phone;

	private Integer sorting;

	private String status;

	public SysDept() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDelFlag() {
		return this.delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLeader() {
		return this.leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getSorting() {
		return this.sorting;
	}

	public void setSorting(Integer sorting) {
		this.sorting = sorting;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}