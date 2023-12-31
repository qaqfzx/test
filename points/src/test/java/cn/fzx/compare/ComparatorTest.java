package cn.fzx.compare;

import cn.fzx.A;

import java.util.*;

public class ComparatorTest {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(-5);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(-9);
        arrayList.add(-7);
        System.out.println("原始数组:");
        System.out.println(arrayList);

        Collections.reverse(arrayList);
        System.out.println("Collections.reverse(arrayList):");
        System.out.println(arrayList);

        // 自然排序，需要list中存储的元素 实现Comparable接口，重写CompareTo()方法
        Collections.sort(arrayList);
        System.out.println("Collections.sort(arrayList):");
        System.out.println(arrayList);

//        Collections.sort(arrayList, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                // 降序
//                return o2.compareTo(o1);
//            }
//        });

        Collections.sort(arrayList, (o1, o2) -> {return o2.compareTo(o1);});
        System.out.println("定制排序后：");
        System.out.println(arrayList);

    }

}
