package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 绩效指标
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-07 10:42:31
 */
@TableName("jixiaozhibiao")
public class JixiaozhibiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JixiaozhibiaoEntity() {
		
	}
	
	public JixiaozhibiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 部门
	 */
					
	private String bumen;
	
	/**
	 * 岗位
	 */
					
	private String gangwei;
	
	/**
	 * 绩效项目
	 */
					
	private String jixiaoxiangmu;
	
	/**
	 * 绩效指标1
	 */
					
	private String jixiaozhibiao1;
	
	/**
	 * 分值1
	 */
					
	private Integer fenzhi1;
	
	/**
	 * 绩效指标2
	 */
					
	private String jixiaozhibiao2;
	
	/**
	 * 分值2
	 */
					
	private Integer fenzhi2;
	
	/**
	 * 绩效指标3
	 */
					
	private String jixiaozhibiao3;
	
	/**
	 * 分值3
	 */
					
	private Integer fenzhi3;
	
	/**
	 * 总评分
	 */
					
	private String zongpingfen;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：部门
	 */
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
	/**
	 * 设置：岗位
	 */
	public void setGangwei(String gangwei) {
		this.gangwei = gangwei;
	}
	/**
	 * 获取：岗位
	 */
	public String getGangwei() {
		return gangwei;
	}
	/**
	 * 设置：绩效项目
	 */
	public void setJixiaoxiangmu(String jixiaoxiangmu) {
		this.jixiaoxiangmu = jixiaoxiangmu;
	}
	/**
	 * 获取：绩效项目
	 */
	public String getJixiaoxiangmu() {
		return jixiaoxiangmu;
	}
	/**
	 * 设置：绩效指标1
	 */
	public void setJixiaozhibiao1(String jixiaozhibiao1) {
		this.jixiaozhibiao1 = jixiaozhibiao1;
	}
	/**
	 * 获取：绩效指标1
	 */
	public String getJixiaozhibiao1() {
		return jixiaozhibiao1;
	}
	/**
	 * 设置：分值1
	 */
	public void setFenzhi1(Integer fenzhi1) {
		this.fenzhi1 = fenzhi1;
	}
	/**
	 * 获取：分值1
	 */
	public Integer getFenzhi1() {
		return fenzhi1;
	}
	/**
	 * 设置：绩效指标2
	 */
	public void setJixiaozhibiao2(String jixiaozhibiao2) {
		this.jixiaozhibiao2 = jixiaozhibiao2;
	}
	/**
	 * 获取：绩效指标2
	 */
	public String getJixiaozhibiao2() {
		return jixiaozhibiao2;
	}
	/**
	 * 设置：分值2
	 */
	public void setFenzhi2(Integer fenzhi2) {
		this.fenzhi2 = fenzhi2;
	}
	/**
	 * 获取：分值2
	 */
	public Integer getFenzhi2() {
		return fenzhi2;
	}
	/**
	 * 设置：绩效指标3
	 */
	public void setJixiaozhibiao3(String jixiaozhibiao3) {
		this.jixiaozhibiao3 = jixiaozhibiao3;
	}
	/**
	 * 获取：绩效指标3
	 */
	public String getJixiaozhibiao3() {
		return jixiaozhibiao3;
	}
	/**
	 * 设置：分值3
	 */
	public void setFenzhi3(Integer fenzhi3) {
		this.fenzhi3 = fenzhi3;
	}
	/**
	 * 获取：分值3
	 */
	public Integer getFenzhi3() {
		return fenzhi3;
	}
	/**
	 * 设置：总评分
	 */
	public void setZongpingfen(String zongpingfen) {
		this.zongpingfen = zongpingfen;
	}
	/**
	 * 获取：总评分
	 */
	public String getZongpingfen() {
		return zongpingfen;
	}

}
