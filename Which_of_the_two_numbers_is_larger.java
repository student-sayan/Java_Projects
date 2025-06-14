import java.util.Scanner;

public class gol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of a = ");
        int a = sc.nextInt();
        System.out.print("Enter the number of b = ");
        int b = sc.nextInt();
        if (a == b){
            System.out.println("the numbers are equal");
        } else if (a>b) {
            System.out.println("a is grater than b");
        }
        else {
            System.out.println("b is grater than a");
        }
    }
}
