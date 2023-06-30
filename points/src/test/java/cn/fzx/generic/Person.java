package cn.fzx.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author fangzhixiang
 * @date 2022-12-30
 */
public class Person {

	/*
	使用原则《Effictive Java》
	为了获得最大限度的灵活性，要在表示 生产者或者消费者 的输入参数上使用通配符，使用的规则就是：生产者有上限、消费者有下限
	1. 如果参数化类型表示一个 T 的生产者，使用 < ? extends T>;
	2. 如果它表示一个 T 的消费者，就使用 < ? super T>；
	 */
	private  <E extends Comparable<? super E>> E max(List<? extends E> e1) {
		if (e1 == null){
			return null;
		}
		//迭代器返回的元素属于 E 的某个子类型
		Iterator<? extends E> iterator = e1.iterator();
		E result = iterator.next();
		while (iterator.hasNext()){
			E next = iterator.next();
			// 对E进行消费
			if (next.compareTo(result) > 0){
				result = next;
			}
		}
		return result;
	}

	public static void main(String[] args) {


		/*
		父类的引用  可以指向子类的对象

		反过来不可以需要强转（正常来说，先类型判断，再强转）
		 */
		test(new Person());
		test(new Yellow());
		test(new Green());
		test(new XiaoYellow());


		testYellow(new Yellow());
//		testYellow(new Person());  父类不行

		testYellow(new XiaoYellow());



		// 下限是yellow
		List<? super Yellow> list = new ArrayList<>();
		list.add(new Yellow());
		list.add(new XiaoYellow());
//		list.add(new Person());  不能设置Yellow的父类

		//获取的上限是Object
		Object object = list.get(0);

		// 上限是yellow
		List<? extends Yellow> extendsList = new ArrayList<>();
		//extendsList.add(new Yellow());  除了null外，不能设置值，无法确定泛型到底是yellow的哪个子类
		extendsList.add(null);

		// 上限是yellow
		Yellow yellow = extendsList.get(0);

	}


	public static void test(Person person) {
		System.out.println(person.getClass());
	}
	public static void testYellow(Yellow person) {
		System.out.println(person.getClass());
	}



}
