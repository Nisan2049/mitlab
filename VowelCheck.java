//5. Write a program to check where a character is vowel or consonant.
import java.util.Scanner;
class VowelCheck{
	public static void main(String args[]){
		char a;
		System.out.print("Enter a number\n");
		Scanner sc=new Scanner(System.in);
		a=sc.next().charAt(0);
		if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
			System.out.print(a+ " is vowel");
		}
	else{
			System.out.print(a+ " is not Vowel");
		}
		
	}

}