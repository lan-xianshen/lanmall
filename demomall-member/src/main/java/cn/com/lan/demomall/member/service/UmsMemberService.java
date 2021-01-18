package cn.com.lan.demomall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.com.lan.common.utils.PageUtils;
import cn.com.lan.demomall.member.entity.UmsMemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author lan
 * @email misterlanjianglin@gmail.com
 * @date 2021-01-18 16:30:23
 */
public interface UmsMemberService extends IService<UmsMemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

