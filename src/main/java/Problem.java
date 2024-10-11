import java.util.Queue;

public interface Problem {
    boolean goalTest(SearchTreeNode node);
    State initState();
    Queue<SearchTreeNode> expand(SearchTreeNode node);

}
