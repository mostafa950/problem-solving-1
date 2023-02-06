import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String hate = "I hate";
        String love = "I love";
        String result = "";
        for(int i = 1 ; i <= size ; i++){
            if(size == 1){
                result = hate;
                break;
            }
            else if(i % 2 != 0  && size != i){
                result += hate + " that ";
            }
            else if(i % 2 == 0 && size != i){
                result += love +" that ";
            }
            else if (i % 2 == 0){
                result += love;
            }
            else if(i % 2 != 0){
                result += hate;
            }
        }
        System.out.println(result + " " + "it");
    }
}
