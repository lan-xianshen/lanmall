package cn.com.lan.demomall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.com.lan.common.utils.PageUtils;
import cn.com.lan.demomall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author lan
 * @email misterlanjianglin@gmail.com
 * @date 2021-01-18 16:52:22
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

