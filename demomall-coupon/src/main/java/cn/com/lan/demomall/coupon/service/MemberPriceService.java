package cn.com.lan.demomall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.com.lan.common.utils.PageUtils;
import cn.com.lan.demomall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author lan
 * @email misterlanjianglin@gmail.com
 * @date 2021-01-18 16:22:42
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

