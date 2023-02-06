import java.util.Scanner;

public class Task_One {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num =input.nextInt();
        int rem=num%2;
        switch (rem){
            case 0:
                System.out.println("The number is Even");
                break;
            default:
                System.out.println("The Number is odd");
                break;
        }
    }
}
