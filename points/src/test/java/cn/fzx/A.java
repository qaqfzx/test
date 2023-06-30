package cn.fzx;

import cn.fzx.entity.Person;

import java.util.*;
import java.util.stream.Collectors;

public class A {


    private static Object resource1 = new Object();//资源 1
    private static Object resource2 = new Object();//资源 2

    public static void main(String[] args) {

        new Thread(() -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread() + "get resource1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "waiting get resource2");
                synchronized (resource2) {
                    System.out.println(Thread.currentThread() + "get resource2");
                }
            }
        }, "线程 1").start();

        Person person = new Person();

        String a = new String("123");
        String d = "3";
        String c = "12" + d;
        String b = "123";
        System.out.println("a==b = " + (a == b));
        System.out.println("b==c = " + (b == c));
        System.out.println("a = " + a);


        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("1", "245");
        hashMap.put("2", "222");
        hashMap.put("3", "333");
        for (Map.Entry<String, String> stringStringEntry : hashMap.entrySet()) {

            System.out.println("stringStringEntry = " +   stringStringEntry.getKey() + " ,value:" + stringStringEntry.getValue());
        }



        List<String> ss = new ArrayList<>();
        ss.add("i am a boy");
        ss.add("she is a girl");
        List<String[]> collect = ss.stream().map(str -> str.split("")).collect(Collectors.toList());
        System.out.println("collect = " + collect);

    }


}
