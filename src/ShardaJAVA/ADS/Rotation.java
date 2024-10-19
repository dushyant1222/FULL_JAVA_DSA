package ShardaJAVA.ADS;

import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        int N,k;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        N = in.nextInt();
        int arr[] = new int[N];
        System.out.println("Enter the value of k: ");
        k = in.nextInt();
        System.out.println("Enter the "+ N + " Elements");
        for (int i = 0; i<N; i++){
            arr[i] = in.nextInt();
        }

        k = k % N;
        for (int i = 0; i<N;i++){
            if(i<k){
                System.out.println(arr[N+i-k]);
            }else{
                System.out.println(arr[i-k]);
            }
        }
    }
}
