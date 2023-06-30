package cn.fzx.test;

import cn.fzx.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Calculator的  Junit单元测试
 * 类名+Test
 *
 * junit注解标记的方法 必须是public void
 *
 * 使用的是 junit包
 *
 */
public class CalculatorTest {
    /**
     * 初始化方法：
     *  用于资源申请，所有测试方法在执行之前都会先执行该方法 (只针对CalculatorTest类里的 @test 注解标记方法)
     */
    @Before
    public void init() {
        System.out.println("init……");
    }

    /**
     * 释放资源方法：
     *  用于资源释放，所有测试方法在执行之后都会执行该方法 (只针对CalculatorTest类里的 @test 注解标记方法)
     */
    @After
    public void close() {
        System.out.println("close……");
    }

    /**
     * 方法名，    测试的方法名 + Add
     * 测试add方法  执行结果，绿色成功， 红色失败
     */
    @Test
    public void testAdd() {
        System.out.println("testAdd……");
        Calculator calculator = new Calculator();
        //断言  我断言这个结果是3
        Assert.assertEquals(3, calculator.add(1, 2));
    }
}
