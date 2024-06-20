//10. Write a program to print Fibonacci Series.
class Fibo{
	public static void main(String args[]){
		int i=1,j=0,k;
		while(i+j<=300){
			k=i+j;
			System.out.println(k+" ");
			i=j;
			j=k;
		}

}
}