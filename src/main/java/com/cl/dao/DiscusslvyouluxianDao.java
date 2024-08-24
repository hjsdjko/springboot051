package com.cl.dao;

import com.cl.entity.DiscusslvyouluxianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusslvyouluxianView;


/**
 * 旅游路线评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-12 13:23:13
 */
public interface DiscusslvyouluxianDao extends BaseMapper<DiscusslvyouluxianEntity> {
	
	List<DiscusslvyouluxianView> selectListView(@Param("ew") Wrapper<DiscusslvyouluxianEntity> wrapper);

	List<DiscusslvyouluxianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusslvyouluxianEntity> wrapper);
	
	DiscusslvyouluxianView selectView(@Param("ew") Wrapper<DiscusslvyouluxianEntity> wrapper);
	

}
