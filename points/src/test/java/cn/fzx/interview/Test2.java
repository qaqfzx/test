package cn.fzx.interview;

// 都是0  ，  误以为（x++）/3  是1
public class Test2 {
    public static void main(String[] args) {
        int x = 2;
        System.out.println("(x++)/3 = " + (x++) / 3);

        int y = 2;
        System.out.println("y++/3 = " + y++ / 3);
    }
}
