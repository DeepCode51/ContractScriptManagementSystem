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


import com.dao.JubenleixingDao;
import com.entity.JubenleixingEntity;
import com.service.JubenleixingService;
import com.entity.vo.JubenleixingVO;
import com.entity.view.JubenleixingView;

@Service("jubenleixingService")
public class JubenleixingServiceImpl extends ServiceImpl<JubenleixingDao, JubenleixingEntity> implements JubenleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JubenleixingEntity> page = this.selectPage(
                new Query<JubenleixingEntity>(params).getPage(),
                new EntityWrapper<JubenleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JubenleixingEntity> wrapper) {
		  Page<JubenleixingView> page =new Query<JubenleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JubenleixingVO> selectListVO(Wrapper<JubenleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JubenleixingVO selectVO(Wrapper<JubenleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JubenleixingView> selectListView(Wrapper<JubenleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JubenleixingView selectView(Wrapper<JubenleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
