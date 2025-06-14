import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arm =0;
        System.out.print("Enter any number = ");
        int num = sc.nextInt();
        int x = num;
        while (num>0){
            int r = num % 10;
             arm = (r*r*r) + arm;
             num = num/10;
        }
        if (x==arm)
        {
            System.out.println("The number is Armstrong");
        }
        else
        {
            System.out.println("The number is not Armstrong");
        }
    }
}
