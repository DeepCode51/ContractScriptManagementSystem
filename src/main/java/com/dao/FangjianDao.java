package com.dao;

import com.entity.FangjianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangjianVO;
import com.entity.view.FangjianView;


/**
 * 房间
 * 
 * @author 
 * @email 
 * @date 2021-04-15 19:47:46
 */
public interface FangjianDao extends BaseMapper<FangjianEntity> {
	
	List<FangjianVO> selectListVO(@Param("ew") Wrapper<FangjianEntity> wrapper);
	
	FangjianVO selectVO(@Param("ew") Wrapper<FangjianEntity> wrapper);
	
	List<FangjianView> selectListView(@Param("ew") Wrapper<FangjianEntity> wrapper);

	List<FangjianView> selectListView(Pagination page,@Param("ew") Wrapper<FangjianEntity> wrapper);
	
	FangjianView selectView(@Param("ew") Wrapper<FangjianEntity> wrapper);
	
}
