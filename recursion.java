public class recursion {

    public static int how_many_ways(int x,int y) {

        int counter = 0;

        if (x == 0 && y == 0 ) {
            counter += 1;
        }

        if (x > 0) {
            counter += how_many_ways(x - 1, y);
        }
        if (y > 0) {
            counter += how_many_ways(x, y - 1);
        }

        return counter;
    }
    public static void main(String[] args) {
        System.out.println(how_many_ways(20, 20));
    }
}
