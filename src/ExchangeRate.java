//exchangeRate.java
/*this program asks for the exchange rate and the calculates the conversion*/

import javax.swing.*;

public class ExchangeRate {

    public static void main(String[] args) {
        doCalc();
    }

    private static float doCalc() {

        float rate = Float.parseFloat(JOptionPane.showInputDialog(null, "What is the current exchange rate (GB£ TO EURO): "));

        float amount = Float.parseFloat(JOptionPane.showInputDialog(null, "What is the amount to be converted: "));

        float result = 0;


        while (amount != 0f) {
            result = amount * rate;

            JOptionPane.showMessageDialog(null,"The final amount after conversion is: "+result);

            amount = Float.parseFloat(JOptionPane.showInputDialog(null, "What is the amount to be converted: "));
        }

        return result;
    }
}
