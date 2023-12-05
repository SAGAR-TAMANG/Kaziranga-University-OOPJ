// Exception Handling

class Question2 {
  public static void main(String[] args) {
    try {
      int a = 0;
      int d = 32/a;

      System.out.println("NOT PRINTING");
    }
    catch (ArithmeticException e) {
      System.out.println("CAUGHT IT: " + e);
    }
  }
}