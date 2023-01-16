import java.util.Scanner;

public class SumOddNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* int numOfLoop = scanner.nextInt();
        int[][] arr = new int[numOfLoop][2];
        int[] sum = new int[numOfLoop];
        for (int i = 0; i < numOfLoop; i++) // 0
        {
            for (int m = 0 ; m < 2 ; m++) // 1
            {
                arr[i][m] = scanner.nextInt();
            }
            if (arr[i][0] < arr[i][1]){
                for(int first = arr[i][0]+1 ;first< arr[i][1] ; first++){
                    if (first % 2 != 0){
                        sum[i] += first;
                    }
                }
            }
            else if (arr[i][0] > arr[i][1]){
                for(int first = arr[i][0] ;first> arr[i][1] ; first--){
                    if (first % 2 != 0){
                        sum[i] += first;
                    }
                }
            }
        }
        for (int s = 0 ; s < numOfLoop ; s++){
            System.out.println(sum[s]);
        }*/
        int numOfLoop = scanner.nextInt();
        int[] arr = new int[numOfLoop];
        int sum = 0;
        for (int i = 0 ; i < numOfLoop ; i++)
        {
            sum = 0;
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int min = Math.min(num1 , num2);
            int max = Math.max(num1 , num2);
            for (int z = min +1 ; z < max ; z++)
            {
                if(z % 2 != 0){
                    sum += z;
                }
            }
            arr[i]= sum;
        }
        for (int index = 0; index < arr.length; index++){
            System.out.println(arr[index]);
        }


    }
}
