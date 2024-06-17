package com.entity.view;

import com.entity.JixiaokaoheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 绩效考核
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-07 10:42:31
 */
@TableName("jixiaokaohe")
public class JixiaokaoheView  extends JixiaokaoheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JixiaokaoheView(){
	}
 
 	public JixiaokaoheView(JixiaokaoheEntity jixiaokaoheEntity){
 	try {
			BeanUtils.copyProperties(this, jixiaokaoheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
