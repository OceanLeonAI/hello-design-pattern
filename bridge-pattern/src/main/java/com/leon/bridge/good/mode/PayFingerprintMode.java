package com.leon.bridge.good.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: PayFingerprintMode
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/12/13 14:09
 * @Version 1.0
 * @DESCRIPTION:
 **/
public class PayFingerprintMode implements PayMode {
    protected Logger logger = LoggerFactory.getLogger(PayCypher.class);

    @Override
    public boolean security(String uId) {
        logger.info("指纹支付，风控校验指纹信息");
        return true;
    }

}
