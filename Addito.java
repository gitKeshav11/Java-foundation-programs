import java.util.Scanner;
public class Addito{
  public static void main(String[] args){
    Scanner obj=new Scanner (System.in);
    System.out.print("Enter value of a : ");
    int a=obj.nextInt();
    System.out.print("Enter Value of b : ");
    int b=obj.nextInt();
    int c=a+b;
    System.out.println("The Sum of These Numbers: "+c);
    obj.close();
    
    }
  }
