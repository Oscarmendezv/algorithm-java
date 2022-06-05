package main.java.com.oscarmendezv.algorithm;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    long maxNumber = getMaxNumberInArrayAfterOperations(input);

    System.out.println(maxNumber);
  }

  public static long getMaxNumberInArrayAfterOperations(Scanner input) {
    int arraySize;
    arraySize = input.nextInt();

    if (!validateListSize(arraySize)) {
      throw new RuntimeException("Introduce a correct list size");
    }

    int[] arr = new int[arraySize+1];

    int numberOfOperations = input.nextInt();

    if (!validateNumberOfOperations(numberOfOperations)) {
      throw new RuntimeException("Introduce a correct number of operations");
    }

    for (int i = 0; i < numberOfOperations; i++) {
      int lowerMargin = input.nextInt() - 1;
      int higherMargin = input.nextInt() - 1;

      if (!validateArrayIndices(lowerMargin, higherMargin, arraySize)) {
        throw new RuntimeException("Introduce valid indices");
      }

      int numberToAdd = input.nextInt();

      if (!validateNumberToAdd(numberToAdd)) {
        throw new RuntimeException("Introduce a valid number to add");
      }

      arr[lowerMargin] = arr[lowerMargin] + numberToAdd;
      arr[higherMargin] = arr[higherMargin] - numberToAdd;
    }

    long maxNumber = 0;
    int currentResult = 0;

    for (int k : arr) {
      currentResult = currentResult + k;

      if (currentResult > maxNumber) {
        maxNumber = currentResult;
      }
    }

    return maxNumber;
  }

  private static boolean validateListSize(int listSize) {
    return listSize >= 3 && listSize <= 10_000_000;
  }

  private static boolean validateNumberOfOperations(int numberOfOperations) {
    return numberOfOperations >= 1 && numberOfOperations <= 200_000;
  }

  private static boolean validateArrayIndices(int startIndex, int endIndex, int listSize) {
    return startIndex>= 0 && endIndex <= listSize - 1 && startIndex <= endIndex;
  }

  private static boolean validateNumberToAdd(int numberToAdd) {
    return numberToAdd >= 0 && numberToAdd <= 1_000_000_000;
  }
}
