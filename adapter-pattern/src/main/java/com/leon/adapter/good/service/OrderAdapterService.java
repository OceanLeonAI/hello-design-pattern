package com.leon.adapter.good.service;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: OrderAdapterService
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/12/3 20:24
 * @Version 1.0
 * @DESCRIPTION:
 **/
public interface OrderAdapterService {

    /**
     * 判断是否首单
     *
     * @param uId 订单id
     * @return
     */
    boolean isFirst(String uId);

}
