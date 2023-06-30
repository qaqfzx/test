package cn.fzx.extendstest;

public class ExtendsTest {

    public static void main(String[] args) {
        /*
        打印顺序
        parent  static 代码快
        son  static 代码快
        parent 普通代码快
        parent construction
        son 普通代码快
        son construction
         */
        Son son = new Son();
    }
}
