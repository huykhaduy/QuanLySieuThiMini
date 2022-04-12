package BUS.Exception;

import javax.swing.*;

public class AbstractShowException extends Exception {

    public void displayException() {
        JOptionPane.showMessageDialog(null, this.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
