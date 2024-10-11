import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public abstract class GenericSearch {


    public static SearchTreeNode General_Search(Problem problem, SearchStrategy searchStrategy){
        // initialize the root node
        State initialState = problem.initState();
        Deque<SearchTreeNode> nodes = new LinkedList<>();
        nodes.add(new SearchTreeNode(initialState));

        while (nodes.size()!=0){
            SearchTreeNode node = searchStrategy.getElement(nodes); // get a node
            boolean foundAnswer = problem.goalTest(node); // checks if node pass the goal test function
            if(foundAnswer) return node; //still will figure this out

            Deque<SearchTreeNode> newNodes = problem.expand(node); //expand this node to get some new nodes
            nodes = searchStrategy.addElements(nodes, newNodes); // add the new nodes to the old nodes
        }

        return null;

    }


}
