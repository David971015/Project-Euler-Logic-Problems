import java.util.Scanner;

public class Problem1Multiples3Or5 {
    /*Problem 1: Multiples of 3 or 5
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    Find the sum of all the multiples of 3 or 5 below the provided parameter value number*/

    public static void main(String[] args) {
        int test = multiplesOf3Or5(10);
        System.out.println(test);
        System.out.println("Testing");


    }

    public static int multiplesOf3Or5(int number) {
        int sum = 0;

        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

}




