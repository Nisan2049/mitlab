//22. Write a program to sort Array elements.
import java.util.Arrays;
import java.util.Scanner;
public class SortArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = s.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }
        Arrays.sort(nums);
        System.out.println("Sorted array:");
        for (int num = nums) {
            System.out.print(num + " ");
        }

    }
}
