import java.util.Scanner;

/**
 * Subtraction
 */
public class Subtraction {

    public static void main(String[] args) {
        int a , b, Sub;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Value Of a: ");
        a = obj.nextInt();
        System.out.print("Enter Value of b: ");
        b = obj.nextInt();
        Sub  = a - b ;
        System.out.println("After Subtracted The Value is: " + Sub);
        obj.close();

    }
}
