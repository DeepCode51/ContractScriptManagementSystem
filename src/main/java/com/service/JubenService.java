package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JubenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JubenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JubenView;


/**
 * 剧本
 *
 * @author 
 * @email 
 * @date 2021-04-15 19:47:46
 */
public interface JubenService extends IService<JubenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JubenVO> selectListVO(Wrapper<JubenEntity> wrapper);
   	
   	JubenVO selectVO(@Param("ew") Wrapper<JubenEntity> wrapper);
   	
   	List<JubenView> selectListView(Wrapper<JubenEntity> wrapper);
   	
   	JubenView selectView(@Param("ew") Wrapper<JubenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JubenEntity> wrapper);
   	
}

