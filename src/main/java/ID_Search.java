import java.util.Deque;

public class ID_Search implements SearchStrategy{
    @Override
    public Deque<SearchTreeNode> addElements(Deque<SearchTreeNode> oldNodes, Deque<SearchTreeNode> newNodes) {
        return null;
    }

    @Override
    public SearchTreeNode getElement(Deque<SearchTreeNode> elements) {
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
}
