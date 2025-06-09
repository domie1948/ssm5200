package com.dao;

import com.entity.GuahaoyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuahaoyuyueVO;
import com.entity.view.GuahaoyuyueView;


/**
 * 挂号预约
 * 
 * @author 
 * @email 
 * @date 2021-03-10 10:26:02
 */
public interface GuahaoyuyueDao extends BaseMapper<GuahaoyuyueEntity> {
	
	List<GuahaoyuyueVO> selectListVO(@Param("ew") Wrapper<GuahaoyuyueEntity> wrapper);
	
	GuahaoyuyueVO selectVO(@Param("ew") Wrapper<GuahaoyuyueEntity> wrapper);
	
	List<GuahaoyuyueView> selectListView(@Param("ew") Wrapper<GuahaoyuyueEntity> wrapper);

	List<GuahaoyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<GuahaoyuyueEntity> wrapper);
	
	GuahaoyuyueView selectView(@Param("ew") Wrapper<GuahaoyuyueEntity> wrapper);
	
}
