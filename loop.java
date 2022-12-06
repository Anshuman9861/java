import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner num = new Scanner(System.in);
        int n= num.nextInt();


        System.out.println("Table of " + n + " is ");
        
        for(int i=1; i<=10;i++){
         System.out.println(n+" * "+i+" = "+ (n*i));
        }
    }
    
}
