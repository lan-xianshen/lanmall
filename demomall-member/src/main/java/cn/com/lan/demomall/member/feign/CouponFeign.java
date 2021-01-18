package cn.com.lan.demomall.member.feign;

import cn.com.lan.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jianglin.lan
 * @title: CouponFeign
 * @projectName lanmall
 * @description: TODO
 * @date 2021/1/1817:50
 */
@Component
@FeignClient("demomall-coupon")
public interface CouponFeign {

    @RequestMapping("/coupon/coupon/member/list")
    public R getCoupon();
}
