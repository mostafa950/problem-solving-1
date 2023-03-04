import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        int answer = 0;
        char[] nums = number.toCharArray();
        if (nums.length == 1) {
            System.out.println("0");
            return;
        }
        int counter = 1;
        for (int i = 0; i < nums.length; i++) {
            answer += nums[i] - '0';
        }
        while (answer >= 10){
            answer = sum(answer);
            counter++;
        }
        System.out.println(counter);
    }
    public static int sum(int num){
        int result = 0;
        while (num != 0){
            result += num % 10;
            num /=10;
        }
        return result;
    }
}
