package com.dao;

import com.entity.JixiaozhibiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JixiaozhibiaoVO;
import com.entity.view.JixiaozhibiaoView;


/**
 * 绩效指标
 * 
 * @author 
 * @email 
 * @date 2021-05-07 10:42:31
 */
public interface JixiaozhibiaoDao extends BaseMapper<JixiaozhibiaoEntity> {
	
	List<JixiaozhibiaoVO> selectListVO(@Param("ew") Wrapper<JixiaozhibiaoEntity> wrapper);
	
	JixiaozhibiaoVO selectVO(@Param("ew") Wrapper<JixiaozhibiaoEntity> wrapper);
	
	List<JixiaozhibiaoView> selectListView(@Param("ew") Wrapper<JixiaozhibiaoEntity> wrapper);

	List<JixiaozhibiaoView> selectListView(Pagination page,@Param("ew") Wrapper<JixiaozhibiaoEntity> wrapper);
	
	JixiaozhibiaoView selectView(@Param("ew") Wrapper<JixiaozhibiaoEntity> wrapper);
	
}
