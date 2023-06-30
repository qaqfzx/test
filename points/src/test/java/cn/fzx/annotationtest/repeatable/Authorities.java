package cn.fzx.annotationtest.repeatable;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author fangzhixiang
 * @date 2023-01-05
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Authorities {
	// 此处必须要有value
	Authority[] value();
}
