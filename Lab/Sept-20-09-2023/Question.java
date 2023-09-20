class A{
  int i, j;

  void showij(){
  System.out.println("I & J: " + i + " " + j);
  }
}

class B extends A{
  int k;

  void showijk(){
    System.out.println("I, J & K: " + i + " " + j + " " + k);
  }
}

class Question{
  public static void main(String args[]){
    A obj1 = new A();
    B obj2 = new B();

    obj1.i = 1;
    obj1.j = 2;

    obj1.showij();

    obj2.i = 1;
    obj2.j = 2;
    obj2.k = 3;
    
    obj2.showijk();
  }
}