import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your date of birth year  = ");
        int birth = sc.nextInt();
        System.out.printf("Your date of birth is year = %d\n",birth);

        System.out.print("Enter the point number = ");
        double num = sc.nextDouble();
        System.out.printf("Your date of birth is year = %f\n",num);

        System.out.print("Enter your name  = ");
        String name = sc.nextLine();
        System.out.printf(" your name is  = %s",name);

    }
}
