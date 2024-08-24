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


import com.cl.dao.DiscusslvyouluxianDao;
import com.cl.entity.DiscusslvyouluxianEntity;
import com.cl.service.DiscusslvyouluxianService;
import com.cl.entity.view.DiscusslvyouluxianView;

@Service("discusslvyouluxianService")
public class DiscusslvyouluxianServiceImpl extends ServiceImpl<DiscusslvyouluxianDao, DiscusslvyouluxianEntity> implements DiscusslvyouluxianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusslvyouluxianEntity> page = this.selectPage(
                new Query<DiscusslvyouluxianEntity>(params).getPage(),
                new EntityWrapper<DiscusslvyouluxianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusslvyouluxianEntity> wrapper) {
		  Page<DiscusslvyouluxianView> page =new Query<DiscusslvyouluxianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscusslvyouluxianView> selectListView(Wrapper<DiscusslvyouluxianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusslvyouluxianView selectView(Wrapper<DiscusslvyouluxianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
