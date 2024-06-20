//6. Write a program to find out how many day in the month with specify year and month.
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numDays=0,month,year;
       
        System.out.print("Enter the year: ");
        year = scanner.nextInt();

        
        System.out.print("Enter the month ");
        month = scanner.nextInt();

       switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of days in the specified month (" + month + "/" + year + "): " + numDays);

    }
}
