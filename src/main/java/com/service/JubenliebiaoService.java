package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JubenliebiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JubenliebiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JubenliebiaoView;


/**
 * 剧本列表
 *
 * @author 
 * @email 
 * @date 2021-04-15 19:47:46
 */
public interface JubenliebiaoService extends IService<JubenliebiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JubenliebiaoVO> selectListVO(Wrapper<JubenliebiaoEntity> wrapper);
   	
   	JubenliebiaoVO selectVO(@Param("ew") Wrapper<JubenliebiaoEntity> wrapper);
   	
   	List<JubenliebiaoView> selectListView(Wrapper<JubenliebiaoEntity> wrapper);
   	
   	JubenliebiaoView selectView(@Param("ew") Wrapper<JubenliebiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JubenliebiaoEntity> wrapper);
   	
}

