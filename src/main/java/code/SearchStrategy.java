package code;

import java.util.Queue;

public interface SearchStrategy {
    Queue<SearchTreeNode> addElements(Queue<SearchTreeNode> oldNodes, Queue<SearchTreeNode> newNodes);
    SearchTreeNode getElement(Queue<SearchTreeNode> elements);
    SearchTreeNode runSearchAlgorithm(Problem problem);

    Queue<SearchTreeNode> generateDataStructure();

    }
