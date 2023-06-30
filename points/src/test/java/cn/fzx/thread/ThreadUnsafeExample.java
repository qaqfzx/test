package cn.fzx.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author fangzhixiang
 * @date 2022-12-30
 */
public class ThreadUnsafeExample {
	private int cnt = 0;

	private void add(){
		cnt++;
	}

	public int getCnt(){
		return cnt;
	}

	public static void main(String[] args) throws InterruptedException {
		//线程大小
		final int threadSize = 1000;
		//创建公共类，测试线程不安全问题
		ThreadUnsafeExample example = new ThreadUnsafeExample();
		CountDownLatch countDownLatch = new CountDownLatch(threadSize);

		//阿里建议直接使用 ThreadPoolExecutor的构造函数创建
		ExecutorService executorService = Executors.newCachedThreadPool();

		for (int i = 0; i < threadSize; i++) {
			executorService.execute(() ->{
				//执行+1操作
				example.add();
				//latch  锁存器？？    中保存的数值-1
				countDownLatch.countDown();
			});
		}
		// 等待1000个线程执行完毕
		countDownLatch.await();
		// 关闭线程池
		executorService.shutdown();
		// 输出cnt的大小
		System.out.println(example.getCnt());

	}
}
