// Constructor

class Box{
  double Siddharth;
  double Sagar;

  double result;

  double addition(){
    result = Siddharth + Sagar;
    return result;
  }

}

class Main{

  public static void main(String args[]){
    Box firstbox;
    firstbox = new Box();

    firstbox.Siddharth = 10;
    firstbox.Sagar = 50;

    double var;

    var = firstbox.addition();
  
    System.out.println(var);
  }
}