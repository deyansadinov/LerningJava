package com.clouway.threads.task2;

import java.util.concurrent.*;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 16:47 Oct 14-10-29
 */
public class Main {
  public static void main(String[] args) throws InterruptedException {


    Thread thread1 = new Thread(new ThreadCounter(5), "Thread One :");
    Thread thread2 = new Thread(new ThreadCounter(15), "Thread Two :");

    thread2.setDaemon(true);
    thread1.start();
    thread2.start();

  }

}
