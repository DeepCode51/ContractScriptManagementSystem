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


import com.dao.JubenliebiaoDao;
import com.entity.JubenliebiaoEntity;
import com.service.JubenliebiaoService;
import com.entity.vo.JubenliebiaoVO;
import com.entity.view.JubenliebiaoView;

@Service("jubenliebiaoService")
public class JubenliebiaoServiceImpl extends ServiceImpl<JubenliebiaoDao, JubenliebiaoEntity> implements JubenliebiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JubenliebiaoEntity> page = this.selectPage(
                new Query<JubenliebiaoEntity>(params).getPage(),
                new EntityWrapper<JubenliebiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JubenliebiaoEntity> wrapper) {
		  Page<JubenliebiaoView> page =new Query<JubenliebiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JubenliebiaoVO> selectListVO(Wrapper<JubenliebiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JubenliebiaoVO selectVO(Wrapper<JubenliebiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JubenliebiaoView> selectListView(Wrapper<JubenliebiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JubenliebiaoView selectView(Wrapper<JubenliebiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
