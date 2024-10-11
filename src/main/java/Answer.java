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
        System.out.println("depth "+current.depth);

       while (current.parent!=null)
       {
           String s = "pour_" + current.operator.bottle2Idx+"_"+current.operator.bottle1Idx+", "+ current.operator.bottle2+" "+current.operator.bottle1+"" +
                   "\n" +" ------"+current+" \n";
           answer.add(s);
           current = current.parent;

       }
       answer.add("Initial State: "+current+" \n");

       Deque<String> answerFlipped =new LinkedList<>();
       while(!answer.isEmpty())
           answerFlipped.add(answer.removeLast());






       return answerFlipped.toString();
    }
}
