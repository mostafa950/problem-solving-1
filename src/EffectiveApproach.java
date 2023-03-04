import java.util.Scanner;

public class EffectiveApproach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfArr = scanner.nextInt();
        int[] arr = new int[1000000];
        int number ;
        long compare1 = 0;
        long compare2 = 0;
        for (int i = 0 ; i < numOfArr ; i++){
            number = scanner.nextInt();
            arr[number] = i + 1;
        }
        int numSearch = scanner.nextInt();
        int numOfSearch ;
        for(int i = 0 ; i < numSearch ; i++){
            numOfSearch = scanner.nextInt();
            compare1 += arr[numOfSearch];
            compare2 += (numOfArr - arr[numOfSearch]) +1 ;
        }
        System.out.println(compare1 + " " + compare2);
    }
}
