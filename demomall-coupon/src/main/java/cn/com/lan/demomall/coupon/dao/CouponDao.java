package cn.com.lan.demomall.coupon.dao;

import cn.com.lan.demomall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lan
 * @email misterlanjianglin@gmail.com
 * @date 2021-01-18 16:22:42
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
