package cn.com.lan.demomall.order.dao;

import cn.com.lan.demomall.order.entity.OmsPaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author lan
 * @email misterlanjianglin@gmail.com
 * @date 2021-01-18 16:36:00
 */
@Mapper
public interface OmsPaymentInfoDao extends BaseMapper<OmsPaymentInfoEntity> {
	
}
