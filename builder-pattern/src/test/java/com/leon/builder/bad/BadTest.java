package com.leon.builder.bad;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: BadTest
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/11/15 15:07
 * @Version 1.0
 * @DESCRIPTION:
 **/
public class BadTest {

    @Test
    public void testDecorationPackageController() {
        DecorationPackageController decoration = new DecorationPackageController();

        // 豪华欧式
        System.out.println(decoration.getMatterList(new BigDecimal("132.52"), 1));

        // 轻奢田园
        System.out.println(decoration.getMatterList(new BigDecimal("98.25"), 2));

        // 现代简约
        System.out.println(decoration.getMatterList(new BigDecimal("85.43"), 3));

    }
}
