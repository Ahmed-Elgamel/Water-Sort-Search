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
       StringBuilder answer = new StringBuilder();
       while (current!=null)
       {
           String s = "pour" + current.operator.bottle2+"_"+current.operator.bottle1;
           answer.append(s);
           current = current.parent;
           if(current!=null)
               answer.append(",");
       }
       return answer.toString();
    }
}
