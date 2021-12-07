public class main {

    public static boolean funktsioon(String haha, String[] list, int counter) {

        int number = counter;
        System.out.println(number);
        if (counter > list.length) {
            System.out.println("fff");
            return false;
        }
        else if (haha.equals(list[counter])) {
            return true;
        }
        else {
                number++;
                return funktsioon(haha, list, number);
        }
    }

    public static void main(String[] args) {
        String[] liist = new String[] {"haha", "hah", "anna", "jaja"};
        String sõna = "jaja";
        System.out.println(funktsioon(sõna, liist, 0));
    }
}
