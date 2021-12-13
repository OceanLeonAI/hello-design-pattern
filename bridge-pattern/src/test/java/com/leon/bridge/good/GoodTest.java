package com.leon.bridge.good;

import com.leon.bridge.good.channel.AbstractPay;
import com.leon.bridge.good.channel.AliPay;
import com.leon.bridge.good.channel.WechatPay;
import com.leon.bridge.good.mode.PayFaceMode;
import com.leon.bridge.good.mode.PayFingerprintMode;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: GoodTest
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/12/13 14:32
 * @Version 1.0
 * @DESCRIPTION:
 **/
public class GoodTest {

    @Test
    public void testGood() {

        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        AbstractPay wxPay = new WechatPay(new PayFaceMode());
        wxPay.transfer("weixin_1092033111", "100000109893", new BigDecimal(100));

        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        AbstractPay zfbPay = new AliPay(new PayFingerprintMode());
        zfbPay.transfer("jlu19dlxo111", "100000109894", new BigDecimal(100));

    }

}
