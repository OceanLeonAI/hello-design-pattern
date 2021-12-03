package com.leon.adapter.good.service.impl;

import com.leon.adapter.good.service.OrderAdapterService;
import com.leon.service.OrderService;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: InsideOrderAdapterServiceImpl
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/12/3 20:25
 * @Version 1.0
 * @DESCRIPTION:
 **/
public class InsideOrderAdapterServiceImpl implements OrderAdapterService {

    OrderService orderService = new OrderService();

    /**
     * 判断是否首单
     *
     * @param uId 订单id
     * @return
     */
    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }
}
