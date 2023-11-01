// Display a Description of an Exception

class Question3 {
  public static void main(String[] args){
    int d, a;

    try{
      d = 0;
      a = 42 / d;

      System.out.println("This will not be printed");
    }

    catch (ArithmeticException e) {
      System.out.println("Exception: " + e);
    }

    finally {
      System.out.println("After catch statement");
    }
  }
}