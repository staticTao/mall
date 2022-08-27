package com.tgp.product.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.tgp.common.utils.PageUtils;
import com.tgp.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author tgp
 * @email 1227470298@qq.com
 * @date 2022-08-27 16:26:26
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

