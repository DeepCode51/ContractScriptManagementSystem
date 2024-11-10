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


import com.dao.JubenDao;
import com.entity.JubenEntity;
import com.service.JubenService;
import com.entity.vo.JubenVO;
import com.entity.view.JubenView;

@Service("jubenService")
public class JubenServiceImpl extends ServiceImpl<JubenDao, JubenEntity> implements JubenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JubenEntity> page = this.selectPage(
                new Query<JubenEntity>(params).getPage(),
                new EntityWrapper<JubenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JubenEntity> wrapper) {
		  Page<JubenView> page =new Query<JubenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JubenVO> selectListVO(Wrapper<JubenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JubenVO selectVO(Wrapper<JubenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JubenView> selectListView(Wrapper<JubenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JubenView selectView(Wrapper<JubenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
