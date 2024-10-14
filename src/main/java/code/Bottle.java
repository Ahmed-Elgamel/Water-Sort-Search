package code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;


public class Bottle {
    Layer[] layers;
    private Integer filledIndex=-1;
    private Integer bottleCapacity;

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
                case "r": this.layers[ (bottleCapacity-1) - i ] = Layer.Red; filledIndex++; break;
                case "g": this.layers[ (bottleCapacity-1) - i ] = Layer.Green; filledIndex++; break;
                case "b": this.layers[ (bottleCapacity-1) - i ] = Layer.Blue; filledIndex++; break;
                case "y": this.layers[ (bottleCapacity-1) - i ] = Layer.Yellow; filledIndex++; break;
                case "o": this.layers[ (bottleCapacity-1) - i ] = Layer.Orange; filledIndex++; break;
                default:  this.layers[ (bottleCapacity-1) - i ] = Layer.Empty;

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

    public int addColor(Bottle bottleRemoveFrom){
        int numOfLayersWillPour = numOfLayersWillPour(bottleRemoveFrom);

        for(int i=0;i<numOfLayersWillPour;i++){
            Layer layer = bottleRemoveFrom.layers[bottleRemoveFrom.filledIndex];
            bottleRemoveFrom.layers[bottleRemoveFrom.filledIndex--] = Layer.Empty;

            layers[++filledIndex] = layer;
        }

        return numOfLayersWillPour; //this is the cost of apply the pour operation

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

    public int numberOfDifferentColors(){
        HashSet<Layer> numberOfDiffLayers= new HashSet<>();

        for(int layer =filledIndex; layer>-1; layer--){
            numberOfDiffLayers.add(layers[layer]);
        }
        return Math.max(0, numberOfDiffLayers.size()-1);
    }


    public String toString(){
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<bottleCapacity;i++)
            sb.append(layers[i]+", ");

        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bottle bottle = (Bottle) o;
        return Arrays.equals(layers, bottle.layers) &&  // Compare layers array
                Objects.equals(filledIndex, bottle.filledIndex) &&
                Objects.equals(bottleCapacity, bottle.bottleCapacity);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(filledIndex, bottleCapacity);  // Hash fields
        result = 31 * result + Arrays.hashCode(layers);  // Include the layers array hash
        return result;
    }




}
