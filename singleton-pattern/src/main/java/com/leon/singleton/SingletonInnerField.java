package com.leon.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: SingletonInnerField
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/11/15 17:50
 * @Version 1.0
 * @DESCRIPTION: 静态类使用
 * 以上这种方式在我们平常的业务开发中非常场常见，这样静态类的方式可以在第一次运行的时候直接初始化Map类，同时这里我们也不需要到延迟加载在使用。
 * 在不需要维持任何状态下，仅仅用于全局访问，这个使用使用静态类的方式更加方便。
 * 但如果需要被继承以及需要维持一些特定状态的情况下，就适合使用单例模式。
 **/
public class SingletonInnerField {

    public static Map<String, String> cache = new HashMap<String, String>();

}
