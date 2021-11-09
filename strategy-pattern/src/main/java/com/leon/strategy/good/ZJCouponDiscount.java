package com.leon.strategy.good;

import java.math.BigDecimal;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: ZJCouponDiscount
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/11/9 16:21
 * @Version 1.0
 * @DESCRIPTION: 直减
 **/
public class ZJCouponDiscount implements CouponDiscount<Double> {

    /**
     * 直减计算
     * 1.使用商品价格减去优惠价格
     * 2.最低支付金额1元
     *
     * @param couponInfo 折扣信息：直减、满减、折扣、N元购
     * @param skuPrice
     * @return
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(couponInfo));

        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) {
            return BigDecimal.ONE;
        }

        return discountAmount;
    }
}
