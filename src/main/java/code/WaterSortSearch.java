package code;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.*;

public class WaterSortSearch extends GenericSearch implements WaterSortProblem {
    String initialState;
    SearchStrategy searchStrategy;
    boolean visualize;
    HashSet<State> visitedStates;

    // set the instance variables of this class as well as create the appropriate search strategy
    public WaterSortSearch(String initialState,String strategy, boolean visualize){
        this.initialState = initialState;
        this.visualize = visualize;
        visitedStates = new HashSet<>();

        switch (strategy) {
            case "BF":
                this.searchStrategy = new BF_Search();
                break;

            case "DF":
                this.searchStrategy = new DF_Search();
                break;

            case "DL":
                this.searchStrategy = new DL_Search(8);
                break;

            case "ID":
                this.searchStrategy = new ID_Search();
                break;

            case "UC":
                this.searchStrategy = new UC_Search();
                break;

            default:
                if (strategy.startsWith("GR")) {
                    int heuristicIndex = Integer.parseInt(strategy.substring(2));
                    this.searchStrategy = new GR_Search(heuristicIndex);
                } else if (strategy.startsWith("AS")) {
                    int heuristicIndex = Integer.parseInt(strategy.substring(2));
                    this.searchStrategy = new AS_Search(heuristicIndex);
                } else {
                    throw new IllegalArgumentException("Unknown search strategy: " + strategy);
                }
                break;
        }



    }


    public String runSearchAlgorithm(){
        SearchTreeNode node = searchStrategy.runSearchAlgorithm(this);

        if(node == null)// then there is no answer to this environment/initial state
            return "NOSOLUTION";

        Answer answer = new Answer(node, this);
        return answer.toString();

    }
    public static String solve(String initialState,String strategy, boolean visualize){
        WaterSortSearch waterSortSearch = new WaterSortSearch(initialState, strategy, visualize);
        return waterSortSearch.runSearchAlgorithm();


    }


    @Override
    public boolean goalTest(SearchTreeNode node) {
        return node.state.isGoalState(); // is the state in this node satisfy our goal?

    }

    @Override
    public State initState() {
        // take the initialState string and create a state out of it
        String []s = initialState.split(";");
        int numberOfBottles = Integer.parseInt(s[0]);

        Bottle [] bottles = new Bottle[numberOfBottles];
        for(int i=2;i<numberOfBottles+2;i++){
            String []layers = s[i].split(","); // this string contains the layers (Red, Green, Empty...) of the bottle i
            bottles[i-2] = new Bottle(layers);
        }


       State state = new State(bottles);
        return state;
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
        if(visualize)
            System.out.println("Expanding Node: "+node);

        for(int i=0 ; i<bottles.length ; i++){
            Bottle bottle2 = bottles[i];
            // try to pour this bottle on every other bottle

            for(int j=0 ; j<bottles.length ; j++){
                Bottle bottle1 = bottles[j];
                if(i!=j){ // make sure we are not pouring in the same bottle
                    Operator operator = new Operator(bottle1, bottle2, j , i);
                    if(operator.canApplyOperator()){
                        // i can pour from bottle2 to bottle1
                        // So a new node with the new state must be added to the expanded nodes
                        SearchTreeNode newSearchTreeNode = new SearchTreeNode(node, operator, searchStrategy);
                        if(!visitedStates.contains(newSearchTreeNode.state)){
                            expandedNodes.add(newSearchTreeNode);
                            visitedStates.add(newSearchTreeNode.state);
                        }


                    }
                }

            }
        }

        return expandedNodes;


    }




    public void visualize(String printString, Queue<SearchTreeNode>nodes){
        if(!visualize) return;

        StringBuilder sb =new StringBuilder();
        for(SearchTreeNode searchTreeNode: nodes){
            sb.append(searchTreeNode.toString());
        }
        System.out.print(printString+ "\n"+ sb.toString());
        System.out.println("--------------------------------------");
    }



}
