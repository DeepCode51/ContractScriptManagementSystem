package com.dao;

import com.entity.DingdanshenheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingdanshenheVO;
import com.entity.view.DingdanshenheView;


/**
 * 订单审核
 * 
 * @author 
 * @email 
 * @date 2021-04-15 19:47:46
 */
public interface DingdanshenheDao extends BaseMapper<DingdanshenheEntity> {
	
	List<DingdanshenheVO> selectListVO(@Param("ew") Wrapper<DingdanshenheEntity> wrapper);
	
	DingdanshenheVO selectVO(@Param("ew") Wrapper<DingdanshenheEntity> wrapper);
	
	List<DingdanshenheView> selectListView(@Param("ew") Wrapper<DingdanshenheEntity> wrapper);

	List<DingdanshenheView> selectListView(Pagination page,@Param("ew") Wrapper<DingdanshenheEntity> wrapper);
	
	DingdanshenheView selectView(@Param("ew") Wrapper<DingdanshenheEntity> wrapper);
	
}
