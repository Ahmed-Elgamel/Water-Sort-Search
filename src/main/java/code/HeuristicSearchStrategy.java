package code;

import java.util.ArrayList;

abstract class HeuristicSearchStrategy implements SearchStrategy {
    ArrayList<Heuristic> heuristics; // could be static variable i think
    Heuristic selectedHeuristic;
}
