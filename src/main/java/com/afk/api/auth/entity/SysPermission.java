package com.afk.api.auth.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * Created by @author fuxj on 2019-7-18 11:18
 */
@Entity
@Table(name="sys_permission")
public class SysPermission implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String action;

	private String code;

	private String icon;

	@Column(name="is_button")
	private Integer isButton;

	@Column(name="is_menu")
	private Integer isMenu;

	private String name;

	@Column(name="parent_id")
	private Integer parentId;

	private Integer sorting;

	private String type;

	public SysPermission() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getIsButton() {
		return this.isButton;
	}

	public void setIsButton(Integer isButton) {
		this.isButton = isButton;
	}

	public Integer getIsMenu() {
		return this.isMenu;
	}

	public void setIsMenu(Integer isMenu) {
		this.isMenu = isMenu;
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

	public Integer getSorting() {
		return this.sorting;
	}

	public void setSorting(Integer sorting) {
		this.sorting = sorting;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}