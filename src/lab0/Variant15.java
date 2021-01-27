package lab0;

public class Variant15 {
    /**
     * Integer15. A three-digit number is given. Print the number obtained by rearranging the digits of hundreds and tens of the original number (for example, 123 will go to 213).
     * @param x
     * @return
     */
    public int integerTask(int x) {
        char [] charArray = (""+x).toCharArray();
        char temp = charArray[0];
        charArray[0] = charArray[1];
        charArray[1] = temp;
        int result = Integer.parseInt(new String(charArray));
        return result;
    }

    /**
     * Boolean15. Three integers are given: A, B, C. Check the truth of the statement: "Exactly two of the numbers A, B, C are positive."
     * @param a
     * @param b
     * @param c
     * @return
     */
    public boolean booleanTask(int a, int b, int c) {
        int positive=0;
        if (a>0) {
            positive = positive+1;
        }
        if(b>0) {
            positive = positive+1;
        }
        if(c>0) {
            positive = positive+1;
        }
        if(positive==2) return true;
        return false;
    }

    /**
     * If15. Three numbers are given. Find the sum of the two largest ones.
     * @param a
     * @param b
     * @param c
     * @return
     */
    public int ifTask(int a, int b, int c) {
        if(a<=b && b<=c) {
            return b+c;
        }
        if(c<=b && b<=a) {
            return b+a;
        }
        if(b<=a && a<=c) {
            return a+c;
        }
        if(c<=a && a<=b) {
            return a+b;
        }
        if(a<=c && c<=b) {
            return c+b;
        }
        if(b<=c && c<=a) {
            return c+b;
        }
        return 0;
    }

    /**
     * Case15. The suits of playing cards are assigned serial numbers: 1 - spades, 2 - clubs, 3 - diamonds, 4 - hearts. The dignity of cards, senior ten, are assigned numbers: 11 - jack, 12 - queen, 13 - king, 14 - ace. Two integers are given: N - value (6 Ј N Ј 14) and M - card suit (1 Ј M Ј 4). Display the name of the corresponding card of the form "six of tambourines", "queen of hearts", "ace of clubs", etc.
     * @param n
     * @param m
     * @return
     */
    public String caseTask(int n,int m) {
        String temp_suits="";
        String temp_card_value="";

        switch(n) {
            case 6:
                temp_suits = "Six";
                break;
            case 7:
                temp_suits = "Seven";
                break;
            case 8:
                temp_suits = "Eight";
                break;
            case 9:
                temp_suits = "Nine";
                break;
            case 10:
                temp_suits = "Ten";
                break;
            case 11:
                temp_suits = "Jack";
                break;
            case 12:
                temp_suits = "Queen";
                break;
            case 13:
                temp_suits = "King";
                break;
            case 14:
                temp_suits = "Ace";
                break;
        }

        switch (m) {
            case 1:
                temp_card_value = " Heart";
                break;
            case 2:
                temp_card_value = " Diamond";
                break;
            case 3:
                temp_card_value = " Club";
                break;
            case 4:
                temp_card_value = " Spade";
                break;
        }

        String result = temp_suits + temp_card_value;
        return result;
    }

    /**
     * For15 *. You are given a real number A and an integer N (> 0). Find A to the N power:
     *AN = A · A ·… · A
     *(numbers A are multiplied N times).
     *
     * @param a
     * @param n
     * @return
     */
    public double forTask(double a, int n) {
        double sum = 1;
        for (int i = 0; i < n; i++) {
            sum = sum * a;
        }
        return sum;
    }

    /**
     * While15. The initial deposit in the bank is 1000 rubles. Every month, the size of the deposit increases by P percent of the available amount (P is a real number, 0 <P <25). For this P, determine how many months the deposit will exceed 1100 rubles, and output the found number of months K (integer) and the final size of the contribution S (real number).
     * @param p
     * @return
     */
    public SpecialWhileTask whileTask(double p){
        double start=1000;
        int k=0;
        double temp_p = p/100;
        int end = 1100;
        while (start<end){
            start = start + (start*temp_p);
            k = k + 1;
            System.out.println(p);
        }
        SpecialWhileTask result = new SpecialWhileTask(k,start);
        return result;

    }

    /**
     * Minmax15. Given numbers B, C (0 <B <C) and a set of ten numbers. Print the maximum of the set elements contained in the interval (B, C) and its number. If the required numbers are absent in the set, then output 0 twice.
     * @param b
     * @param c
     * @param array
     * @return
     */
    public double [] minmaxTask(double b, double c, double [] array){
        double numeric = 0;
        double number = 0;
        for(int i=0; i< array.length; i++) {
            if(array[i]>b && array[i]<c) {
                if(array[i]>numeric) {
                    numeric = array[i];
                    number = i;
                }
            }
        }
        double[] result = new double[2];
        result[0] = numeric;
        result[1] = number;
        return result;
    }

    /**
     * Array15. Given an array A of size N. First, output its elements with odd numbers in ascending order, and then - elements with even numbers in descending order:
     *
     * A1, A3, A5, ..., A6, A4, A2.
     * @param A
     * @return
     */
    public double [] arrayTask(double [] A){
        double [] result = new double[A.length-1];
        int k=0;
        for(int i=1; i< A.length; i++) {
            if(i%2!=0&&i!=0) {
                result[k++] = A[i];
            }
        }
        for(int i= A.length-1; i>1; i--) {
            if(i%2==0&&i!=0) {
                result[k++] = A[i];
            }
        }
        return result;

    }

    /**
     *Matrix15. You are given a square matrix A of order M (M is an odd number). Starting at element A1,1 and moving clockwise, output all its elements in a spiral: first row, last column, last row in reverse order, first column in reverse order, remaining elements of second row, etc .; the center element of the matrix is displayed last.
     * @param a
     * @return
     */
    public double[][] matrixTask(double [][] a) {


        int m=a.length;
        double [][] result =new  double[m][m];


        int i2,i,j;
        int n1=0;
        int n2=0;
        for (i2=0; i2<m/2; ++i2){
            for (i=i2; i<m-i2; ++i){
                ///System.out.print(a[i2][i]); System.out.print(" /");
                result[n1][n2++] = a[i2][i];
                if (n2==m){
                    n1 = n1 + 1;
                    n2 = 0;
                }
            }
            for (j=i2+1; j<=m-i2-1; ++j){
                ///System.out.print(a[j][m-i2-1]);System.out.print(" //");
                result[n1][n2++] = a[j][m-i2-1];
                if (n2==m){
                    n1 = n1 + 1;
                    n2 = 0;
                }}
            for (i=m-i2-2; i>=i2; --i){
                ///System.out.print(a[m-i2-1][i]);System.out.print(" ///");
                result[n1][n2++] = a[m-i2-1][i];
                if (n2==m){
                    n1 = n1 + 1;
                    n2 = 0;
                }}
            for (j=m-i2-2; j>=i2+1; --j){
                ///System.out.print(a[j][i2]);System.out.print(" ////");
                result[n1][n2++] = a[j][i2];
                if (n2==m){
                    n1 = n1 + 1;
                    n2 = 0;
                }
            }
            ///System.out.print("\n");
        }
        ///System.out.print(a[m / 2][m / 2]);
        ///System.out.print("\n");
        result[m-1][m-1] = a[m / 2][m / 2];

        ///System.out.print("//////////////////////");
        for(i=0; i<result.length;i++) {
            for (j = 0; j < result.length; j++) {
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        return result;
    }

    public static void main(String args[]) {

        System.out.println("I'm main");
    }


    public static class SpecialWhileTask {
        public int a;
        public double b;

        public SpecialWhileTask(int a, double b) {
            this.a = a;
            this.b = b;
        }
    }
}
