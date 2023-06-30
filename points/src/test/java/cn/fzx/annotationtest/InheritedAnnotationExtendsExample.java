package cn.fzx.annotationtest;

import org.junit.Test;

import java.lang.annotation.Annotation;

/**
 * Inherited注解的作用：被它修饰的Annotation将具有继承性。
 * 如果某个类使用了被@Inherited修饰的Annotation，则其子类将自动具有该注解。
 * @author fangzhixiang
 * @date 2023-01-04
 */
public class InheritedAnnotationExtendsExample extends InheritedAnnotationExample {

	@Test
	public void test(){
		Class<InheritedAnnotationExtendsExample> cls = InheritedAnnotationExtendsExample.class;
		Annotation[] annotations = cls.getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println("annotation = " + annotation);//@cn.fzx.annotationtest.TestInheritedAnnotation(values=[values], number=10)
		}

	}
}
