package cn.fzx.thread;

import org.junit.Test;

/**
 * @author fangzhixiang
 * @date 2022-12-26
 */
public class ThreadTest {

	/*
	在main方法中测试有效，  test方法没执行完直接就结束了。。。。
	 */
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("线程1");
				System.out.println(Thread.currentThread());
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread() +" end");
			}
		});
		thread.start();


		Thread tHread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					// 等到thread线程结束
					thread.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("线程2");
				System.out.println(Thread.currentThread());
				System.out.println(Thread.currentThread() + " end");
			}
		});
		tHread2.start();
	}





}


