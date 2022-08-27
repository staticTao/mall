package com.tgp.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tgp.common.utils.PageUtils;
import com.tgp.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author tgp
 * @email 1227470298@qq.com
 * @date 2022-08-27 18:50:17
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

