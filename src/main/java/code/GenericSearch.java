package code;

import java.util.Deque;
import java.util.Queue;

public abstract class GenericSearch {


    public static SearchTreeNode General_Search(Problem problem, SearchStrategy searchStrategy){
        // initialize the root node
        State initialState = problem.initState();
        Queue<SearchTreeNode> nodes = searchStrategy.generateDataStructure();
        nodes.add(new SearchTreeNode(initialState));

        while (nodes.size()!=0){
            SearchTreeNode node = searchStrategy.getElement(nodes); // get a node
            boolean foundAnswer = problem.goalTest(node); // checks if node pass the goal test function
            if(foundAnswer) return node;

            Deque<SearchTreeNode> newNodes = problem.expand(node); //expand this node to get some new nodes
//            ((WaterSortSearch)problem).visualize("NEWLY ADDED NODES: ", newNodes);
            nodes = searchStrategy.addElements(nodes, newNodes); // add the new nodes to the old nodes
            ((WaterSortSearch)problem).visualize("ALL NODES AVAILABLE FOR EXPANSION: ", newNodes);

        }

        return null;

    }

    public static void printExpandedNodes(Queue<SearchTreeNode> nodes){
        StringBuilder sb =new StringBuilder();
        sb.append("EXPANDED NODES: \n");

        for(SearchTreeNode searchTreeNode: nodes){
            sb.append(searchTreeNode);
        }
         sb.toString();
        sb.append("\n");
        System.out.println(sb);
    }


}
