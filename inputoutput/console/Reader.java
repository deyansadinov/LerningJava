package com.clouway.inputoutput.console;

import java.io.File;
import java.io.InputStream;
import java.util.*;
//Да се направи клас, който чете от конзолата. Трябва да има следните методи:
//
//        readString();
//        readInt();
//        readChar();
//        readFloat();
//

import java.util.Scanner;

public class Reader {

  private Scanner scanner;

  public Reader(InputStream in) {
    this.scanner=new Scanner(in);
  }

  public int readInt() throws InputMismatchException {
    int num = scanner.nextInt();
    scanner.nextLine();
    return num;
  }

  public char readChar() {
    char ch = scanner.nextLine().charAt(0);
    return ch;
  }

  public float reaAFloat() {
    float fl = scanner.nextFloat();
    scanner.nextLine();
    return fl;
  }

  public String readString() {
    String txt = scanner.nextLine();
    return txt;
  }

}
