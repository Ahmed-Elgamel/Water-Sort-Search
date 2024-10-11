public class SearchTreeNode {
    State state;
    SearchTreeNode parent;
    Operator operator;
    int depth;
    int cost;

    // create e new search tree node by pouring bottle j to bottle i
    public SearchTreeNode(SearchTreeNode parent, int i , int j){
        /*
        create a search tree node by pouring from bottle j to bottle i
        1) create a new state same as the parent state
        2) create an operator
        3) apply this operator to the created state
         */


        Bottle []oldBottles = parent.state.bottles.clone(); // clone the bottles array of the parent node

        State state = new State(oldBottles); // create new state same as old
        Operator operator = new Operator(state.getBottles(), i, j); // create operator
        state.changeState(operator); // apply operator on the created state

        this.parent = parent;
        this.operator = operator;
        this.depth = parent.depth+1;
        //todo cost

    }


}
