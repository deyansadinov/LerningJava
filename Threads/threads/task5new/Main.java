package com.clouway.threads.task5new;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 9:13 Nov 14-11-12
 */
public class Main {
  public static void main(String[] args) {
    TimeOutTable timeOutTable = new TimeOutTable(5);

    timeOutTable.put("Ivan", "BMW");

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
    }

    timeOutTable.remove("Ivan");
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
    }
    System.out.println("--------------");
    System.out.println(timeOutTable.get("Ivan"));

    System.out.println();
  }
}
