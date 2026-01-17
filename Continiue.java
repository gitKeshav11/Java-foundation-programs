import java.util.Scanner;

public class Continiue {
    public static void main(String[] args) {
        int i;
        Scanner obj=new Scanner (System.in);
        System.out.print("Enter any Number: ");
        i= obj.nextInt();
        obj.close();
        for(i=1; i<=10; i++){
            if(i==5){
                continue;
            }
            System.out.print(i+" ");
        }


    }
}
