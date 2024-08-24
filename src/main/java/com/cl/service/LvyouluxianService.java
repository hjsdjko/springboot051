package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.LvyouluxianEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.LvyouluxianView;


/**
 * 旅游路线
 *
 * @author 
 * @email 
 * @date 2024-04-12 13:23:13
 */
public interface LvyouluxianService extends IService<LvyouluxianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LvyouluxianView> selectListView(Wrapper<LvyouluxianEntity> wrapper);
   	
   	LvyouluxianView selectView(@Param("ew") Wrapper<LvyouluxianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LvyouluxianEntity> wrapper);
   	

}

