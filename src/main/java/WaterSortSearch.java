import java.util.Queue;

public class WaterSortSearch extends GenericSearch implements WaterSortProblem {
    SearchTreeNode node;
    SearchStrategy searchStrategy;

    @Override
    public boolean goalTest(SearchTreeNode node) {
        return false;

    }

    @Override
    public State initState() {
        return null;
    }

    @Override
    public Queue<SearchTreeNode> expand(SearchTreeNode node) {
        return null;
    }

    public static String solve(String initialState,String strategy, boolean visualize){
        return "";

    }

    public static State initializeState(String initialState){
        return null;

    }

    public static SearchStrategy initializeSearchStrategy(String strategy){
        return null;

    }
}
