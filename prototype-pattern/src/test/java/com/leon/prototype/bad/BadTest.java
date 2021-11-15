package com.leon.prototype.bad;

import org.junit.Test;

/**
 * @PROJECT_NAME: hello-design-pattern
 * @CLASS_NAME: BadTest
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/11/15 15:36
 * @Version 1.0
 * @DESCRIPTION:
 **/
public class BadTest {

    @Test
    public void test_QuestionBankController() {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("花花", "1000001921032"));
        System.out.println(questionBankController.createPaper("豆豆", "1000001921051"));
        System.out.println(questionBankController.createPaper("大宝", "1000001921987"));
    }

}
