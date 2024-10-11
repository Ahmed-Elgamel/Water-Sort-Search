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

    public Bottle[] getBottles() {
        return bottles;
    }
}
