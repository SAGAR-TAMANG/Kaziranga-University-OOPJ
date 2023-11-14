class A {
  A() {
    System.out.println("I am the grandfather");
  }
}

class B extends A {
  B() {
    System.out.println("I am the father");
  }
}
class C extends B {
  C() {
    System.out.println("I am the son");
  }
}

class Question2 {
  public static void main(String[] args) {
    C obj1 = new C();
  }
}