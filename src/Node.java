public class Node {
    private int id;
  
    public Node(int _id) {
      id = _id;
    }
  
    public int getId() {
      return id;
    }
  
    public String toString() {
      return ((Integer) id).toString();
    }
  }
  