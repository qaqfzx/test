package cn.fzx.math;

import org.junit.Test;

import java.security.SecureRandom;

public class SecureRandomTest {
    @Test
    public void test(){
        SecureRandom secureRandom = new SecureRandom();
        //随机生成一个int数值
        int i = secureRandom.nextInt();
        System.out.println("i = " + i);
        // 返回 [0 - 指定数值之间的int值
        int i1 = secureRandom.nextInt(2);
        System.out.println("i1 = " + i1);
        // 返回0.0  - 1.0 之间的double值
        double v = secureRandom.nextDouble();
        System.out.println("v = " + v);
    }
}
