package cn.com.lan.demomall.coupon.dao;

import cn.com.lan.demomall.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author lan
 * @email misterlanjianglin@gmail.com
 * @date 2021-01-18 16:22:42
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
