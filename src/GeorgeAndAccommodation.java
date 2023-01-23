import java.util.Scanner;

public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfFlats = scanner.nextInt();
        int counter = 0;
        for(int i = 0 ; i < numOfFlats ; i++){
            int numOfMembers = scanner.nextInt();
            int numOfPlaces = scanner.nextInt();
            int sum = numOfPlaces - numOfMembers;
            if(sum > 1){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
