import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numOfOperations = scanner.nextInt();
        for(int i = 0 ; i< numOfOperations ; i++){
            if(number % 10 != 0){
                number--;
                continue;
            }
            number /= 10;
        }
        System.out.println(number);
    }
}