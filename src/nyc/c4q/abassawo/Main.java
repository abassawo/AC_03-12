package nyc.c4q.abassawo;

public class Main {
    public static void speak() {
        System.out.println("hello");
    }
    public static void shoutOut(String name){
        System.out.println("Hey " + name );
    }


    public static int getNumber() {
        return 100;
    }

    public static void main(String[] args) {
        String n = "Von Neumann";
        shoutOut("these");
        getNumber() ;
        System.out.println(getNumber());


    }
}
