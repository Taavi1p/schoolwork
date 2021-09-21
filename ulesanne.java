public class ulesanne {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static int[][] suvalineMaatriks(int n) {

        int[][] maatriks = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                maatriks[i][j] = getRandomNumber(2, 111);
            }
        }
        return maatriks;
    }

    public static int summa(int n, int[][] maatriks) {
        int summa = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                summa = summa + maatriks[i][j];
            }
        }
        return summa;
    }

    public static int diagonaalide_summa(int n, int[][] maatriks){
        int summa = 0;
        for ( )
    }



    public static void main(String[] args) {
        int n = 4;
        int [][] maatriks = suvalineMaatriks(n);


        for (int i = 0; i < maatriks.length; i++) {
            for (int j = 0; j < maatriks.length; j++) {
                System.out.print(maatriks[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("summa on    " + summa(n, maatriks));

    }
}
