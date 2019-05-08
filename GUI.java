import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
/**
 * @author seklc
 */
public class GUI {
    private static Frame mainFrame;
    private static Panel topPanel;
    private static Panel bottomPanel;
    private static Button button1;
    private static Button button2;
    private static Button button3;
    private static Button button4;
    private static Label instructionLabel;
    private static Label pushedButton1;
    private static Label pushedButton2;
    private static Label pushedButton3;
    private static Label pushedButton4;
    private static FlowLayout centeredText;
    private static Font labelFont;
    
    
    public static void main(String args []){
        GUIMaker();
        eventHandlers();
    }
    
    public static void GUIMaker(){
        mainFrame = new Frame("World of Warcraft UI");
        
        mainFrame.setLayout(new BorderLayout());

        mainFrame.setSize(800,400);
        
        mainFrame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        
        centeredText = new FlowLayout(FlowLayout.CENTER,50,50);
        topPanel = new Panel(centeredText);
        bottomPanel = new Panel(centeredText);
        
        mainFrame.add(topPanel, BorderLayout.NORTH);
        mainFrame.add(bottomPanel, BorderLayout.SOUTH);
        
        button1 = new Button("Health");
        button2 = new Button("Armor");
        button3 = new Button("Mana");
        button4 = new Button("Energy");
        
        Dimension buttonSize = new Dimension(105,35);
        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize);
        button3.setPreferredSize(buttonSize);
        button4.setPreferredSize(buttonSize);
        
        Font buttonFont = new Font("",Font.ROMAN_BASELINE, 20);
        button1.setFont(buttonFont);
        button2.setFont(buttonFont);
        button3.setFont(buttonFont);
        button4.setFont(buttonFont);
        
        topPanel.add(button1);
        topPanel.add(button2);
        topPanel.add(button3);
        topPanel.add(button4);

        instructionLabel = new Label("Select combat text");
        pushedButton1 = new Label("You've selcted Health");
        pushedButton2 = new Label("You've selcted Armor");
        pushedButton3 = new Label ("You've selected Mana");
        pushedButton4 = new Label ("You've selected Energy");
        
        
        bottomPanel.add(instructionLabel);
        
        labelFont = new Font("",Font.ROMAN_BASELINE,35);
        instructionLabel.setFont(labelFont);
        pushedButton1.setFont(labelFont);
        pushedButton2.setFont(labelFont);
        pushedButton3.setFont(labelFont);
        pushedButton4.setFont(labelFont);
        
        
        instructionLabel.setForeground(Color.BLACK);
        pushedButton1.setForeground(Color.GREEN);
        pushedButton2.setForeground(Color.ORANGE);
        pushedButton3.setForeground(Color.BLUE);
        pushedButton4.setForeground(Color.YELLOW);
        mainFrame.setVisible(true);
    }
    
    
    
    public static void eventHandlers(){
        
        button1.addActionListener((ActionEvent ae) -> {
            bottomPanel.removeAll();
            bottomPanel.add(pushedButton1);
            mainFrame.setVisible(true);
        button2.addActionListener((ActionEvent ae1) -> {
            bottomPanel.removeAll();
            bottomPanel.add(pushedButton2);
            mainFrame.setVisible(true);
        button3.addActionListener((ActionEvent ae2) -> {
            bottomPanel.removeAll();
            bottomPanel.add(pushedButton3);
            mainFrame.setVisible(true);
            
                });        
        button4.addActionListener((ActionEvent ae2) -> {
            bottomPanel.removeAll();
            bottomPanel.add(pushedButton4);
            mainFrame.setVisible(true);
            
                });
            });
        });
        
    }
}
