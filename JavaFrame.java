import javax.swing.*;
import java.awt.*;

class JavaFrame{
    public static void main(String[] args){
        JFrame frame=new JFrame();
      //  frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //  frame.setSize(700,500);
      //  frame.setLocation(100,50);
        frame.setBounds(100,100,1000,500);  // set Location & Size
        frame.setTitle("My_Frame");

        ImageIcon icon=new ImageIcon("@Image.png");
        frame.setIconImage(icon.getImage());

        frame.setVisible(true);

        Container obj=frame.getContentPane();
        obj.setBackground(Color.GRAY);

        frame.setResizable(false);
    }
        }