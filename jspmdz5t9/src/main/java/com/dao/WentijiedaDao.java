package com.dao;

import com.entity.WentijiedaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WentijiedaVO;
import com.entity.view.WentijiedaView;


/**
 * 问题解答
 * 
 * @author 
 * @email 
 * @date 2021-03-10 10:26:02
 */
public interface WentijiedaDao extends BaseMapper<WentijiedaEntity> {
	
	List<WentijiedaVO> selectListVO(@Param("ew") Wrapper<WentijiedaEntity> wrapper);
	
	WentijiedaVO selectVO(@Param("ew") Wrapper<WentijiedaEntity> wrapper);
	
	List<WentijiedaView> selectListView(@Param("ew") Wrapper<WentijiedaEntity> wrapper);

	List<WentijiedaView> selectListView(Pagination page,@Param("ew") Wrapper<WentijiedaEntity> wrapper);
	
	WentijiedaView selectView(@Param("ew") Wrapper<WentijiedaEntity> wrapper);
	
}
