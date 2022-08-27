package com.tgp.product.dao;

import com.tgp.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author tgp
 * @email 1227470298@qq.com
 * @date 2022-08-27 16:26:25
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
