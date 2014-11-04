package com.clouway.threads.task3;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 10:21 Nov 14-11-1
 */
public class Second extends Thread{

  private ThreadCount threadCount;
  private int timer;

  public Second(ThreadCount threadCount, int timer) {

    this.threadCount = threadCount;
    this.timer = timer;
  }

  public void run() {
    for (int i = 0; i <= timer; i++) {
      int result = threadCount.get();
      System.out.println(Thread.currentThread().getName() + " " + result);
    }
  }
}
