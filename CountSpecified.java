

//14. Write a program to count digit with specify number.
import java.util.Scanner;
	class CountSpecified{
	public static void main(String args[]){
		int a,b,c=0,d,e;
		System.out.print("Enter a number\n");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		e=a;
		System.out.print("Which digit to count?\n");
		d=sc.nextInt();
		while(a!=0){
			b=a%10;
			if(b==d){c++;}
			a=a/10;
		
		}
			System.out.print("Total occurence of "+d+" in "+e+" is "+c);	
		
		}
}
