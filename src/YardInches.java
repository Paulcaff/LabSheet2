//yardInches.java
/*This program converts yards to feet and to yards*/
import javax.swing.*;
import java.awt.*;

public class YardInches {

    public static void main(String[] args) {
    doCalc();
    }

    public static void doCalc(){

        JTextArea textArea = new JTextArea(5, 20);
        Font textAreaFont = new Font("monospaced", Font.PLAIN,12);
        FlowLayout layout = new FlowLayout();
        textArea.setFont(textAreaFont);

        textArea.setText(String.format("%-10s%-10s\n","Yards","Inches"));

        for(int i=1; i < 11; i++){

            int yards = i;
            int inches = i * 36;

            textArea.append(String.format("%-10s%-10s\n",yards,inches));


        }
        JOptionPane.showMessageDialog(null,textArea);

    }
}
