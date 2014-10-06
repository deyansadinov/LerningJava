package com.clouway.testing.sample.tasckobjects;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SumatorTest {

  @Test
  public void sumString() throws Exception {
    Sumator sumator = new Sumator("2","2");
      int num = sumator.sum();
      assertThat(num, is(equalTo(4)));
  }
  @Test(expected = NumberFormatException.class)
  public void nullArgument() throws Exception {
   Sumator sum=new Sumator(null,"34");
    sum.sum();
  }
}