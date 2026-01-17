import java.util.Scanner;
public class Ternary_Opernator {
    public static void main(String[] args){
        
        Scanner obj=new Scanner (System.in);
        System.out.print("Enter value of a : ");
        int a = obj.nextInt();
        System.out.print("Enter value of b: ");
        int b = obj.nextInt();
        System.out.print("Enter Value of c: ");
        int c = obj.nextInt();
        obj.close();

        int r = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.print(r+" is greater");

    }
}
