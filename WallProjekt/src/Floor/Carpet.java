package Floor;

public class Carpet {
    private double costOfType;

    public Carpet (double costOfType){
        this.costOfType=costOfType;
        if (costOfType<0){
            costOfType=0;
        }
    }
    public void getCost(){
        return;
    }
}
