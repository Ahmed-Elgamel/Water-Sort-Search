import java.util.Arrays;
import java.util.TreeSet;

public class State {
    /*
    This class reperesents the state of our environment
    which is how the bottles are filled
     */
    Bottle [] bottles;


    public State(Bottle[] bottles){
        this.bottles = bottles;

    }

    public void changeState(Operator operator){
        operator.applyOperator();


    }

    public boolean isGoalState(){
        boolean ans = true;
        for(int i=0 ; i<bottles.length ; i++){
            Bottle bottle = bottles[i];
            ans&= bottle.isBottleSameColor();
        }


        return ans;
    }

    public Bottle[] getBottles() {
        return bottles;
    }

    public String toString(){
        return Arrays.deepToString(bottles);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State that = (State) o;
        // Compare as sets by checking if they contain the same bottles
        return Arrays.stream(this.bottles).allMatch(b -> Arrays.asList(that.bottles).contains(b))
                && this.bottles.length == that.bottles.length;
    }

    @Override
    public int hashCode() {
        return Arrays.stream(bottles).mapToInt(Bottle::hashCode).sum();  // Sum hash codes of all bottles
    }
}
