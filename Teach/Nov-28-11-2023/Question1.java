// Overloading Polymorphism

class A {
  void Amit() {
    System.out.println("HIIII 1");
  }

  void Amit(int a) {
    System.out.println("HIIII 2");
  }

  void Amit(int a, int b) {
    System.out.println("HIIII 3");
  }
}

class Question1 {
  public static void main(String[] args) {
    A obj = new A();

    obj.Amit();
  }
}