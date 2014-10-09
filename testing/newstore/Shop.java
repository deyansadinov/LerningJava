package com.clouway.testing.sample.newstore;

import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 13:20 Oct 14-10-9
 */
public class Shop {
  List<Prodcutt> container;

  public Shop(List<Prodcutt> container) {
    this.container = container;
  }

  public void add(Prodcutt prodcutt) {
    container.add(prodcutt);
  }

  public void sell(Prodcutt prodcutt, Integer price) throws ProductNotEnoughProductsException {
    prodcutt.setQuantity(prodcutt.getQuantity() - price);
    if (prodcutt.getQuantity() < 0) {
      throw new ProductNotEnoughProductsException();
    }
    if ((prodcutt.getQuantity() - price) <= 0) {
      container.remove(prodcutt);
    }

  }

  public void sortByPrice() {
    sort(container);
  }
}
