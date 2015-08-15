import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by xsun on 15-08-09.
 */
public class Solutions {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node){
        if(node == null){
            return null;
        }
        ArrayList<UndirectedGraphNode> nodes = new ArrayList<UndirectedGraphNode>();
        HashMap<UndirectedGraphNode, UndirectedGraphNode> map =
                new HashMap<UndirectedGraphNode, UndirectedGraphNode>();

        nodes.add(node);
        map.put(node, new UndirectedGraphNode(node.label));
        int start = 0;
        while(start <nodes.size()){
            UndirectedGraphNode head = nodes.get(start++);
            for(int i=0; i<head.neighbors.size(); i++){
                UndirectedGraphNode neighbor = head.neighbors.get(i);
                if(!map.containsKey(neighbor)){
                    map.put(neighbor, new UndirectedGraphNode(neighbor.label));
                    nodes.add(neighbor);
                }
            }
        }

        for (int i = 0; i < nodes.size(); i++) {
            UndirectedGraphNode newNode = map.get(nodes.get(i));
            for (int j = 0; j < nodes.get(i).neighbors.size(); j++) {
                newNode.neighbors.add(map.get(nodes.get(i).neighbors.get(j)));
            }

        }

        return map.get(node);
    }

    public RandomListNode copyRandomList(RandomListNode head){
        if(head == null){
            return null;
        }
        ArrayList<RandomListNode> list = new ArrayList<RandomListNode>();
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode tmp = head;
        while(tmp !=null){
            list.add(tmp);
            map.put(tmp, new RandomListNode(tmp.label));
            tmp = tmp.next;
        }

        return null;
    }
}
