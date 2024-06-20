//19. Write a program print sum and average of 10 array elements.
import java.util.Scanner;
class SumAndAverage
{
public static void main(String[] args) {
	int i,sum=0;
	Scanner s=new Scanner(System.in);
	int[]nums=new int[10];
	System.out.println("Enter 10 numbers");
	for(i=0;i<10;i++)
	{
		nums[i]=s.nextInt();

	}
	for(i=0;i<10;i++){
		sum=sum+nums[i];

	}
	 double average = (double) sum / 10;
        
  
        System.out.println("Sum of 10 array elements: " + sum);
        System.out.println("Average of 10 array elements: " + average);
        
}
}