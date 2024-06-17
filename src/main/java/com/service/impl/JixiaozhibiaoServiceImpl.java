package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JixiaozhibiaoDao;
import com.entity.JixiaozhibiaoEntity;
import com.service.JixiaozhibiaoService;
import com.entity.vo.JixiaozhibiaoVO;
import com.entity.view.JixiaozhibiaoView;

@Service("jixiaozhibiaoService")
public class JixiaozhibiaoServiceImpl extends ServiceImpl<JixiaozhibiaoDao, JixiaozhibiaoEntity> implements JixiaozhibiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JixiaozhibiaoEntity> page = this.selectPage(
                new Query<JixiaozhibiaoEntity>(params).getPage(),
                new EntityWrapper<JixiaozhibiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JixiaozhibiaoEntity> wrapper) {
		  Page<JixiaozhibiaoView> page =new Query<JixiaozhibiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JixiaozhibiaoVO> selectListVO(Wrapper<JixiaozhibiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JixiaozhibiaoVO selectVO(Wrapper<JixiaozhibiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JixiaozhibiaoView> selectListView(Wrapper<JixiaozhibiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JixiaozhibiaoView selectView(Wrapper<JixiaozhibiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
