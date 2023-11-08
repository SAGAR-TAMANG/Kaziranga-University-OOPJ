// Write a program to find the average of a set of numbers using a one-dimensional array.

public class Question1 {
  double arr[] = {10.1, 11.2, 12.3, 13.4, 14.5};
  double ans = 0;
  
  for (int i = 0; i < arr.length; i++) {
    ans = ans + arr[i];
  }

  System.out.println("THE AVERAGE IS: " + ans / 5);
}
