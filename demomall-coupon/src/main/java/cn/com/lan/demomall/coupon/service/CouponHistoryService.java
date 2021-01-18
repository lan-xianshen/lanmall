package cn.com.lan.demomall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.com.lan.common.utils.PageUtils;
import cn.com.lan.demomall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author lan
 * @email misterlanjianglin@gmail.com
 * @date 2021-01-18 16:22:42
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

