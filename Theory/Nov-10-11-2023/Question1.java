class Question1 {
  public static void main(String[] args) {
    double arr[] = {65.7, 89.7, 56.4, 90.3, 75.7};
    int len = arr.length;
    double sum = 0;

    for (int i = 0; i < len; i++) {
      sum = sum + arr[i];
    }
    System.out.println("The Average is: " + sum/len);
  }
}