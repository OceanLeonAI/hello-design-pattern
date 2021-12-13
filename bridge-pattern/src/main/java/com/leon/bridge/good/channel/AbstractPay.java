package com.leon.bridge.good.channel;

import com.leon.bridge.good.mode.PayMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: Pay
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/12/13 14:07
 * @Version 1.0
 * @DESCRIPTION: 在这个类中定义了支付方式的需要实现的划账接口：transfer，以及桥接接口；IPayMode，并在构造函数中用户方自行选择支付方式。
 **/
public abstract class AbstractPay {

    protected Logger logger = LoggerFactory.getLogger(AbstractPay.class);

    protected PayMode payMode;

    /**
     * @param payMode
     */
    public AbstractPay(PayMode payMode) {
        this.payMode = payMode;
    }

    /**
     * 划账接口
     *
     * @param uId
     * @param tradeId
     * @param amount
     * @return
     */
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);

}
