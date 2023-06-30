package cn.fzx.annotationtest.repeatable;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 可重复注解
 *
 * Authorities 注解内必须要有 value方法
 */
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Authorities.class)
public @interface Authority {
	String role();
}