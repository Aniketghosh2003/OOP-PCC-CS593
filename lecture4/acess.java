package lecture4;

public class acess {
    private int num;
    String name;
    int[] arr;

    public int getnum(){
        return num;
    }

    public void setnum(int num){
         this.num = num;
    }

    public acess(int num, String name){
      this.num = num;
      this.name = name;
      this.arr = new int[num];
    }
}
