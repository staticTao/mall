package com.tgp.product;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tgp.product.entity.BrandEntity;
import com.tgp.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductApplicationTests {

	@Autowired
	BrandService brandService;
	@Test
	void contextLoads() {
//		BrandEntity brandEntity = new BrandEntity();
//		brandEntity.setName("huawei1");
//		brandEntity.setBrandId(1L);
//		brandService.updateById(brandEntity);
//		System.out.println("保存成功！");
		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", "1"));
		list.forEach((e)->{
			System.out.println(e);
		});
	}

}
