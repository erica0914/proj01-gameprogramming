
/**
 * Erica Morales Salinas
 * CM 390: Game Programming
 * Project 1
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorChange extends JFrame
{
    private JButton pan1Button;
    private JButton pan2Button;
    private JPanel panel1;
    private JPanel panel2;
    private boolean panRed=false;
    private boolean panBlue=false;
    private int width=200;
    private int height=200;
    public ColorChange()
    {
        super("Proj01");
        
        ActionHandler ah=new ActionHandler();

        JPanel buttonPanel=new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel,BoxLayout.Y_AXIS));
        add(buttonPanel,BorderLayout.WEST);

        pan1Button=new JButton("Panel 1");
        pan1Button.addActionListener(ah);
        buttonPanel.add(pan1Button);

        pan2Button=new JButton("Panel 2");
        pan2Button.addActionListener(ah);
        buttonPanel.add(pan2Button);

        JPanel mainPanel=new JPanel();
        mainPanel.setLayout(new GridLayout(2,1));
        add(mainPanel);
        
        panel1=new JPanel();
        panel1.setPreferredSize(new Dimension(width,height));
        panel1.setBackground(Color.LIGHT_GRAY);
        mainPanel.add(panel1);
        
        panel2=new JPanel();
        panel2.setPreferredSize(new Dimension(width,height));
        panel2.setBackground(Color.LIGHT_GRAY);
        mainPanel.add(panel2);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,400);
        setVisible(true);
    }
    
    private class ActionHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==pan1Button)
            {
                if(panRed)
                {
                    panel1.setBackground(Color.LIGHT_GRAY);
                    panRed=false;
                }
                else
                {
                    panel1.setBackground(Color.RED);
                    panRed=true;
                }
            }
            else if(e.getSource()==pan2Button)
            {
                if(panBlue)
                {
                    panel2.setBackground(Color.LIGHT_GRAY);
                    panBlue=false;
                }
                else
                {
                    panel2.setBackground(Color.BLUE);
                    panBlue=true;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        new ColorChange();
    }
}