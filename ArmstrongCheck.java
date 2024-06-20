//12. Write a Java program to find the given number is Armstrong number or not
import java.util.Scanner;
	class ArmstrongCheck{
	public static void main(String args[]){
		int a,b,c=0,d;
		System.out.print("Enter a number\n");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		d=a;
		while(a!=0){
			b=a%10;
			c=c+b*b*b;
			a=a/10;
		}
		if(d==c){
			System.out.print("Given number is Armstrong\n");
		}
		else
		{
			System.out.print("Given number is not Armstrong\n");	
		}
		
		}
}
	
