package com.vogella.eclipse.ide.first;

public class MyFirstClass {

  private static final String HELLO = "Hello Eclipse!";

  public static void main(String[] args) {
    System.out.println(HELLO);
    int sum = 0;
    sum = calculateSum(sum);
    System.out.println(sum);
  }

  private static int calculateSum(int sum) {
    for (int i = 1; i <= 100; i++) {
      sum += i;
    }
    return sum;
  }
}
