package code;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DL_Search implements SearchStrategy{
    int depthLimit;

    public DL_Search(int depthLimit){
        this.depthLimit = depthLimit;
    }

    @Override
    public Queue<SearchTreeNode> addElements(Queue<SearchTreeNode> oldNodes, Queue<SearchTreeNode> newNodes) {
        Deque<SearchTreeNode> deque1;
        Deque<SearchTreeNode> deque2;

        deque1 = (Deque<SearchTreeNode>) oldNodes;
        deque2 = (Deque<SearchTreeNode>) newNodes;

        Iterator iterator = deque2.iterator();

        while(iterator.hasNext()){
            SearchTreeNode element = (SearchTreeNode) iterator.next();
            if(element.depth<=depthLimit)
                deque1.addFirst(element);
        }

        return deque1;
    }

    @Override
    public SearchTreeNode getElement(Queue<SearchTreeNode> nodes) {
        Deque<SearchTreeNode> deque = (Deque<SearchTreeNode>) nodes;
        return deque.pollFirst();
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
