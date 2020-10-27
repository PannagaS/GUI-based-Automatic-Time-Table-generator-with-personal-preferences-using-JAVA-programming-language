package timetablegui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTree;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.Checkbox;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JList;

public class tt_gui  {
	
	private JFrame frmAutomaticTimetableGenerator;
	JLabel clockLabel = new JLabel("");
	JLabel DateLabel = new JLabel("");
	private JTextField noSubTxtFld;
	private JCheckBox digilabChckBx;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField txt5;
	private JTextField txt6;
	private JTextField txt7;
	private JTextField txt1;
	private JLabel maxLabel;
	private JComboBox m1cbx;
	private JComboBox t1cbx;
	private JComboBox w1cbx;
	private JComboBox th1cbx;
	private JComboBox f1cbx;
	private JComboBox s1cbx;
	
	private JComboBox m2cbx;
	private JComboBox t2cbx;
	private JComboBox w2cbx;
	private JComboBox th2cbx;
	private JComboBox f2cbx;
	private JComboBox s2cbx;
	
	JComboBox m3cbx;
	JComboBox t3cbx;
	JComboBox w3cbx;
	JComboBox th3cbx;
	JComboBox f3cbx;
	JComboBox s3cbx;
	
	JComboBox m4cbx;
	JComboBox t4cbx;
	JComboBox w4cbx;
	JComboBox th4cbx;
	JComboBox f4cbx;
	JComboBox s4cbx;
	
	JComboBox m5cbx;
	JComboBox t5cbx;
	JComboBox w5cbx;
	JComboBox th5cbx;
	JComboBox f5cbx;
	JComboBox s5cbx;
	
	JComboBox m6cbx;
	JComboBox t6cbx;
	JComboBox w6cbx;
	JComboBox th6cbx;
	JComboBox f6cbx;
	JComboBox s6cbx;
	
	JComboBox m7cbx;
	JComboBox t7cbx;
	JComboBox w7cbx;
	JComboBox th7cbx;
	JComboBox f7cbx;
	JComboBox s7cbx;
	JCheckBox m1,t1,w1,th1,f1,s1,m2,t2,w2,th2,f2,s2,m3,t3,w3,th3,f3,s3,m4,t4,w4,th4,f4,s4,m5,t5,w5,th5,f5,s5,m6,t6,w6,th6,f6,s6,m7,t7,w7,th7,f7,s7;
	/**
	 * Launch the application.
	 */
	int noOfSub  = 0;
	int classes = 4;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tt_gui window = new tt_gui();
					window.frmAutomaticTimetableGenerator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void clock()
	{
		Thread clock = new Thread()
				{
					public void run()
					{
						try
						{
							while(true)
							{
								Calendar cal = new GregorianCalendar();
								int day = cal.get(Calendar.DAY_OF_MONTH);
								int month = cal.get(Calendar.MONTH);
								int year = cal.get(Calendar.DAY_OF_MONTH);
								
								int second = cal.get(Calendar.SECOND);
								int minute = cal.get(Calendar.MINUTE);
								int hour = cal.get(Calendar.HOUR);
								clockLabel.setText((hour+12) + " : " + minute + " : " + second);
								//clockLabel.setText("\n");
								DateLabel.setText( " " + day + " / " + month + " / " + (year + 3));
								
								sleep(1000);
							}
						}
						catch(InterruptedException e )
						{
							e.printStackTrace();
						}
					}
				};
				clock.start();
	}
	
	/**
	 * Create the application.
	 * 
	 */
	public tt_gui() {
		
		initialize();
		clock();
	}
	

	
	/**
	 * Initialize the contents of the frame.
	 * 
	 */
	private void initialize()  {
		frmAutomaticTimetableGenerator = new JFrame();
		frmAutomaticTimetableGenerator.getContentPane().setBackground(new Color(255, 255, 255));
		frmAutomaticTimetableGenerator.setTitle("Automatic timetable generator using personal preferences");
		frmAutomaticTimetableGenerator.getContentPane().setFont(new Font("Serif", Font.ITALIC, 13));
		frmAutomaticTimetableGenerator.setBounds(100, 100, 1199, 777);
		frmAutomaticTimetableGenerator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAutomaticTimetableGenerator.getContentPane().setLayout(null);
		
		/*
		 * For scrolling text
		
		tt_gui scroll = new tt_gui();	
		scroll.start();
		
		frmAutomaticTimetableGenerator.getContentPane().add(scroll);
		frmAutomaticTimetableGenerator.setVisible(true);
		*/
		
		JLabel title = new JLabel("Time table generator");
		title.setBackground(new Color(0, 0, 0));
		title.setForeground(new Color(255, 69, 0));
		title.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 30));
		title.setBounds(434, 29, 376, 50);
		frmAutomaticTimetableGenerator.getContentPane().add(title);
		
		JLabel lblNewLabel = new JLabel("JSS Science and Technology University ( Formerly SJCE)");
		lblNewLabel.setForeground(new Color(0, 51, 255));
		lblNewLabel.setBackground(new Color(255, 200, 0));
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD, 23));
		lblNewLabel.setBounds(12, 0, 710, 34);
		frmAutomaticTimetableGenerator.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"A", "B"}));
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(arg0.getStateChange()==ItemEvent.SELECTED)
				{
					
				}
			}
		});
		comboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		
		});
		comboBox.setMaximumRowCount(2);
		comboBox.setToolTipText("");
		comboBox.setBounds(121, 105, 64, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(comboBox);
		
		JLabel txtSec = new JLabel("Section :");
		txtSec.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		txtSec.setBounds(27, 102, 82, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(txtSec);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"SPK", "EAM", "GHM", "SBR", "MSV", "MS"}));
		comboBox_1.setBounds(121, 183, 66, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_1 = new JLabel("Faculty:");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(27, 175, 82, 34);
		frmAutomaticTimetableGenerator.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Faculty \t\t                           Time slot                      Working days");
		lblNewLabel_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_2.setBounds(27, 306, 581, 44);
		frmAutomaticTimetableGenerator.getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"EC610", "EC620", "EC630", "EC640", "EC650", "EC660"}));
		comboBox_2.setToolTipText("");
		comboBox_2.setBounds(523, 106, 64, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(comboBox_2);
		
		JLabel lblNewLabel_3 = new JLabel("Subject code:");
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(399, 99, 125, 37);
		frmAutomaticTimetableGenerator.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(783, 667, 97, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.setBounds(657, 667, 97, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Generate");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				generate_window g;
				generate_window.main(null);
			}
		});
		btnNewButton_3.setBounds(523, 667, 97, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_5 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/sjce.png")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img4));
		lblNewLabel_5.setBounds(929, 38, 240, 131);
		frmAutomaticTimetableGenerator.getContentPane().add(lblNewLabel_5);
		
		
		clockLabel.setForeground(new Color(255, 0, 0));
		clockLabel.setBackground(new Color(255, 255, 224));
		clockLabel.setFont(new Font("Tahoma", Font.BOLD, 37));
		
		
		clockLabel.setBounds(929, 466, 222, 50);
		frmAutomaticTimetableGenerator.getContentPane().add(clockLabel);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		Image img5 = new ImageIcon(this.getClass().getResource("/resized apj.png")).getImage();
		lblNewLabel_6.setIcon(new ImageIcon(img5));
		lblNewLabel_6.setBounds(929, 175, 229, 114);
		frmAutomaticTimetableGenerator.getContentPane().add(lblNewLabel_6);
		DateLabel.setForeground(new Color(0, 0, 255));
		DateLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		
		DateLabel.setBounds(942, 550, 209, 50);
		frmAutomaticTimetableGenerator.getContentPane().add(DateLabel);
		
		JLabel lblNewLabel_7 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/yellow.png")).getImage();
		lblNewLabel_7.setIcon(new ImageIcon(img1));
		lblNewLabel_7.setBounds(12, 653, 903, 64);
		frmAutomaticTimetableGenerator.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_9 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/blue 1.png")).getImage();
		lblNewLabel_9.setIcon(new ImageIcon(img2));
		lblNewLabel_9.setBounds(12, 13, 903, 16);
		frmAutomaticTimetableGenerator.getContentPane().add(lblNewLabel_9);
		
		JRadioButton ab104Btn = new JRadioButton("AB104");
		ab104Btn.setBackground(new Color(255, 255, 255));
		ab104Btn.setBounds(732, 105, 127, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(ab104Btn);
		
		JLabel RoomLbl = new JLabel("Room :");
		RoomLbl.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		RoomLbl.setBounds(657, 105, 98, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(RoomLbl);
		
		JRadioButton nps1Btn = new JRadioButton("NPS001");
		nps1Btn.setBackground(new Color(255, 255, 255));
		nps1Btn.setBounds(732, 144, 127, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(nps1Btn);
		
		JRadioButton nps2Btn = new JRadioButton("NPS002");
		nps2Btn.setBackground(new Color(204, 204, 153));
		nps2Btn.setBounds(732, 185, 127, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(nps2Btn);
		
		JRadioButton ev204Btn = new JRadioButton("EV204");
		ev204Btn.setBackground(new Color(204, 204, 153));
		ev204Btn.setBounds(732, 220, 127, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(ev204Btn);
		
		JRadioButton ev205Btn = new JRadioButton("EV205");
		ev205Btn.setBackground(new Color(204, 204, 153));
		ev205Btn.setBounds(732, 254, 127, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(ev205Btn);
		
		JLabel noSubLbl = new JLabel("No. of Subjects : ");
		noSubLbl.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		noSubLbl.setBounds(216, 184, 158, 16);
		frmAutomaticTimetableGenerator.getContentPane().add(noSubLbl);
		
		noSubTxtFld = new JTextField();
		noSubTxtFld.setBounds(369, 184, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(noSubTxtFld);
		noSubTxtFld.setColumns(10);
		
		JLabel condLbl = new JLabel("(Max 7)");
		condLbl.setBounds(424, 187, 56, 16);
		frmAutomaticTimetableGenerator.getContentPane().add(condLbl);
		
		JLabel labLbl = new JLabel("Labs  :");
		labLbl.setBackground(new Color(102, 255, 255));
		labLbl.setForeground(new Color(255, 255, 255));
		labLbl.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		labLbl.setBounds(683, 411, 82, 16);
		frmAutomaticTimetableGenerator.getContentPane().add(labLbl);
		
		JCheckBox diChckBx = new JCheckBox("Design and Implmentation Lab ");
		diChckBx.setBackground(new Color(0, 0, 0));
		diChckBx.setForeground(new Color(255, 255, 255));
		diChckBx.setBounds(683, 436, 216, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(diChckBx);
		
		JCheckBox cmosLabChckBx = new JCheckBox("CMOS VLSI Lab");
		cmosLabChckBx.setForeground(new Color(255, 255, 255));
		cmosLabChckBx.setBackground(new Color(0, 0, 0));
		cmosLabChckBx.setBounds(683, 466, 189, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(cmosLabChckBx);
		
		JCheckBox advCmnChckBx = new JCheckBox("Advanced Communications Lab");
		advCmnChckBx.setForeground(new Color(255, 255, 255));
		advCmnChckBx.setBackground(new Color(0, 0, 0));
		advCmnChckBx.setBounds(683, 496, 216, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(advCmnChckBx);
		
		JCheckBox microChckBx = new JCheckBox("Microcontroller Lab");
		microChckBx.setForeground(new Color(255, 255, 255));
		microChckBx.setBackground(new Color(0, 0, 0));
		microChckBx.setBounds(683, 526, 216, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(microChckBx);
		
		digilabChckBx = new JCheckBox("Digital Lab ");
		digilabChckBx.setForeground(new Color(255, 255, 255));
		digilabChckBx.setBackground(new Color(0, 0, 0));
		digilabChckBx.setBounds(683, 556, 113, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(digilabChckBx);
		
		JLabel maxLabel;
		maxLabel = new JLabel("(Max 3)");
		maxLabel.setForeground(new Color(255, 255, 255));
		maxLabel.setBounds(748, 413, 56, 16);
		frmAutomaticTimetableGenerator.getContentPane().add(maxLabel);
		
		txt2 = new JTextField();
		txt2.setEnabled(false);
		txt2.setBounds(27, 407, 116, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(txt2);
		txt2.setColumns(10);
		
		txt3 = new JTextField();
		txt3.setEnabled(false);
		txt3.setBounds(27, 437, 116, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(txt3);
		txt3.setColumns(10);
		
		txt4 = new JTextField();
		txt4.setEnabled(false);
		txt4.setBounds(27, 467, 116, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(txt4);
		txt4.setColumns(10);
		
		txt5 = new JTextField();
		txt5.setEnabled(false);
		txt5.setBounds(27, 497, 116, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(txt5);
		txt5.setColumns(10);
		
		txt6 = new JTextField();
		txt6.setEnabled(false);
		txt6.setBounds(27, 527, 116, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(txt6);
		txt6.setColumns(10);
		
		txt7 = new JTextField();
		txt7.setEnabled(false);
		txt7.setBounds(27, 557, 116, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(txt7);
		txt7.setColumns(10);
		
		txt1 = new JTextField();
		txt1.setEnabled(false);
		txt1.setBounds(27, 372, 116, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		 m1 = new JCheckBox("");
		m1.setEnabled(false);
		m1.setBackground(new Color(204, 204, 102));
		m1.setBounds(151, 372, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(m1);
		
		 t1 = new JCheckBox("");
		t1.setEnabled(false);
		t1.setBackground(new Color(204, 204, 102));
		t1.setBounds(240, 372, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(t1);
		
		 w1 = new JCheckBox("");
		w1.setEnabled(false);
		w1.setBackground(new Color(204, 204, 102));
		w1.setBounds(329, 372, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(w1);
		
		 th1 = new JCheckBox("");
		th1.setEnabled(false);
		th1.setBackground(new Color(204, 204, 102));
		th1.setBounds(418, 372, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(th1);
		
		 f1 = new JCheckBox("");
		f1.setEnabled(false);
		f1.setBackground(new Color(204, 204, 102));
		f1.setBounds(507, 372, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(f1);
		
		 s1 = new JCheckBox("");
		s1.setEnabled(false);
		s1.setBackground(new Color(204, 204, 153));
		s1.setBounds(595, 372, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(s1);
		
		 s2 = new JCheckBox("");
		s2.setEnabled(false);
		s2.setBackground(new Color(204, 204, 153));
		s2.setBounds(595, 402, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(s2);
		
		 m2 = new JCheckBox("");
		m2.setEnabled(false);
		m2.setBackground(new Color(204, 204, 102));
		m2.setBounds(151, 404, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(m2);
		
		 t2 = new JCheckBox("");
		t2.setEnabled(false);
		t2.setBackground(new Color(204, 204, 102));
		t2.setBounds(240, 402, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(t2);
		
		 w2 = new JCheckBox("");
		w2.setEnabled(false);
		w2.setBackground(new Color(204, 204, 102));
		w2.setBounds(329, 402, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(w2);
		
		 th2 = new JCheckBox("");
		th2.setEnabled(false);
		th2.setBackground(new Color(204, 204, 102));
		th2.setBounds(418, 402, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(th2);
		
		 f2 = new JCheckBox("");
		f2.setEnabled(false);
		f2.setBackground(new Color(204, 204, 153));
		f2.setBounds(507, 402, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(f2);
		
		 s3 = new JCheckBox("");
		s3.setEnabled(false);
		s3.setBackground(new Color(204, 204, 153));
		s3.setBounds(595, 436, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(s3);
		
		 m3 = new JCheckBox("");
		m3.setEnabled(false);
		m3.setBackground(new Color(204, 204, 102));
		m3.setBounds(151, 436, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(m3);
		
		 t3 = new JCheckBox("");
		t3.setEnabled(false);
		t3.setBackground(new Color(204, 204, 102));
		t3.setBounds(240, 436, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(t3);
		
		 w3 = new JCheckBox("");
		w3.setEnabled(false);
		w3.setBackground(new Color(204, 204, 102));
		w3.setBounds(329, 436, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(w3);
		
		 th3 = new JCheckBox("");
		th3.setEnabled(false);
		th3.setBackground(new Color(204, 204, 102));
		th3.setBounds(418, 436, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(th3);
		
		 f3 = new JCheckBox("");
		f3.setEnabled(false);
		f3.setBackground(new Color(204, 204, 153));
		f3.setBounds(507, 436, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(f3);
		
		 s4 = new JCheckBox("");
		s4.setEnabled(false);
		s4.setBackground(new Color(204, 204, 153));
		s4.setBounds(595, 466, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(s4);
		
		 m4 = new JCheckBox("");
		m4.setEnabled(false);
		m4.setBackground(new Color(204, 204, 102));
		m4.setBounds(151, 466, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(m4);
		
		 t4 = new JCheckBox("");
		t4.setEnabled(false);
		t4.setBackground(new Color(204, 204, 102));
		t4.setBounds(240, 466, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(t4);
		
		 w4 = new JCheckBox("");
		w4.setEnabled(false);
		w4.setBackground(new Color(204, 204, 102));
		w4.setBounds(329, 466, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(w4);
		
		 th4 = new JCheckBox("");
		th4.setEnabled(false);
		th4.setBackground(new Color(204, 204, 102));
		th4.setBounds(418, 466, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(th4);
		
		 f4 = new JCheckBox("");
		f4.setEnabled(false);
		f4.setBackground(new Color(204, 204, 153));
		f4.setBounds(507, 466, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(f4);
		
		 s5 = new JCheckBox("");
		s5.setEnabled(false);
		s5.setBackground(new Color(204, 204, 153));
		s5.setBounds(595, 496, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(s5);
		
		 m5 = new JCheckBox("");
		m5.setEnabled(false);
		m5.setBackground(new Color(204, 204, 102));
		m5.setBounds(151, 496, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(m5);
		
		t5 = new JCheckBox("");
		t5.setEnabled(false);
		t5.setBackground(new Color(204, 204, 102));
		t5.setBounds(240, 496, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(t5);
		
		 w5 = new JCheckBox("");
		w5.setEnabled(false);
		w5.setBackground(new Color(204, 204, 51));
		w5.setBounds(329, 496, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(w5);
		
		 th5 = new JCheckBox("");
		th5.setEnabled(false);
		th5.setBackground(new Color(204, 204, 102));
		th5.setBounds(418, 496, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(th5);
		
		 f5 = new JCheckBox("");
		f5.setEnabled(false);
		f5.setBackground(new Color(204, 204, 153));
		f5.setBounds(507, 496, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(f5);
		
		 s6 = new JCheckBox("");
		s6.setEnabled(false);
		s6.setBackground(new Color(204, 204, 153));
		s6.setBounds(595, 526, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(s6);
		
		 m6 = new JCheckBox("");
		m6.setEnabled(false);
		m6.setBackground(new Color(204, 204, 102));
		m6.setBounds(151, 526, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(m6);
		
		 t6 = new JCheckBox("");
		t6.setEnabled(false);
		t6.setBackground(new Color(204, 204, 102));
		t6.setBounds(240, 526, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(t6);
		
		 w6 = new JCheckBox("");
		w6.setEnabled(false);
		w6.setBackground(new Color(204, 204, 102));
		w6.setBounds(329, 526, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(w6);
		
		 th6 = new JCheckBox("");
		th6.setEnabled(false);
		th6.setBackground(new Color(204, 204, 153));
		th6.setBounds(418, 526, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(th6);
		
		 f6 = new JCheckBox("");
		f6.setEnabled(false);
		f6.setBackground(new Color(204, 204, 153));
		f6.setBounds(507, 526, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(f6);
		
		 s7 = new JCheckBox("");
		s7.setEnabled(false);
		s7.setBackground(new Color(204, 204, 153));
		s7.setBounds(595, 556, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(s7);
		
		 m7 = new JCheckBox("");
		m7.setEnabled(false);
		m7.setBackground(new Color(204, 204, 102));
		m7.setBounds(151, 556, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(m7);
		
		 t7 = new JCheckBox("");
		t7.setEnabled(false);
		t7.setBackground(new Color(204, 204, 102));
		t7.setBounds(240, 556, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(t7);
		
		 w7 = new JCheckBox("");
		w7.setEnabled(false);
		w7.setBackground(new Color(204, 204, 153));
		w7.setBounds(329, 556, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(w7);
		
		 th7 = new JCheckBox("");
		th7.setEnabled(false);
		th7.setBackground(new Color(204, 204, 153));
		th7.setBounds(418, 556, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(th7);
		
		f7 = new JCheckBox("");
		f7.setEnabled(false);
		f7.setBackground(new Color(204, 204, 153));
		f7.setBounds(507, 556, 25, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(f7);
		
		JLabel lblNewLabel_10 = new JLabel("M      T       W      Th      F       S");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setBounds(434, 344, 201, 16);
		frmAutomaticTimetableGenerator.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("JSS MAHAVIDYAPEETHA");
		lblNewLabel_11.setForeground(new Color(255, 0, 0));
		lblNewLabel_11.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblNewLabel_11.setBackground(new Color(102, 255, 255));
		lblNewLabel_11.setBounds(984, 13, 167, 28);
		frmAutomaticTimetableGenerator.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_4;
		JLabel lbl = new JLabel("");
		lbl.setBackground(new Color(204, 204, 153));
		Image img3 = new ImageIcon(this.getClass().getResource("/ec3.png")).getImage();
		lbl.setIcon(new ImageIcon(img3));
		lbl.setBounds(12, 29, 918, 625);
		frmAutomaticTimetableGenerator.getContentPane().add(lbl);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(102, 0, 255));
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(929, 13, 240, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(204, 0, 255));
		separator_1.setBounds(929, 526, 240, 106);
		frmAutomaticTimetableGenerator.getContentPane().add(separator_1);
		
		// Combo boxes
		JButton btnNewButton = new JButton("clear");
		btnNewButton.setBounds(523, 183, 64, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(btnNewButton);
		
		 m1cbx = new JComboBox();
		
		m1cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		m1cbx.setBounds(184, 375, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(m1cbx);
		
		 t1cbx = new JComboBox();
		t1cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		t1cbx.setBounds(273, 375, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(t1cbx);
		
		 w1cbx = new JComboBox();
		w1cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		w1cbx.setBounds(362, 375, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(w1cbx);
		
		 th1cbx = new JComboBox();
		th1cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		th1cbx.setBounds(451, 375, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(th1cbx);
		
		 f1cbx = new JComboBox();
		f1cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		f1cbx.setBounds(540, 372, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(f1cbx);
		
		 s1cbx = new JComboBox();
		s1cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		s1cbx.setBounds(628, 372, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(s1cbx);
		
		 m2cbx = new JComboBox();
		m2cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		m2cbx.setBounds(184, 407, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(m2cbx);
		
		 m3cbx = new JComboBox();
		m3cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		m3cbx.setBounds(184, 437, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(m3cbx);
		
		 m4cbx = new JComboBox();
		m4cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		m4cbx.setBounds(184, 466, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(m4cbx);
		
		 m5cbx = new JComboBox();
		m5cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		m5cbx.setBounds(184, 497, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(m5cbx);
		
		 m6cbx = new JComboBox();
		m6cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		m6cbx.setBounds(184, 527, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(m6cbx);
		
		 m7cbx = new JComboBox();
		m7cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		m7cbx.setBounds(184, 557, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(m7cbx);
		
		 t2cbx = new JComboBox();
		t2cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		t2cbx.setBounds(273, 405, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(t2cbx);
		
		 t3cbx = new JComboBox();
		t3cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		t3cbx.setBounds(273, 437, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(t3cbx);
		
		 t4cbx = new JComboBox();
		t4cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		t4cbx.setBounds(273, 467, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(t4cbx);
		
		 t5cbx = new JComboBox();
		t5cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		t5cbx.setBounds(273, 494, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(t5cbx);
		
		 t6cbx = new JComboBox();
		t6cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		t6cbx.setBounds(273, 527, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(t6cbx);
		
		 t7cbx = new JComboBox();
		t7cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		t7cbx.setBounds(273, 557, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(t7cbx);
		
		 w2cbx = new JComboBox();
		w2cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		w2cbx.setBounds(362, 407, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(w2cbx);
		
		 w3cbx = new JComboBox();
		w3cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		w3cbx.setBounds(362, 437, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(w3cbx);
		
		w4cbx = new JComboBox();
		w4cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		w4cbx.setBounds(362, 467, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(w4cbx);
		
		 w5cbx = new JComboBox();
		w5cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		w5cbx.setBounds(362, 497, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(w5cbx);
		
		 w6cbx = new JComboBox();
		w6cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		w6cbx.setBounds(362, 527, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(w6cbx);
		
		 w7cbx = new JComboBox();
		w7cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		w7cbx.setBounds(362, 557, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(w7cbx);
		
		 th2cbx = new JComboBox();
		th2cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		th2cbx.setBounds(451, 405, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(th2cbx);
		
		 th3cbx = new JComboBox();
		th3cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		th3cbx.setBounds(451, 437, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(th3cbx);
		
		 th4cbx = new JComboBox();
		th4cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		th4cbx.setBounds(451, 466, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(th4cbx);
		
		 th5cbx = new JComboBox();
		th5cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		th5cbx.setBounds(451, 497, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(th5cbx);
		
		 th6cbx = new JComboBox();
		th6cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		th6cbx.setBounds(451, 527, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(th6cbx);
		
		 th7cbx = new JComboBox();
		th7cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		th7cbx.setBounds(451, 557, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(th7cbx);
		
		 f2cbx = new JComboBox();
		f2cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		f2cbx.setBounds(540, 402, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(f2cbx);
		
		 f3cbx = new JComboBox();
		f3cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		f3cbx.setBounds(539, 437, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(f3cbx);
		
		 f4cbx = new JComboBox();
		f4cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		f4cbx.setBounds(540, 466, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(f4cbx);
		
		 f5cbx = new JComboBox();
		f5cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		f5cbx.setBounds(540, 497, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(f5cbx);
		
		 f6cbx = new JComboBox();
		f6cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		f6cbx.setBounds(540, 527, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(f6cbx);
		
		 f7cbx = new JComboBox();
		f7cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		f7cbx.setBounds(540, 557, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(f7cbx);
		
		 s2cbx = new JComboBox();
		s2cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		s2cbx.setBounds(628, 402, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(s2cbx);
		
		 s3cbx = new JComboBox();
		s3cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		s3cbx.setBounds(627, 437, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(s3cbx);
		
		 s4cbx = new JComboBox();
		s4cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		s4cbx.setBounds(628, 466, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(s4cbx);
		
		 s5cbx = new JComboBox();
		s5cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		s5cbx.setBounds(628, 494, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(s5cbx);
		
		 s6cbx = new JComboBox();
		s6cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		s6cbx.setBounds(628, 527, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(s6cbx);
		
		 s7cbx = new JComboBox();
		s7cbx.setModel(new DefaultComboBoxModel(new String[] {"slot1", "slot2"}));
		s7cbx.setBounds(627, 557, 48, 22);
		frmAutomaticTimetableGenerator.getContentPane().add(s7cbx);
		
		JLabel x = new JLabel("Slot 1 : 7:30am - 1:30pm    Slot 2 : 11:00am - 5:30pm");
		x.setBounds(224, 592, 332, 40);
		frmAutomaticTimetableGenerator.getContentPane().add(x);
		
		
		
		
		//
		
		
		
		
		JCheckBox subChckBx = new JCheckBox("ok\r\n");
		subChckBx.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(subChckBx.isSelected())
				{
					noOfSub = Integer.parseInt(noSubTxtFld.getText());
					
					
					alloc(noOfSub);
				}
			}
			
			
		});
		subChckBx.setBounds(474, 183, 48, 25);
		frmAutomaticTimetableGenerator.getContentPane().add(subChckBx);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				noSubTxtFld.setText(null);
				txt1.setEnabled(false);
				
				m1.setEnabled(false);
				t1.setEnabled(false);
				w1.setEnabled(false);
				th1.setEnabled(false);
				f1.setEnabled(false);
				s1.setEnabled(false);
				txt2.setEnabled(false);
				
				m2.setEnabled(false);
				t2.setEnabled(false);
				w2.setEnabled(false);
				th2.setEnabled(false);
				f2.setEnabled(false);
				s2.setEnabled(false);
				txt3.setEnabled(false);
				
				m3.setEnabled(false);
				t3.setEnabled(false);
				w3.setEnabled(false);
				th3.setEnabled(false);
				f3.setEnabled(false);
				s3.setEnabled(false);
				txt4.setEnabled(false);
				
				m4.setEnabled(false);
				t4.setEnabled(false);
				w4.setEnabled(false);
				th4.setEnabled(false);
				f4.setEnabled(false);
				s4.setEnabled(false);
				txt5.setEnabled(false);
				
				m5.setEnabled(false);
				t5.setEnabled(false);
				w5.setEnabled(false);
				th5.setEnabled(false);
				f5.setEnabled(false);
				s5.setEnabled(false);
				txt6.setEnabled(false);
				
				m6.setEnabled(false);
				t6.setEnabled(false);
				w6.setEnabled(false);
				th6.setEnabled(false);
				f6.setEnabled(false);
				s6.setEnabled(false);
				txt7.setEnabled(false);
				
				m7.setEnabled(false);
				t7.setEnabled(false);
				w7.setEnabled(false);
				th7.setEnabled(false);
				f7.setEnabled(false);
				s7.setEnabled(false);
			
				m1cbx.setEnabled(false);
				t1cbx.setEnabled(false);
				w1cbx.setEnabled(false);
				th1cbx.setEnabled(false);
				f1cbx.setEnabled(false);
				s1cbx.setEnabled(false);
				
				m2cbx.setEnabled(false);
				t2cbx.setEnabled(false);
				w2cbx.setEnabled(false);
				th2cbx.setEnabled(false);
				f2cbx.setEnabled(false);
				s2cbx.setEnabled(false);
				
				m3cbx.setEnabled(false);
				t3cbx.setEnabled(false);
				w3cbx.setEnabled(false);
				th3cbx.setEnabled(false);
				f3cbx.setEnabled(false);
				s3cbx.setEnabled(false);
				
				m4cbx.setEnabled(false);
				t4cbx.setEnabled(false);
				w4cbx.setEnabled(false);
				th4cbx.setEnabled(false);
				f4cbx.setEnabled(false);
				s4cbx.setEnabled(false);
				
				m5cbx.setEnabled(false);
				t5cbx.setEnabled(false);
				w5cbx.setEnabled(false);
				th5cbx.setEnabled(false);
				f5cbx.setEnabled(false);
				s5cbx.setEnabled(false);
				
				m6cbx.setEnabled(false);
				t6cbx.setEnabled(false);
				w6cbx.setEnabled(false);
				th6cbx.setEnabled(false);
				f6cbx.setEnabled(false);
				s6cbx.setEnabled(false);
			
				m7cbx.setEnabled(false);
				t7cbx.setEnabled(false);
				w7cbx.setEnabled(false);
				th7cbx.setEnabled(false);
				f7cbx.setEnabled(false);
				s7cbx.setEnabled(false);
			}
			});
		
		
		
		//TeachingHrs();
	}

	protected void TeachingHrs() {
		// TODO Auto-generated method stub
		String option[][]=new String [6][6];
		boolean flag = true;
		int r1=4,r2=4,r3=4,r4=4,r5=4,r6=4,r7=4;
		while(flag)
		{
			while(r1!=0)
			{
			if(m1.isSelected())
			{
				 option[0][0] = m1cbx.getSelectedItem().toString();
				r1--;
				
			}
			if(t1.isSelected())
			{
				 option[0][1] = t1cbx.getSelectedItem().toString();
				r1--;
			}
			if(w1.isSelected())
			{
				 option[0][2] = w1cbx.getSelectedItem().toString();
				r1--;
				
			}
			if(th1.isSelected())
			{
				 option[0][3] = th1cbx.getSelectedItem().toString();
				r1--;
			}
			if(f1.isSelected())
			{
				 option[0][4] = f1cbx.getSelectedItem().toString();
				r1--;
				
			}
			if(s1.isSelected())
			{
				 option[0][5] = s1cbx.getSelectedItem().toString();
				r1--;
			}
			}
			
			while(r2!=0)
			{
			if(m2.isSelected())
			{
				 option[1][0] = m2cbx.getSelectedItem().toString();
				r2--;
				
			}
			if(t2.isSelected())
			{
				 option[1][1] = t2cbx.getSelectedItem().toString();
				r2--;
			}
			if(w2.isSelected())
			{
				 option[1][2] = w2cbx.getSelectedItem().toString();
				r2--;
				
			}
			if(th2.isSelected())
			{
				 option[1][3] = th2cbx.getSelectedItem().toString();
				r2--;
			}
			if(f2.isSelected())
			{
				 option[1][4] = f2cbx.getSelectedItem().toString();
				r2--;
				
			}
			if(s2.isSelected())
			{
				 option[1][5] = s2cbx.getSelectedItem().toString();
				r2--;
			}
			}
			while(r3!=0)
			{
			if(m3.isSelected())
			{
				 option[2][0] = m3cbx.getSelectedItem().toString();
				r3--;
				
			}
			if(t3.isSelected())
			{
				 option[2][1] = t3cbx.getSelectedItem().toString();
				r3--;
			}
			if(w3.isSelected())
			{
				 option[2][2] = w3cbx.getSelectedItem().toString();
				r3--;
				
			}
			if(th3.isSelected())
			{
				 option[2][3] = th3cbx.getSelectedItem().toString();
				r3--;
			}
			if(f3.isSelected())
			{
				 option[2][4] = f3cbx.getSelectedItem().toString();
				r3--;
				
			}
			if(s3.isSelected())
			{
				 option[2][5] = s3cbx.getSelectedItem().toString();
				r3--;
			}
			}
			
			while(r4!=0)
			{
			if(m4.isSelected())
			{
				 option[3][0] = m4cbx.getSelectedItem().toString();
				r4--;
				
			}
			if(t4.isSelected())
			{
				 option[3][1] = t4cbx.getSelectedItem().toString();
				r4--;
			}
			if(w4.isSelected())
			{
				 option[3][2] = w4cbx.getSelectedItem().toString();
				r4--;
				
			}
			if(th4.isSelected())
			{
				 option[3][3] = th4cbx.getSelectedItem().toString();
				r4--;
			}
			if(f4.isSelected())
			{
				 option[3][4] = f4cbx.getSelectedItem().toString();
				r4--;
				
			}
			if(s4.isSelected())
			{
				 option[3][5] = s4cbx.getSelectedItem().toString();
				r4--;
			}
			}
			
			while(r5!=0)
			{
			if(m5.isSelected())
			{
				 option[4][0] = m5cbx.getSelectedItem().toString();
				r5--;
				
			}
			if(t5.isSelected())
			{
				 option[4][1] = t5cbx.getSelectedItem().toString();
				r5--;
			}
			if(w5.isSelected())
			{
				 option[4][2] = w5cbx.getSelectedItem().toString();
				r5--;
				
			}
			if(th5.isSelected())
			{
				 option[4][3] = th5cbx.getSelectedItem().toString();
				r5--;
			}
			if(f5.isSelected())
			{
				 option[4][4] = f5cbx.getSelectedItem().toString();
				r5--;
				
			}
			if(s5.isSelected())
			{
				 option[4][5] = s5cbx.getSelectedItem().toString();
				r5--;
			}
			}
			
			while(r6!=0)
			{
			if(m6.isSelected())
			{
				 option[5][0] = m6cbx.getSelectedItem().toString();
				r6--;
				
			}
			if(t6.isSelected())
			{
				 option[5][1] = t6cbx.getSelectedItem().toString();
				r6--;
			}
			if(w6.isSelected())
			{
				 option[5][2] = w6cbx.getSelectedItem().toString();
				r6--;
				
			}
			if(th6.isSelected())
			{
				 option[5][3] = th6cbx.getSelectedItem().toString();
				r6--;
			}
			if(f6.isSelected())
			{
				 option[5][4] = f6cbx.getSelectedItem().toString();
				r6--;
				
			}
			if(s6.isSelected())
			{
				 option[5][5] = s6cbx.getSelectedItem().toString();
				r6--;
			}
			}
			
			flag = false;
		
	}}

	protected void alloc(int noOfSub) {
		// TODO Auto-generated method stub
		if(noOfSub == 1)
		{
			txt1.setEnabled(true);
			
			m1.setEnabled(true);
			t1.setEnabled(true);
			w1.setEnabled(true);
			th1.setEnabled(true);
			f1.setEnabled(true);
			s1.setEnabled(true);
		}
		else if(noOfSub  == 6)
		{
			txt1.setEnabled(true);
			
			m1.setEnabled(true);
			t1.setEnabled(true);
			w1.setEnabled(true);
			th1.setEnabled(true);
			f1.setEnabled(true);
			s1.setEnabled(true);
			txt2.setEnabled(true);
			
			m2.setEnabled(true);
			t2.setEnabled(true);
			w2.setEnabled(true);
			th2.setEnabled(true);
			f2.setEnabled(true);
			s2.setEnabled(true);
			txt3.setEnabled(true);
			
			m3.setEnabled(true);
			t3.setEnabled(true);
			w3.setEnabled(true);
			th3.setEnabled(true);
			f3.setEnabled(true);
			s3.setEnabled(true);
			txt4.setEnabled(true);
			
			m4.setEnabled(true);
			t4.setEnabled(true);
			w4.setEnabled(true);
			th4.setEnabled(true);
			f4.setEnabled(true);
			s4.setEnabled(true);
			txt5.setEnabled(true);
			
			m5.setEnabled(true);
			t5.setEnabled(true);
			w5.setEnabled(true);
			th5.setEnabled(true);
			f5.setEnabled(true);
			s5.setEnabled(true);
			txt6.setEnabled(true);
			
			m6.setEnabled(true);
			t6.setEnabled(true);
			w6.setEnabled(true);
			th6.setEnabled(true);
			f6.setEnabled(true);
			s6.setEnabled(true);
			
			
		}
		
	}
}
