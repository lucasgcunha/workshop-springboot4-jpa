package com.educandoweb.course.services.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException {
  @Serial
  private static final long serialVersionUID = -5181015101929750833L;

  public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }
}
