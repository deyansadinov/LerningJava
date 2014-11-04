package com.clouway.threads.task3;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 14:50 Oct 14-10-30
 */
public class Main {
  public static void main(String[] args) throws InterruptedException {

    ThreadCount threadCount=new ThreadCount();
    First first=new First(threadCount,5);
    Second second=new Second(threadCount,5);

    first.setName("First : ");
    second.setName("Second : " );

    first.start();
    second.start();


  }
}
