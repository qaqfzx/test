package cn.fzx.annotationtest.repeatable;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author fangzhixiang
 * @date 2023-01-05
 */
public class RepeatAnnotationUseNewVersion {

	// 此处是语法糖，编译后实际是@Authorities
	@Authority(role="Admin")
	@Authority(role="Manager")
	public void doSomeThing(){
		System.out.println("在做了，在做了……");
	}

	public static void main(String[] args) throws NoSuchMethodException {
		Method doSomeThing = RepeatAnnotationUseNewVersion.class.getMethod("doSomeThing");

		Annotation[] annotations = doSomeThing.getAnnotations();
		for (Annotation annotation : annotations) {
			//interface cn.fzx.annotationtest.repeatable.Authorities
			System.out.println(annotation.annotationType());
		}
	}
}
