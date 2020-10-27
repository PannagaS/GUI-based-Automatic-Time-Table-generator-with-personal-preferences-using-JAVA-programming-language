package timetablegui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class login_window {

	private JFrame frmTimeTableGenerator;
	private JTextField userTextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_window window = new login_window();
					window.frmTimeTableGenerator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
					
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login_window() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTimeTableGenerator = new JFrame();
		frmTimeTableGenerator.setTitle("Time table generator | event 4 | Pannaga ");
		frmTimeTableGenerator.getContentPane().setBackground(new Color(255, 250, 205));
		frmTimeTableGenerator.getContentPane().setForeground(Color.BLACK);
		frmTimeTableGenerator.setBounds(100, 100, 861, 548);
		frmTimeTableGenerator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTimeTableGenerator.getContentPane().setLayout(null);
		
		JLabel passwordLabel = new JLabel("Password : ");
		JLabel userLabel = new JLabel("Username : ");
		passwordField = new JPasswordField();
		userTextField = new JTextField();
		
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 int  attempts = 4;
				while(attempts != 0 )
				{
				String user = userTextField.getText();
				String pass = passwordField.getText(); 
				if(user.equals("admin") && pass.equals("12345"))
				{
					JOptionPane.showMessageDialog(frmTimeTableGenerator,"Successfully logged in !");
					tt_new_gui tt;
					
					tt_new_gui.main(null);
					break;
				}
				
				else
				{	
					JOptionPane.showMessageDialog(frmTimeTableGenerator,"Sorry invalid login credentials , attempts left is " + attempts);
					//attemptsExceededTxtBox.setText(Integer.toString(attempts-1));
					attempts --;
				}
				
				if(attempts ==0)
				{
					JOptionPane.showMessageDialog(frmTimeTableGenerator, "Sorry, exceeded maximum number of attempts ! , try again after sometime ");
					break;
					/*
					try {
						int count =5;
						for(int i =0; i < 4 ;i++)
						{
						TimeUnit.SECONDS.sleep(1);
						 attemptsExceededTxtBox.setText("Try again after : " + Integer.toString(count) + "seconds");
						 attemptsExceededTxtBox.setText("");
						}
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}*/
				
				}
				}
				
			}
		});
		loginButton.setForeground(new Color(0, 0, 255));
		loginButton.setBackground(new Color(220, 220, 220));
		loginButton.setBounds(350, 368, 107, 38);
		frmTimeTableGenerator.getContentPane().add(loginButton);
		
		JButton resetButton = new JButton("Reset");
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField.setText("");
				userTextField.setText("");
			}
		});
		resetButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		resetButton.setForeground(new Color(0, 0, 0));
		resetButton.setBackground(new Color(220, 220, 220));
		resetButton.setBounds(174, 368, 107, 38);
		frmTimeTableGenerator.getContentPane().add(resetButton);
		
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exitButton.setForeground(new Color(255, 0, 0));
		exitButton.setBackground(new Color(220, 220, 220));
		exitButton.setBounds(523, 368, 107, 38);
		frmTimeTableGenerator.getContentPane().add(exitButton);
		
		
		userTextField.setBounds(297, 174, 241, 22);
		frmTimeTableGenerator.getContentPane().add(userTextField);
		userTextField.setColumns(10);
		
		
		userLabel.setForeground(new Color(0, 0, 0));
		userLabel.setBackground(new Color(0, 0, 0));
		userLabel.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		userLabel.setBounds(185, 172, 102, 25);
		frmTimeTableGenerator.getContentPane().add(userLabel);
		
		passwordLabel.setForeground(new Color(0, 0, 0));
		passwordLabel.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		passwordLabel.setBounds(197, 261, 86, 16);
		frmTimeTableGenerator.getContentPane().add(passwordLabel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		Image img = new ImageIcon(this.getClass().getResource("/sjce.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(297, 23, 280, 135);
		frmTimeTableGenerator.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		separator.setBackground(new Color(0, 0, 255));
		separator.setBounds(154, 146, 497, 200);
		frmTimeTableGenerator.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(255, 0, 0));
		separator_1.setBounds(154, 353, 497, 70);
		frmTimeTableGenerator.getContentPane().add(separator_1);
		
		
		passwordField.setBounds(297, 261, 241, 22);
		frmTimeTableGenerator.getContentPane().add(passwordField);
		
		
	}
}
