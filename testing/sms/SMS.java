package com.clouway.testingwithmocks.sms;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 14:52 Oct 14-10-16
 */
public class SMS {

  private final String receiver;
  private final String title;
  private final String text;

  public SMS(String receiver, String title, String text) {

    this.receiver = receiver;
    this.title = title;
    this.text = text;
  }

  public String getReceiver() {
    return receiver;
  }

  public String getTitle() {
    return title;
  }

  public String getText() {
    return text;
  }
}
