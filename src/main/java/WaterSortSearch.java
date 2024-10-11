import java.util.Queue;

public class WaterSortSearch extends GenericSearch implements WaterSortProblem {
    SearchTreeNode node;
    String initialState;
    SearchStrategy searchStrategy;
    boolean visualize;

    public WaterSortSearch(String initialState,String strategy, boolean visualize){
        this.initialState = initialState;
        if(strategy.equals("BF"))
            this.searchStrategy = new BF_Search();
        this.visualize = visualize;
    }

    public static String solve(String initialState,String strategy, boolean visualize){
        WaterSortSearch waterSortSearch = new WaterSortSearch(initialState, strategy, visualize);
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
