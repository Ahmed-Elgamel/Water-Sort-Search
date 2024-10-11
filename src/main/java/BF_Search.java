import java.util.Deque;

public class BF_Search implements SearchStrategy {
    @Override
    public Deque<SearchTreeNode> addElements(Deque<SearchTreeNode> elements1, Deque<SearchTreeNode> elements2) {
       for (SearchTreeNode element: elements2){
           elements1.addLast(element);
       }

       return elements1;
    }

    @Override
    public SearchTreeNode getElement(Deque<SearchTreeNode> elements) {
        return elements.peekFirst();
    }
}
