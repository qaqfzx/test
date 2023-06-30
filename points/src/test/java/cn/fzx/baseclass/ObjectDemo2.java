package cn.fzx.baseclass;

public class ObjectDemo2 {

    public static void main(String[] args) {

        /*
        public final native void notify ()
        native方法，并且不能重写。唤醒一个在此对象监视器上等待的线程(监视器相当于就是锁的概念)。如果有多个线程在等待只会任意唤醒一个。
         */

        /*
                native方法，并且不能重写。跟notify一样，唯一的区别就是会唤醒在此对象监视器上等待的所有线程，而不是一个线程。
                public final native void notifyAll ()
         */


        /*
                public final native void wait ( long timeout) throws
                InterruptedException//native方法，并且不能重写。暂停线程的执行。注意：sleep方法没有释放锁，而wait方法释放了锁 。timeout是等待时间。
         */


        /*
                public final void wait ( long timeout, int nanos) throws
                InterruptedException//多了nanos参数，这个参数表示额外时间（以毫微秒为单位，范围是 0-999999）。 所以超时的时间还需要加上nanos毫秒。
         */


        /*
                public final void wait () throws InterruptedException//跟之前的2个wait方法一样，只不过该方法一直等待，没有超时时间这个概念
         */

        /*
                protected void finalize () throws Throwable
                实例被垃圾回收器回收的时候触发的操作
         */

    }

}
