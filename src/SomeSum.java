import java.util.Scanner;

public class SomeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        int sum = 0;
        for (int i = 1 ; i <= num ; i++){
            if(i / 10 == 0){
                if(i >= val1 && i <= val2){
                    sum += i;
                }
            }
            else { // 15
                int number = i;
                int mySum = 0;
                while (number != 0){ // for first i = 15 for second i = 1
                    int myNum = number % 10;  // 5 // 1
                    mySum += myNum; // 5 // 5+1
                    number /= 10; // 1 // 0
                }
                if(mySum >= val1 && mySum <= val2){
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}
