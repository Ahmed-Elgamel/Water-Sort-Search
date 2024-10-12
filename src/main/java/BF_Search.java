import java.util.Deque;
import java.util.Iterator;

public class BF_Search implements SearchStrategy {
    @Override
    public Deque<SearchTreeNode> addElements(Deque<SearchTreeNode> oldNodes, Deque<SearchTreeNode> newNodes) {
        Iterator iterator = newNodes.iterator();

        while(iterator.hasNext()){
           SearchTreeNode element = (SearchTreeNode) iterator.next();
           oldNodes.addLast(element);
       }

       return oldNodes;
    }

    @Override
    public SearchTreeNode getElement(Deque<SearchTreeNode> nodes) {
        return nodes.pollFirst();
    }
}
