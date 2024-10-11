import java.util.Queue;

public interface SearchStrategy {
     void addElement(Object element);
    Queue<SearchTreeNode> addElements(Queue<SearchTreeNode> elements1, Queue<SearchTreeNode> elements2);
    SearchTreeNode getElement(Queue<SearchTreeNode> elements);
}