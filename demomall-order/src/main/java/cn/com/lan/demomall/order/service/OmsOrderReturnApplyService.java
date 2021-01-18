package cn.com.lan.demomall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.com.lan.common.utils.PageUtils;
import cn.com.lan.demomall.order.entity.OmsOrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author lan
 * @email misterlanjianglin@gmail.com
 * @date 2021-01-18 16:36:00
 */
public interface OmsOrderReturnApplyService extends IService<OmsOrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

