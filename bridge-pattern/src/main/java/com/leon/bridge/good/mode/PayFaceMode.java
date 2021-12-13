package com.leon.bridge.good.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: PayFaceMode
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/12/13 14:09
 * @Version 1.0
 * @DESCRIPTION:
 **/
public class PayFaceMode implements PayMode {

    protected Logger logger = LoggerFactory.getLogger(PayCypher.class);

    @Override
    public boolean security(String uId) {
        logger.info("人脸支付，风控校验脸部识别");
        return true;
    }

}
