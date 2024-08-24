package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 旅游路线
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-12 13:23:13
 */
@TableName("lvyouluxian")
public class LvyouluxianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LvyouluxianEntity() {
		
	}
	
	public LvyouluxianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 路线名称
	 */
					
	private String luxianmingcheng;
	
	/**
	 * 景点名称
	 */
					
	private String jingdianmingcheng;
	
	/**
	 * 景点介绍
	 */
					
	private String jingdianjieshao;
	
	/**
	 * 路线图片
	 */
					
	private String luxiantupian;
	
	/**
	 * 起点
	 */
					
	private String qidian;
	
	/**
	 * 途径路段
	 */
					
	private String tujingluduan;
	
	/**
	 * 目的地
	 */
					
	private String mudedi;
	
	/**
	 * 出行方式
	 */
					
	private String chuxingfangshi;
	
	/**
	 * 路线价格
	 */
					
	private Double luxianjiage;
	
	/**
	 * 路线介绍
	 */
					
	private String luxianjieshao;
	
	/**
	 * 行程天数
	 */
					
	private String xingchengtianshu;
	
	/**
	 * 行程安排
	 */
					
	private String xingchenganpai;
	
	/**
	 * 收藏数量
	 */
					
	private Integer storeupnum;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：路线名称
	 */
	public void setLuxianmingcheng(String luxianmingcheng) {
		this.luxianmingcheng = luxianmingcheng;
	}
	/**
	 * 获取：路线名称
	 */
	public String getLuxianmingcheng() {
		return luxianmingcheng;
	}
	/**
	 * 设置：景点名称
	 */
	public void setJingdianmingcheng(String jingdianmingcheng) {
		this.jingdianmingcheng = jingdianmingcheng;
	}
	/**
	 * 获取：景点名称
	 */
	public String getJingdianmingcheng() {
		return jingdianmingcheng;
	}
	/**
	 * 设置：景点介绍
	 */
	public void setJingdianjieshao(String jingdianjieshao) {
		this.jingdianjieshao = jingdianjieshao;
	}
	/**
	 * 获取：景点介绍
	 */
	public String getJingdianjieshao() {
		return jingdianjieshao;
	}
	/**
	 * 设置：路线图片
	 */
	public void setLuxiantupian(String luxiantupian) {
		this.luxiantupian = luxiantupian;
	}
	/**
	 * 获取：路线图片
	 */
	public String getLuxiantupian() {
		return luxiantupian;
	}
	/**
	 * 设置：起点
	 */
	public void setQidian(String qidian) {
		this.qidian = qidian;
	}
	/**
	 * 获取：起点
	 */
	public String getQidian() {
		return qidian;
	}
	/**
	 * 设置：途径路段
	 */
	public void setTujingluduan(String tujingluduan) {
		this.tujingluduan = tujingluduan;
	}
	/**
	 * 获取：途径路段
	 */
	public String getTujingluduan() {
		return tujingluduan;
	}
	/**
	 * 设置：目的地
	 */
	public void setMudedi(String mudedi) {
		this.mudedi = mudedi;
	}
	/**
	 * 获取：目的地
	 */
	public String getMudedi() {
		return mudedi;
	}
	/**
	 * 设置：出行方式
	 */
	public void setChuxingfangshi(String chuxingfangshi) {
		this.chuxingfangshi = chuxingfangshi;
	}
	/**
	 * 获取：出行方式
	 */
	public String getChuxingfangshi() {
		return chuxingfangshi;
	}
	/**
	 * 设置：路线价格
	 */
	public void setLuxianjiage(Double luxianjiage) {
		this.luxianjiage = luxianjiage;
	}
	/**
	 * 获取：路线价格
	 */
	public Double getLuxianjiage() {
		return luxianjiage;
	}
	/**
	 * 设置：路线介绍
	 */
	public void setLuxianjieshao(String luxianjieshao) {
		this.luxianjieshao = luxianjieshao;
	}
	/**
	 * 获取：路线介绍
	 */
	public String getLuxianjieshao() {
		return luxianjieshao;
	}
	/**
	 * 设置：行程天数
	 */
	public void setXingchengtianshu(String xingchengtianshu) {
		this.xingchengtianshu = xingchengtianshu;
	}
	/**
	 * 获取：行程天数
	 */
	public String getXingchengtianshu() {
		return xingchengtianshu;
	}
	/**
	 * 设置：行程安排
	 */
	public void setXingchenganpai(String xingchenganpai) {
		this.xingchenganpai = xingchenganpai;
	}
	/**
	 * 获取：行程安排
	 */
	public String getXingchenganpai() {
		return xingchenganpai;
	}
	/**
	 * 设置：收藏数量
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数量
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}

}
