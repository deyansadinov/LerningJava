package com.clouway.today;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ShopTest {

  @Test(expected = ProductError.class)
  public void sellFromEmptyShop() throws Exception {

    List<Product> productList=new ArrayList<>();
    Shop shop=new Shop(productList);

    shop.sell("apple",10);
  }

  @Test(expected = ProductError.class)
  public void sellIfProductDoesNotExist() throws Exception {
    List<Product> productList=new ArrayList<>();
    Shop shop=new Shop(productList);
    shop.add(new Product("apple",20,2.10,2.30));
    shop.add(new Product("mango",9,3.10,4.30));

    shop.sell("banana", 10);
  }

  @Test
  public void getProductTest() throws Exception {
    List<Product> productList = new ArrayList<>();
    Shop shop = new Shop(productList);
    Product apple=new Product("apple", 20, 2.10, 2.30);
    Product banana=new Product("banana", 30, 3.10, 3.30);
    shop.add(apple);
    shop.add(banana);

    Product theProduct = shop.getProduct("apple");
    assertThat(theProduct,is(apple));
  }
  @Test
  public void sellFromProductThatExists() throws Exception {
    List<Product> productList=new ArrayList<>();
    Shop shop=new Shop(productList);
    shop.add(new Product("apple",20,2.10,2.30));


    Product theProduct=shop.getProduct("apple");

    shop.sell("apple", 10);

    assertThat(theProduct.getQuantity(),is(10));
  }

  @Test
  public void addNewProduct() throws Exception {
    List<Product> productList=new ArrayList<>();
    Shop shop=new Shop(productList);

    shop.add(new Product("apple",20,2.10,2.30));

    assertThat(productList.size(), is(1));
  }

  @Test(expected = ProductError.class)
  public void sellTooBigQuantity() throws Exception {
    List<Product> productList=new ArrayList<>();
    Shop shop=new Shop(productList);
    shop.add(new Product("apple",20,2.10,2.30));

    shop.sell("apple", 30);

  }

  @Test
  public void shopSortBy() throws Exception {
    List<Product> productList = new ArrayList<>();
    Shop shop = new Shop(productList);
    Product apple=new Product("apple", 20, 2.10, 2.30);
    Product banana=new Product("banana", 30, 3.10, 3.30);
    shop.add(apple);
    shop.add(banana);

  }

  @Test
  public void sortByPrice() throws Exception {
    List<Product> productList = new ArrayList<>();
    Shop shop = new Shop(productList);

    Product banana=new Product("banana", 30, 3.10, 3.30);
    Product mango=new Product("mango", 10, 3.10, 3.30);
    Product eggs=new Product("eggs", 15, 3.10, 3.30);
    Product apple=new Product("apple", 20, 2.10, 2.30);
    Product corn=new Product("corn", 22, 3.10, 3.30);


    shop.add(banana);
    shop.add(mango);
    shop.add(eggs);
    shop.add(apple);
    shop.add(corn);

    shop.sortByPrice();

    assertThat(productList.get(0),is(apple));
    assertThat(productList.get(1),is(mango));
  }

}