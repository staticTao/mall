package com.tgp.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tgp.common.utils.PageUtils;
import com.tgp.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author tgp
 * @email 1227470298@qq.com
 * @date 2022-08-27 18:50:17
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

