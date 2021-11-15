package com.leon.abstra.factory.bad;

import com.leon.abstra.factory.bad.cuisine.impl.CacheServiceImpl;
import org.junit.Test;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: BadTest
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/11/15 14:21
 * @Version 1.0
 * @DESCRIPTION:
 **/
public class BadTest {

    @Test
    public void test_CacheService() {

        CacheService cacheService = new CacheServiceImpl();

        cacheService.set("user_name_01", "小傅哥", 1);
        String val01 = cacheService.get("user_name_01", 1);
        System.out.println("测试结果：" + val01);

    }
}
