import java.util.ArrayList;

public abstract class Heuristic {
    ArrayList<Heuristic> heuristics ;
    abstract int estimateCostToGoal(State state);
}
