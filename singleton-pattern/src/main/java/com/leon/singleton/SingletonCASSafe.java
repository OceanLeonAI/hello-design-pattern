package com.leon.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: SingletonCASSafe
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/11/15 18:18
 * @Version 1.0
 * @DESCRIPTION: CAS 单例模式
 * <p>
 * java并发库提供了很多原子类来支持并发访问的数据安全性；AtomicInteger、AtomicBoolean、AtomicLong、AtomicReference。
 * AtomicReference<V> 可以封装引用一个V实例，支持并发访问如上的单例方式就是使用了这样的一个特点。
 * 使用CAS的好处就是不需要使用传统的加锁方式保证线程安全，而是依赖于CAS的忙等算法，依赖于底层硬件的实现，来保证线程安全。相对于其他锁的实现没有线程的切换和阻塞也就没有了额外的开销，并且可以支持较大的并发性。
 * 当然CAS也有一个缺点就是忙等，如果一直没有获取到将会处于死循环中
 **/
public class SingletonCASSafe {

    private static final AtomicReference<SingletonCASSafe> INSTANCE = new AtomicReference<SingletonCASSafe>();

    private static SingletonCASSafe instance;

    private SingletonCASSafe() {
    }

    public static final SingletonCASSafe getInstance() {
        for (; ; ) {
            SingletonCASSafe instance = INSTANCE.get();
            if (null != instance) return instance;
            INSTANCE.compareAndSet(null, new SingletonCASSafe());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        System.out.println(SingletonCASSafe.getInstance()); // org.itstack.demo.design.SingletonCASSafe@2b193f2d
        System.out.println(SingletonCASSafe.getInstance()); // org.itstack.demo.design.SingletonCASSafe@2b193f2d
    }

}
