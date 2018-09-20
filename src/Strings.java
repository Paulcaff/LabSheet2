import javax.swing.*;
import java.sql.SQLOutput;

public class Strings {
    public static void main(String[] args) {

        name();
    }

    public static void name() {
        String name = JOptionPane.showInputDialog(null, "Please enter your full name here including your middle name if applicable: ");
        int space=0;
        int len = name.length();

        int len2 = 0;

        for (int i = 0; i < name.length(); i++) {
            if (Character.isLetter(name.charAt(i))) {

                len2++;
            } else {
                int j = 0;
                j++;

            }
        }

        JOptionPane.showMessageDialog(null, len);

        JOptionPane.showMessageDialog(null, len2);

        char initial = name.charAt(0);
        JOptionPane.showMessageDialog(null, initial);

        String upper = name.toUpperCase();

        JOptionPane.showMessageDialog(null, upper);


        System.out.println(name.lastIndexOf(' '));

        int lastSpace = name.lastIndexOf(' ');

        for (int j = len2; j >= 0; j--) {
            if(name.charAt(j)==' '){
                space = j;
                break;
            }

            /*else {
                JOptionPane.showMessageDialog(null,"You only entered 1 name");
            }*/


        }

        //if(j==-1)

        int len3 = len - space;

        JOptionPane.showMessageDialog(null,"Your last name is"+name.substring(space,len));
    }
}
