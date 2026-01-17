import java.util.Scanner;

/**
 * Multiplication
 */
public class Multiplication {

    public static void main(String[] args) {
        int a , b , Multi ; 
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Value of a : ");
        a = obj.nextInt();
        System.out.print("Enter value of b : ");
        b = obj.nextInt();
        Multi = a*b;
        System.out.println("The Multiplication of a & b: "+Multi);
        obj.close();
        
    }
}
