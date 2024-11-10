package com.entity.model;

import com.entity.DingdanshenheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 订单审核
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-15 19:47:46
 */
public class DingdanshenheModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 编号
	 */
	
	private String bianhao;
		
	/**
	 * 剧本名
	 */
	
	private String jubenming;
		
	/**
	 * 游戏时间
	 */
	
	private String youxishijian;
		
	/**
	 * 房间号
	 */
	
	private String fangjianhao;
		
	/**
	 * 状态
	 */
	
	private String zhuangtai;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：编号
	 */
	 
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	
	/**
	 * 获取：编号
	 */
	public String getBianhao() {
		return bianhao;
	}
				
	
	/**
	 * 设置：剧本名
	 */
	 
	public void setJubenming(String jubenming) {
		this.jubenming = jubenming;
	}
	
	/**
	 * 获取：剧本名
	 */
	public String getJubenming() {
		return jubenming;
	}
				
	
	/**
	 * 设置：游戏时间
	 */
	 
	public void setYouxishijian(String youxishijian) {
		this.youxishijian = youxishijian;
	}
	
	/**
	 * 获取：游戏时间
	 */
	public String getYouxishijian() {
		return youxishijian;
	}
				
	
	/**
	 * 设置：房间号
	 */
	 
	public void setFangjianhao(String fangjianhao) {
		this.fangjianhao = fangjianhao;
	}
	
	/**
	 * 获取：房间号
	 */
	public String getFangjianhao() {
		return fangjianhao;
	}
				
	
	/**
	 * 设置：状态
	 */
	 
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
