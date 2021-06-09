 /**
 * Main.java
 * This is a user registration swing application
 * @author Kruben Naidoo (student-number)
 * Date: 28 April 2021
 */

package za.ac.cput.userregistration;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

 


public class Main extends JFrame {
     private JLabel lblCputHotel;
    private JLabel lblTitle;
    private JComboBox cboTitle;
    private JLabel lblErrorTitle;
     private Font ft;
      private JLabel lblFirstName;
    private JTextField txtFirstName;
    private JLabel lblErrorFirstName;

    private JLabel lblLastName;
    private JTextField txtLastName;
    private JLabel lblErrorLastName;

    private JLabel lblGender;
    private JPanel panelGender;
    private JRadioButton radMale;
    private JRadioButton radFemale;
    private ButtonGroup genderButtonGroup;
    private JLabel lblErrorGender;

    private JLabel lblPensioner;
    private JCheckBox chkPensioner;
    private JLabel lblErrorPensioner;

    
   
    
    
  
    
    private JButton btnPrevious;
    private JButton btnNext;
    private JButton btnExit;
    private Container c;
    
    
    public Main() {
        // this constructor is where we will initialise our instance variables
        super("User Registration");
         
       
         
         setTitle("WELCOM EXEPTER");
         setBounds(300,90,900,600);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setResizable(false);
         
         
    }
    
    public void setGUI() {
        // this place all gui components on the frame ... gridlayout(3 columns and 9 rows)
        
        this.setLayout(new GridLayout(7, 3));
        getContentPane().setBackground(Color.blue);
        setVisible(true);
        
        
         this.add(lblCputHotel);
        this.add(lblTitle);
        this.add(cboTitle);
        this.add(lblErrorTitle);
        
        
          this.add(lblFirstName);
        this.add(txtFirstName);
        this.add(lblErrorFirstName);

        this.add(lblLastName);
        this.add(txtLastName);
        this.add(lblErrorLastName);

        this.add(lblGender);
        this.add(panelGender);
        this.add(lblErrorGender);
        
        
          
        this.add(lblPensioner);
        this.add(chkPensioner);
        this.add(lblErrorPensioner);
        
       
        
        this.add(btnPrevious);
        this.add(btnNext);
        this.add(btnExit);
        
        btnNext.addActionListener((ActionListener) this);
        btnNext.addActionListener((ActionListener) this);
        btnExit.addActionListener((ActionListener) this);
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
   
    
   
   
    
    public static void main(String[] args) {
        
        new Main().setGUI();
    }
}
