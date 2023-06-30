package cn.fzx.annotationtest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author fangzhixiang
 * @date 2023-01-04
 */
@Target({ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyMethodAnnotation {
	public String title() default "";

	public String description() default "";
}
