package org.unijac.ingesoft3;

import org.unijac.ingesoft3.fabric1.Connection;
import org.unijac.ingesoft3.fabric1.Fabric;

import javax.swing.*;

/**
 * Created by alexhd on 9/9/14.
 */
public class Accountancy {
    public static void main(String[] args) {
        String type = null;
        Fabric myFabric;
        Connection myConnection;

        JDialog.setDefaultLookAndFeelDecorated(true);
        Object[] selectionValues = { "Oracle", "SqlServer", "MySql", "Postgresql" };
        String initialSelection = "Oracle";
        do{
            type = (String) JOptionPane.showInputDialog(null, "Choose the right connection type:",
                    "Select database", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
        } while (type == null);
        myFabric = new Fabric(type);
        myConnection = myFabric.createConnection();
        JOptionPane.showMessageDialog(null, String.format("type : %s", myConnection.description()));
    }
}
