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
        if (createEdgeRand()) {
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

    

    // HashSet<Node> girls = new HashSet<Node>();
    // HashSet<Edge> friends = new HashSet<Edge>();
    // girls.add(new Vnode("Becky"));
    // girls.add(new Vnode("Jane"));
    // girls.add(new Vnode("Sarah"));
    // girls.add(new Vnode("Tracy"));

    // for (Node g : girls) {
    //   for (Node gg : girls) {
    //     if (createEdgeRand()) {
    //       friends.add(new Edge(g, gg));
    //     }
    //   }
    // }

    // Graph gGraph = new Graph(girls, friends);

    // System.out.println(gGraph);

  //   HashSet<Node> cities = new HashSet<Node>();
  //   HashSet<Edge> roads = new HashSet<Edge>();
  //   City sf = new City("Bay", 20);
  //   City nyc = new City("Big Apple", 24);
  //   City gb = new City("Cheese", 10);
  //   City la = new City("Champs", 21);
  //   cities.add(new Vnode(sf));
  //   cities.add(new Vnode(nyc));
  //   cities.add(new Vnode(gb));
  //   cities.add(new Vnode(la));

  //   for (Node g : cities) {
  //     for (Node gg : cities) {
  //       if (createEdgeRand()) {
  //         roads.add(new Edge(g, gg));
  //       }
  //     }
  //   }

  //   Graph cGraph = new Graph(cities, roads);
  //   System.out.println(cGraph);

  }

  public static boolean createEdgeRand() {
    if (Math.random() > 0.6)
      return true;
    return false;
  }
}
