package com.clouway.inputoutput.reversefile;


import java.io.FileNotFoundException;
import java.io.IOException;

public class ReversedFileDemo {
  public static void main(String[] args) {
    ReversedFile rv = new ReversedFile();

    try {
      rv.reverseAndSave("text.txt");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
