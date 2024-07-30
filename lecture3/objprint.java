package lecture3;

public class objprint {

    int num;

    objprint(int num){
        this.num = num;
    }

    @Override
    public String toString(){
        return "Objprint "+num;
    }

    public static void main(String[] args) {
        objprint obj = new objprint(100);
        System.out.println(obj);
    }
}
