package code;

public class BadBottlesHeuristic implements Heuristic{
    /**
     * Heursitic Explanation:
     * This heuristic calculates the number of bottles which have more than 1 color in them,
     * It is admissible because we at least need a cost = number of bad bottles to reach our goal
    * */

    @Override
    public int estimateCostToGoal(State state) {
        int badBottles = 0;
        Bottle [] bottles = state.getBottles();
        for(Bottle bottle: bottles){
            badBottles+= bottle.isBottleSameColor()? 0 : 1;
        }

        return badBottles;
    }
}
