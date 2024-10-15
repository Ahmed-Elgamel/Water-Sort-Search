package code;

import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

public class State {
    /*
    This class reperesents the state of our environment
    which is how the bottles are filled
     */
    Bottle [] bottles;
    int cost=0;

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
//        return "State: " + Arrays.deepToString(bottles);
        StringBuilder sb =new StringBuilder();
        Stack<String >stack =new Stack<>();
        for(int layer = 0; layer<bottles[0].layers.length;layer++){

            for(int bottleNum=0;bottleNum<bottles.length; bottleNum++){
                sb.append("[ "+ bottles[bottleNum].layers[layer]+" ]");
            }
            sb.append("\n");
            stack.add(sb.toString());
            sb.setLength(0);
        }
        sb.setLength(0);
//        System.out.println(stack);

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }


        return sb.toString();

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

//    @Override
//    public int hashCode() {
//        return Arrays.stream(bottles).mapToInt(Bottle::hashCode).sum();  // Sum hash codes of all bottles
//
//    }

    @Override
    public int hashCode() {
        int hash = 7; // Start with a non-zero constant

        // Combine the hash codes of the bottles
        for (Bottle bottle : bottles) {
            // Use 31 (a prime number) to generate unique hash codes
            hash = 31 * hash + (bottle != null ? bottle.hashCode() : 0); // Handle null bottles safely
        }

        return hash;
    }
}
