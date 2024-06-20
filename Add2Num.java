//1. Write a program to Add two numbers
import java.util.Scanner;
class Add2Num{
	public static void main(String args[]){
		int a,b,c;
		System.out.print("Enter 2 number\n");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.print("Sum of "+a+" and "+b+" is "+ c);
		
	}

}