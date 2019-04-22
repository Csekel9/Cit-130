/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Panel;

/**
 *
 * @author collin.sekel
 */
public class GUI {

    private static Frame mainFrame;

    public static void main(String[] args) {
        GUIMaker();
    }

    private static void GUIMaker() {

        mainFrame = new Frame("AWT Simple Demo");

        mainFrame.setSize(500, 250);

        mainFrame.setVisible(true);

        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
                
            } // close windowClosing
        }); // close WindowListener
    }// close method GUIMaker
}// close Class
