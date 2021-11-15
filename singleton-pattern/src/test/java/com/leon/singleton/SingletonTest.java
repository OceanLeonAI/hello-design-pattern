package com.leon.singleton;

import org.junit.Test;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: SingletonTest
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/11/15 18:23
 * @Version 1.0
 * @DESCRIPTION:
 **/
public class SingletonTest {

    @Test
    public void test() {
        SingletonEnumSafe instance = SingletonEnumSafe.INSTANCE;
        SingletonEnumSafe instance1 = SingletonEnumSafe.INSTANCE;
        System.out.println(instance == instance1);
    }

}
