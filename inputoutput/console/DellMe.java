package com.clouway.inputoutput.console;

import java.net.URL;

/**
 * Created by clouway on 14-9-19.
 */
public class DellMe {
  public static void main(String[] args) throws ClassNotFoundException {
    Class cls = Class.forName("DellMe");

    // returns the ClassLoader object associated with this Class
    ClassLoader cLoader = cls.getClassLoader();

    System.out.println(cLoader.getClass());

    // finds resource
    URL url = cLoader.getSystemResource("file.txt");
    System.out.println("Value = " + url);

  }
}
