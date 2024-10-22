package ee.ivkhkdev;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 4
        int summ = 0;
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            int randnum = rand.nextInt(100);
            while (randnum % 2 != 0 || randnum == 0) {
                randnum = rand.nextInt(100);

            }
            arr[i] = randnum;
        }
        for (int x = 0; x < arr.length; x++) {
            summ = arr[x];
            System.out.print(arr[x] + " ");
        }

        int randlength = arr.length;
        double avgsum = (double) summ / randlength;

        System.out.println("\n" + avgsum + " ");

    }
}