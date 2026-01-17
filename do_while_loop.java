import java.util.Scanner;
public class do_while_loop{
    public static void main (String[] args){
        int num;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter any Number: ");
        num = obj.nextInt();
        obj.close();
        do{
            System.out.print(num+" ");
            ++num;
             
        }
        while(num<=10);
   
    }
}
