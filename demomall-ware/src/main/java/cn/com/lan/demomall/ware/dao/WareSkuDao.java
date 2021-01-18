package cn.com.lan.demomall.ware.dao;

import cn.com.lan.demomall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author lan
 * @email misterlanjianglin@gmail.com
 * @date 2021-01-18 16:52:22
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
