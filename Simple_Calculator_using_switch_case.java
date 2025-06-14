import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number = ");
        int a = sc.nextInt();
        System.out.print("Enter the second number = ");
        int b = sc.nextInt();
        System.out.print("Enter the second number = ");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int button = sc.nextInt();

        switch (button){
            case 1:
                int sum = a + b;
                System.out.println("The sum of"+a+ "and" +b+"are = " +sum);
                break;
            case 2:
                int sub = a - b;
                System.out.println("The sub of"+a+ "and" +b+"are = " +sub);
            case 3:
                int mul = a * b;
                System.out.println("The mul of"+a+ "and" +b+"are = " +mul);
                break;
            case 4:
                int div = a / b;
                System.out.println("The div of"+a+ "and" +b+"are = " +div);
                break;

            default:
                System.out.println("cod run again");
        }

    }
}
