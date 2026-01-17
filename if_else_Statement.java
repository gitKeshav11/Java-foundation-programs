import java.util.Scanner;
public class if_else_Statement{
    public static void main (String[] args){
        int num;
        System.out.print("Enter a number: ");
        Scanner obj=new Scanner(System.in);
        num=obj.nextInt();
        obj.close();
        if(num==202001){
            System.out.print("Your Password is Correct\nName: Keshav Upadhyay");
        }
        else{
            System.out.print("Invailed Password\nTry again after Some Time");
        }

        
    }

}