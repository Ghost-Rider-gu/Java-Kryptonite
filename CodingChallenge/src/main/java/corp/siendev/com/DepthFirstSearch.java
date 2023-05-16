/**
 * @author Iurii Golubnichenko
 * <p>
 * Need to implement a Depth-first search (DFS) algorithm.
 * DFS is an algorithm for traversing or searching tree or graph data structures.
 * The algorithm starts at the root node (selecting some arbitrary node as the root node in the case of a graph) and
 * explores as far as possible along each branch before backtracking.
 * As a result we must output a list of edges' value.
 * </p>
 * ==================================================================
 * Time complexity is O(V+E) and Space complexity is O(V).
 * Where V is the number of vertices and E is the number of edges.
 * ==================================================================
 */
package corp.siendev.com;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {
    public static class Node {
        String name;
        List<Node> children = new ArrayList<>();

        public Node(String name) {
            this.name = name;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }

        public List<String> depthFirstSearchAlgo(List<String> listOfNames) {
            listOfNames.add(this.name);
            for (Node child : children) {
                child.depthFirstSearchAlgo(listOfNames);
            }
            return listOfNames;
        }
    }
}
