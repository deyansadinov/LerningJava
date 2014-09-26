package com.clouway.inputoutput.readandsave;


import java.io.IOException;
import java.util.Scanner;

public class SaveToFileDemo {
  public static void main(String[] args) {
    System.out.println("First enter a breaking simbol or something.\nEnter the name of the file .\nAnd then the text :");

    Scanner scan = new Scanner(System.in);

    String breakPoint = scan.nextLine();
    String fileName = scan.nextLine();
    String text;
    String txt = "";
    do {
      text = scan.nextLine();
      txt += text;
    }
    while (!text.equals(breakPoint));

    SaveToFile sf = new SaveToFile(fileName, txt);
    try {
      sf.write();
    } catch (IOException e) {
      e.printStackTrace();
    }
    scan.close();
  }
}
