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


import com.dao.FangjianDao;
import com.entity.FangjianEntity;
import com.service.FangjianService;
import com.entity.vo.FangjianVO;
import com.entity.view.FangjianView;

@Service("fangjianService")
public class FangjianServiceImpl extends ServiceImpl<FangjianDao, FangjianEntity> implements FangjianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangjianEntity> page = this.selectPage(
                new Query<FangjianEntity>(params).getPage(),
                new EntityWrapper<FangjianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangjianEntity> wrapper) {
		  Page<FangjianView> page =new Query<FangjianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangjianVO> selectListVO(Wrapper<FangjianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangjianVO selectVO(Wrapper<FangjianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangjianView> selectListView(Wrapper<FangjianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangjianView selectView(Wrapper<FangjianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
