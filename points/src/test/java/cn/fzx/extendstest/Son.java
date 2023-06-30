package cn.fzx.extendstest;

public class Son extends Parent{
    /**
     * 名字
     */
    private String name;


    static {
        System.out.println("son  static 代码快");
    }

    {
        System.out.println("son 普通代码快");
//        name = "老五";
    }

    public Son() {
        System.out.println("son construction");
    }
}
