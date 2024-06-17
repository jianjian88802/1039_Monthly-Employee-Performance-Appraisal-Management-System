package com.entity.vo;

import com.entity.JixiaokaoheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 绩效考核
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-07 10:42:31
 */
public class JixiaokaoheVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 部门
	 */
	
	private String bumen;
		
	/**
	 * 岗位
	 */
	
	private String gangwei;
		
	/**
	 * 绩效月份
	 */
	
	private String jixiaoyuefen;
		
	/**
	 * 员工考勤
	 */
	
	private Integer yuangongkaoqin;
		
	/**
	 * 工作态度
	 */
	
	private Integer gongzuotaidu;
		
	/**
	 * 业务技能
	 */
	
	private Integer yewujineng;
		
	/**
	 * 工作绩效
	 */
	
	private Integer gongzuojixiao;
		
	/**
	 * 总得分
	 */
	
	private String zongdefen;
		
	/**
	 * 绩效等级
	 */
	
	private String jixiaodengji;
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
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
	 * 设置：绩效月份
	 */
	 
	public void setJixiaoyuefen(String jixiaoyuefen) {
		this.jixiaoyuefen = jixiaoyuefen;
	}
	
	/**
	 * 获取：绩效月份
	 */
	public String getJixiaoyuefen() {
		return jixiaoyuefen;
	}
				
	
	/**
	 * 设置：员工考勤
	 */
	 
	public void setYuangongkaoqin(Integer yuangongkaoqin) {
		this.yuangongkaoqin = yuangongkaoqin;
	}
	
	/**
	 * 获取：员工考勤
	 */
	public Integer getYuangongkaoqin() {
		return yuangongkaoqin;
	}
				
	
	/**
	 * 设置：工作态度
	 */
	 
	public void setGongzuotaidu(Integer gongzuotaidu) {
		this.gongzuotaidu = gongzuotaidu;
	}
	
	/**
	 * 获取：工作态度
	 */
	public Integer getGongzuotaidu() {
		return gongzuotaidu;
	}
				
	
	/**
	 * 设置：业务技能
	 */
	 
	public void setYewujineng(Integer yewujineng) {
		this.yewujineng = yewujineng;
	}
	
	/**
	 * 获取：业务技能
	 */
	public Integer getYewujineng() {
		return yewujineng;
	}
				
	
	/**
	 * 设置：工作绩效
	 */
	 
	public void setGongzuojixiao(Integer gongzuojixiao) {
		this.gongzuojixiao = gongzuojixiao;
	}
	
	/**
	 * 获取：工作绩效
	 */
	public Integer getGongzuojixiao() {
		return gongzuojixiao;
	}
				
	
	/**
	 * 设置：总得分
	 */
	 
	public void setZongdefen(String zongdefen) {
		this.zongdefen = zongdefen;
	}
	
	/**
	 * 获取：总得分
	 */
	public String getZongdefen() {
		return zongdefen;
	}
				
	
	/**
	 * 设置：绩效等级
	 */
	 
	public void setJixiaodengji(String jixiaodengji) {
		this.jixiaodengji = jixiaodengji;
	}
	
	/**
	 * 获取：绩效等级
	 */
	public String getJixiaodengji() {
		return jixiaodengji;
	}
			
}
