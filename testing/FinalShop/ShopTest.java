package shop;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ShopTest {

  @Test
  public void sellOneProduct() throws Exception {
    Shop shop = createShop(new HashMap<String, Integer>() {{
      put("apple", 10);
    }});
    shop.add("apple", 10);


    assertThat(shop.sell("apple", 3), is(7));

  }

  @Test
  public void sellManyProducts() throws Exception {
    Shop shop = createShop(new HashMap<String, Integer>() {{
      put("apple", 120);
      put("banana", 100);
    }});
    shop.add("apple", 10);
    shop.add("banana", 13);

    assertThat(shop.sell("apple", 3), is(7));
    assertThat(shop.sell("banana", 4), is(9));

  }

  @Test
  public void addToQuantityOfProduct() throws Exception {
    Shop shop = createShop(new HashMap<String, Integer>() {{
      put("apple", 10);
    }});
    shop.add("apple", 10);
    assertThat(shop.addTo("apple", 5), is(15));
  }

  @Test(expected = TooBigQuantityToAddException.class)
  public void addMoreThenMAxQuantity() throws Exception {

    Shop shop = createShop(new HashMap<String, Integer>() {{
      put("apple", 50);
    }});
    shop.add("apple", 60);

  }

  @Test(expected = ProductNotFoundException.class)
  public void addingNonExistingProduct() throws Exception {

    Shop shop = createShop(new HashMap<String, Integer>() {{
      put("apple", 50);
    }});
    shop.add("banana", 10);
  }

  @Test(expected = TooBigQuantityToSellException.class)
  public void sellTooBigQuantity() throws Exception {
    Shop shop = createShop(new HashMap<String, Integer>() {{
      put("banana", 50);
    }});
    shop.add("banana", 30);
    shop.sell("banana", 40);

  }

  private Shop createShop(Map<String, Integer> inventory) {

    return new Shop(inventory);
  }

}