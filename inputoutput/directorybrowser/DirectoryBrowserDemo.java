package com.clouway.inputoutput.directorybrowser;

import java.io.IOException;

public class DirectoryBrowserDemo {
  public static void main(String[] args) throws IOException {

    DirectoryBrowser browser = new DirectoryBrowser();
    browser.listContainer("/home/clouway/Test");

  }
}
