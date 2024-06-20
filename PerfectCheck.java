//13. Write a program to find the given number is perfect or not
import java.util.Scanner;
	class PerfectCheck{
	public static void main(String args[]){
		int a,i,c=0;
		System.out.print("Enter a number\n");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(i=1;i<a;i++){
			if(a%i==0){
				c=c+i;
			}
		}
		if(a==c){
			System.out.print("Given number is Perfect\n");
		}
		else
		{
			System.out.print("Given number is not Perfect\n");	
		}
		
		}
}
