class A{
  int a = 10;
  static int b = 20;

  void amit() {
    System.out.println(b);
  }
}

class Question {
  public static void main(String[] args){
    final int a = 10;

    a = 20;
    System.out.println(a);
    }
}