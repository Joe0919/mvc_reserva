package utils;

import java.awt.event.KeyEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author JOEL
 */
public class inputValidator {

    static public void Mayusculas(KeyEvent e) {
        if (Character.isLowerCase(e.getKeyChar())) {
            e.setKeyChar(("" + e.getKeyChar()).toUpperCase().charAt(0));
        }
    }

    static public void Numeros(KeyEvent e) {
        if (!Character.isDigit(e.getKeyChar())) {
            e.consume();
        }
    }

    static public void NumeroPunto(KeyEvent e) {
        char[] p = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.'};
        int b = 0;
        for (int i = 0; i <= 10; i++) {
            if (p[i] == e.getKeyChar()) {
                b = 1;
            }
        }
        if (b == 0) {
            e.consume();
        }
    }

    static public void Letras(KeyEvent evt) {
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != 32) && (c != '\u00f1') && (c != '\u00d1')) {
            evt.consume();//no permite que se ingrese 
        }
    }

    public void limitarcaracteres(JTextField tx, int cant, KeyEvent evt) {
        if (tx.getText().length() >= cant) {
            evt.consume();
        }
    }

    public void FinalText(JTextField tx) {
        int indice = tx.getText().length(); //retorna el numero de lineas
        tx.setCaretPosition(indice); //ubica el cursor al final
    }

    public void FinalPswText(JPasswordField jtx) {
        int indice = String.valueOf(jtx.getPassword()).length(); //retorna el numero de lineas
        jtx.setCaretPosition(indice); //ubica el cursor al final
    }
}
