package com.tgp.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tgp.product.entity.CategoryEntity;
import com.tgp.common.utils.PageUtils;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author tgp
 * @email 1227470298@qq.com
 * @date 2022-08-27 16:26:25
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

