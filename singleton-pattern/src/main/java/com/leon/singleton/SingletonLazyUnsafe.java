package com.leon.singleton;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: SingletonLazyUnsafe
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/11/15 17:55
 * @Version 1.0
 * @DESCRIPTION: 懒汉模式费线程不安全，类别多人抢座位
 **/
public class SingletonLazyUnsafe {

    private static SingletonLazyUnsafe INSTANCE;

    /**
     * 私有化构造防止外部实例化对象
     */
    public SingletonLazyUnsafe() {
    }

    public static SingletonLazyUnsafe getInstance() {

        if (null != INSTANCE) {
            return INSTANCE;
        }

        INSTANCE = new SingletonLazyUnsafe();
        return INSTANCE;
    }
}
