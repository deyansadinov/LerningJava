package com.clouway.testing.sample.newshop;

import com.clouway.shop.today.Product;

import java.util.Comparator;


/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 11:49 Oct 14-10-21
 */
public class SortbyPrice implements Comparator<MyProduct> {


  @Override
  public int compare(MyProduct o1, MyProduct o2) {
    return o1.getPrice().compareTo(o2.getPrice());
  }
}
