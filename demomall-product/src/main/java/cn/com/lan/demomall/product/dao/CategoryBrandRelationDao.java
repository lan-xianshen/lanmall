package cn.com.lan.demomall.product.dao;

import cn.com.lan.demomall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author lan
 * @email misterlanjianglin@gmail.com
 * @date 2021-01-18 15:02:49
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	
}
