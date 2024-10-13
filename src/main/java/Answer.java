import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

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
        Deque<String> answer =new LinkedList<>();
       while (current.parent!=null)
       {
           String s = "pour_" + current.operator.bottle2Idx+"_"+current.operator.bottle1Idx;
           answer.add(s);
           current = current.parent;
           if(current.parent != null)
               answer.add(",");

       }


       StringBuilder sb =new StringBuilder();
       while(!answer.isEmpty())
           sb.append(answer.removeLast());

       sb.append(";" + String.valueOf(node.cost));

       return sb.toString();
    }
}
