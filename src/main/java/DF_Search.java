import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DF_Search implements SearchStrategy{
    @Override
    public Deque<SearchTreeNode> addElements(Queue<SearchTreeNode> oldNodes, Queue<SearchTreeNode> newNodes) {
        return null;
    }

    @Override
    public SearchTreeNode getElement(Queue<SearchTreeNode> nodes) {
        return null;
    }

    @Override
    public SearchTreeNode runSearchAlgorithm(Problem problem) {
        return GenericSearch.General_Search(problem, this);

    }


    @Override
    public Queue<SearchTreeNode> generateDataStructure() {
        Deque<SearchTreeNode> deque = new LinkedList<>();
        return  deque;
    }
}
