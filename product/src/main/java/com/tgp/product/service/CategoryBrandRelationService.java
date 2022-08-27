package com.tgp.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tgp.product.entity.CategoryBrandRelationEntity;
import com.tgp.common.utils.PageUtils;
import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author tgp
 * @email 1227470298@qq.com
 * @date 2022-08-27 16:26:25
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

