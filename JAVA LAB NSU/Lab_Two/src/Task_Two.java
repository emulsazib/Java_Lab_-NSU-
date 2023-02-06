import java.util.Scanner;

public class Task_Two {
    public static void main(String[] args) {
        int f=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num=input.nextInt();
        if(num==0||num==1){
            f=1;
        }
        for(int i =2;i<=num/2;i++){
            if(num%i==0){
                f=1;
                break;
            }
        }
        if(f==0){
            System.out.println("The number is a prime number.");
        }else {
            System.out.println("The number is not a prime number.");
        }
    }
}
