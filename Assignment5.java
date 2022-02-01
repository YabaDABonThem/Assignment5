// Allen Bao
// CS 211
// 1/21/2022
// This is for Assignment 5 in CS 211
// This program finds the number of permutations with a recursive method

public class Assignment5 {
    public static int permut(int n, int r) throws IllegalArgumentException{
        // essentially, we keep multiplying n by n-1 an r amount of times, hence we can use r as our counter.
        if (n < r) {
            // throw an exception when n is greater than r, because that is an invalid input.
            throw new IllegalArgumentException(String.format("n must be greater than or equal to r," +
                    " but n = %1d and r = %2d", n, r));
        }
        if (r == 0) {
            // after an r amount of times, we break out the loop
            return 1;
        }
        // we call the method again with n-1 and r-1 and be sure to multiply it every time.
        return (n * permut(n-1, r-1));
    }

    // main method
    public static void main(String[] args) {
        // test cases
        // System.out.println(permut(0, 5));
        System.out.println(permut(5, 1));
        System.out.println(permut(55, 5));
    }
}