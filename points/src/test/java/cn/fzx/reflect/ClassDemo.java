package cn.fzx.reflect;

/**
 * 获取Class 对象的三种方法
 */
public class ClassDemo {

    public static void main(String[] args) throws Exception{
        //  全类名
        Class<?> cls1 = Class.forName("cn.fzx.reflect.Belle");

        // 不知道为什么  .class属性点不过去
        Class<Belle> cls2 = Belle.class;

        Belle belle = new Belle();
        Class<? extends Belle> cls3 = belle.getClass();

        // true
        System.out.println("cls1 == cls2 : " + (cls1 == cls2));
        // true
        System.out.println("cls2 == cls3 : " + (cls2 == cls3));
        /*
        结论
        同一个字节码文件(*.class)在一次程序运行过程中，只会被加载一次，不论通过哪一种方式获取的Class对象都是同一个。
         */


    }

}
