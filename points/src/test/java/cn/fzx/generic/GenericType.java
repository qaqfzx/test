package cn.fzx.generic;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 可忽略，查看泛型类，类型擦除前的原始类型，没太懂，代码示例也不太好
 * 顺便测试了Class的几个getName方法-----     感觉还是getName 打印全类名靠谱些
 * @author fangzhixiang
 * @date 2023-01-04
 */
public class GenericType<T> {
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public static void main(String[] args) {
		GenericType<String> genericType = new GenericType<String>() {
		};
		Class<? extends GenericType> aClass = genericType.getClass();

		//aClass.getName() = cn.fzx.generic.GenericType   打印全类名
		System.out.println("aClass.getName() = " + aClass.getName());
		System.out.println("aClass.getSimpleName() = " + aClass.getSimpleName());
		System.out.println("aClass.getCanonicalName() = " + aClass.getCanonicalName());
		System.out.println("aClass.getTypeName() = " + aClass.getTypeName());


		Type type = aClass.getGenericSuperclass();
		System.out.println("type = " + type.getTypeName());

		ParameterizedType parameterizedType = ((ParameterizedType) type);
		System.out.println("parameterizedType.getTypeName() = " + parameterizedType.getTypeName());
		System.out.println("parameterizedType.getRawType() = " + parameterizedType.getRawType());
		System.out.println("parameterizedType.getActualTypeArguments()[0] = " + parameterizedType.getActualTypeArguments()[0]);
		System.out.println("parameterizedType.getOwnerType() = " + parameterizedType.getOwnerType());


	}
}
