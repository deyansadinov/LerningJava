package com.clouway.testing.sample.introducingjava;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class ArrayTest {


  @Test
  public void print() throws Exception {
    int[] arr = new int[]{1, 2, 3, 4};
    Array array = new Array(arr);
    final StringBuilder builder = new StringBuilder();
    array.print(new Display() {
      @Override
      public void print(int x) {
        builder.append(x);
      }
    });

    assertThat(builder.toString(), is(equalTo("1234")));

  }

  @Test
  public void sum() throws Exception {
    int[] arr = new int[]{1, 2, 3, 4};
    Array array = new Array(arr);
    int sum = array.getSum();
    assertThat(sum, is(10));
  }

  @Test
  public void minElement() throws Exception {
    int[] arr = new int[]{1, 2, 3, 4};
    Array array = new Array(arr);
    int min = array.getMinElement();
    assertEquals(min, 1);
  }

}