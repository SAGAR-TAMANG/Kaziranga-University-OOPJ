class Area{
  double width;
  double length;
  double result;

  public void area(){
    System.out.println("Please Pass an Argument");
  }

  public double area(double a, double b){
    width = a;
    length = b;
    result = width * length;
    return result;
  } 
}
class Question2{
  public static void main(String args[]){
  Area obj1 = new Area();
  double result;

  obj1.area();
  result = obj1.area(5.3, 5.5);

  System.out.println(result);
  }
}