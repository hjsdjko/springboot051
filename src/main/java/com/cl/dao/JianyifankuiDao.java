package com.cl.dao;

import com.cl.entity.JianyifankuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JianyifankuiView;


/**
 * 建议反馈
 * 
 * @author 
 * @email 
 * @date 2024-04-12 13:23:13
 */
public interface JianyifankuiDao extends BaseMapper<JianyifankuiEntity> {
	
	List<JianyifankuiView> selectListView(@Param("ew") Wrapper<JianyifankuiEntity> wrapper);

	List<JianyifankuiView> selectListView(Pagination page,@Param("ew") Wrapper<JianyifankuiEntity> wrapper);
	
	JianyifankuiView selectView(@Param("ew") Wrapper<JianyifankuiEntity> wrapper);
	

}
