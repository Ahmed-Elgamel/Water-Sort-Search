import java.util.*;

public class BF_Search implements SearchStrategy {


    public SearchTreeNode runSearchAlgorithm(Problem problem){
        return GenericSearch.General_Search(problem, this);
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
            deque1.addLast(element);
       }

       return deque1;
    }

    @Override
    public SearchTreeNode getElement(Queue<SearchTreeNode> nodes) {
        Deque<SearchTreeNode> deque = (Deque<SearchTreeNode>) nodes;
        return deque.pollFirst();
    }

    @Override
    public Queue<SearchTreeNode> generateDataStructure() {
        Deque<SearchTreeNode> deque = new LinkedList<>();
        return  deque;
    }
}
