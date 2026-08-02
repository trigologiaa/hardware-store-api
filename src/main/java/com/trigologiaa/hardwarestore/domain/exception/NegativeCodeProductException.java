package com.trigologiaa.hardwarestore.domain.exception;

import java.io.Serial;

/**
 * Exception thrown when an attempt is made to assign a negative code to a product.
 */
public class NegativeCodeProductException extends RuntimeException {
  @Serial
  private static final long serialVersionUID = 1L;

  /**
   * Constructs a new {@code NegativeCodeProductExeception} with the specified detail message.
   *
   * @param message the detail message explaining the reason for the exception
   */
  public NegativeCodeProductException(String message) {
    super(message);
  }
}