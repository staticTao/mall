package com.tgp.product.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.tgp.common.utils.PageUtils;
import com.tgp.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author tgp
 * @email 1227470298@qq.com
 * @date 2022-08-27 16:26:26
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

