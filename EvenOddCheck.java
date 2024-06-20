//2. Write a program checks specify number is odd or even.
import java.util.Scanner;
class EvenOddCheck{
	public static void main(String args[]){
		int a;
		System.out.print("Enter a number\n");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a%2==0){
			System.out.print(a+ " is Even");
		}
	else{
			System.out.print(a+ " is Odd");
		}
		
	}

}