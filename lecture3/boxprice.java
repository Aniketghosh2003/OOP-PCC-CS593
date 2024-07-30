package lecture3;

public class boxprice extends box{
    double cost;

    boxprice(){
        super();
        this.cost = -1;
    }

    public boxprice(double l,double h,double w,double weight,double cost){
        super(l,h,w,weight);
        this.cost = cost;
    }
}
