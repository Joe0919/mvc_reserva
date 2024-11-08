package utils;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JOEL
 */
public class funcions {

    public void Totalizar(DefaultTableModel df, int col, JTextField jt) {
        double t = 0;
        double p = 0;
        if (df.getRowCount() > 0) {
            for (int i = 0; i < df.getRowCount(); i++) {
                p = Double.parseDouble(df.getValueAt(i, col).toString());
                t += p;
            }
        } else {

            t = 0;
        }
        jt.setText("" + t);
    }
}
