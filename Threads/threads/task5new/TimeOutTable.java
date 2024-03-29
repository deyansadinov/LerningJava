package com.clouway.threads.task5new;

import java.util.HashMap;
import java.util.Map;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 9:13 Nov 14-11-12
 */


/**
 * @param <K>-the   key (name) for the map.
 * @param <V>-value (object) fot the map.
 */
public class TimeOutTable<K, V> {

  private Map<K, ThreadedValue<V>> timeOutTable = new HashMap<>();
  private Integer timer;


  public TimeOutTable(Integer timer) {
    this.timer = timer;
  }

  public synchronized void put(K key, V value) {
    ThreadedValue<V> threadAdd = (ThreadedValue<V>) new ThreadedValue<>(value, timeOutTable, timer, key);
    Thread thread = new Thread(threadAdd);

    if (timeOutTable.get(key) != null) {
      timeOutTable.get(key).setActive(false);
    }

    timeOutTable.put(key, threadAdd);
    thread.start();

  }

  public V get(K key) {
    if (timeOutTable.get(key) != null) {
      timeOutTable.get(key).reset();
      return timeOutTable.get(key).getValue();
    }
    return null;
  }

  public V remove(K key) {
    if (timeOutTable.get(key) != null) {
      timeOutTable.get(key).terminate();
      timeOutTable.remove(key);
    }
    return null;
  }
}
