package com.clouway.inputoutput.transferobject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TransfersObjectDemo {
  public static void main(String[] args) {

    TransfeersObject tr = new TransfeersObject();
    try {
      FileInputStream in = new FileInputStream("text.txt");
      FileOutputStream out = new FileOutputStream("text2.txt");
      int num = tr.transfer(in, out, 3, 4);
      System.out.printf("%s bytes transefered .", num);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}
