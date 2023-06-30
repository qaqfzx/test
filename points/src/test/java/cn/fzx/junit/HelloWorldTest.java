package cn.fzx.junit;

import junit.framework.TestCase;

/**
 * junit老方式  通过继承TestCase的方式
 *
 * @author fangzhixiang
 * @date 2023-01-05
 */
public class HelloWorldTest extends TestCase {
	private HelloWorld hw;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("开始");
		hw=new HelloWorld();
	}

	//1.测试没有返回值
	public void testHello(){
		try {
			hw.sayHello();
		} catch (Exception e) {
			System.out.println("发生异常.....");
		}

	}
	public void testWorld(){
		hw.sayWorld();
	}
	//2.测试有返回值的方法
	// 返回字符串
	public void testSay(){
		assertEquals("测试失败", hw.say(), "hello world!");
	}
	//返回对象
	public void testObj(){
		assertNull("测试对象不为空", null);
		assertNotNull("测试对象为空",new String());
	}
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("结束");
		hw=null;
	}

}
