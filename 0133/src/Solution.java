import java.util.HashMap;
import java.util.ArrayList;
public class Solution {
    private HashMap<Node, Node> visited = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
        if(visited.containsKey(node)){
            return visited.get(node);
        }
        Node cloneNode = new Node(node.val, new ArrayList());
        visited.put(node, cloneNode);
        for(Node neighbor : node.neighbors){
            cloneNode.neighbors.add(cloneGraph(neighbor));
        }
        return cloneNode;
    }
}
