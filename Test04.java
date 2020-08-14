package day05;

import java.util.*;

/**
 *创建一个Map，保存某个学生的成绩:
 *在控制台输入该学生成绩，格式:
 *科目:成绩;科目:成绩;...
 *例如:  
 *语文:99;数学:98;英语:97;物理:96;化学:95
 *然后输出物理的成绩。
 *然后将化学的成绩设置为96
 *然后删除英语这一项。
 *然后遍历该Map分别按照遍历key，Entry，value
 *的形式输出该Map信息。
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        System.out.print("语文:");
        map.put("语文", console.nextInt());
        System.out.print("数学:");
        map.put("数学", console.nextInt());
        System.out.print("英语:");
        map.put("英语", console.nextInt());
        System.out.print("物理:");
        map.put("物理", console.nextInt());
        System.out.print("化学:");
        map.put("化学", console.nextInt());
        System.out.println(map.get("物理"));
        map.put("化学",96);
        map.remove("英语");
        for(String key:map.keySet()){
            System.out.println("key:" + key + ",value:" +map.get(key));
        }
        for(int value : map.values()){
            System.out.println("value" + value);
        }
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println("键值对：" + entry);
            System.out.println("key:" + entry.getKey());
            System.out.println("value:" + entry.getValue());
        }
    }
}
