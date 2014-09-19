package com.clouway.inputoutput.reversefile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReversedFile {
  /**
   * Gets the content of the file reverses it and saves it on the file.
   */
  private String textHolder="";

  public  void reverseAndSave(String fileName) throws IOException {
    String text=readFromFile(fileName);
    String reversedText=reverse(text);
    saveToFile(fileName,reversedText);
  }
  /**
   * The content of the file is read and put into a buffer
   *
   * @param fileName
   */
  private String readFromFile(String fileName) throws IOException {

    BufferedReader input = new BufferedReader(new FileReader(fileName));
//    String text = input.readLine();
    String text;
    while((text=input.readLine())!=null){
        textHolder+=" "+text;
    }
    input.close();
    return textHolder;
  }

  /**
   * Reverses the content of the file.
   * @param text
   */
  private String reverse(String text) {
    String[] theText = text.split("");
    String[] reversedText = new String[theText.length];

    for (int i = 0; i < theText.length; i++) {
      reversedText[reversedText.length - 1 - i] = theText[i];

    }
    String txt = "";
    for (String x : reversedText) {
      txt += x;
    }
   return txt;
  }

  /**
   * Saves the content to the file.
   * @param fileName
   * @param text
   * @throws IOException
   */
  private void saveToFile(String fileName,String text) throws IOException {
    File file = new File(fileName);
    BufferedWriter output=new BufferedWriter(new FileWriter(file));
    output.write(text);
    output.close();
  }
}
