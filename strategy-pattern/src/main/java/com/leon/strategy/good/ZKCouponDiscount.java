package com.leon.strategy.good;

import java.math.BigDecimal;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: ZKCouponDiscount
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/11/9 16:25
 * @Version 1.0
 * @DESCRIPTION: 折扣
 **/
public class ZKCouponDiscount implements CouponDiscount<Double> {

    /**
     * 折扣计算
     * 1.商品价格乘以折扣比例，得到应付金额
     * 2.保留两位小数
     * 3.最低支付金额1元
     *
     * @param couponInfo 折扣信息：直减、满减、折扣、N元购
     * @param skuPrice
     * @return
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discountAmount = skuPrice.multiply(new BigDecimal(couponInfo))
                .setScale(2, BigDecimal.ROUND_HALF_UP);

        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) {
            return BigDecimal.ONE;
        }

        return discountAmount;
    }
}
