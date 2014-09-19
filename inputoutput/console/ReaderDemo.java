package com.clouway.inputoutput.console;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by clouway on 14-9-17.
 */
public class ReaderDemo {
  public static void main(String[] args) throws FileNotFoundException {

   // Path path= Paths.get("/home/clouway/workspaces/idea/MyProject/src/com/clouway/");
  //  System.out.println(path.isAbsolute());
      String fileName="sample.txt";
    File file=new File("sample.txt");
   String cl= file.getAbsolutePath();
    FileInputStream in=new FileInputStream(file);









    Reader cn = new Reader(in);




    System.out.println("Read from console return Int :");
    int num = cn.readInt();
    System.out.println(num);

    System.out.println("Read from console return char :");
    char ch = cn.readChar();
    System.out.println(ch);

    System.out.println("Read from console return float :");
    float fl = cn.reaAFloat();
    System.out.println(fl);

    System.out.println("Read from console return string :");
    String text = cn.readString();
    System.out.println(text);
  }
}
