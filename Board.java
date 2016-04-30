import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
import java.applet.Applet;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class Board
{
    JFrame mainFrame;
    JPanel mainPanel;
    JPanel topPanel;
    
    public Board()
    {
        mainFrame = new JFrame("Monopoly");
        mainFrame.setSize(1000,1000);
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createLineBorder(Color.black));
    }
    public void displayBoard()
    {
        topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(1,8));
        topPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        
        mainPanel.add(topPanel);
        this.drawBoard();
    }
    public void drawBoard()
    {
        mainFrame.add(mainPanel);
        mainFrame.setVisible(true);
    }
}
