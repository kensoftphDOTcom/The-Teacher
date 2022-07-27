package theteacher;

import javax.swing.JOptionPane;

/**
 *
 * @author Kent
 */
public class site_runtime {

    public void execute(String link) {
        try {
            Process p;
            p = Runtime.getRuntime().exec("cmd /c start " + link);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
