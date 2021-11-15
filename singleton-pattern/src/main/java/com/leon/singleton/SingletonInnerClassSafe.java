package com.leon.singleton;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: SingletonInnerClassSafe
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/11/15 18:08
 * @Version 1.0
 * @DESCRIPTION: 内部类
 * 使用类的静态内部类实现的单例模式，既保证了线程安全有保证了懒加载，同时不会因为加锁的方式耗费性能。
 * 这主要是因为JVM虚拟机可以保证多线程并发访问的正确性，也就是一个类的构造方法在多线程环境下可以被正确的加载。
 * 此种方式也是非常推荐使用的一种单例模式
 **/
public class SingletonInnerClassSafe {

    public SingletonInnerClassSafe() {
    }

    private static class InstanceHolder {
        private static SingletonInnerClassSafe INSTANCE = new SingletonInnerClassSafe();
    }

    public static SingletonInnerClassSafe getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
