package com.leon.strategy.good;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: CouponDiscountTest
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/11/9 16:38
 * @Version 1.0
 * @DESCRIPTION:
 **/
public class CouponDiscountTest {

    // 定义日志记录器对象,logback
    public static final Logger LOGGER = LoggerFactory.getLogger(CouponDiscountTest.class);


    /**
     * 满减测试
     * 满100减10，商品100
     */
    @Test
    public void testMJ() {

        Map<String, String> map = new HashMap<>();
        map.put("x", "100"); // 满减条件
        map.put("o", "10"); // 优惠金额

        // 实例化一个策略
        CouponDiscount couponDiscount = new MJCouponDiscount();

        // 初始化应用山下文
        Context context = new Context(couponDiscount);

        // 获取满减后的价格
        BigDecimal discountAmount = context.discountAmount(map, new BigDecimal(100));

        LOGGER.info("满减后优惠价格为：{}", discountAmount);
    }
}
