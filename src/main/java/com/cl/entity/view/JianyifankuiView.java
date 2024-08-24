package com.cl.entity.view;

import com.cl.entity.JianyifankuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 建议反馈
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-12 13:23:13
 */
@TableName("jianyifankui")
public class JianyifankuiView  extends JianyifankuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianyifankuiView(){
	}
 
 	public JianyifankuiView(JianyifankuiEntity jianyifankuiEntity){
 	try {
			BeanUtils.copyProperties(this, jianyifankuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
