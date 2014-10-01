package com.clouway.collection.pagebean.taskone;


//next() - връща следващите няколко елемента от списъка;
//        previous() - връща предишните няколко елемента на списъка;
//        hasNext() - връща дали има следващи елементи;
//        hasPrevious() - връща дали има предишни елементи;
//        firstPage() - връща първата страница и я прави текуща;
//        lastPage() - връща последната страница и я прави текуща;
//        getCurrentPageNumber() - връща номера на текущата страница.


//При стартиране на програмата да се показва първата страница от списъка чрез извикване на next().
// Методите next() и previous() да могат да се извикват от конзолата.
//        Когато е показана първата страница (първите няколко елемента от списъка) и се
// извика метода previous () - да се изписва съобщение за грешка.
//        Ако последната страница на списъка е с по-малко от pageSize елементи и се извика метода next
// () да НЕ се получава грешка.


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * <T> parameter.
 */
public class PageBean {
  private boolean programStart = true;
  private final int PAGESIZE;
  private final List ELEMENTS;

  private int index = 0;
  private int pageNumber = 0;
  private Scanner scanner = new Scanner(System.in);

  public PageBean(List elements, int pageSize) {
    this.PAGESIZE = pageSize;
    this.ELEMENTS = elements;
  }

  /**
   * returns true or false if there is a next element;
   *
   * @return
   */
  public boolean hasNext() throws IndexOutOfBoundsException {
    if (index < ELEMENTS.size()) {
      return true;
    }
    return false;
  }

  /**
   * returns true or false if there is a previous element;
   *
   * @return
   */
  public boolean hasPrevious() {
    for (ListIterator it = ELEMENTS.listIterator(index - 1); it.hasPrevious(); ) {
      if (it.hasPrevious()) {
        return true;
      }
    }
    return false;
  }

  /**
   * @return the current page number.
   */
  public int getCurrentPageNumber() {
    if (pageNumber > ELEMENTS.size() / PAGESIZE) {
      pageNumber = 1;
    }
    return pageNumber;
  }

  public void firstPage() {
    pageNumber = 1;
    index = 1;
    //index = ELEMENTS.indexOf(pageNumber+PAGESIZE);
  }

  /**
   * Gets the last page and makes it to be the current one.
   */
  public void lastPage() {
    pageNumber = ELEMENTS.size() / PAGESIZE;

    index = ELEMENTS.lastIndexOf(ELEMENTS.size()) + 1;

  }

  /**
   * Prints the next elements.
   */
  public void next() {
    if ((index) >= ELEMENTS.size()) {
      System.out.println("Back to the start of the page.");
      index = 0;
    }
    if ((index + PAGESIZE) > ELEMENTS.size()) {
      System.out.println(ELEMENTS.get(index));
    } else {
      for (Object d : ELEMENTS.subList(index, PAGESIZE + index)) {
        System.out.println(d);
      }
    }

    index += PAGESIZE;
    System.out.println();
    pageNumber++;
  }

  /**
   * Rerturns the previous elemnts it they exist
   */
  public void previous() {

    index -= PAGESIZE * 2;
    for (Object d : ELEMENTS.subList(index, index + PAGESIZE)) {
      System.out.println(d);

    }
    index += PAGESIZE;
    System.out.println();
    if (index < 0) {
      throw new IndexOutOfBoundsException();
    }
    pageNumber--;
  }

}
