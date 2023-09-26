// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Differanse {


    public static int Differanse(int[] number) {
        int Min = 0;
        int Max = 0;
        for (int n = 0; n < number.length; n++) {
            Max = number[n];
            for (int i = 0; i < number.length; i++) {
                if (number[i] > Max) {

                }
            }
        }
        System.out.println("The Max is" + Max);


        for (int m = 0; m < number.length; m++) {
            Min = number[m];

            for (int x = 0; x < number.length; x++) {

                if (number[x] < Min) {
                    Min = number[x];
                }
            }
        }
                System.out.println("The Min is" + Min);

           return  Max - Min;

        }

    public static void main(String[] args) {
      int[]  number = {8, 9, 33, 67, 15, 100};


System.out.println("Differance is "+Differanse(number));

    }git
}