
//4. Write a program to print Day name with specify day number.
import java.util.Scanner;
class PrintDay{
	public static void main(String args[]){
		int a,b,c;
		System.out.print("Enter a number between 1 and 7\n");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a==1){
			System.out.print("Sunday");
		}
		else if(a==2){
			System.out.print("Monday");
		}
		else if(a==3){
			System.out.print("Tuesday");
		}
		else if(a==4){
			System.out.print("Wednesday");
		}
		else if(a==5){
			System.out.print("Thursday");
		}
		else if(a==6){
			System.out.print("Friday");
		}
		else if(a==7){
			System.out.print("Saturday");
		}
		
	else{
			System.out.print("Not a valid Number");
	}
}

}