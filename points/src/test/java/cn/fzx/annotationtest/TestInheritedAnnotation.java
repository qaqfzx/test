package cn.fzx.annotationtest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Inherited注解的作用：被它修饰的Annotation将具有继承性。
 * 如果某个类使用了被@Inherited修饰的Annotation，则其子类将自动具有该注解。
 * @author fangzhixiang
 * @date 2023-01-04
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface TestInheritedAnnotation {

	String[] values();

	int number();
}
