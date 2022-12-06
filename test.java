import java.util.*;
public class test
{
public static void main(String[] args)
{
    // Scanner input = new Scanner(System.in);
    // int a,b,sum;
    // a= input.nextInt();
    // b= input.nextInt();
    // sum=a+b;

    int a, b ;
    String op;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter First Number:");
    a=sc.nextInt();

    System.out.println("Enter 2nd Number:");
    b=sc.nextInt();

    System.out.println("Operation:");
    op = sc.next();

    switch(op){
        case "Add":
            System.out.println("result is " + (a+b));
            break;
        case "Sub":
            System.out.println("result is "+ (a-b));
            break;
        case "Mul":
            System.out.println("result is "+ (a*b));
            break;
        case "Div":
            System.out.println("result is "+ (a/b));
            break;
        case "Mod":
            System.out.println("result is "+ (a%b));
            break;
        default:System.out.println("invalid opt.");
    }

}
} 