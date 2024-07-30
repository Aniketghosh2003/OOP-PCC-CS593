package lecture3;

public class box extends inheritance {
    double weight;

    box() {
        this.weight = -1;
    }

    public box(double l, double h, double w, double weight) {
        super(l, h, w);// used to initialized values present in parent class
        this.weight = weight;
        
    }
}
