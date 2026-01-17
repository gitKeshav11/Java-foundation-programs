public class Second{
int a = 10;                                 // instance variable
static double b=20.5;                       // static variable
public static void main(String[] args) {
    boolean c=true;                         // local variablee
      Second s=new Second();                //Object Name  
   // System.out.println(s.a);
   // System.out.println(b);
   // System.out.println(c);
                 // Or
    System.out.println(s.a+" "+b+" "+c);
}
}