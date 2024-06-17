package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JixiaozhibiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JixiaozhibiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JixiaozhibiaoView;


/**
 * 绩效指标
 *
 * @author 
 * @email 
 * @date 2021-05-07 10:42:31
 */
public interface JixiaozhibiaoService extends IService<JixiaozhibiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JixiaozhibiaoVO> selectListVO(Wrapper<JixiaozhibiaoEntity> wrapper);
   	
   	JixiaozhibiaoVO selectVO(@Param("ew") Wrapper<JixiaozhibiaoEntity> wrapper);
   	
   	List<JixiaozhibiaoView> selectListView(Wrapper<JixiaozhibiaoEntity> wrapper);
   	
   	JixiaozhibiaoView selectView(@Param("ew") Wrapper<JixiaozhibiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JixiaozhibiaoEntity> wrapper);
   	
}

