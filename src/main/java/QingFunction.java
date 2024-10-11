import java.util.Queue;

public interface QingFunction {
     void addElement(Object element);
    Queue<SearchTreeNode> addElements(Queue<SearchTreeNode> elemenst1, Queue<SearchTreeNode> elements2);
    SearchTreeNode getElement(Queue<SearchTreeNode> elements);
}
