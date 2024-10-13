package code;

import java.util.Deque;

public interface Problem {
    boolean goalTest(SearchTreeNode node);
    State initState();
    Deque<SearchTreeNode> expand(SearchTreeNode node);

}
