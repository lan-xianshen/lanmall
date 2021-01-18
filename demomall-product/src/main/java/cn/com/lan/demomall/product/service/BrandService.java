package cn.com.lan.demomall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.com.lan.common.utils.PageUtils;
import cn.com.lan.demomall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author lan
 * @email misterlanjianglin@gmail.com
 * @date 2021-01-18 15:02:49
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

