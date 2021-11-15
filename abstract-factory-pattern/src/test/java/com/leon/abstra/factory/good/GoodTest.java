package com.leon.abstra.factory.good;

import com.leon.abstra.factory.good.factory.JDKProxy;
import com.leon.abstra.factory.good.factory.impl.EGMCacheAdapter;
import com.leon.abstra.factory.good.factory.impl.IIRCacheAdapter;
import com.leon.abstra.factory.good.impl.CacheServiceImpl;
import org.junit.Test;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: GoodTest
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/11/15 14:31
 * @Version 1.0
 * @DESCRIPTION:
 **/
public class GoodTest {

    @Test
    public void test_CacheService() throws Exception {

        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "小傅哥");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println("测试结果：" + val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01", "小傅哥");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println("测试结果：" + val02);

    }

}
