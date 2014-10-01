package com.clouway.inputoutput.readandsave;

import java.io.*;
import java.util.Scanner;

public class FileSaver {

  private final String breakPoint;
  private String txt = "";
  private String fileName;

  /**
   * The reading stops when we see ' . '
   */
  public FileSaver(String fileName,String breakPoint) {
    this.fileName = fileName;
    this.breakPoint=breakPoint;
  }
  /**
   * Saves to file with name fileName
   * the text comes from read()
   *
   * @throws IOException
   */
  public void write() throws IOException {

    File file = new File(fileName);
    BufferedWriter output = new BufferedWriter(new FileWriter(file));
    String text=getText();
    output.write(text);
    output.close();
  }
  public String getText(){
    Scanner scan=new Scanner(System.in);
      String text;
      String txt = "";
  do {
    text = scan.nextLine();
    txt += text;
  }
  while (!text.equals(breakPoint));
    System.out.println(txt);
  return txt;
  }


}
