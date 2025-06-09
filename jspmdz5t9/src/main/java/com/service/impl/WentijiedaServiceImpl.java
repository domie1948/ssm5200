package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WentijiedaDao;
import com.entity.WentijiedaEntity;
import com.service.WentijiedaService;
import com.entity.vo.WentijiedaVO;
import com.entity.view.WentijiedaView;

@Service("wentijiedaService")
public class WentijiedaServiceImpl extends ServiceImpl<WentijiedaDao, WentijiedaEntity> implements WentijiedaService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WentijiedaEntity> page = this.selectPage(
                new Query<WentijiedaEntity>(params).getPage(),
                new EntityWrapper<WentijiedaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WentijiedaEntity> wrapper) {
		  Page<WentijiedaView> page =new Query<WentijiedaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WentijiedaVO> selectListVO(Wrapper<WentijiedaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WentijiedaVO selectVO(Wrapper<WentijiedaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WentijiedaView> selectListView(Wrapper<WentijiedaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WentijiedaView selectView(Wrapper<WentijiedaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
