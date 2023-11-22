class Car {
  Car () {
    System.out.println("I am a Car");
  }
}

class BMW extends Car {
  BMW () {
    System.out.println("I am a BMW");
  }
}
class Marcedes extends BMW {
  Marcedes () {
    System.out.println("I am a Marcedes");
  }
}

class Question2 {
  public static void main(String [] args) {
    Marcedes obj1  = new Marcedes();
  }
}
