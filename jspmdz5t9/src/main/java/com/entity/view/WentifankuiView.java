package com.entity.view;

import com.entity.WentifankuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 问题反馈
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-10 10:26:02
 */
@TableName("wentifankui")
public class WentifankuiView  extends WentifankuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WentifankuiView(){
	}
 
 	public WentifankuiView(WentifankuiEntity wentifankuiEntity){
 	try {
			BeanUtils.copyProperties(this, wentifankuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
