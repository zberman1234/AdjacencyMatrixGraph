import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");
    
    Node fNode = new Node(12);
    Node sNode = new Node(34);

    Edge fEdge = new Edge(fNode, sNode);

    HashSet<Node> Nodes = new HashSet<Node>();
    HashSet<Edge> Edges = new HashSet<Edge>();

    Nodes.add(fNode);
    Nodes.add(sNode);

    Edges.add(fEdge);

    for (int i = 0; i < 10; i++) {
      Node inode = new Node(i);
      Nodes.add(inode);
      for (Node n : Nodes) {
        if (createEdgeRand(0.4)) {
          Edge ijedge = new Edge(inode, n);
          Edges.add(ijedge);
        }
      }
    }

    Graph fGraph = new Graph(Nodes, Edges);

    System.out.println(fGraph);

    Set<Node> Adj6 = fGraph.adjacentNodes(6);
    System.out.println("The Node with ID 6 is adjacent to the Nodes with ID:");
    for(Node n : Adj6) {
      System.out.println(n);
    }
  }


  /**
   * Generates a boolean whose value depends on given odds
   * @param odds the chances that the method returns true
   * @return true or false, based on odds
   */
  public static boolean createEdgeRand(double odds) {
    if (Math.random() < odds)
      return true;
    return false;
  }
}
