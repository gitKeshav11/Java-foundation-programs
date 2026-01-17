import java.util.Scanner;

public class Break {
    public static void main(String[] args){
        int num,i;
        Scanner obj=new Scanner (System.in);
        System.out.println("Enter any Number: ");
        num=obj.nextInt();
        obj.close();
        for(i=1; i<=10; i++)
        {
            if(i==5) {
                break;           // It is use For Break ;
            }
            System.out.print(num*i+" ");
        }

    }
}
