package ShardaJAVA.Basics;
import java.util.Scanner;
public class Restart {
    public static void main(String[] args) {
        Restart.Res();
    }
    static void Res() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        if(sum>30){
            System.out.println(sum);
        }
        else Restart.Res();
    }
}