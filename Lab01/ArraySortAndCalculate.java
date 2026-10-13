package Lab01;

import java.util.Arrays;

public class ArraySortAndCalculate {
    public static void main(String[] args) {
        int[] arr = {1789, 2035, 1899, 1456, 2013};

        Arrays.sort(arr);

        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double) sum / arr.length);
    }
}
