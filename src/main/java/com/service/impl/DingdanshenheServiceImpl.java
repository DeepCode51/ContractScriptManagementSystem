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


import com.dao.DingdanshenheDao;
import com.entity.DingdanshenheEntity;
import com.service.DingdanshenheService;
import com.entity.vo.DingdanshenheVO;
import com.entity.view.DingdanshenheView;

@Service("dingdanshenheService")
public class DingdanshenheServiceImpl extends ServiceImpl<DingdanshenheDao, DingdanshenheEntity> implements DingdanshenheService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DingdanshenheEntity> page = this.selectPage(
                new Query<DingdanshenheEntity>(params).getPage(),
                new EntityWrapper<DingdanshenheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DingdanshenheEntity> wrapper) {
		  Page<DingdanshenheView> page =new Query<DingdanshenheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DingdanshenheVO> selectListVO(Wrapper<DingdanshenheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DingdanshenheVO selectVO(Wrapper<DingdanshenheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DingdanshenheView> selectListView(Wrapper<DingdanshenheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DingdanshenheView selectView(Wrapper<DingdanshenheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
