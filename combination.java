public class combination {

    public static void how_many(int number_of_numbers, int number) {

        if (number / Math.pow(10, number_of_numbers) < 1) {
            System.out.println(number);
        }
        else {
            return;
        }
        how_many(number_of_numbers, number + 1);
    }

    public static void main(String[] args) {
        how_many(3, 0);
    }
}
