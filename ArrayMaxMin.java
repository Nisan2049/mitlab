//20. Write a program print maximum and minimum of 10 array elements.
import java.util.Scanner;

 class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            nums[i] = s.nextInt();
        }
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < 10; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);a
    }
}
