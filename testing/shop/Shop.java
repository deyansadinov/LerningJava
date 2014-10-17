package com.clouway.today;

import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class Shop {
  private List<Product> productList;

  public Shop(List<Product> productList) {

    this.productList = productList;
  }

  public void sell(String name, int sellQuantity) {
    if (productList.size() == 0) {
      throw new ProductError("There is nothing to sell , the shop is empty !");
    }
    int count = 0;

    for (Product product : productList) {
      if (product.getName() == name) count++;
    }
    if (count == 0) throw new ProductError("Product does not exist");
    Product toSell = getProduct(name);
    if(toSell.getQuantity()<sellQuantity) throw new ProductError("We cant sell you that quantity of the product we have"+toSell.getQuantity());

    toSell.sell(sellQuantity);
  }
  public void add(Product product) {
    productList.add(product);
  }
  public Product getProduct(String name) {
    for (Product product : productList) {
      if (product.getName() == name) return product;
    }
    return null;
  }
  public void sorrt(){

  }

  public void sortByPrice() {
    sort(productList);
  }
}
