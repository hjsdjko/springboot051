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


import com.cl.dao.LvyouluxianDao;
import com.cl.entity.LvyouluxianEntity;
import com.cl.service.LvyouluxianService;
import com.cl.entity.view.LvyouluxianView;

@Service("lvyouluxianService")
public class LvyouluxianServiceImpl extends ServiceImpl<LvyouluxianDao, LvyouluxianEntity> implements LvyouluxianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LvyouluxianEntity> page = this.selectPage(
                new Query<LvyouluxianEntity>(params).getPage(),
                new EntityWrapper<LvyouluxianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LvyouluxianEntity> wrapper) {
		  Page<LvyouluxianView> page =new Query<LvyouluxianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<LvyouluxianView> selectListView(Wrapper<LvyouluxianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LvyouluxianView selectView(Wrapper<LvyouluxianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
