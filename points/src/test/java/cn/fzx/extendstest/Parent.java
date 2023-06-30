package cn.fzx.extendstest;

public class Parent {

    /**
     * 姓名
     */
    private String surname;

    static {
        System.out.println("parent  static 代码快");
    }

    {
        System.out.println("parent 普通代码快");
//        surname = "王";
    }

    public Parent() {
        System.out.println("parent construction");
    }
}
