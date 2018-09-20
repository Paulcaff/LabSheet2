import javax.swing.*;
import java.awt.*;

public class CarpetCost {

    public static void main(String[] args) {
        details();
    }

    public static void details(){
        JTextArea textArea = new JTextArea(5, 20);
        Font textAreaFont = new Font("monospaced", Font.PLAIN,12);
        textArea.setFont(textAreaFont);
        FlowLayout layout = new FlowLayout();
        textArea.setFont(textAreaFont);


        String name = JOptionPane.showInputDialog(null, "Please enter your name here: ");
        float length = Float.parseFloat(JOptionPane.showInputDialog(null,"Please enter the length of the room: "));
        float breadth = Float.parseFloat(JOptionPane.showInputDialog(null,"Please enter the breadth of the room: "));
        float cost = Float.parseFloat(JOptionPane.showInputDialog(null,"Please enter the cost of carpet per square metre: "));

     float area = length * breadth;
     float quote = area * cost;

        textArea.setText(String.format("%-50s\n","Quotation for "+name));

        textArea.append(String.format("%-40s%.2f%-5s\n%-40s%.2f%-5s\n%-40s%.2f%-5s\n%-40s%.2f%-5s\n%-40s%.2f%-5s\n","Length of Room",length," m.","Breadth of Room"
                ,breadth," m.","Total area of Room",area," sq. m","Cost per square metre of Carpet",cost," Euro","Total Cost of Carpet",quote," Euro"));

        JOptionPane.showMessageDialog(null,textArea);


    }



    }


