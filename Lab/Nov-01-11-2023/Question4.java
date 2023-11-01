// Demonstrate multiple catch statements

class Question4 {
  public static void main(String[] args){
    int d, a;

    try{
      d = 0;
      a = 42 / d;

      System.out.println("This will not be printed");
    }

    catch (ArithmeticException e) {
      System.out.println("Divided by 0: " + e);
    }

    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index oob: " + e);
    }

    finally {
      System.out.println("After catch statement");
    }
  }
}