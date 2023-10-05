class Area{
  double width;
  double length;
  double result;

  public void area(){
    result = width * length;
    System.out.println("AREA: " + result);
  } 
}
class Question1{
  public static void main(String args[]){
  Area obj1 = new Area();
  // Area() is the constructor. We have not created it ourselves, so it will get the default.
  Area obj2 = new Area();

  obj1.width = 15.5;
  obj1.length = 10.5;
  obj1.area();

  obj2.width = 5.3;
  obj2.length = 5.5;
  obj2.area();
  }
}