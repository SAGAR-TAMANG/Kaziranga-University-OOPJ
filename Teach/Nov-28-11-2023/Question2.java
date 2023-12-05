import java.util.HashMap

class A {
  A() {
    System.out.println("I AM BMW");  
  }
}

class B extends A {
  B() {
    System.out.println("I AM MARCEDES");  
  }
}

class C extends B {
  C() {
    System.out.println("I AM SAGAR");  
  }
}


class Question2 {
  public static void main(String[] args) {
    C obj = new C();
  }
}