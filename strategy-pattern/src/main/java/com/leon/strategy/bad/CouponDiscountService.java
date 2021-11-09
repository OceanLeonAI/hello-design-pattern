package com.leon.strategy.bad;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: CouponDiscountService
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/11/9 15:40
 * @Version 1.0
 * @DESCRIPTION: 优惠券折扣计算接口
 * <p>
 * 优惠券类型；
 * 1. 直减券
 * 2. 满减券
 * 3. 折扣券
 * 4. n元购
 **/
public class CouponDiscountService {

    /**
     * @param type        优惠类型
     * @param typeContent 优惠金额
     * @param skuPrice    商品金额
     * @param typeExt     满减
     * @return
     */
    public double discountAmount(int type, double typeContent, double skuPrice, double typeExt) {
        // 1. 直减券
        if (1 == type) {
            return skuPrice - typeContent;
        }
        // 2. 满减券
        if (2 == type) {
            if (skuPrice < typeExt) return skuPrice;
            return skuPrice - typeContent;
        }
        // 3. 折扣券
        if (3 == type) {
            return skuPrice * typeContent;
        }
        // 4. n元购
        if (4 == type) {
            return typeContent;
        }
        return 0;
    }
}
