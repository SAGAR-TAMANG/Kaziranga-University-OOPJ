class Amit{
  private int a = 10;

  void get(){
    System.out.println(a);
  }

  void set(int b){
    a = b;
  }
}

class mainDriver{
  public static void main(String args[]){
  Amit obj1 = new Amit();

  obj1.get();

  obj1.set(11);

  obj1.get();
  
  }
}