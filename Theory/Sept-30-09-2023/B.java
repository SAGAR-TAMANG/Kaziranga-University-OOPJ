class A{
  int length, height, width;

  int vol(){
    return length * height * width;
  }
}

class B{
  public static void main(String args[]){
    A obj1 = new A();

    obj1.length = 5;
    obj1.height = 10;
    obj1.width = 15;
    
    int result = obj1.vol();

    System.out.println(result);
  }
}