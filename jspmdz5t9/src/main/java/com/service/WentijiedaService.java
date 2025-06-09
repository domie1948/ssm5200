package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WentijiedaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WentijiedaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WentijiedaView;


/**
 * 问题解答
 *
 * @author 
 * @email 
 * @date 2021-03-10 10:26:02
 */
public interface WentijiedaService extends IService<WentijiedaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WentijiedaVO> selectListVO(Wrapper<WentijiedaEntity> wrapper);
   	
   	WentijiedaVO selectVO(@Param("ew") Wrapper<WentijiedaEntity> wrapper);
   	
   	List<WentijiedaView> selectListView(Wrapper<WentijiedaEntity> wrapper);
   	
   	WentijiedaView selectView(@Param("ew") Wrapper<WentijiedaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WentijiedaEntity> wrapper);
   	
}

