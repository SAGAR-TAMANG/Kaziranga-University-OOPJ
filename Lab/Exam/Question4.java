class Question4 {
  public static void main(String[] args) {
    try {
      int d = 0;
      int a = 32/d;

      System.out.println("Not printed");
    }
    catch (ArithmeticException e) {
      System.out.println("Caught it: " + e);
    }
  }  
}
