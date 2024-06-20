//1. Write a program print maximum and minimum of tree number.
import java.util.Scanner;
class MaxMinThree{
	public static void main(String args[]){
		int a,b,c;
		System.out.print("Enter 2 number\n");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>=b && a>=c){
			System.out.print("Greatest is :"+a);
		}
		else if(b>=a && b>=c){
			System.out.print("Greatest is :"+b);
	}
	else{
			System.out.print("Greatest is :"+c);
	}
}

}