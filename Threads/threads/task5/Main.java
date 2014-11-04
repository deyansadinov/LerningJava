package com.clouway.threads.task5;

import com.clouway.threads.task3.ThreadCount;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 11:25 Nov 14-11-3
 */
public class Main {
  public static void main(String[] args) {
    TimeoutHashtable timeoutHashtable = new TimeoutHashtable();
    Person p1=new Person("Ivan",5,0);
    Person p2=new Person("Petkan" +
            "",10,0);
    Thread thread = new Thread(new TimeOutThread(timeoutHashtable));

    timeoutHashtable.put(p1.getName(),p1);

    thread.start();
    try {
      Thread.sleep(4000);
    } catch (InterruptedException e) {}
    timeoutHashtable.get("Ivan");
    try {
      Thread.sleep(4000);
    } catch (InterruptedException e) {}
    timeoutHashtable.put(p1.getName(),p2);
    try {
      Thread.sleep(4000);
    } catch (InterruptedException e) {}
    timeoutHashtable.remove(p2.getName());
  }
}
