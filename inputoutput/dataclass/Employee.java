package com.clouway.inputoutput.dataclass;

import java.io.Serializable;

public class Employee implements Serializable {

  public String name;
  public String address;
  private String parentName;
  public Employee(String name, String address) {
    this.name = name;
    this.address = address;
  }
}
