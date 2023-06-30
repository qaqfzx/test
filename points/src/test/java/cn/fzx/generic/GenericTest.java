package cn.fzx.generic;

/**
 * @author fangzhixiang
 * @date 2023-01-03
 */
public class GenericTest {


	/**
	 * 泛型方法
	 * @param tClass Class 对象，用来创建泛型对象;  泛型方法要求参数是 Class<T>
	 * @param <T> 声明一个泛型T，
	 * @return 方法返回值
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public <T> T getObject(Class<T> tClass) throws IllegalAccessException, InstantiationException {
		T t = tClass.newInstance();
		return t;
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		GenericTest genericTest = new GenericTest();
		// 此时，object就是Person示例对象
		Object object = genericTest.getObject(Class.forName("cn.fzx.generic.Person"));
		if (object instanceof Person) {
			System.out.println("成功啦，是Person对象");
		} else {
			System.out.println("傻叉，怎么搞的，居然不是Person对象");
		}
	}
}
