package com.leon.bridge.bad;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: PayController
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/12/13 14:00
 * @Version 1.0
 * @DESCRIPTION:
 **/
public class PayController {

    private Logger logger = LoggerFactory.getLogger(PayController.class);

    /**
     * @param uId         用户ID
     * @param tradeId     交易ID
     * @param amount      金额
     * @param channelType 渠道
     * @param modeType    模式
     * @return
     */
    public boolean doPay(String uId, String tradeId, BigDecimal amount, int channelType, int modeType) {
        // 微信支付
        if (1 == channelType) {
            logger.info("模拟微信渠道支付划账开始。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
            if (1 == modeType) {
                logger.info("密码支付，风控校验环境安全");
            } else if (2 == modeType) {
                logger.info("人脸支付，风控校验脸部识别");
            } else if (3 == modeType) {
                logger.info("指纹支付，风控校验指纹信息");
            }
        }
        // 支付宝支付
        else if (2 == channelType) {
            logger.info("模拟支付宝渠道支付划账开始。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
            if (1 == modeType) {
                logger.info("密码支付，风控校验环境安全");
            } else if (2 == modeType) {
                logger.info("人脸支付，风控校验脸部识别");
            } else if (3 == modeType) {
                logger.info("指纹支付，风控校验指纹信息");
            }
        }
        return true;
    }

}
