package com.clouway.threads.task3;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 10:20 Nov 14-11-1
 */
public class First extends Thread {

  private ThreadCount threadCount;
  private int timer;

  public First(ThreadCount threadCount,int timer) {

    this.threadCount = threadCount;
    this.timer = timer;
  }

  public void run() {
    for (int i=0;i<=timer;i++){
      threadCount.put(i);
      System.out.println(Thread.currentThread().getName() + " " + i);

    }
  }

}
