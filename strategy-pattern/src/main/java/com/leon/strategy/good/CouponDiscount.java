package com.leon.strategy.good;

import java.math.BigDecimal;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: CouponDiscount
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/11/9 15:50
 * @Version 1.0
 * @DESCRIPTION:
 **/
public interface CouponDiscount<T> {

    /**
     * 优惠群金额计算
     *
     * @param couponInfo 折扣信息：直减、满减、折扣、N元购
     * @param skuPrice
     * @return
     */
    BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);
}
