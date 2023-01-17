import java.util.Scanner;

public class ColorFulStones {
    public static void main(String[] args) {
        // عايز يمشي علي القيمه الاولي ويحسب لما يلاقي اللي فوق شبه اللي تحت يبقي اخر حاجه وقف عندها هتبقي كام
        Scanner scanner = new Scanner(System.in);
        /*
          RBG
          RRR
         */
        String value = scanner.next();
        String instruction = scanner.next();
        int counter = 1;
        for(int i = 0 ; i< instruction.length() ; i++){
            if(value.toCharArray()[counter-1] == instruction.toCharArray()[i]){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
