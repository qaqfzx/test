package cn.fzx.interview;

/**
 * 考验基础  类加载顺序
 *
 *
 * * 静态块只执行一次
 * *
 * * new 对象，成员变量（静态变量 和 实例变量）必有默认值
 * *（构造函数不会是静态方法）
 * *
 * * 子类的构造方法默认第一行调用父类的无参构造方法
 * *
 *
 * ===========
 * * 类加载机制，加载类，从上到下，执行静态代码
 * *
 * *          (注意：  静态变量 new 对象，又是类似的一套流程。
 * 					 可能出现先执行非静态代码，再执行剩下的静态代码)
 * *
 * *
 * * 从上到下执行非静态代码（实例变量，非静态代码块）
 * *  （包括为实例变量赋值  int a = 1. 将a赋值1）
 * *
 * * 执行构造方法。
 * ===========
 *
 * *
 * *  有父类，会先执行父类的静态代码。
 * *  再执行自己的静态代码
 * *
 * *  执行父类的非静态代码
 * *  执行父类的构造方法
 * *
 * *  执行自己的非静态方法
 * *  执行自己的构造方法
 */
public class Hello {
    public static void main(String[] args) {
        A ab = new B();
        ab = new B();
    }
}
