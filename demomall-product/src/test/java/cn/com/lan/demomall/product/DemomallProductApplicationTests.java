package cn.com.lan.demomall.product;

import cn.com.lan.demomall.product.entity.BrandEntity;
import cn.com.lan.demomall.product.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Slf4j
class DemomallProductApplicationTests {

    @Resource
    BrandService brandService;

    @Test
    void contextLoads () {
        BrandEntity brandEntity = new BrandEntity ();
        brandEntity.setName ("小米");
        brandService.save (brandEntity);
        log.info ("保存成功。。。");


    }

}
