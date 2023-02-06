import java.util.Scanner;

public class Task_fore {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                System.out.print(i+",");
            }
        }
    }
}
