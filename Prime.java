//11. Write a program to print Prime Numbers.
class Prime{
	public static void main(String args[]){

        int limit = 100; 
        for (int num = 2; num <= limit; num++) {
            boolean isPrime = true;
  
            for (int factor = 2; factor <= Math.sqrt(num); factor++) {
                if (num % factor == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            
            if (isPrime) {
                System.out.print(num+ " ");
            }
        }
    }
}