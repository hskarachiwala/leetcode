package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CloneGraph {

    public static class UndirectedGraphNode {
        public int label;
        public List<UndirectedGraphNode> neighbors;
        public UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
    }

    public static UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {

        if(node==null) {
            return null;
        }

        Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
        queue.add(node);
        Set<Integer> visited = new HashSet<Integer>();
        Map<Integer, UndirectedGraphNode> map = new HashMap<Integer, UndirectedGraphNode>();

        UndirectedGraphNode startClone = new UndirectedGraphNode(node.label);
        map.put(node.label, startClone);

        while(!queue.isEmpty()) {
            UndirectedGraphNode current = queue.poll();
            visited.add(current.label);
            if(!map.containsKey(current.label)) {
                map.put(current.label, new UndirectedGraphNode(current.label));
            }
            UndirectedGraphNode cloneOfCurrent = map.get(current.label);
            for(UndirectedGraphNode neighbor : current.neighbors) {
                if(map.containsKey(neighbor.label)) {
                    cloneOfCurrent.neighbors.add(map.get(neighbor.label));
                } else {
                    UndirectedGraphNode neighborClone = new UndirectedGraphNode(neighbor.label);
                    cloneOfCurrent.neighbors.add(neighborClone);
                    map.put(neighbor.label, neighborClone);
                }
                if(!visited.contains(neighbor.label)) {
                    queue.add(neighbor);
                }
            }
        }
        return startClone;
    }
}
