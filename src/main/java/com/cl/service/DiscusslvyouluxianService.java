package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscusslvyouluxianEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusslvyouluxianView;


/**
 * 旅游路线评论表
 *
 * @author 
 * @email 
 * @date 2024-04-12 13:23:13
 */
public interface DiscusslvyouluxianService extends IService<DiscusslvyouluxianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusslvyouluxianView> selectListView(Wrapper<DiscusslvyouluxianEntity> wrapper);
   	
   	DiscusslvyouluxianView selectView(@Param("ew") Wrapper<DiscusslvyouluxianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusslvyouluxianEntity> wrapper);
   	

}

