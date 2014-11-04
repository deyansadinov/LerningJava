package com.clouway.threads.task4new;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 10:01 Nov 14-11-4
 */
public class ToAdd extends Thread {

  private TheList theList;
  private Random random = new Random();

  public ToAdd(TheList theList) {

    this.theList = theList;
  }

  public void run() {
    while (true) {
      int number=random.nextInt(100);
      theList.add(random.nextInt(100));

      try {
        Thread.sleep(number*100);
      } catch (InterruptedException e) {
      }

    }
  }

}
