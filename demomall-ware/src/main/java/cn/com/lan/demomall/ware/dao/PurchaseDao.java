package cn.com.lan.demomall.ware.dao;

import cn.com.lan.demomall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author lan
 * @email misterlanjianglin@gmail.com
 * @date 2021-01-18 16:52:23
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
