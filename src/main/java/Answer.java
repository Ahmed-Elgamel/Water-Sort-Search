import java.util.ArrayList;

public class Answer {
    ArrayList<Operator> plan;
    int pathCost;
    int nodesExpanded;
    SearchTreeNode node;

    public Answer(SearchTreeNode node){
        this.node = node;
        pathCost = node.cost;
    }

    public String toString(){
       SearchTreeNode current = node;
       System.out.println(node);
       StringBuilder answer = new StringBuilder();
       while (current.parent!=null)
       {
           String s = "pour" + current.operator.bottle2+"_"+current.operator.bottle1+", ";
           answer.append(s);
           current = current.parent;

       }

       return answer.toString();
    }
}
