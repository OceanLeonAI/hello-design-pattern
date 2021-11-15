package com.leon.singleton;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: SingletonDoubleCheckSafe
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/11/15 18:11
 * @Version 1.0
 * @DESCRIPTION: 单例模式双重锁
 * 双重锁的方式是方法级锁的优化，减少了部分获取实例的耗时。
 * 同时这种方式也满足了懒加载。
 **/
public class SingletonDoubleCheckSafe {

    private static volatile SingletonDoubleCheckSafe INSTANCE;

    private SingletonDoubleCheckSafe() {
    }

    public static SingletonDoubleCheckSafe getInstance() {

        if (null != INSTANCE) {
            return INSTANCE;
        }

        synchronized (SingletonDoubleCheckSafe.class) {
            if (null == INSTANCE) {
                INSTANCE = new SingletonDoubleCheckSafe();
            }
        }

        return INSTANCE;
    }
}
