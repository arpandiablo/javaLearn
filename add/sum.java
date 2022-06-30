package add;
import java.util.Scanner;


public class sum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n1,n2,sum;
        System.out.print("Enter first number : ");  
        n1= sc.nextInt();
        System.out.print("Enter second number : ");
        n2= sc.nextInt();
        sum=n1+n2;
        System.out.println("The sum is " +sum);
    }
}

