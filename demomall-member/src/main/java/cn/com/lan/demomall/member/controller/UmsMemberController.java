package cn.com.lan.demomall.member.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import cn.com.lan.demomall.member.feign.CouponFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.com.lan.demomall.member.entity.UmsMemberEntity;
import cn.com.lan.demomall.member.service.UmsMemberService;
import cn.com.lan.common.utils.PageUtils;
import cn.com.lan.common.utils.R;

import javax.annotation.Resource;


/**
 * 会员
 *
 * @author lan
 * @email misterlanjianglin@gmail.com
 * @date 2021-01-18 16:30:23
 */
@RestController
@RequestMapping("member/umsmember")
public class UmsMemberController {
    @Autowired
    private UmsMemberService umsMemberService;

    @Resource
    private CouponFeign couponFeign;

    @RequestMapping("/getCoupon")
    public R test(){
        UmsMemberEntity umsMemberEntity = new UmsMemberEntity ();
        umsMemberEntity.setNickname ("哈哈哈哈");
        couponFeign.getCoupon ();
        return R.ok ().put ("member", umsMemberEntity).put ("coupon", couponFeign.getCoupon ());
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:umsmember:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = umsMemberService.queryPage(params);

        System.out.println ("list");
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:umsmember:info")
    public R info(@PathVariable("id") Long id){
		UmsMemberEntity umsMember = umsMemberService.getById(id);

        return R.ok().put("umsMember", umsMember);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:umsmember:save")
    public R save(@RequestBody UmsMemberEntity umsMember){
		umsMemberService.save(umsMember);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   // @RequiresPermissions("member:umsmember:update")
    public R update(@RequestBody UmsMemberEntity umsMember){
		umsMemberService.updateById(umsMember);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:umsmember:delete")
    public R delete(@RequestBody Long[] ids){
		umsMemberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
