import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numOfEvents = scanner.nextInt();
    int result = 0;
    int sumOfPolices = 0 ;
    int sumOfCrimes = 0 ;
    for (int i = 0 ; i < numOfEvents ; i++){
        int num = scanner.nextInt();
        if(num > -1){
            sumOfPolices += num;
        }
        else if(num == -1){
            result = num + sumOfPolices;
            if(result < 0){
                sumOfCrimes++;
            }
            if(sumOfPolices != 0){
                sumOfPolices--;
            }
        }
    }
        System.out.println(sumOfCrimes);
    }
}
