package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingdanshenheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingdanshenheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingdanshenheView;


/**
 * 订单审核
 *
 * @author 
 * @email 
 * @date 2021-04-15 19:47:46
 */
public interface DingdanshenheService extends IService<DingdanshenheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingdanshenheVO> selectListVO(Wrapper<DingdanshenheEntity> wrapper);
   	
   	DingdanshenheVO selectVO(@Param("ew") Wrapper<DingdanshenheEntity> wrapper);
   	
   	List<DingdanshenheView> selectListView(Wrapper<DingdanshenheEntity> wrapper);
   	
   	DingdanshenheView selectView(@Param("ew") Wrapper<DingdanshenheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingdanshenheEntity> wrapper);
   	
}

