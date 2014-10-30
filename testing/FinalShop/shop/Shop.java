package shop;

import java.util.HashMap;
import java.util.Map;

public class Shop {

  /**
   * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 17:01 Oct 14-10-28
   */
  private class ProductSlot {

    private final Product product;
    private int currentQuantity;

    private ProductSlot(Product product, int currentQuantity) {
      this.product = product;
      this.currentQuantity = currentQuantity;
    }

    public int sell(int quantity) {
      return currentQuantity - quantity;
    }

    public int addTo(int quantity) {
      return currentQuantity+quantity;
    }

    public int getCurrentQuantity() {
      return currentQuantity;
    }
  }
  private Map<String, ProductSlot> container = new HashMap<String, ProductSlot>();

  private Map<String, Integer> inventory;

  public Shop(Map<String, Integer> inventory) {

    this.inventory = inventory;
  }

  public void add(String name, int quantity) {
    if(!inventory.containsKey(name)){
      throw new ProductNotFoundException();
    }
    if(inventory.get(name)<quantity){
      throw  new TooBigQuantityToAddException();
    }
    container.put(name, new ProductSlot(new Product(name), quantity));
  }

  public int sell(String name, int quantity) {

    ProductSlot theProduct = container.get(name);
    if (theProduct.getCurrentQuantity() - quantity < 0) {
      throw new TooBigQuantityToSellException();
    }
    return theProduct.sell(quantity);

  }

  public int addTo(String name, int quantity) {
    ProductSlot theProduct = container.get(name);
    return theProduct.addTo(quantity);

  }
}
