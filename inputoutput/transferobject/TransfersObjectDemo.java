package com.clouway.inputoutput.transferobject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TransfersObjectDemo {
  public static void main(String[] args) {



    try {
      FileInputStream in = new FileInputStream("text.txt");
      FileOutputStream out = new FileOutputStream("text2.txt");
      TransfeersObject tr = new TransfeersObject();

      int numberOfBytes=24;
      int num=tr.transfer(in, out,numberOfBytes,0);
      System.out.printf(" In  %s step .%s bytes transfered.", num,numberOfBytes);
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    catch (IOException e) {
      e.printStackTrace();
    }


  }
}
