class A {
  void Amit() {
    System.out.println("I AM AMIT 1");
  }
}

class B extends A {
  void Amit() {
    System.out.println("I AM AMIT 2");
  }
}

class Question1{
  public static void main(String[] args) {
    B obj = new B();

    obj.Amit();
  }
}

