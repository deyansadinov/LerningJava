package com.clouway.testingwithmocks.sms;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 15:24 Oct 14-10-16
 */
public class Error extends RuntimeException {
  public Error(String message) {
    super(message);
  }
}
