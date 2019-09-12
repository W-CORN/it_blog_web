package com.example.projectprotal;

import java.util.Arrays;

public class Test {
 public static void test1(int[] arr) {
  int temp;
  for (int i = 0; i < arr.length - 1; i++) {
   for (int j = 0; j < arr.length - i - 1; j++) {
    if (arr[j + 1] < arr[j]) {
     temp = arr[j];
     arr[j] = arr[j + 1];
     arr[j + 1] = temp;
    }
   }
  }
 }

 public static void main(String[] args) {
  Test test = new Test();
  int arr[] = new int[]{13, 26, 22, 22, 35, 18};
  test.test1(arr);
  System.out.println(Arrays.toString(arr));
 }
}
