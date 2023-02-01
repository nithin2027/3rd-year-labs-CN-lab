package Lab.Leaky_Bucket;
import java.util.Scanner;

public class leakyBucket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bucket capacity : ");
        int capacity = sc.nextInt();
        System.out.println("Enter output rate");
        int rate = sc.nextInt();
        int curr = 0;
        while(true){
            System.out.println("Enter the input rate :");
            int input = sc.nextInt();
            if(curr+input>capacity){
                System.out.println("Bucket Overflow");
            }
            else{
                curr += input;
                curr -= rate;
                curr = Math.max(0, curr);
                System.out.println("Bucket Capacity is "+curr);
            }
            System.out.println("Do you want to continue, 2 to exit ,1 to continue");
            int choose = sc.nextInt();
            if(choose==2)
                break;
        }
        sc.close();
    }
}
