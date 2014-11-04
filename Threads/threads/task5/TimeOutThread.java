package com.clouway.threads.task5;

import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry.Entry;

import java.util.Map;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 13:11 Nov 14-11-3
 */
public class TimeOutThread extends Thread {

  TimeoutHashtable timeoutHashtable;


  public TimeOutThread(TimeoutHashtable timeoutHashtable) {

    this.timeoutHashtable = timeoutHashtable;
  }

  public void run() {

    while (true) {
      for (Map.Entry<String, Person> entry : timeoutHashtable.getMyHashtable().entrySet()) {
        Person p = entry.getValue();
        int maxTime = p.getMaxTime();
        int currentTime = p.getCurrentTime();

        System.out.println(entry.getKey() + " time until dell :" + (maxTime -currentTime));
        p.setCurrentTime();
        if(currentTime==maxTime){
          timeoutHashtable.getMyHashtable().remove(entry.getKey());
        }
      }

      try {
        sleep(1000);
      } catch (InterruptedException e) {
      }


    }

  }
}
