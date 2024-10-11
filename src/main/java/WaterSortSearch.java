import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class WaterSortSearch extends GenericSearch implements WaterSortProblem {
    String initialState;
    SearchStrategy searchStrategy;
    boolean visualize;

    // set the instance variables of this class as well as create the appropriate search strategy
    public WaterSortSearch(String initialState,String strategy, boolean visualize){
        this.initialState = initialState;
        if(strategy.equals("BF"))
            this.searchStrategy = new BF_Search();
        this.visualize = visualize;
    }

    public void runSearchAlgorithm(){
        GenericSearch.General_Search(this, searchStrategy);
    }
    public static String solve(String initialState,String strategy, boolean visualize){
        WaterSortSearch waterSortSearch = new WaterSortSearch(initialState, strategy, visualize);
        waterSortSearch.runSearchAlgorithm();
        return null;

    }


    @Override
    public boolean goalTest(SearchTreeNode node) {
        return node.state.isGoalState(); // is the state in this node satisfy our goal?

    }

    @Override
    public State initState() {
        //todo take the initialState string and create a state out of it

        return null;
    }

    @Override
    public Deque<SearchTreeNode> expand(SearchTreeNode node) {
        /*
        _ apply operator(s) on this node
        _ we only have one operator -> the pour operator
        _ if there were multiple operators we could create a super class operator then apply all the subclasses to this node
          but in our case we just assume that the operator class to be the pour operator
         */
        Bottle []bottles = node.state.getBottles();
        Deque<SearchTreeNode> expandedNodes = new LinkedList<>();

        for(int i=0 ; i<bottles.length ; i++){
            Bottle bottle2 = bottles[i];
            // try to pour this bottle on every other bottle

            for(int j=0 ; j<bottles.length ; j++){
                Bottle bottle1 = bottles[j];
                if(i!=j){ // make sure we are not pouring in the same bottle
                    Operator operator = new Operator(bottle1, bottle2);
                    if(operator.canApplyOperator()){
                        // i can pour from bottle2 to bottle1
                        // So a new node with the new state must be added to the expanded nodes
                        // todo remove repeated states ***important***
                        SearchTreeNode newSearchTreeNode = new SearchTreeNode(node, operator);
                        expandedNodes.add(newSearchTreeNode);

                    }
                }

            }
        }

        return expandedNodes;


    }

}
