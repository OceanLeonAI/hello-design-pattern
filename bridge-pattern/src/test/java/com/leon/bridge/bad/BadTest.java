package com.leon.bridge.bad;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: BadTest
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/12/13 14:01
 * @Version 1.0
 * @DESCRIPTION:
 **/
public class BadTest {

    @Test
    public void badTest() {
        PayController pay = new PayController();
        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        pay.doPay("weixin_1092033111", "100000109893", new BigDecimal(100), 1, 2);

        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        pay.doPay("jlu19dlxo111", "100000109894", new BigDecimal(100), 2, 3);
    }

}
