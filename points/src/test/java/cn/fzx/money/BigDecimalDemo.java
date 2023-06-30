package cn.fzx.money;

import java.math.BigDecimal;

public class BigDecimalDemo {

    public static void main(String[] args) {
        //  1. 常见赋值方式，传String形式的参数, long, int
        BigDecimal account = new BigDecimal("1");
        int i = 19;
        long l = 4L;
        account = new BigDecimal(i);
        account = new BigDecimal(l);
        /*
         *  2. 不能使用double形式的参数
         *   如果源头的数据类型为double,使用如下方式
         *   BigDecimal.valueOf();
         *
         *   等效
         *   Double.toString(double)方法，然后使用BigDecimal(String)构造方法，将double转换为String。
          */
        double d = 242342.4235d;
        account = BigDecimal.valueOf(d);
        // 等效于下面这行代码
        account = new BigDecimal(Double.toString(d));

        /*
         * 加    add()
         * 减    subtract()
         * 乘    multiply()
         * 除    divide(除数)
         *       divide(除数，保留的小数位数，模式)
         *      四舍五入    BigDecimal.ROUND_HALF_UP
         *      24/8   24是被除数，  8是除数
         */
        BigDecimal bigDecimal = new BigDecimal(1);
        BigDecimal bigDecimal1 = new BigDecimal(2);
        BigDecimal add = bigDecimal.add(bigDecimal1);
        //四舍五入
        BigDecimal divide = bigDecimal.divide(bigDecimal1, 2, BigDecimal.ROUND_HALF_UP);
        //方法的参数中不能有null,会报错
        //BigDecimal add1 = bigDecimal.add(null);

        /*
        *  .toPlainString()
        *   不使用任何指数
         */
        String s = divide.toPlainString();
        System.out.println("s = " + s);

        /*
         * 去除小数末尾的0
         * .stripTrailingZeros()
         */
        BigDecimal bigDecimal2 = divide.stripTrailingZeros();

        BigDecimal demo = new BigDecimal("19.1000");
        // 尽量不要这样使用， 如果去掉小数位有不含0的会报错
        //  默认是 模式7 ROUND_UNNECESSARY
        BigDecimal bigDecimal3 = demo.setScale(1);
        //  使用下面的这种方式    双参数，   保留位数 和 模式
        demo.setScale(1, BigDecimal.ROUND_HALF_UP);
    }
}
