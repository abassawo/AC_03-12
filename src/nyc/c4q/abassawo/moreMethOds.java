package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 3/12/15.
 */
public class moreMethOds {
    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int min(int z, int y) {
        int diff = z - y;
        return diff;
    }

    public static avg(int x, int y, int z){
        int average = (x + y + z) / 3;
        return average;

    }


    public static void main(String[] args) {
        int num = min(22, 2);
                System.out.println(num);
    }

        

}
