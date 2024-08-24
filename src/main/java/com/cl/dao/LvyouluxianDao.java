package com.cl.dao;

import com.cl.entity.LvyouluxianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.LvyouluxianView;


/**
 * 旅游路线
 * 
 * @author 
 * @email 
 * @date 2024-04-12 13:23:13
 */
public interface LvyouluxianDao extends BaseMapper<LvyouluxianEntity> {
	
	List<LvyouluxianView> selectListView(@Param("ew") Wrapper<LvyouluxianEntity> wrapper);

	List<LvyouluxianView> selectListView(Pagination page,@Param("ew") Wrapper<LvyouluxianEntity> wrapper);
	
	LvyouluxianView selectView(@Param("ew") Wrapper<LvyouluxianEntity> wrapper);
	

}
