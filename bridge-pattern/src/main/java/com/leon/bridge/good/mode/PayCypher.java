package com.leon.bridge.good.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: PayCypher
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/12/13 14:08
 * @Version 1.0
 * @DESCRIPTION:
 **/
public class PayCypher implements PayMode {


    protected Logger logger = LoggerFactory.getLogger(PayCypher.class);

    @Override
    public boolean security(String uId) {
        logger.info("密码支付，风控校验环境安全");
        return true;
    }

}
