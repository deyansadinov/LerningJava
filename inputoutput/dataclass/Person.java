package com.clouway.inputoutput.dataclass;

import java.io.Serializable;

public class Person implements Serializable {

  private String name;

  private String address;

  public Person(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getAddress() {
    return address;
  }

  public String getName() {
    return name;
  }

}
