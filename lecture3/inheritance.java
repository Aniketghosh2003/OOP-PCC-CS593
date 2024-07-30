package lecture3;

public class inheritance {
    double l;
    double h;
    double w;

    inheritance(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    inheritance(double side){
       this.h = side;
       this.l = side;
       this.w = side;
    }

    inheritance(double l,double h,double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    inheritance(inheritance old){
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }

    public void information(){
        System.out.println("Running fine !!!");
    }
}
