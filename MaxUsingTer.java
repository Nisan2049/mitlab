//1. Write a program find the max of two numbers using ternary operator
import java.util.Scanner;
class MaxUsingTer{
	public static void main(String args[]){
		int a,b,c;
		System.out.print("Enter 2 number\n");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a>b?a:b;
		System.out.print("Max of "+a+" and "+b+" is "+ c);
		
	}

}