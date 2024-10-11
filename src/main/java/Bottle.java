import java.util.Arrays;

public class Bottle {
    Layer[] layers;
    Integer filledIndex=-1;
    Integer bottleCapacity;

    public Bottle(Bottle bottle){
        layers = bottle.layers.clone();
        this.filledIndex = bottle.filledIndex;
        this.bottleCapacity = bottle.bottleCapacity;

    }

    public Bottle(String [] colors){
        bottleCapacity = colors.length;
        layers = new Layer[bottleCapacity];

        for(int i=0 ; i<bottleCapacity ; i++){
            switch(colors[i]) {
                case "r": this.layers[i] = Layer.Red; filledIndex++; break;
                case "g": this.layers[i] = Layer.Green; filledIndex++; break;
                case "b": this.layers[i] = Layer.Blue; filledIndex++; break;
                case "y": this.layers[i] = Layer.Yellow; filledIndex++; break;
                case "o": this.layers[i] = Layer.Orange; filledIndex++; break;
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
        int numOfLayersWillPour = numOfLayersWillPour(bottleRemoveFrom);
        System.out.println("ADD COLOR "+bottleRemoveFrom.layers[bottleRemoveFrom.filledIndex] +" to "+ (filledIndex!=-1? layers[filledIndex]: "EMPTY"));
        for(int i=0;i<numOfLayersWillPour;i++){
            Layer layer = bottleRemoveFrom.layers[bottleRemoveFrom.filledIndex];
            bottleRemoveFrom.layers[bottleRemoveFrom.filledIndex--] = Layer.Empty;

            layers[++filledIndex] = layer;
        }

    }

    public int numOfLayersWillPour(Bottle bottleRemoveFrom){
        int emptyLayers = bottleCapacity - (filledIndex + 1);
        int layersWillAdd = 1;

        for(int layer = bottleRemoveFrom.filledIndex - 1 ; layer>-1 ; layer--){
            if(bottleRemoveFrom.layers[layer] == bottleRemoveFrom.layers[layer+1])
                layersWillAdd++;
            else
                break;

        }
        return Math.min(emptyLayers,layersWillAdd);

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
