import java.util.Scanner;

/**
 * Division
 */
public class Division {

    public static void main(String[] args) {
        int a , b , Div , Rem;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Vlaue of a: ");
        a = obj.nextInt();
        System.out.print("Enter value of b: ");
        b = obj.nextInt();
        Div = a / b ;
        Rem = a % b ;
        System.out.println("The Divion of A & B : "+ Div);
        System.out.println("The Reminder of A & B: "+ Rem);
        obj.close();
        
    }
}