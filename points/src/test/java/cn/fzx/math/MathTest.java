package cn.fzx.math;

import org.junit.Test;

public class MathTest {

    @Test
    public void mathTest(){
        double floor = Math.floor(1.9);// 1.0
        System.out.println("floor = " + floor);

        int i = (int) 1.9d; // 1
        System.out.println("i = " + i);


        long round = Math.round(1.9);// 2
        System.out.println("round = " + round);
        long round1 = Math.round(1.1d); //1
        System.out.println("round1 = " + round1);

        // 返回0.0   - 1.0之间的一个数
        double random = Math.random();
        System.out.println("random = " + random);
    }
}
