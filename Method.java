import java.util.Scanner;

public class Method{

    public int Sum(int a , int b , int c){   // Methods of Addition
        return a+b+c;
    }
     
    
    
    public static void main(String[] args){
       Scanner obj=new Scanner(System.in);

       System.out.print("Enter Value of A: ");
       int a = obj.nextInt();
       System.out.print("Enter value of B: ");
       int b = obj.nextInt();
       System.out.print("Enter value of C: ");
       int c = obj.nextInt();
        obj.close();
       Method scan=new Method();
       

       int r = scan.Sum(a , b , c);

       System.out.print("Sum of A+B+C is "+r);
       
      }
}