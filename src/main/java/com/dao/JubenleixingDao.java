package com.dao;

import com.entity.JubenleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JubenleixingVO;
import com.entity.view.JubenleixingView;


/**
 * 剧本类型
 * 
 * @author 
 * @email 
 * @date 2021-04-15 19:47:46
 */
public interface JubenleixingDao extends BaseMapper<JubenleixingEntity> {
	
	List<JubenleixingVO> selectListVO(@Param("ew") Wrapper<JubenleixingEntity> wrapper);
	
	JubenleixingVO selectVO(@Param("ew") Wrapper<JubenleixingEntity> wrapper);
	
	List<JubenleixingView> selectListView(@Param("ew") Wrapper<JubenleixingEntity> wrapper);

	List<JubenleixingView> selectListView(Pagination page,@Param("ew") Wrapper<JubenleixingEntity> wrapper);
	
	JubenleixingView selectView(@Param("ew") Wrapper<JubenleixingEntity> wrapper);
	
}
