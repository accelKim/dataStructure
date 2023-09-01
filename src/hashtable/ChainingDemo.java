package hashtable;

public class ChainingDemo {
  public static void main(String[] args) {
    Chaining<Integer, String> c = new Chaining<>();
    c.put(50, "orange");
    c.put(63, "watermelon");
    c.put(37, "apple");
    c.put(22, "mango");

    System.out.println(c.get(50));
    System.out.println(c);
     }
    }


