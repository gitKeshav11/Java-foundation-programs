

import java.util.Scanner;

public class Else_If_Statement {
    public static void main(String[] args) {
        double marks;
        System.out.print("Enter Your Mark's Percentage: ");
        Scanner obj = new Scanner(System.in);
        marks = obj.nextDouble();
        obj.close();
        if(marks>=60 && marks<=100){
            System.out.print("First Division\nGood Marks");
        }
        else if(marks>=45 && marks<=60){
            System.out.println("Second Division\nEverage Marks");
        }
        else if(marks>=33 && marks<=45){
            System.out.println("Third Division\nPorr Marks");
        }
        else{
            System.out.print("You are Fail\n Try next Year For Exam");
        }

    }
}