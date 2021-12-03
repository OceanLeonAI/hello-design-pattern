package com.leon.adapter.good.service.impl;

import com.leon.adapter.good.service.OrderAdapterService;
import com.leon.service.POPOrderService;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: POPOrderAdapterServiceImpl
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/12/3 20:26
 * @Version 1.0
 * @DESCRIPTION:
 **/
public class POPOrderAdapterServiceImpl implements OrderAdapterService {

    POPOrderService popOrderService = new POPOrderService();

    @Override
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }
}
