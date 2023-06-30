package cn.fzx.baseclass;

import java.util.HashMap;
import java.util.Objects;

public class ObjectDemo {

    public static void main(String[] args) {

        /*
        public final native Class<?> getClass()
        native方法，用于返回当前运行时对象的Class对象，使用了final关键字修饰，故不允许子类重写。

        反射部分  用的到，runtime 时获取Class对象。
         */
        String str = "str";
        Class<? extends String> cls = str.getClass();
        //cls = class java.lang.String
        System.out.println("cls = " + cls);
        System.out.println("");

        /*
        public native int hashCode()
        native方法，用于返回对象的哈希码，主要使用在哈希表中，比如JDK中的HashMap。
        被设计是用来使得哈希容器能高效的工作


        一句话 解释equals 和 hashcode
        equals()用于判断两个对象是否相等，这是大家公认的。
        hashCode()被设计是用来使得哈希容器能高效的工作。
        先判断hashcode值，值不同，必定不是同一个对象。
        hashcode值相同，在判断equals。


        两对象equals为true,hashcode必相等。  即hashcode不相等，equals 必不相等。
        hashCode()相等是两个对象相等的必要非充分条件。
        equals()相等是两个对象相等的充要条件。

        重写equals()方法时候一定要重写hashCode()方法。
         */
        int hashCode = str.hashCode();

        Person person = new Person("张三",128);
        Person person1 = new Person("张三",128);

        System.out.println("personl类没有重写toString()方法");
        /*
        public String toString()
        返回类的名字@实例的哈希码的16进制的字符串。建议Object所有的子类都重写这个方法。

         全类名@hashcod十六位形式   例如 baseclass.Person@16e8e02
         */
        System.out.println("person = " + person.toString());
        System.out.println("person.hashCode() = " + person.hashCode());
        System.out.println("Integer.toHexString(person.hashCode()) = " + Integer.toHexString(person.hashCode()));
        System.out.println();


        // false  == 比较地址   两个对象
        System.out.println("person==person1 = " + (person == person1));

        /*
        public boolean equals(Object obj)
        Object 用于比较2个对象的内存地址是否相等
        String 等类对该方法进行了重写，用户比较字符串的值是否相等。

        true
         */
        System.out.println("person.equals(person1) = " + person.equals(person1));
        // 全类名@hashcod十六位形式   例如 baseclass.Person@16e8e02
        System.out.println("person.hashCode() = " + person.hashCode());
        System.out.println("person1.hashCode() = " + person1.hashCode());
        System.out.println();


        // 测试添加数据   person和person1 equals相等， 值为后一个
        HashMap<Person, Integer> hashMap = new HashMap<>();
        hashMap.put(person, 1);
        hashMap.put(person1, 111);
        System.out.println("hashMap.size() = " + hashMap.size());
        Integer value = hashMap.get(new Person("张三", 128));
        //111
        System.out.println(" person和person1 equals相等. value值是后面覆盖的那个 = " + value);
        System.out.println("value = " + value);
    }
}

/**
 * 没有重写 toString
 * age 是 int类型
 */
class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        /*
        基本类型  使用 ==  判断   &&  引用类型 使用Objects.equals() 判断
                                            1.7 Objects 类 equals方法
                                            可以看看具体的实现方法
         */
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    /**
     * 参与equals 和参与hashCode() 的成员变量要一致
     * @return
     */
    @Override
    public int hashCode() {
        /*
       获取哈希值   1.7 Objects 类 public static int hash(Object... values) 方法
       可以看看具体实现
         */
        return Objects.hash(name, age);
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

