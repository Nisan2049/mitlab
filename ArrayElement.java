//18. Write a program to enter 10 array elements and print it.
import java.util.Scanner;
class ArrayElement{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[]nums=new int[10];
		System.out.println("Enter 10 numbers");
		 for (int i = 0; i < 10; i++) {
            nums[i] = s.nextInt(); 
        }
        
       
        System.out.println("You entered:");
        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + " ");
        }
	}
}