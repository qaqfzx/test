package Collection;

import cn.fzx.entity.Person;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionsTest {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(new Integer(1));
        arrayList.add(new Integer(23));
        arrayList.add(new Integer(999));
        arrayList.add(new Integer(124));


        //排序操作

        Collections.reverse(arrayList);//反转
        Collections.shuffle(arrayList);//随机排序
        Collections.sort(arrayList);//自然排序 升序
        // 定制排序，由Comparator提供排序逻辑
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        //交换两个索引位置的元素
        Collections.swap(arrayList, 1, 2);

        //旋转。当distance为正数时，将list后distance个元素整体移到前面。当distance为负数时，将 list的前distance个元素整体移到后面
        Collections.rotate(arrayList, 1);

        //查找替换操作

        //对List进行二分查找，返回索引，注意List必须是有序的
        //int binarySearch(List list, Object key)

        //根据元素的自然顺序，返回最大的元素。 类比int min(Collection coll)
        //T max(Collection coll)

        //根据定制排序，返回最大元素，排序规则由Comparatator类控制。类比int min(Collection coll, Comparator c)
        //T max(Collection coll, Comparator c)

        //用指定的元素代替指定list中的所有元素
        //void fill(List list, Object obj)

        //统计元素出现次数
        //int frequency(Collection c, Object o)

        //统计target在list中第一次出现的索引，找不到则返回-1，类比int lastIndexOfSubList(List source, list target)
        //int indexOfSubList(List list, List target)

        //用新元素替换旧元素
        //boolean replaceAll(List list, Object oldVal, Object newVal)

        //同步控制
        //Collections 提供了多个synchronizedXxx()方法·，该方法可以将指定集合包装成线程同步的集合，从而解决多线程并发访问集合时的线程安全问题。
        //
        //我们知道 HashSet，TreeSet，ArrayList,LinkedList,HashMap,TreeMap 都是线程不安全的。Collections 提供了多个静态方法可以把他们包装成线程同步的集合。
        //
        //最好不要用下面这些方法，效率非常低，需要线程安全的集合类型时请考虑使用 JUC 包下的并发集合。


        if (arrayList.isEmpty()) {
            System.out.println("arrayList 是空数组");
        }


        //在使用 java.util.stream.Collectors 类的 toMap() 方法转为 Map 集合时，一定要注意当 value 为 null 时会抛 NPE 异常。
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person("张三", 15));
        personArrayList.add(new Person("李四", null));
//        personArrayList.stream().collect(Collectors.toMap(Person::getName, Person::getAge));


        // 1.8 removeIf 方法删除元素 或者使用迭代器 Iterator 里的remove方法
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; ++i) {
            list.add(i);
        }
        list.removeIf(filter -> filter % 2 == 0); /* 删除list中的所有偶数 */
        System.out.println(list); /* [1, 3, 5, 7, 9] */

        // 使用HashSet去重
        ArrayList arrayList1 = new ArrayList<>(arrayList);
        HashSet hashSet = new HashSet(arrayList1);


        //集合转数组
        String [] s= new String[]{
                "dog", "lazy", "a", "over", "jumps", "fox", "brown", "quick", "A"
        };
        List<String> strList = Arrays.asList(s);
        //没有指定类型的话会报错
        s=strList.toArray(new String[0]);



        //数组转集合   转的是对象数组
//        int[] myArray = {1, 2, 3};
//        List myList = Arrays.asList(myArray);
//        System.out.println(myList.size());//1
//        System.out.println(myList.get(0));//数组地址值
//        System.out.println(myList.get(1));//报错：ArrayIndexOutOfBoundsException
//        int[] array = (int[]) myList.get(0);
//        System.out.println(array[0]);//1


        /*
        使用工具类 Arrays.asList() 把数组转换成集合时，不能使用其修改集合相关的方法，
         它的 add/remove/clear 方法会抛出 UnsupportedOperationException 异常。
         */

        // 正确方式
        List hiList = new ArrayList<>(Arrays.asList("a", "b", "c"));

        Integer [] myArray = { 1, 2, 3 };
        List myList = Arrays.stream(myArray).collect(Collectors.toList());
        //基本类型也可以实现转换（依赖boxed的装箱操作）
        int [] myArray2 = { 1, 2, 3 };
        List myList2 = Arrays.stream(myArray2).boxed().collect(Collectors.toList());

    }

}
