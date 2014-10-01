package com.clouway.inputoutput.directorybrowser;

import java.io.File;
import java.io.IOException;

public class DirectoryBrowser {
  /**
   * IF the path leads to a file return file name
   * If the path leads to a directory print dir name and the names of the files inside.
   *
   * @param path curent path
   * @return
   */
  public String listContainer(String path) throws IOException {
    File file = new File(path);
    StringBuilder print = new StringBuilder();

   StringBuilder text= browse(file, print);

  return text.toString();
  }

  public StringBuilder browse(File file, StringBuilder txt) {
    if (file.isFile()) {
      txt.append(file.getParentFile());
      txt.append(" File :");
      txt.append(file.getName());
      txt.append("\n");
    }
    if (file.isDirectory()) {
      txt.append(" Dir :");
      txt.append(file.getName());
      txt.append("\n");

      for (File innerFile : file.listFiles()) {
        browse(innerFile, txt);
      }
    }
    return txt;
  }
}
