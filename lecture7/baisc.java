package lecture7;

public class baisc {
    enum week {
        monday, tuesday, wednesday, thursday, friday, saturday, sunday;

        week(){
            System.out.println("fuck off !!!");
        }
    }

    public static void main(String[] args) {
        week w1;
        w1 = week.monday;

        // for (week day : week.values()) {
        //     System.out.println(day);
        // }

        System.out.println(w1);
        System.out.println(w1.ordinal());
    }
}
