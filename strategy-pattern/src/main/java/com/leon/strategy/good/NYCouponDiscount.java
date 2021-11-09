package com.leon.strategy.good;

import java.math.BigDecimal;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: NYCouponDiscount
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/11/9 16:30
 * @Version 1.0
 * @DESCRIPTION:
 **/
public class NYCouponDiscount implements CouponDiscount<Double> {

    /**
     * N元购
     * 1.无论原价多少，都按照固定金额购买
     *
     * @param couponInfo 折扣信息：直减、满减、折扣、N元购
     * @param skuPrice
     * @return
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        return new BigDecimal(couponInfo);
    }
}
