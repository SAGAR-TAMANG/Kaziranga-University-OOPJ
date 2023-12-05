import java.util.HashMap;

class Question2 {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();

    map.put("A", "Amit");    
    map.put("B", "Samrat");    
    map.put("C", "Aluk");
    
    System.out.println(map.get("C") + map.get("B") + map.get("A"));
  }
}