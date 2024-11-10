package com.entity.view;

import com.entity.JubenliebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 剧本列表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 19:47:46
 */
@TableName("jubenliebiao")
public class JubenliebiaoView  extends JubenliebiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JubenliebiaoView(){
	}
 
 	public JubenliebiaoView(JubenliebiaoEntity jubenliebiaoEntity){
 	try {
			BeanUtils.copyProperties(this, jubenliebiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
