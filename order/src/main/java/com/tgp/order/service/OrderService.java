package com.tgp.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tgp.common.utils.PageUtils;
import com.tgp.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author tgp
 * @email 1227470298@qq.com
 * @date 2022-08-27 18:53:25
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

