package com.leon.singleton;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: SingletonLazyUnsafe
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/11/15 17:55
 * @Version 1.0
 * @DESCRIPTION: 懒汉模式费线程安全
 * 此种模式虽然是安全的，但由于把锁加到方法上后，所有的访问都因需要锁占用导致资源的浪费。如果不是特殊情况下，不建议此种方式实现单例模式。
 **/
public class SingletonLazySafe {

    private static SingletonLazySafe INSTANCE;

    /**
     * 私有化构造防止外部实例化对象
     */
    public SingletonLazySafe() {
    }

    public static synchronized SingletonLazySafe getInstance() {

        if (null != INSTANCE) {
            return INSTANCE;
        }

        INSTANCE = new SingletonLazySafe();
        return INSTANCE;
    }
}
