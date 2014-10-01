package com.clouway.collection.pagebean;

import com.clouway.introducingjava.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.TreeSet;

/**
 * Created by clouway on 14-9-30.
 */
public class DellMeDemo {
  public static void main(String[] args) {

    HashMap<String, String> ha = new HashMap<String, String>();

    DellMe map = new DellMe(ha);

//    ha.put("1","a");
    ha.put(null,"sdsd");
    ha.put("a","sssss");

    map.add("1","2");
    map.add("2","222");
    map.add(null,"3332");
    map.add("1","2");

    Hashtable table= new Hashtable();
    table.put(1,"sasa");
    table.put(1,"sasa");

    HashSet sss=new HashSet();
    sss.add("a");
    sss.add(1);
    sss.add("a");
    sss.add(3);


    TreeSet
  }
}
