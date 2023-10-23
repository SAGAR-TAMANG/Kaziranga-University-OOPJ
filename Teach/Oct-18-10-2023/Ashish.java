class Sagar {
  int a = 10;
  int b = 10;
  
  void summ(){
    System.out.println("FIRST");
  };
  
  void summ(int a, int b){
    System.out.println("SECOND");
  };
};

class Ashish {
  public static void main(String args[]){
    System.out.println("HELLO WORLD");

    Sagar obj1 = new Sagar();

    obj1.summ(1, 2);  
  };
};