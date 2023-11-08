// Calculate the average of an array in Java

class Question1 {
  public static void main(String[] args) {
    int arr[] = {10, 20, 30, 40, 50};

    int result = 0;

    for (int i = 0; i < arr.length; i++) {
      result = result + arr[i];
    }

    System.out.println("Average: " + result/5);
  }
}