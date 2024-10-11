public class Operator {
    /*
    This class represents the operator  that we will apply on the two bottles
    pour water from bottle2 to bottle1
     */
    Bottle bottle1;
    Bottle bottle2;

    public Operator(Bottle [] bottles, int i, int j){
        bottle1 = bottles[i];
        bottle2 = bottles[j];
    }


    public boolean applyOperator(){

        if(bottle1.canAddColor(bottle2)){
            bottle1.addColor(bottle2);
            return true;
        }

        return false;

    }

}
