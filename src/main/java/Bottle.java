public class Bottle {
    Color [] colors;
    Integer filledIndex=-1;
    Integer bottleCapacity;

    public Bottle(Color[] colors){
        colors = colors;
        bottleCapacity = colors.length;

    }

    public boolean canAddColor(Bottle bottleRemoveFrom){
        if(bottleRemoveFrom.filledIndex == -1)
            return false;
        if (filledIndex == -1){
            return true;
        }

        Color color = bottleRemoveFrom.colors[bottleRemoveFrom.filledIndex];
        if(colors[filledIndex] == color  && filledIndex + 1 < bottleCapacity){
            return true;
        }
        return false;
    }

    public void addColor(Bottle bottleRemoveFrom){
        Color color = bottleRemoveFrom.colors[bottleRemoveFrom.filledIndex--];

        if (filledIndex==-1){
            colors[++filledIndex] = color;
            return;
        }

        if(colors[filledIndex] == color){
            colors[++filledIndex] = color;
            return;
        }
    }

    public boolean isBottleSameColor(){
        boolean ans= true;

        for(int layer =filledIndex-1; layer>-1; layer--){
            ans&= colors[layer] == colors[layer+1];
        }
        return ans;
    }

    public Integer getFilledIndex() {
        return filledIndex;
    }

    public void setFilledIndex(Integer filledIndex) {
        this.filledIndex = filledIndex;
    }



}
