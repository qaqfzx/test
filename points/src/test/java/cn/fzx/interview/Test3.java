package cn.fzx.interview;

public class Test3 {
    public static void main(String[] args) {
        int x=1,y=2,z=3;
        // 3               2+=(3/2)
        System.out.println("y+=z--/++x = " + (y += z-- / ++x));
    }
}
