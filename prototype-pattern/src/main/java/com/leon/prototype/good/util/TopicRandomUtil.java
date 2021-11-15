package com.leon.prototype.good.util;

import java.util.*;

public class TopicRandomUtil {

    /**
     * 乱序Map元素，记录对应答案key
     *
     * @param option 题目 <选项，答案>
     * @param key    答案
     * @return Topic 乱序后 {A=c., B=d., C=a., D=b.}
     */
    static public Topic random(Map<String, String> option, String key) {
        // 选项key A B C D
        Set<String> keySet = option.keySet();
        ArrayList<String> keyList = new ArrayList<String>(keySet);
        // 打乱key顺序
        Collections.shuffle(keyList);
        HashMap<String, String> optionNew = new HashMap<String, String>();
        int idx = 0;
        String keyNew = "";
        // 遍历乱序的key
        for (String next : keySet) { // 原 A、B、C、D
            String randomKey = keyList.get(idx++);
            // System.out.println("把原来" + next + "选项的内容放到" + randomKey + "选项");
            if (key.equals(next)) { // 遍历到原答案
                keyNew = randomKey; // 记录新的正确答案
            }
            // 构建新的答案
            optionNew.put(randomKey, option.get(next));
        }
        return new Topic(optionNew, keyNew);
    }

    public static void main(String[] args) {

        Map<String, String> map01 = new HashMap<String, String>();
        map01.put("A", "JAVA2 EE");
        map01.put("B", "JAVA2 Card");
        map01.put("C", "JAVA2 ME");
        map01.put("D", "JAVA2 HE");
        map01.put("E", "JAVA2 SE");
        System.out.println(map01);


        Topic topic = random(map01, "A");
        System.out.println("第一次打乱 " + topic.getOption() + " 答案" + topic.getKey());

        Topic topic1 = random(topic.getOption(), topic.getKey());
        System.out.println("第二次打乱 " + topic1.getOption() + " 答案" + topic1.getKey());
    }

}
