package cn.fzx.innerclass;

/**
 * @author fangzhixiang
 * @date 2022-12-26
 */
public class Person {

	private String name;

	static class Dog{
		String dog = "大狗";
	}

	class Bird{
		String name = "杜鹃";
		public void display(String name){
			System.out.println(name);//方法的形参
			System.out.println(this.name);//内部类的属性
			System.out.println(Person.this.name);//外部类的属性
			//Person.this.eat();
		}
	}

	public String getName(){
		return name;
	}


	public Comparable getComparable(){
		//创建一个实现了Comparable接口的类:局部内部类
		//方式一：
//		class MyComparable implements Comparable{
//
//			@Override
//			public int compareTo(Object o) {
//				return 0;
//			}
//
//		}
//
//		return new MyComparable();

		//方式二：
		return new Comparable(){

			@Override
			public int compareTo(Object o) {
				return 0;
			}

		};

	}

	/*
	局部内部类和匿名内部类只能访问final的局部变量
	1.8可以省略final，但实际上是有的
	 */
	public String hello(final String id){
		class My {
			private Integer mId;

			public void print(){
				System.out.println("id:" + id);
				System.out.println("mId:" + mId);
				System.out.println("name = " + name);
			}
		}
		My my = new My();
		my.print();
		return id;
	}


	public static void main(String[] args) {
		Person person = new Person();
		person.hello("1");
		// 成员内部类
		Bird bird = person.new Bird();
		bird.display("hello");

		//静态内部类
		Person.Dog dog = new  Person.Dog();
	}
}


