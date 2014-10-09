package com.clouway.testing.sample.newstore;

import java.util.Collections;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 13:20 Oct 14-10-9
 */
public class Prodcutt implements Comparable<Prodcutt> {
  private String type;
  private Double price;
  private Integer quantity;

  public Prodcutt(String type, double price, Integer quantity) {
    this.type = type;
    this.price = price;
    this.quantity = quantity;
  }

  public double getPrice() {
    return price;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Prodcutt product = (Prodcutt) o;

    if (Double.compare(product.price, price) != 0) return false;
    if (quantity != null ? !quantity.equals(product.quantity) : product.quantity != null) return false;
    if (type != null ? !type.equals(product.type) : product.type != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    result = type != null ? type.hashCode() : 0;
    temp = Double.doubleToLongBits(price);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
    return result;
  }


  @Override
  public int compareTo(Prodcutt o) {
    return this.price.compareTo(o.getPrice());
  }
}
