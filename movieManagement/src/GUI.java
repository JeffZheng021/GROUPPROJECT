import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class GUI implements ActionListener{

    public GUI()
    {
        JFrame frame;
        JLabel title;
        JPanel panel;
        JButton button;

        frame = new JFrame();
        panel = new JPanel();

        button = new JButton("Continue");
        button.addActionListener(this);
        button.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                clear();
            } 
        });
        title = new JLabel("Netflix Managenment System");
        


        panel.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
        panel.add(title);
        panel.add(button);



        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("NetFlix Management System");
        frame.pack();
        frame.setVisible(true);

    }


    public static void main(String [] args)
    {
        new GUI();

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        // TODO Auto-generated method stub
        
    }
    public clear()
    {

    }
}

