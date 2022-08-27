package com.tgp.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tgp.common.utils.PageUtils;
import com.tgp.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author tgp
 * @email 1227470298@qq.com
 * @date 2022-08-27 18:56:58
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

