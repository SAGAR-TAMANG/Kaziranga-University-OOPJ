class A{
  int i, j;

  A(int a, int b){
    i = a;
    j = b;
  }

  void show(){
    System.out.println("i & j: " + i + " " + j);
  }
}

class B extends A{
  int k;
  
  B(int a, int b, int c){
    super(a, b);
    k = c;
  }

  void show(){
    super.show(); // THis will show the A's show()
    System.out.println("k: " + k);
  }
}

class override{
  public static void main(String args[]){
    B subOb = new B(1, 2, 3);
    subOb.show();
  }
}