package com.entity.view;

import com.entity.JixiaozhibiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 绩效指标
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-07 10:42:31
 */
@TableName("jixiaozhibiao")
public class JixiaozhibiaoView  extends JixiaozhibiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JixiaozhibiaoView(){
	}
 
 	public JixiaozhibiaoView(JixiaozhibiaoEntity jixiaozhibiaoEntity){
 	try {
			BeanUtils.copyProperties(this, jixiaozhibiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
