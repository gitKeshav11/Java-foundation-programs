import java.util.Scanner;
public class While_loop{
    public static void main (String[] args){
        int num;
        Scanner obj=new Scanner (System.in);
        System.out.print("Enter any Number: ");
        num=obj.nextInt();
        obj.close();
        while(num>=0){
            if(num%2==0){
                System.out.println(num+" is a  Even Number");
                break;
            }
            else{
                System.out.println(num+" is a Odd Numer");
                break;
            }
        }
    }

}
            //    Second Program ......................Example

// import java.util.Scanner;

// public class Hacker{
//     public static void main(String[] args){
//         int num;
//         Scanner obj=new Scanner (System.in);
//         System.out.print("Enter any Number: ");
//         num=obj.nextInt();
//         while(num>=1){
//             System.out.print(num+" ");
//             --num;
//         }
//     }
// }