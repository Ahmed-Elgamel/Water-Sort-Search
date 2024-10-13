public class SearchTreeNode {
    State state;
    SearchTreeNode parent;
    Operator operator;
    int depth;
    int cost;

    // create e new search tree node by applying the operator
    public SearchTreeNode(SearchTreeNode parent, Operator operator){
        /*
        create a search tree node by applying the operator
        1) create a new state same as the parent state
        2) apply the operator to the created state
         */


        Bottle []oldBottles = new Bottle[parent.state.bottles.length]; // DEEP clone the bottles array of the parent node
        for(int i=0 ; i<oldBottles.length ; i++)
            oldBottles[i] = new Bottle(parent.state.bottles[i]);


        operator.bottle1 = oldBottles[operator.bottle1Idx];
        operator.bottle2 = oldBottles[operator.bottle2Idx];



        State state = new State(oldBottles); // create new state same as old
        state.changeState(operator); // apply operator on the created state, now the operator stores the cost of this pour operation

        this.state = state;
        this.parent = parent;
        this.operator = operator;
        this.depth = parent.depth+1;
        this.cost = parent.cost + operator.cost;

    }

    /* creates the ROOT search tree node from the initial state given
    This constructor is only called when initializing the root node
     */

    public SearchTreeNode(State state){
        this.state = state;
        this.parent = null;
        this.operator = null;
        this.depth = 0;
        this.cost = 0;

    }

    public String toString(){
        StringBuilder s =new StringBuilder("State: " + state + " Operator: "+operator+ " Depth: "+depth+" Cost: "+cost);
        return s.toString();

    }


}
