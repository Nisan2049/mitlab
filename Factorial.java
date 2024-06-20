
//8. Write a program to print Factorial of a number.
import java.util.Scanner;
class Factorial{
	public static void main(String args[]){
		int a;
		int fact=1;
		System.out.print("Enter a number\n");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		while(a>1){
			fact=fact*a;
			a--;
		}
		System.out.print(" Factorial is "+fact);
	}

}