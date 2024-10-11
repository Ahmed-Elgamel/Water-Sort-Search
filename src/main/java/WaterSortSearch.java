import java.util.ArrayList;
import java.util.Queue;

public class WaterSortSearch extends GenericSearch implements WaterSortProblem {

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
}
