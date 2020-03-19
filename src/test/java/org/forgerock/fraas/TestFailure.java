package org.forgerock.fraas;

public class TestFailure extends RuntimeException {

  public TestFailure(Throwable e) {
    super(e);
  }
}
