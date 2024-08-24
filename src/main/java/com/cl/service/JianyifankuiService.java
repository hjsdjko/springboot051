package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.JianyifankuiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JianyifankuiView;


/**
 * 建议反馈
 *
 * @author 
 * @email 
 * @date 2024-04-12 13:23:13
 */
public interface JianyifankuiService extends IService<JianyifankuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianyifankuiView> selectListView(Wrapper<JianyifankuiEntity> wrapper);
   	
   	JianyifankuiView selectView(@Param("ew") Wrapper<JianyifankuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianyifankuiEntity> wrapper);
   	

}

