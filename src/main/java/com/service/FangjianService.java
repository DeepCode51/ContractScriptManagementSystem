package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangjianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangjianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangjianView;


/**
 * 房间
 *
 * @author 
 * @email 
 * @date 2021-04-15 19:47:46
 */
public interface FangjianService extends IService<FangjianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangjianVO> selectListVO(Wrapper<FangjianEntity> wrapper);
   	
   	FangjianVO selectVO(@Param("ew") Wrapper<FangjianEntity> wrapper);
   	
   	List<FangjianView> selectListView(Wrapper<FangjianEntity> wrapper);
   	
   	FangjianView selectView(@Param("ew") Wrapper<FangjianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangjianEntity> wrapper);
   	
}

