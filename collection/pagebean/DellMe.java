package com.clouway.collection.pagebean;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by clouway on 14-9-30.
 */
public class DellMe {

  private HashMap map;

  private LinkedList list=new LinkedList();
  private String valueHolder="";
  private String x="";

//  @Override
//  public boolean equals(Object o) {
//    if (this == o) return true;
//    if (o == null || getClass() != o.getClass()) return false;
//
//    DellMe dellMe = (DellMe) o;
//
//    if (list != null ? !list.equals(dellMe.list) : dellMe.list != null) return false;
//    if (map != null ? !map.equals(dellMe.map) : dellMe.map != null) return false;
//    if (valueHolder != null ? !valueHolder.equals(dellMe.valueHolder) : dellMe.valueHolder != null) return false;
//    if (x != null ? !x.equals(dellMe.x) : dellMe.x != null) return false;
//
//    return true;
//  }
//
//  @Override
//  public int hashCode() {
//    int result = map != null ? map.hashCode() : 0;
//    result = 77731 * result + (list != null ? list.hashCode() : 0);
//    result = 77731 * result + (valueHolder != null ? valueHolder.hashCode() : 0);
//    result = 77731 * result + (x != null ? x.hashCode() : 0);
//    return result;
//  }

  public DellMe(HashMap map) {
    this.map = map;
  }
  public void add(String key,String value){
    if(map.size()==0){
      map.put(key,value);
     list.add(value);
    }else{
      if(map.containsKey(key)){
        list.add(value);
        map.put(key,list.toString());
      }
    }
  }
}
