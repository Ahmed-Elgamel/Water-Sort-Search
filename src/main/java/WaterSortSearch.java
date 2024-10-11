import java.util.Queue;

public class WaterSortSearch extends GenericSearch implements WaterSortProblem {
    String initialState;
    SearchStrategy searchStrategy;
    boolean visualize;

    // set the instance varibles of this class as well as create the appropriate search strategy
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
        return false;

    }

    @Override
    public State initState() {
        //todo take the initialState string and create a state out of it

        return null;
    }

    @Override
    public Queue<SearchTreeNode> expand(SearchTreeNode node) {
        return null;
    }

}
