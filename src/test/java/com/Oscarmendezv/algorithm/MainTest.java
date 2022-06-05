package test.java.com.Oscarmendezv.algorithm;

import main.java.com.oscarmendezv.algorithm.App;
import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class MainTest {

  @Test
  public void sampleTestCaseReturnsExpectedOutput() {
    Scanner scanner = new Scanner("5 3" + "\n1 2 100" + "\n2 5 100" + "\n3 4 100");

    long maxNumber = App.getMaxNumberInArrayAfterOperations(scanner);

    Assert.assertEquals(200, maxNumber);
  }

  @Test
  public void inValidListSizeThrowsException() {
    Scanner scanner = new Scanner("2 3" + "\n1 2 100" + "\n2 5 100" + "\n3 4 100");

    Assert.assertThrows(RuntimeException.class, () -> App.getMaxNumberInArrayAfterOperations(scanner));
  }

  @Test
  public void inValidNumberOfOperationsThrowsException() {
    Scanner scanner = new Scanner("5 0" + "\n1 2 100" + "\n2 5 100" + "\n3 4 100");

    Assert.assertThrows(RuntimeException.class, () -> App.getMaxNumberInArrayAfterOperations(scanner));
  }

  @Test
  public void inValidNumberToAddThrowsException() {
    Scanner scanner = new Scanner("5 1" + "\n1 2 1000000001");

    Assert.assertThrows(RuntimeException.class, () -> App.getMaxNumberInArrayAfterOperations(scanner));
  }

  @Test
  public void invalidStartIndexThrowsException() {
    Scanner scanner = new Scanner("5 1" + "\n0 2 1000000001");

    Assert.assertThrows(RuntimeException.class, () -> App.getMaxNumberInArrayAfterOperations(scanner));
  }

  @Test
  public void invalidEndIndexThrowsException() {
    Scanner scanner = new Scanner("5 1" + "\n1 6 1000000001");

    Assert.assertThrows(RuntimeException.class, () -> App.getMaxNumberInArrayAfterOperations(scanner));
  }

  @Test
  public void invalidParOdIndicesThrowsException() {
    Scanner scanner = new Scanner("5 1" + "\n3 2 1000000001");

    Assert.assertThrows(RuntimeException.class, () -> App.getMaxNumberInArrayAfterOperations(scanner));
  }
}
