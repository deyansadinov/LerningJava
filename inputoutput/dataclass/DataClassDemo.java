package com.clouway.inputoutput.dataclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataClassDemo {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    Employee em = new Employee("Ivan", "Ivan Sarafov");
    DataClass dc = new DataClass();

   // OutputStream out=new FileOutputStream("serializable.ser");
    InputStream in=new FileInputStream("serializable.ser");

    //dc.saveObject(out,em);
    System.out.println(dc.getObject(in));

  }
}
