package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.JianyifankuiDao;
import com.cl.entity.JianyifankuiEntity;
import com.cl.service.JianyifankuiService;
import com.cl.entity.view.JianyifankuiView;

@Service("jianyifankuiService")
public class JianyifankuiServiceImpl extends ServiceImpl<JianyifankuiDao, JianyifankuiEntity> implements JianyifankuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianyifankuiEntity> page = this.selectPage(
                new Query<JianyifankuiEntity>(params).getPage(),
                new EntityWrapper<JianyifankuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianyifankuiEntity> wrapper) {
		  Page<JianyifankuiView> page =new Query<JianyifankuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<JianyifankuiView> selectListView(Wrapper<JianyifankuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianyifankuiView selectView(Wrapper<JianyifankuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
