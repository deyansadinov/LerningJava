package com.clouway.threads.task5;

import com.clouway.testingwithmocks.newservice.*;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;


/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 11:27 Nov 14-11-3
 */

//Класът съдържа Hashtable със стойности. За стойностите зад всеки ключ се следи времето,
// за което не са използвани (т.е. за ключа не са извиквани методите put() и get()).
// При неизползване на даден ключ за определен предварително зададен интервал от време той да се изтрива от таблицата.
//
//        - put(String key, Object value) - при въвеждане на стойност с вече съществуващ ключ, то стойността се замества с новата;
//        - get(String key) - връща обект по ключ, ако го няма - null;
//        - remove(String key) - маха елемент по ключ, ако го няма връща null.

public class TimeoutHashtable {

  private Hashtable<String,Person> myHashtable = new Hashtable<>();

  public synchronized void put(String key, Person person) {

    myHashtable.put(person.getName(), person);

    notifyAll();
  }

  public Hashtable<String, Person> getMyHashtable() {
    return myHashtable;
  }

  public synchronized Person get(String key) {
    if (myHashtable.get(key) != null) {

      Person p=myHashtable.get(key);
      p.setCountDownTimerToZero();
      notifyAll();
      return myHashtable.get(key);
    }
    return null;
  }

  public synchronized Person remove(String key) {
    if (myHashtable.get(key) != null) {
      myHashtable.remove(key);
      return myHashtable.get(key);
    }
    return null;
  }
}
