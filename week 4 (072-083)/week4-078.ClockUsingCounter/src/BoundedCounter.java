
public class BoundedCounter {

    private int value=0;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void next() {
        value++;
        if (value > upperLimit) {
            value=0;
        }
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void setValue(int value){
        if(value>=0 && value<=upperLimit){
            this.value=value;
        }
    }

    public String toString() {
        if (value<10){
            String value = "0" + this.value;
            return value;
        } else{
            String value = "" + this.value;
            return value;
        }
    }
}
