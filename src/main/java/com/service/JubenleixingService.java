package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JubenleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JubenleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JubenleixingView;


/**
 * 剧本类型
 *
 * @author 
 * @email 
 * @date 2021-04-15 19:47:46
 */
public interface JubenleixingService extends IService<JubenleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JubenleixingVO> selectListVO(Wrapper<JubenleixingEntity> wrapper);
   	
   	JubenleixingVO selectVO(@Param("ew") Wrapper<JubenleixingEntity> wrapper);
   	
   	List<JubenleixingView> selectListView(Wrapper<JubenleixingEntity> wrapper);
   	
   	JubenleixingView selectView(@Param("ew") Wrapper<JubenleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JubenleixingEntity> wrapper);
   	
}

