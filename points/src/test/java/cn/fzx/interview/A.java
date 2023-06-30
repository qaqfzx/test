package cn.fzx.interview;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class A {
    static {
        System.out.println("1");
    }

    public A(){
        System.out.println("1"+"2");
    }


    public static void main(String[] args) throws Exception {
        String encode = URLEncoder.encode(" 1方", "utf-8");
        System.out.println("encode = " + encode);//+1%E6%96%B9

        String decode = URLDecoder.decode(encode, "utf-8");
        System.out.println("decode = " + decode);

        /*
        和标准的URL编码稍有不同，URLEncoder把空格字符编码成+，而现在的URL编码标准要求空格被编码为%20
        测试是不是这么样
         */
        String s = encode.replaceAll("\\+", "%20");// %20%E6%96%B9   (带空格)
        String decode1 = URLDecoder.decode(s, "utf-8");
        System.out.println("decode1 = " + decode1);
    }
}
