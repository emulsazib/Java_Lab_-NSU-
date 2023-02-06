import java.util.Scanner;

public class Task_Three {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=input.nextInt();
        if(num%2==0){
            System.out.println("The Number is Even");
        }else {
            System.out.println("The Number is Odd");
        }
    }
}
