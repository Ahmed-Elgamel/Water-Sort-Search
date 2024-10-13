public class Operator {
    /*
    This class represents the operator  that we will apply on the two bottles
    pour water from bottle2 to bottle1
     */
    Bottle bottle1;
    Bottle bottle2;
    int bottle1Idx;
    int bottle2Idx;
    int cost;


    public Operator(Bottle bottle1, Bottle bottle2, int bottle1Idx, int bottle2Idx){
        this.bottle1 = bottle1;
        this.bottle2 = bottle2;
        this.bottle1Idx = bottle1Idx;
        this.bottle2Idx = bottle2Idx;
    }

    public boolean canApplyOperator(){
        return bottle1.canAddColor(bottle2);
    }

    public void applyOperator(){
        this.cost = bottle1.addColor(bottle2);
    }

    public String toString(){
        return bottle2Idx+"-->"+bottle1Idx;
    }

}
