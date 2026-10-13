package Lab01;

import java.time.Month;
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] validMonths = {
                                {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"},
                                {"Jan.", "Feb,", "Mar.", "Apr.", "May", "June", "July", "Aug.", "Sept.", "Oct.", "Nov.", "Dec."},
                                {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"},
                                {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}
                                };

        

        System.out.println("Enter Month: ");
        String monthInput = input.nextLine();
        int month = 0;
        int colNum = validMonths.length;
        for (int i = 0; i < colNum; i++){
            int rowNum = validMonths[i].length;
            for (int j = 0; j < rowNum; j++){
                if (monthInput.equals(validMonths[i][j])){
                    month = j+1;
                }
            }
        }

        if (month == 0){
            System.out.println("INVALID INPUT");
            return;
        }
        
        System.out.println("Enter Year: ");
        int year = input.nextInt();
        if (year < 0){
            System.out.println("INVALID INPUT");
            return;
        }

        Month m = Month.of(month);
        System.out.println("There are " + m.length(leapYearCheck(year)) + " days in " + validMonths[0][month-1] + ".");
    }

    private static boolean leapYearCheck(int year){
        if (year % 400 == 0) return true;
        else if (year % 100 == 0) return false;
        else if (year % 4 == 0) return true;
        return false;
    }
}
