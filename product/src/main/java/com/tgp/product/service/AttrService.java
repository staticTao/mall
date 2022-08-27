package com.tgp.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tgp.common.utils.PageUtils;
import com.tgp.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author tgp
 * @email 1227470298@qq.com
 * @date 2022-08-27 16:26:26
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

