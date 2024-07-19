package registration;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Main class for the registration application.
 */
public class registration {

    /**
     * Main method to run the application.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                form1 frame1 = new form1();
                frame1.setVisible(true);

                frame1.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        form2 frame2 = new form2();
                        frame2.setVisible(true);
                    }
                });
            }
        });
    }
}