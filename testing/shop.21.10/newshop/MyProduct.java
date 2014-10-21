package com.clouway.testing.sample.newshop;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 10:46 Oct 14-10-21
 */
public class MyProduct {
  private final String name;
  private final Double price;

  public MyProduct(String name, double price) {

    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public Double getPrice() {
    return price;
  }
}
