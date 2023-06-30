package cn.fzx.annotationtest;

/**
 * InheritedAnnotation 注解测试
 *
 * @author fangzhixiang
 * @date 2023-01-04
 */
@TestInheritedAnnotation(values = {"values"}, number = 10)
public class InheritedAnnotationExample {

	public void test(){
		System.out.println("没有什么特别意思，看反射调用不同的方法时，获取方法数组时，哪种可以获取父类的");
	}
}
