import java.util.Deque;

public class DF_Search implements SearchStrategy{
    @Override
    public Deque<SearchTreeNode> addElements(Deque<SearchTreeNode> oldNodes, Deque<SearchTreeNode> newNodes) {
        return null;
    }

    @Override
    public SearchTreeNode getElement(Deque<SearchTreeNode> nodes) {
        return null;
    }

    @Override
    public SearchTreeNode runSearchAlgorithm(Problem problem) {
        return GenericSearch.General_Search(problem, this);

    }
}
