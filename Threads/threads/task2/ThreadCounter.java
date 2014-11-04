package com.clouway.threads.task2;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 16:47 Oct 14-10-29
 */
//
//Да се направят 2 нишки броячи - броят от начална до крайна стойност.
//
//        На всяко отброяване да се извежда стойността на брояча.
//        На едната нишка се задава да брои до по-малка стойност от другата.
//        Когато една от нишките преброи до зададената стойност спира другата и завършва изпълнението си.
//        Да се пуснат нишките с малко различаващи се стойности и със стойности с голяма разлика.
//
//        Забележка: Програмата има само един клас нишка

public class ThreadCounter implements Runnable {

  private  int timer;

  public ThreadCounter(int timer) {
    this.timer = timer;
  }
  private String getThreadName(){
    String threadName=Thread.currentThread().getName();
    return threadName;
  }
  private boolean stop=false;
  @Override
  public void run() {
    for(int i=0;i<=timer;i++){

      try {
        Thread.sleep(1000);

      } catch (InterruptedException e) {
        notifyAll();
       return;
      }
      System.out.println(getThreadName()+" "+i);
    }
  }
}
