import java.util.ArrayList;

/**
 * Created by xsun on 15-08-09.
 */
public class UndirectedGraphNode {
    int label;
    ArrayList<UndirectedGraphNode> neighbors;
    UndirectedGraphNode(int x){label = x; neighbors = new ArrayList<UndirectedGraphNode>();}
}
