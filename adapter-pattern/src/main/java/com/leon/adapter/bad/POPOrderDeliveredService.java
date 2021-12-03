package com.leon.adapter.bad;

import com.alibaba.fastjson.JSON;
import com.leon.mq.POPOrderDelivered;

public class POPOrderDeliveredService {

    public void onMessage(String message) {

        POPOrderDelivered mq = JSON.parseObject(message, POPOrderDelivered.class);

        mq.getuId();
        mq.getOrderId();
        mq.getOrderTime();

        // ... 处理自己的业务
    }

}
