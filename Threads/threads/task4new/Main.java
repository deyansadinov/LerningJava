package com.clouway.threads.task4new;

import java.util.concurrent.CountDownLatch;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 10:00 Nov 14-11-4
 */
public class Main {

  public static void main(String[] args) {
    TheList theList = new TheList();
    Thread threadAdd=new Thread(new ToAdd(theList),"Add :");
    Thread threadRemove=new Thread(new ToRemove(theList),"Remove :");

    threadAdd.start();
    threadRemove.start();




  }

}
