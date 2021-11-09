package com.leon.strategy.good;

import java.math.BigDecimal;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: Context
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/11/9 16:33
 * @Version 1.0
 * @DESCRIPTION: 策略控制类
 **/
public class Context<T> {

    /**
     * 持有一个策略对象
     */
    private CouponDiscount<T> couponDiscount;

    /**
     * 传入一个具体策略对象
     *
     * @param couponDiscount
     */
    public Context(CouponDiscount<T> couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    /**
     * 根据不同策略，实现公用方法
     *
     * @param couponInfo
     * @param skuPrice
     * @return
     */
    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return couponDiscount.discountAmount(couponInfo, skuPrice);
    }

}
