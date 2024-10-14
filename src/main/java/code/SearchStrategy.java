package code;

import java.util.Queue;

public interface SearchStrategy {
    Queue<SearchTreeNode> generateDataStructure();
    Queue<SearchTreeNode> addElements(Queue<SearchTreeNode> oldNodes, Queue<SearchTreeNode> newNodes);
    SearchTreeNode getElement(Queue<SearchTreeNode> elements);
    SearchTreeNode runSearchAlgorithm(Problem problem);



    }
