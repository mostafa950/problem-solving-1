import java.util.Scanner;

public class PUM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfLines = scanner.nextInt();
        String pum = "";
        int num = 1;
        for (int i = 1 ; i <= numOfLines ; i++){
            for (int m = num ; m % 4 != 0 ; m++ ){
                num = m;
                pum += m + " ";
            }
            System.out.println(pum + "pum");
            num++;
            pum = "";
            if(num % 4 == 0){
                num++;
            }
        }
    }
    }
