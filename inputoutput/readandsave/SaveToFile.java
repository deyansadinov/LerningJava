package com.clouway.inputoutput.readandsave;

//Да се направи приложение, който чете текст от конзолата и записва въведеното в текстов файл.
//        Четенето спира при въвеждане на ред съдържащ само една точка ".". В началото да се указва името на създавания файл.

import java.io.*;
import java.util.Scanner;

public class SaveToFile {

  private String txt = "";
  private String fileName="";
  /**
   * The reading stops when we see ' . '
   */
  public void read() {
    Scanner scanner = new Scanner(System.in);
    String text;
    do {
      text = scanner.nextLine();
      txt += text;
    }
    while (!text.equalsIgnoreCase("."));
    scanner.close();
  }

  /**
   * Saves to file with name fileName
   * the text comes from read()
   * @throws IOException
   */
  public void saveToFile() throws IOException {

    File file = new File(fileName);

    BufferedWriter output = new BufferedWriter(new FileWriter(file));

    output.write(txt);
    output.close();
  }
  public void getFileName(){
    Scanner scan=new Scanner(System.in);
    fileName=scan.nextLine();
   // scan.close();
  }
}
