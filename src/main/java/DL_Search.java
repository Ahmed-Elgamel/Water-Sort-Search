import java.util.Deque;
import java.util.Iterator;

public class DL_Search implements SearchStrategy{
    int depthLimit;

    public DL_Search(int depthLimit){
        this.depthLimit = depthLimit;
    }

    @Override
    public Deque<SearchTreeNode> addElements(Deque<SearchTreeNode> elements1, Deque<SearchTreeNode> elements2) {
        Iterator iterator = elements2.iterator();

        while(iterator.hasNext()){
            SearchTreeNode element = (SearchTreeNode) iterator.next();
            if(element.depth<=depthLimit)
                elements1.addFirst(element);
        }

        return elements1;
    }

    @Override
    public SearchTreeNode getElement(Deque<SearchTreeNode> elements) {
        return elements.pollFirst();
    }
}
