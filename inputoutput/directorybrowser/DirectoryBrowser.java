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
  public void listContainer(String path) throws IOException {
    File file = new File(path);
    StringBuilder print = new StringBuilder();

    browser(file, print);
    System.out.println(print.toString());

  }

  public void browser(File file, StringBuilder txt) {
    if (file.isFile()) {
      txt.append(file.getParentFile());
      txt.append(" File :");
      txt.append(file.getName());
    }
    if (file.isDirectory()) {
      txt.append(" Dir :");
      txt.append(file.getName());

      for (File x : file.listFiles()) {
        browser(x, txt);
      }
    }
  }
}
