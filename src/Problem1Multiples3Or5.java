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
        int naturalNumber = 1;
        boolean isTrue = true;

        while (isTrue) {
            int multiple3 = 3 * naturalNumber;
            if (multiple3 >= number) {
                break;
            }
            sum += multiple3;
            naturalNumber++;
        }

        naturalNumber = 1;
        while (isTrue) {
            int multiple5 = 5 * naturalNumber;
            if (multiple5 >= number) {
                break;
            }
            sum += multiple5;
            naturalNumber++;
        }
        return sum;
    }

}


