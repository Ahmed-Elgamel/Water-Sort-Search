import java.util.Deque;
import java.util.Queue;

public interface SearchStrategy {
    Deque<SearchTreeNode> addElements(Deque<SearchTreeNode> elements1, Deque<SearchTreeNode> elements2);
    SearchTreeNode getElement(Deque<SearchTreeNode> elements);
}
