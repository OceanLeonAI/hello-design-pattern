package com.leon.bridge.good.mode;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: Mode
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/12/13 14:07
 * @Version 1.0
 * @DESCRIPTION:
 **/
public interface PayMode {

    /**
     * 风控校验
     *
     * @param uId
     * @return
     */
    boolean security(String uId);

}
