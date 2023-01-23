import java.util.Scanner;

public class LeftAndRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int right = scanner.nextInt(); // 0
        int left = scanner.nextInt();  // 2
        int both = scanner.nextInt();  // 0
        int min = Math.min(right , left); // 0
        int max = Math.max(right , left); // 2
        int minAndBoth = min + both;      //  0
        if(max == minAndBoth){
            System.out.println(max*2);
        }
        else if(minAndBoth != 0 && max > minAndBoth){
            do{
                min++;                        //  1
                max--;
            }while (max <= min);
            System.out.println(minAndBoth*2);
        }
        else if(max == min && both != 0){
            min += both /2;
            System.out.println(min*2);
        }
        else if(minAndBoth == 0){
            System.out.println(minAndBoth);
        } else if (max < minAndBoth) {
            do{
                max++;                        //  1
                minAndBoth--;
            }while (max <= minAndBoth -1);
            System.out.println(minAndBoth*2);
        }
    }
}
