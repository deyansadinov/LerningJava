package com.clouway.inputoutput.readandsave;

import java.io.*;

public class SaveToFile {

  private String txt = "";
  private String fileName;

  /**
   * The reading stops when we see ' . '
   */
  public SaveToFile(String fileName, String theText) {
    this.fileName = fileName;
    this.txt = theText;
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
    output.write(txt);
    output.close();
  }

}
