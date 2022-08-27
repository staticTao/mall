package com.tgp.order.dao;

import com.tgp.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author tgp
 * @email 1227470298@qq.com
 * @date 2022-08-27 18:53:25
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
