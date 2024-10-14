package code;

public class BadColorsHeuristic implements Heuristic{


    @Override
    public int estimateCostToGoal(State state) {
        int badColors = 0;
        Bottle [] bottles = state.getBottles();
        for(Bottle bottle: bottles){
            badColors += bottle.numberOfDifferentColors();
        }
        return badColors;
    }
}
