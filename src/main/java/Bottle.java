import java.util.Arrays;

public class Bottle {
    Layer[] layers;
    Integer filledIndex=-1;
    Integer bottleCapacity;

    public Bottle(String [] colors){
        bottleCapacity = colors.length;
        layers = new Layer[bottleCapacity];

        for(int i=0 ; i<bottleCapacity ; i++){
            switch(colors[i]) {
                case "r": this.layers[i] = Layer.Red; break;
                case "g": this.layers[i] = Layer.Green; break;
                case "b": this.layers[i] = Layer.Blue; break;
                case "y": this.layers[i] = Layer.Yellow; break;
                case "o": this.layers[i] = Layer.Orange; break;
                default: this.layers[i] = Layer.Empty;

            }
        }

    }

    public boolean canAddColor(Bottle bottleRemoveFrom){
        if(bottleRemoveFrom.filledIndex == -1)
            return false;
        if (filledIndex == -1){
            return true;
        }

        Layer layer = bottleRemoveFrom.layers[bottleRemoveFrom.filledIndex];
        if(layers[filledIndex] == layer && filledIndex + 1 < bottleCapacity){
            return true;
        }
        return false;
    }

    public void addColor(Bottle bottleRemoveFrom){
        Layer layer = bottleRemoveFrom.layers[bottleRemoveFrom.filledIndex--];

        if (filledIndex==-1){
            layers[++filledIndex] = layer;
            return;
        }

        if(layers[filledIndex] == layer){
            layers[++filledIndex] = layer;
            return;
        }
    }

    public boolean isBottleSameColor(){
        boolean ans= true;

        for(int layer =filledIndex-1; layer>-1; layer--){
            ans&= layers[layer] == layers[layer+1];
        }
        return ans;
    }

    public Integer getFilledIndex() {
        return filledIndex;
    }

    public void setFilledIndex(Integer filledIndex) {
        this.filledIndex = filledIndex;
    }


    public String toString(){
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<bottleCapacity;i++)
            sb.append(layers[i]+" ");

        return sb.toString();
    }



}
