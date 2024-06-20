//3. Write a program to Implement Increment and Decrement operator.
import java.util.Scanner;
class IncAndDec{
	public static void main(String args[]){
		int a,b,c;
		System.out.print("Enter a number\n");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.print("Initially, value of a is"+ a);
		a++;
		System.out.print("\nAfter increment, value of a is"+ a);
		a--;
		System.out.print("\nAfter decrement, value of a"+ a);		
	}

}