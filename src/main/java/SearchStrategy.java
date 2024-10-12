import java.util.Deque;
import java.util.Queue;

public interface SearchStrategy {
    Deque<SearchTreeNode> addElements(Deque<SearchTreeNode> oldNodes, Deque<SearchTreeNode> newNodes);
    SearchTreeNode getElement(Deque<SearchTreeNode> elements);
}
