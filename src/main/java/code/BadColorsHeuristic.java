package code;

public class BadColorsHeuristic extends Heuristic{


    @Override
    int estimateCostToGoal(State state) {
        int badColors = 0;
        Bottle [] bottles = state.getBottles();
        for(Bottle bottle: bottles){
            badColors += bottle.numberOfDifferentColors();
        }
        return badColors;
    }
}
