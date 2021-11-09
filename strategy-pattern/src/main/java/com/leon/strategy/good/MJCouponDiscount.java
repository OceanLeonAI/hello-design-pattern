package com.leon.strategy.good;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: MJCouponDiscount
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/11/9 15:53
 * @Version 1.0
 * @DESCRIPTION: 满减
 **/
public class MJCouponDiscount implements CouponDiscount<Map<String, String>> {
    /**
     * 满减计算：
     * 1.判断满足X元减N，否则不减
     * 2.最低支付1元
     *
     * @param couponInfo 折扣信息：直减、满减、折扣、N元购
     * @param skuPrice
     * @return
     */
    @Override
    public BigDecimal discountAmount(Map<String, String> couponInfo, BigDecimal skuPrice) {
        String x = couponInfo.get("x"); // 满减条件
        String o = couponInfo.get("o"); // 优惠金额

        // 不满足满减条件，直接返回商品原价
        if (skuPrice.compareTo(new BigDecimal(x)) < 0) {
            return skuPrice;
        }

        // 减去优惠金额判断
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(o));
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) {
            return BigDecimal.ONE;
        }

        return discountAmount;
    }
}
