import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfQuestions = scanner.nextInt();
        int[] arr = new int[numOfQuestions * 3];
        int sum ;
        int result = 0;
        for (int m = 0; m < arr.length; m++) {
            arr[m] = scanner.nextInt();
        }
        for (int i = 0 ; i < arr.length ; i += 3){
            sum = 0;
            sum += arr[i] + arr[i+1] + arr[i+2]; // 1 + 1 + 0 = 2
            if(sum >= 2){
                result++;
            }
        }
        System.out.println(result);
    }
}
