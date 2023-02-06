public class Task_three {
    public static void main(String[] args) {
        int num=5;
        int result;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=10;j++){
                result=i*j;
                System.out.println(i+" X "+j+" = "+result);
            }
            System.out.println("\n");
        }
    }
}
