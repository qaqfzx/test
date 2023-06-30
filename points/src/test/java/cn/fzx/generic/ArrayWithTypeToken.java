package cn.fzx.generic;

/**
 * @author fangzhixiang
 * @date 2023-01-04
 */

import java.lang.reflect.Array;

/**
 * 泛型数组建议通过反射的方式进行创建。
 *
 * 能用list等集合，就别用数组了
 */
public class ArrayWithTypeToken<T> {

	private T[] array;

	public ArrayWithTypeToken(Class<T> cls, int size) {
		array = (T[])Array.newInstance(cls, size);
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}


	public static void main(String[] args) {
		ArrayWithTypeToken<Integer> arrayToken = new ArrayWithTypeToken<>(Integer.class, 100);
		Integer[] array = arrayToken.getArray();
		System.out.println("array.length = " + array.length);
	}

}


