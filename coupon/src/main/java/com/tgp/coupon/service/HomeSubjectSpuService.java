package com.tgp.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tgp.common.utils.PageUtils;
import com.tgp.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * δΈι’εε
 *
 * @author tgp
 * @email 1227470298@qq.com
 * @date 2022-08-27 18:42:54
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

