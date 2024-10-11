import java.util.Deque;
import java.util.Iterator;

public class BF_Search implements SearchStrategy {
    @Override
    public Deque<SearchTreeNode> addElements(Deque<SearchTreeNode> elements1, Deque<SearchTreeNode> elements2) {
        Iterator iterator = elements2.iterator();

        while(iterator.hasNext()){
           SearchTreeNode element = (SearchTreeNode) iterator.next();
           elements1.addLast(element);
       }

       return elements1;
    }

    @Override
    public SearchTreeNode getElement(Deque<SearchTreeNode> elements) {
        return elements.pollFirst();
    }
}
