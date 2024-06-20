

//7. Write a program to implement continues and break statement.

class BreakAndContinue{
	public static void main(String args[]){
		int a;
		System.out.print("This program is intended to print number between 1 and 10 as\n");
		for(a=1;a<=10;a++){
			System.out.print(a+ " ");
		}
		System.out.print("\nImplementing break when value reaches 5\n");
		for(a=1;a<=10;a++){
			if(a==5)
				break;
			System.out.print(a+ " ");
		}
		System.out.print("\nImplementing continue when value reaches 5\n");
		for(a=1;a<=10;a++){
			if(a==5)
				continue;
			System.out.print(a+ " ");
		}
		
	}

}