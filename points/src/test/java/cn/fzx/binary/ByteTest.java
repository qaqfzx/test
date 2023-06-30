package cn.fzx.binary;

import org.junit.Test;

import java.util.Base64;

/**
 * @author fangzhixiang
 * @date 2022-11-26
 */
public class ByteTest {


	public static void main(String[] args) {
		int i  = 1;
		int b = -1;

		String iStr = Integer.toBinaryString(i);
		// 数字1的二进制结果	1
		System.out.println("iStr = " + iStr);


		String bStr = Integer.toBinaryString(b);
		// 数字-1的二进制结果	 11111111111111111111111111111111		32位
		System.out.println("iStr = " + bStr);




		//Original String
		String string = "1";
		//Convert to byte[]
		byte[] bytes = string.getBytes();
		for (byte aByte : bytes) {
			// 字符串1的二进制结果 49
			System.out.println("aByte = " + aByte);
		}


		//Convert back to String
		String s = new String(bytes);
		System.out.println("s = " + s);
	}



	@Test
	public void testBase64(){
		//Original byte[]
		byte[] bytes = "hello world".getBytes();

		//Base64 Encoded
		Base64.getEncoder().encode(bytes);
		String encoded = Base64.getEncoder().encodeToString(bytes);

		//Base64 Decoded
		byte[] decoded = Base64.getDecoder().decode(encoded);
		//Verify original content
		System.out.println( new String(decoded) );
	}


	@Test
	public void des(){
		// 返回e的多少次幂
		double exp = Math.exp(1);
		System.out.println("exp = " + exp);//2.718281828459045

		//去尾法
		double floor = Math.floor(2.5656);
		System.out.println("floor = " + floor);//2.0

		//获取0-1间的随机数 double
		double random = Math.random();
		System.out.println("random = " + random);

		// 取模
		int i = Math.floorMod(13, 2);
		System.out.println("i = " + i);//1
	}

}
