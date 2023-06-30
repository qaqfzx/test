package cn.fzx.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * junit 4测试
 *
 * 每执行一次测试方法，都会先执行一次@Before方法，
 * 方法执行完毕，再执行一次@After方法
 * @author fangzhixiang
 * @date 2023-01-05
 */
public class HelloWorldTestNew {
	private HelloWorld hw;

	@Before
	public void setUp() {
		System.out.println("开始");
		hw = new HelloWorld();
	}

	@Test(expected=NumberFormatException.class)
	// 1.测试没有返回值,有别于junit3的使用，更加方便
	public void testHello() {
		hw.sayHello();
	}
	@Test
	public void testWorld() {
		hw.sayWorld();
	}

	@Test
	// 2.测试有返回值的方法
	// 返回字符串
	public void testSay() {
		assertEquals("测试失败", hw.say(), "hello world!");
	}

	@Test
	// 返回对象
	public void testObj() {
		assertNull("测试对象不为空", null);
		assertNotNull("测试对象为空", new String());
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("结束");
		hw = null;
	}

}
