package com.clouway.inputoutput.readandsave;


import java.io.IOException;

public class SaveToFileDemo {
  public static void main(String[] args) {
    SaveToFile sf = new SaveToFile();
    System.out.println("Enter the name of the file then the text :");
    sf.getFileName();
    sf.read();
    try {
      sf.saveToFile();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
