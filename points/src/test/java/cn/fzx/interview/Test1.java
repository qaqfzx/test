package cn.fzx.interview;

/**
 * pong
 * hi
 *
 * 下面的这种应该也有可能，没能试出来 （主线程睡1s，试出来了  Thread.sleep(1000);）
 *
 *
 * hi
 * pong
 */
public class Test1 {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                hi();
            }
        };
        thread.start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("pong");
    }

    public static void hi() {
        System.out.println("hi");
    }
}
