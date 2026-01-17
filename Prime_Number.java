import java.util.Scanner;

public class Prime_Number {

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int i, m=0, count=0;
        int n;
        System.out.println("Enter Any Number:- ");
        n=scan.nextInt();
        m=n/2;

        if(n==0 || n==1 ){
            System.out.println(n+ "is not prime number...");
        }
        else{
            for(i=2; i<m; i++){
                if (n%i==0){
                    System.out.print(n+" is not prime number.....");
                    count=1;
                    break;
                }
            }

            if (count == 0){
                System.out.println(n+" is a Prime Number....");
            }
        }
    }
}
