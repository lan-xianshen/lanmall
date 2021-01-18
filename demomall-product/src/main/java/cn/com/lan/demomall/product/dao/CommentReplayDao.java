package cn.com.lan.demomall.product.dao;

import cn.com.lan.demomall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author lan
 * @email misterlanjianglin@gmail.com
 * @date 2021-01-18 15:02:49
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
