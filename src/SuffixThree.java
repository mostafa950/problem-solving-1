import java.util.Scanner;

public class SuffixThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfLoops = scanner.nextInt();
        for (int i =0 ; i < numOfLoops ; i++){
            String value = scanner.next();
            int length = value.toCharArray().length;
            if(length >= 4){
                if(value.substring(length - 2).equals("po")) {
                    System.out.println("FILIPINO");
                }
                else if(value.substring(length - 4).equals("desu") ||
                        value.substring(length - 4).equals("masu")){
                    System.out.println("JAPANESE");
                }else if(value.substring(length - 5).equals("mnida")){
                    System.out.println("KOREAN");
                }
            }
            else {
                System.out.println("FILIPINO");
            }
/*            String result = "";
            if(length >= 4){
                result = "";
                for(int v = length -5 ; v <= length-1 ; v++){
                    result += value.toCharArray()[v];
                }
                if(result.substring(3).equals("po")){
                    System.out.println("FILIPINO");
                }
                if(result.substring(1).equals("desu") || result.substring(1).equals("masu")){
                    System.out.println("JAPANESE");
                }
                if(result.equals("mnida")){
                    System.out.println("KOREAN");
                }
            }else {
                System.out.println("FILIPINO");
            }*/
        }

    }
}
