import java.util.Scanner;

public class ExaminationResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Percentage = ");
        int Percentage = sc.nextInt();

        if (Percentage > 90){
            System.out.println("Star Marks...(A++)");
        } else if (Percentage>70) {
            System.out.println("Latter Marks...(A+)");
        } else if (Percentage>60) {
            System.out.println("Good marks...(A)");
        } else if (Percentage>50) {
            System.out.println("pass...(B+)");
        } else if (Percentage>40) {
            System.out.println("pass...(B)");
        } else if (Percentage>30) {
            System.out.println("pass...(C)");
        }else {
            System.out.println("Fail...(D)");
        }
    }
}
