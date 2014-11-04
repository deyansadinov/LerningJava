package com.clouway.threads.task5;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 14:46 Nov 14-11-3
 */
public class Person {
  private final String name;
  private final int time;
  private int currentTime;

  public Person(String name,int maxTime,int currentTime) {
    this.name = name;
    this.time = maxTime;
    this.currentTime = currentTime;
  }

  public String getName() {
    return name;
  }

  public int getCurrentTime() {
    return currentTime;
  }

  public int getMaxTime() {
    return time;
  }

  public void setCurrentTime() {
    currentTime++;
  }

  public void setCountDownTimerToZero() {
    currentTime=0;
  }
}
