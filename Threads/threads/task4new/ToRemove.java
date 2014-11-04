package com.clouway.threads.task4new;

import java.util.Random;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 10:02 Nov 14-11-4
 */
public class ToRemove extends Thread {
  TheList theList;
  Random random = new Random();

  public ToRemove(TheList theList) {

    this.theList = theList;
  }

  public void run() {
    while (true) {
      theList.removeLastElement();

      try {
        sleep(random.nextInt(100)*100);
      } catch (InterruptedException e) {}

    }
  }
}
