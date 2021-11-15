package com.leon.singleton;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: SingletonEnumSafe
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/11/15 18:21
 * @Version 1.0
 * @DESCRIPTION: 这种写法在功能上与共有域方法相近，但是它更简洁，无偿地提供了串行化机制，绝对防止对此实例化，即使是在面对复杂的串行化或者反射攻击的时候。虽然这中方法还没有广泛采用，但是单元素的枚举类型已经成为实现Singleton的最佳方法。
 * <p>
 * 但也要知道此种方式在存在继承场景下是不可用的。
 **/
public enum SingletonEnumSafe {

    INSTANCE;

}
