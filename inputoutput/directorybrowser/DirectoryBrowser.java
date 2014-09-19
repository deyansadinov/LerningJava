package com.clouway.inputoutput.directorybrowser;

//Да се направи клас DirectoryBrowser, който да извежда съдържанието на директория от файловата система.
//        Класът има метод listContent(String path).
//        Параметърът path е името на директория или файл с пълния път преди него (пример: H:\development\, C:\MyFile.jpg).
//        Методът проверява дали path сочи към файл или директория.
//        Ако сочи към файл - извежда се съобщение, че е подадено име на файл.Ако сочи към директория -
//        извежда се списък с имената на всички файлове и директории, съдържащи се в нея.
//        Пример: path= H:\development\, съдържа директориите Proj1, MyProj и файлът Proba.txt.

import java.io.File;

public class DirectoryBrowser {
  /**
   * IF the path leads to a file return file name
   * If the path leads to a directory print dir name and the names of the files inside.
   *
   * @param path curent path
   * @return
   */
  public String listContainer(String path) {

    File file = new File(path);

    if (file.isFile()) {
      System.out.println("File :" + file.getName() + file.getPath());
      return file.getName();
    }

    if (file.isDirectory()) {
      System.out.println("Dir :" + file.getName() + file.getPath());
      for (String x : file.list()) {
        System.out.println(x);
        listContainer(path + "/" + x);
      }
      return file.getName();
    }
    return null;
  }


}
