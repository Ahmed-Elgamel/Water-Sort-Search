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

    public Operator(Bottle bottle1, Bottle bottle2){
        this.bottle1 = bottle1;
        this.bottle2 = bottle2;
    }

    public boolean canApplyOperator(){
        return bottle1.canAddColor(bottle2);
    }

    public void applyOperator(){
        bottle1.addColor(bottle2);
    }

}
