package com.entity.view;

import com.entity.WentijiedaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 问题解答
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-10 10:26:02
 */
@TableName("wentijieda")
public class WentijiedaView  extends WentijiedaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WentijiedaView(){
	}
 
 	public WentijiedaView(WentijiedaEntity wentijiedaEntity){
 	try {
			BeanUtils.copyProperties(this, wentijiedaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
