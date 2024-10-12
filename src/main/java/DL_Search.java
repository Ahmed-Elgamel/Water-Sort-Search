import java.util.Deque;
import java.util.Iterator;

public class DL_Search implements SearchStrategy{
    int depthLimit;

    public DL_Search(int depthLimit){
        this.depthLimit = depthLimit;
    }

    @Override
    public Deque<SearchTreeNode> addElements(Deque<SearchTreeNode> oldNodes, Deque<SearchTreeNode> newNodes) {
        Iterator iterator = newNodes.iterator();

        while(iterator.hasNext()){
            SearchTreeNode element = (SearchTreeNode) iterator.next();
            if(element.depth<=depthLimit)
                oldNodes.addFirst(element);
        }

        return oldNodes;
    }

    @Override
    public SearchTreeNode getElement(Deque<SearchTreeNode> nodes) {
        return nodes.pollFirst();
    }
}
