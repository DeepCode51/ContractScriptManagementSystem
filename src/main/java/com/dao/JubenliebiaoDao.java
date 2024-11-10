package com.dao;

import com.entity.JubenliebiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JubenliebiaoVO;
import com.entity.view.JubenliebiaoView;


/**
 * 剧本列表
 * 
 * @author 
 * @email 
 * @date 2021-04-15 19:47:46
 */
public interface JubenliebiaoDao extends BaseMapper<JubenliebiaoEntity> {
	
	List<JubenliebiaoVO> selectListVO(@Param("ew") Wrapper<JubenliebiaoEntity> wrapper);
	
	JubenliebiaoVO selectVO(@Param("ew") Wrapper<JubenliebiaoEntity> wrapper);
	
	List<JubenliebiaoView> selectListView(@Param("ew") Wrapper<JubenliebiaoEntity> wrapper);

	List<JubenliebiaoView> selectListView(Pagination page,@Param("ew") Wrapper<JubenliebiaoEntity> wrapper);
	
	JubenliebiaoView selectView(@Param("ew") Wrapper<JubenliebiaoEntity> wrapper);
	
}
