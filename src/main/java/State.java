import java.util.TreeSet;

public class State {
    /*
    This class reperesents the state of our environment
    which is how the bottles are filled
     */
    Bottle [] bottles;


    public State(Bottle[] bottles){
        bottles = bottles;

    }

    public void changeState(Operator operator){
        operator.applyOperator();


    }

    public boolean isGoalState(){
        boolean ans = true;

        for(Bottle bottle: bottles)
            ans&= bottle.isBottleSameColor();

        return ans;
    }

    public Bottle[] getBottles() {
        return bottles;
    }
}
