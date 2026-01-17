import java.util.Scanner;

public class For_loop_Statement {
    public static void main(String[] args) {
        int num,i;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter any number For Table: ");
        num=obj.nextInt();
       obj.close();
        for(i=1; i<=10; i++){

            System.out.println(num*i);
        } 
        
    }
}
