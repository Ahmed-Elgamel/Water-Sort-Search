import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ID_Search implements SearchStrategy{
    @Override
    public Deque<SearchTreeNode> addElements(Queue<SearchTreeNode> oldNodes, Queue<SearchTreeNode> newNodes) {
        return null;
    }

    @Override
    public SearchTreeNode getElement(Queue<SearchTreeNode> elements) {
        return null;
    }

    @Override
    public SearchTreeNode runSearchAlgorithm(Problem problem) {
        int depthLimit = 0;
        SearchTreeNode node = null;

        while (node == null){
            DL_Search depthLimitedSearch = new DL_Search(depthLimit);
            node = depthLimitedSearch.runSearchAlgorithm(problem);
            depthLimit++;
        }
        return node;
    }

    @Override
    public Queue<SearchTreeNode> generateDataStructure() {
        Deque<SearchTreeNode> deque = new LinkedList<>();
        return  deque;
    }
}
