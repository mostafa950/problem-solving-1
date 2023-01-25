import java.util.Scanner;

public class SearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPerson = scanner.nextInt();
        int sum =0;
        for(int i = 0 ; i < numOfPerson ; i++){
            sum += scanner.nextInt();
        }
        if(sum == 0){
            System.out.println("EASY");
        }else {
            System.out.println("HARD");
        }
    }
}
