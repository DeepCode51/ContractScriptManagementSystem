package com.entity.model;

import com.entity.JubenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 剧本
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-15 19:47:46
 */
public class JubenModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 剧本类型
	 */
	
	private String jubenleixing;
		
	/**
	 * 作者
	 */
	
	private String zuozhe;
		
	/**
	 * 介绍
	 */
	
	private String jieshao;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：剧本类型
	 */
	 
	public void setJubenleixing(String jubenleixing) {
		this.jubenleixing = jubenleixing;
	}
	
	/**
	 * 获取：剧本类型
	 */
	public String getJubenleixing() {
		return jubenleixing;
	}
				
	
	/**
	 * 设置：作者
	 */
	 
	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}
	
	/**
	 * 获取：作者
	 */
	public String getZuozhe() {
		return zuozhe;
	}
				
	
	/**
	 * 设置：介绍
	 */
	 
	public void setJieshao(String jieshao) {
		this.jieshao = jieshao;
	}
	
	/**
	 * 获取：介绍
	 */
	public String getJieshao() {
		return jieshao;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
