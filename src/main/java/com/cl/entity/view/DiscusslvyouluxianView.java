package com.cl.entity.view;

import com.cl.entity.DiscusslvyouluxianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 旅游路线评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-12 13:23:13
 */
@TableName("discusslvyouluxian")
public class DiscusslvyouluxianView  extends DiscusslvyouluxianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusslvyouluxianView(){
	}
 
 	public DiscusslvyouluxianView(DiscusslvyouluxianEntity discusslvyouluxianEntity){
 	try {
			BeanUtils.copyProperties(this, discusslvyouluxianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
