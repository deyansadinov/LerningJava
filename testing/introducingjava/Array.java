package com.clouway.testing.sample.introducingjava;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 14:06 Oct 14-10-6
 */
public class Array {

  //private int[] array = new int[]{1,2,3};
  int [] array;
  Array(int[] array) {
  this.array=array;
  }

  public void print(Display display) {
    for (int element : array) {
      display.print(element);
    }
  }

  /**
   * Prints out the min element in an array.
   */
  public int getMinElement() {
    int min = array[0];
    for (int i = 1; i < array.length; i++) {
      if (min > array[i]) {
        min = array[i];
      }
    }
    return min;
  }

  /**
   * Prints out the sum of all the elements of an array.
   */
  public int getSum() {
    int sum = 0;
    for (int x : array) {
      sum += x;
    }
    return sum;
  }
}
