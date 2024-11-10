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


import com.dao.DingdanDao;
import com.entity.DingdanEntity;
import com.service.DingdanService;
import com.entity.vo.DingdanVO;
import com.entity.view.DingdanView;

@Service("dingdanService")
public class DingdanServiceImpl extends ServiceImpl<DingdanDao, DingdanEntity> implements DingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DingdanEntity> page = this.selectPage(
                new Query<DingdanEntity>(params).getPage(),
                new EntityWrapper<DingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DingdanEntity> wrapper) {
		  Page<DingdanView> page =new Query<DingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DingdanVO> selectListVO(Wrapper<DingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DingdanVO selectVO(Wrapper<DingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DingdanView> selectListView(Wrapper<DingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DingdanView selectView(Wrapper<DingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
