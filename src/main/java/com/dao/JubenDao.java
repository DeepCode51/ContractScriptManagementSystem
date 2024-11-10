package com.dao;

import com.entity.JubenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JubenVO;
import com.entity.view.JubenView;


/**
 * 剧本
 * 
 * @author 
 * @email 
 * @date 2021-04-15 19:47:46
 */
public interface JubenDao extends BaseMapper<JubenEntity> {
	
	List<JubenVO> selectListVO(@Param("ew") Wrapper<JubenEntity> wrapper);
	
	JubenVO selectVO(@Param("ew") Wrapper<JubenEntity> wrapper);
	
	List<JubenView> selectListView(@Param("ew") Wrapper<JubenEntity> wrapper);

	List<JubenView> selectListView(Pagination page,@Param("ew") Wrapper<JubenEntity> wrapper);
	
	JubenView selectView(@Param("ew") Wrapper<JubenEntity> wrapper);
	
}
