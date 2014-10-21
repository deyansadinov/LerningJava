package com.clouway.testing.sample.newshop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 10:41 Oct 14-10-21
 */
public class Shop {
  HashMap<String, ProductHolder> hashMap = new HashMap();

  public int sell(String name, int quantity) {

    if (hashMap.size() == 0) {
      throw new ErrorInShopException();
    }
    if (hashMap.get(name) == null) {
      throw new ErrorInShopException();
    }
    ProductHolder myProduct = hashMap.get(name);
    return myProduct.sell(quantity);

  }

  public void addNewProduct(MyProduct myProduct, int maxQuantity, int quantity) {
    hashMap.put(myProduct.getName(), new ProductHolder(myProduct, maxQuantity, quantity));
  }

  public int add(String name, int quantity) {
    ProductHolder myProduct = hashMap.get(name);
    return myProduct.add(quantity);
  }

  public List<MyProduct> sort(SortbyPrice sortbyPrice) {
    List<MyProduct> myProductList = new ArrayList<>();
    List<ProductHolder> list = new ArrayList<>(hashMap.values());
    for (ProductHolder x : list) {
      myProductList.add(x.getProduct());
    }
    Collections.sort(myProductList, sortbyPrice);
    return myProductList;
  }


  private class ProductHolder {
    private MyProduct myProduct;
    private final int maxQuantity;
    private int currentQuantity;

    private ProductHolder(MyProduct myProduct, int maxQuantity, int currentQuantity) {
      this.myProduct = myProduct;
      this.maxQuantity = maxQuantity;
      this.currentQuantity = currentQuantity;
    }

    public int sell(int quantity) {
      if (currentQuantity - quantity < 0) {
        throw new ErrorInShopException();
      }
      return currentQuantity - quantity;
    }

    public int add(int quantity) {
      if (currentQuantity + quantity > maxQuantity) {
        throw new ErrorInShopException();
      }
      return currentQuantity += quantity;
    }

    public MyProduct getProduct() {
      return myProduct;
    }
  }
}
