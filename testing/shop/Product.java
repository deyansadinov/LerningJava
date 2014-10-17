package com.clouway.today;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 10:22 Oct 14-10-17
 */
public class Product implements Comparable<Product>{


  private final String name;
  private  Integer quantity;
  private final Double price;
  private final Double sellPrice;

  public Product(String name, Integer quantity, Double price, Double sellPrice) {
    this.name = name;
    this.quantity = quantity;
    this.price = price;
    this.sellPrice = sellPrice;
  }

  public String getName() {
    return name;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void sell(int sellQuantity) {
    this.quantity=quantity-sellQuantity;
  }

  @Override
  public int compareTo(Product o) {
    int priceComp=this.price.compareTo(o.price);
    return (priceComp !=0 ? priceComp:this.quantity.compareTo(o.quantity));
  }
}
