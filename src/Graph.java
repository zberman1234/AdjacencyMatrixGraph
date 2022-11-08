import java.util.HashSet;
import java.util.*;

public class Graph {
  private boolean[][] Matrix;
  private Node[] nodeList;

  /**
  * Graph constructor turns a Set of edges and nodes into an Adjacency Matrix graph, with Node Id's on its axis
  * also creates a Node array that corresponds to the order of the Matrix axis
  * @param nodes the Set of nodes to be in the Graph
  * @param edges the Set of edges to connect the nodes in the graph
  **/
  public Graph(Set<Node> nodes, Set<Edge> edges) {

    // find max node id
    int size = 0;
    for (Node n : nodes) {
      size = Math.max(size, n.getId());
    }

    //create ordered array 
    nodeList = new Node[size+1];
    for (Node n : nodes) {
      nodeList[n.getId()] = n;
    }

    Matrix = new boolean[size+1][size+1];

    // start node Ids correspond to Matrix rows, end node Ids to Matrix cols
    for (Edge e : edges)
      Matrix[e.getStart().getId()][e.getEnd().getId()] = true;

  }

  /**
   * Finds Nodes that are adjacent to a given node
   * Adjacent means that an edge points to the node, not vice versa
   * @param id the Id of the node to find the adjacent nodes of
   * @return A Node Set of the adjacent nodes
   */
  public Set<Node> adjacentNodes(int id) {
    Set<Node> out = new HashSet<Node>();
    for(int c = 0; c < Matrix[id].length; c++) {
      if(Matrix[id][c]) out.add(nodeList[c]);
    }
    return out;
  }

  public String toString() {
    String out = "";
    for (int r = 0; r < Matrix.length; r++) {
      for (int c = 0; c < Matrix[0].length; c++) {
        if (Matrix[r][c]) {
          out += nodeList[r] + " --> " + nodeList[c] +"\n";
        }
      }
    }
    return out;
  }
}