import java.util.Scanner;

public class Nested_If_Else {
    public static void main(String[]args){
        int num1,num2,num3;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter First Number:  ");
        num1=obj.nextInt();
        System.out.print("Enter Second Number:  ");
        num2=obj.nextInt();
        System.out.print("Enter Third Number:  ");
        num3=obj.nextInt();
        obj.close();
        if(num1>num2){
            if(num1>num3){
                System.out.print("First Number is Greter than Second & Third.....");
            }
            else{
                System.out.print("Third Number is greter than First & Third......");
            }
        }

        else if (num1==num2 && num2==num3){
                
            System.out.print("First & Second & Third are Equal Digits.....");
        }

        else{
            if (num2>num3){
                System.out.print("Second Number is Greater than First & Third.......");
            }
            else{
                System.out.print("Third No. is Greater than First & Second.........");
            }
        }
        

    }
}
