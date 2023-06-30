package cn.fzx.junit;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int add = calculator.add(1, 2);
        /*
        黑盒手动测试用例，预计 1+2=3 看输出结果是否与预期相等
         */
        System.out.println("add = " + add);
    }

}
