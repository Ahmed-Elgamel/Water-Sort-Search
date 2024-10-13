import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class GR_Search extends HeuristicSearchStrategy{

    public GR_Search(int selectedHeuristicIndex){
        /**
         *  Note: not the best code for initializing heuristics (could make this arraylist static for example
         *  but will avoid becuase maybe it will cause erros in test cases)
        */
        heuristics = new ArrayList<>();
        heuristics.add(new BadBottlesHeuristic());
        heuristics.add(new BadColorsHeuristic());
        // input is one indexed
        this.selectedHeuristic = heuristics.get(selectedHeuristicIndex-1);
    }
    @Override
    public Queue<SearchTreeNode> addElements(Queue<SearchTreeNode> oldNodes, Queue<SearchTreeNode> newNodes) {
        return null;
    }

    @Override
    public SearchTreeNode getElement(Queue<SearchTreeNode> elements) {
        return null;
    }

    @Override
    public SearchTreeNode runSearchAlgorithm(Problem problem) {
        return null;
    }

    @Override
    public Queue<SearchTreeNode> generateDataStructure() {
        PriorityQueue<SearchTreeNode> priorityQueue = new PriorityQueue<>(new Comparator<SearchTreeNode>() {
            @Override
            public int compare(SearchTreeNode o1, SearchTreeNode o2) {
                return o1.heuristic - o2.heuristic;
            }
        });
        return priorityQueue;
    }
}
