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


import com.cl.dao.JingdianfenleiDao;
import com.cl.entity.JingdianfenleiEntity;
import com.cl.service.JingdianfenleiService;
import com.cl.entity.view.JingdianfenleiView;

@Service("jingdianfenleiService")
public class JingdianfenleiServiceImpl extends ServiceImpl<JingdianfenleiDao, JingdianfenleiEntity> implements JingdianfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingdianfenleiEntity> page = this.selectPage(
                new Query<JingdianfenleiEntity>(params).getPage(),
                new EntityWrapper<JingdianfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingdianfenleiEntity> wrapper) {
		  Page<JingdianfenleiView> page =new Query<JingdianfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<JingdianfenleiView> selectListView(Wrapper<JingdianfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingdianfenleiView selectView(Wrapper<JingdianfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
