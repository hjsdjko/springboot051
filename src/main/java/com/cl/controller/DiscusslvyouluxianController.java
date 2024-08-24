package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.DiscusslvyouluxianEntity;
import com.cl.entity.view.DiscusslvyouluxianView;

import com.cl.service.DiscusslvyouluxianService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.EncryptUtil;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 旅游路线评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-12 13:23:13
 */
@RestController
@RequestMapping("/discusslvyouluxian")
public class DiscusslvyouluxianController {
    @Autowired
    private DiscusslvyouluxianService discusslvyouluxianService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusslvyouluxianEntity discusslvyouluxian,
		HttpServletRequest request){
        EntityWrapper<DiscusslvyouluxianEntity> ew = new EntityWrapper<DiscusslvyouluxianEntity>();

		PageUtils page = discusslvyouluxianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusslvyouluxian), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusslvyouluxianEntity discusslvyouluxian, 
		HttpServletRequest request){
        EntityWrapper<DiscusslvyouluxianEntity> ew = new EntityWrapper<DiscusslvyouluxianEntity>();

		PageUtils page = discusslvyouluxianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusslvyouluxian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusslvyouluxianEntity discusslvyouluxian){
       	EntityWrapper<DiscusslvyouluxianEntity> ew = new EntityWrapper<DiscusslvyouluxianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusslvyouluxian, "discusslvyouluxian")); 
        return R.ok().put("data", discusslvyouluxianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusslvyouluxianEntity discusslvyouluxian){
        EntityWrapper< DiscusslvyouluxianEntity> ew = new EntityWrapper< DiscusslvyouluxianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusslvyouluxian, "discusslvyouluxian")); 
		DiscusslvyouluxianView discusslvyouluxianView =  discusslvyouluxianService.selectView(ew);
		return R.ok("查询旅游路线评论表成功").put("data", discusslvyouluxianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusslvyouluxianEntity discusslvyouluxian = discusslvyouluxianService.selectById(id);
		discusslvyouluxian = discusslvyouluxianService.selectView(new EntityWrapper<DiscusslvyouluxianEntity>().eq("id", id));
        return R.ok().put("data", discusslvyouluxian);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusslvyouluxianEntity discusslvyouluxian = discusslvyouluxianService.selectById(id);
		discusslvyouluxian = discusslvyouluxianService.selectView(new EntityWrapper<DiscusslvyouluxianEntity>().eq("id", id));
        return R.ok().put("data", discusslvyouluxian);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusslvyouluxianEntity discusslvyouluxian, HttpServletRequest request){
    	discusslvyouluxian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusslvyouluxian);
        discusslvyouluxianService.insert(discusslvyouluxian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusslvyouluxianEntity discusslvyouluxian, HttpServletRequest request){
    	discusslvyouluxian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusslvyouluxian);
        discusslvyouluxianService.insert(discusslvyouluxian);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @IgnoreAuth
    public R update(@RequestBody DiscusslvyouluxianEntity discusslvyouluxian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusslvyouluxian);
        discusslvyouluxianService.updateById(discusslvyouluxian);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusslvyouluxianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,DiscusslvyouluxianEntity discusslvyouluxian, HttpServletRequest request,String pre){
        EntityWrapper<DiscusslvyouluxianEntity> ew = new EntityWrapper<DiscusslvyouluxianEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = discusslvyouluxianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusslvyouluxian), params), params));
        return R.ok().put("data", page);
    }








}
