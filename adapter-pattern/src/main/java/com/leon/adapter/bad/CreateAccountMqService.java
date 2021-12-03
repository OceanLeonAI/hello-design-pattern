package com.leon.adapter.bad;

import com.alibaba.fastjson.JSON;
import com.leon.mq.CreateAccount;

public class CreateAccountMqService {

    public void onMessage(String message) {

        CreateAccount mq = JSON.parseObject(message, CreateAccount.class);

        mq.getNumber();
        mq.getAccountDate();

        // ... 处理自己的业务
    }

}
