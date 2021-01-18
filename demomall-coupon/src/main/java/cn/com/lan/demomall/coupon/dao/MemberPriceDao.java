package cn.com.lan.demomall.coupon.dao;

import cn.com.lan.demomall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author lan
 * @email misterlanjianglin@gmail.com
 * @date 2021-01-18 16:22:42
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
