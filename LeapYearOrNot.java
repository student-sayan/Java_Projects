import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year :- ");
        int year = sc.nextInt();

        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0){
            System.out.println("The year is leapyear...");
        }
        else {
            System.out.println("The year is not leapyear...");
        }
    }
}
