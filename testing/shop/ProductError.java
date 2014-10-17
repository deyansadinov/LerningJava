package com.clouway.today;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 10:19 Oct 14-10-17
 */
public class ProductError extends RuntimeException {
  public ProductError(String message) {
    super(message);
  }
}
