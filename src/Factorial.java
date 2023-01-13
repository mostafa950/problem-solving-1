import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        double sum = 1;
        // first solution
        /*for (int i = num ; i >= 1 ; i --){
            sum *= i;
        }*/
        // second solution
        sum = recFactorial(num);
            System.out.println(sum);
    }
    public static double recFactorial(int num){
        if (num >= 1){
            return  num * recFactorial(num -1);
        }
        else {
            return 1;
        }
    }
}
