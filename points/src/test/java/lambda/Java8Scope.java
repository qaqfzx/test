package lambda;

import java.util.Comparator;

/**
 * 验证java8作用域
 */
public class Java8Scope {

    static String outsideParam = "早上好！ ";

    public static void main(String[] args) {


        // 局部变量如何被后续的lambda内部使用，隐式的final类型
        String salutation = "Hello! ";
        GreetingService greetingService = message -> System.out.println(salutation + message);
        greetingService.sayMessage("小崔");


//        GreetingService greetingService1 = System.out::println;
        GreetingService greetingService2 = message -> System.out.println(outsideParam + message);
        greetingService2.sayMessage("Jack");

        GreetingService greetingService3 = message -> {outsideParam = "1" ;System.out.println(outsideParam + message);};
        greetingService3.sayMessage("tom");
    }

    interface GreetingService{
        void sayMessage(String message);
    }
}
