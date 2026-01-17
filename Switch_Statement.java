import java.util.Scanner;

public class Switch_Statement{
    public static void main(String[] args){
    int a , b, ch , S, rem ;
    Scanner obj=new Scanner (System.in);
    System.out.print("Enter First No.: ");
    a=obj.nextInt();
    System.out.print("Enter Second No.: ");
    b=obj.nextInt();
    System.out.print("\n\nChoice 1: Addition..\nChoice 2: Subtraction\nChoice 3:Multiplication...\nChoice 4: Devision & Remainder....\n\n");
    

    System.out.print("\n Enter Your Choice:");
    ch=obj.nextInt();
    obj.close();


    switch(ch){

        case 1: S = a+b;
        System.out.print("Addition of a & b is:"+S);
        break;

        case 2: S = a-b;
        System.out.print("Subtraction of a & b is:"+S);
        break;

        case 3: S = a*b;
        System.out.print("Multiplication of a & b is:"+S);
        break;

        case 4: S = a/b;
                rem = a%b;
        System.out.print("Devision of a & b is: "+S +"\nRemainder of a & b is: "+rem);
        break;

        default:
                System.out.print("You have Entered Invalid Choice............");
    }
    }
    

}