package cn.fzx.annotationtest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 测试自定义的method注解
 * @author fangzhixiang
 * @date 2023-01-04
 */
public class TestMethodAnnotation extends InheritedAnnotationExample{


	@Override
	@MyMethodAnnotation(title = "toStringMethod", description = "override toString Method")
	public String toString() {
		return "TestMethodAnnotation{}";
	}


	@Deprecated
	@MyMethodAnnotation(title = "old static method", description = "deprecated old static method")
	public static void oldMethod() {
		System.out.println("old method, don't use it.");
	}

	@MyMethodAnnotation(title = "test method", description = "suppress warning")
	@SuppressWarnings({"deprecation"})
	public static void genericsTest() {
		List<String> list = new ArrayList<>();
		list.add("随便测试，想下班了");
		oldMethod();
	}

	public static void main(String[] args) throws ClassNotFoundException {
		// 类加载
		ClassLoader classLoader = TestMethodAnnotation.class.getClassLoader();
		Class<?> cls = classLoader.loadClass("cn.fzx.annotationtest.TestMethodAnnotation");
		//获取所有方法
		Method[] methods = cls.getMethods();


		for (Method method : methods) {
			if (method.isAnnotationPresent(MyMethodAnnotation.class)){
				MyMethodAnnotation annotation = method.getAnnotation(MyMethodAnnotation.class);
				System.out.println(method.getName() + "方法的MyMethodAnnotation注解上的title值为  " + annotation.title());
				System.out.println(method.getName() + "方法上有自定义的MyMethod注解,开始遍历该方法上的所有注解");


				// 反射获取的注解只能是Runtime生命周期的   getDeclaredAnnotations只获取自身声明的方法
				Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
				for (Annotation declaredAnnotation : declaredAnnotations) {
					System.out.println(declaredAnnotation);
				}
				System.out.println("-----遍历完毕-----");
			}
		}

	}
}
