import java.util.Scanner;
public class if_statement {
    public static void main(String[] args){
        int pw;
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter Password:- ");
        pw = obj.nextInt();
        if(pw==202001){
        System.out.print("Name : Keshav Upadhyay\nClass: BCA \nATM Password: 4454");
        obj.close();  
        }
    }
}
