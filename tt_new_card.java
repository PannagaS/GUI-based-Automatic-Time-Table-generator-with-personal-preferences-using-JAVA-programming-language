package timetablegui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Timer;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import javax.swing.JProgressBar;

public class tt_new_card {

	private JFrame frmAdvancedTimeTable;
	private JTextField userTextField;
	private JPasswordField passwordField;
	private JPanel login_panel;
	private JPanel menu_panel;
	private JPanel print_panel;
	private JTextField textField;
	private JTextField noSubTxtFld;
	JLabel clockLabel = new JLabel("");
	JLabel DateLabel = new JLabel("");
	private JRadioButton mslot1 = new JRadioButton("7:30AM - 1:30PM");
	JRadioButton mslot2 = new JRadioButton("11:00AM - 5:30PM");
	JRadioButton tslot1 = new JRadioButton("7:30AM - 1:30PM");
	JRadioButton wslot1 = new JRadioButton("7:30AM - 1:30PM");
	JRadioButton thslot1 = new JRadioButton("7:30AM - 1:30PM");
	JRadioButton fslot1 = new JRadioButton("7:30AM - 1:30PM");
	JRadioButton sslot1 = new JRadioButton("7:30AM - 1:30PM");
	JRadioButton tslot2 = new JRadioButton("11:00AM - 5:30PM");
	JRadioButton wslot2 = new JRadioButton("11:00AM - 5:30PM");
	JRadioButton thslot2 = new JRadioButton("11:00AM - 5:30PM");
	JRadioButton fslot2 = new JRadioButton("11:00AM - 5:30PM");
	JRadioButton sslot2 = new JRadioButton("11:00AM - 5:30PM");
	JRadioButton minvi = new JRadioButton("New radio button");
	JRadioButton tinvi = new JRadioButton("New radio button");
	JRadioButton winvi = new JRadioButton("New radio button");
	JRadioButton thinvi = new JRadioButton("New radio button");
	JRadioButton finvi = new JRadioButton("New radio button");
	JRadioButton sinvi = new JRadioButton("New radio button");
	String day [] = new String[6];
	JTextArea labTextArea = new JTextArea();
	JTextArea roomTxtArea = new JTextArea();
	JComboBox clscomboBox = new JComboBox();
	JComboBox semcomboBox = new JComboBox();
	JComboBox SeccomboBox = new JComboBox();
	String spk_choice[] = new String[6];
	String msv_choice[] = new String[6];
	String sbr_choice[] = new String[6];
	String eam_choice[] = new String[6];
	String ms_choice[] = new String[6];
	String ghm_choice[] = new String[6];
	String labs[] = new String[3];
	JTextArea area = new JTextArea();
	String plan[][] = new String[6][6];
	JCheckBox agreeChckBx = new JCheckBox("Finalize to generate");
	JButton generateBtn = new JButton("Generate");
	String faculty[] =  {"-", "SPK", "EAM", "GHM", "SBR", "MSV", "MS"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try { 
					tt_new_card window = new tt_new_card();
					window.frmAdvancedTimeTable.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Function to display live clock on main_panel
	 */
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
	 */
	public tt_new_card() {
		initialize();
		clock();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdvancedTimeTable = new JFrame();
		frmAdvancedTimeTable.setTitle("Advanced time table generator || Event || Pannaga & Ranjan");
		frmAdvancedTimeTable.setBounds(100, 100, 1199, 790);
		frmAdvancedTimeTable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdvancedTimeTable.getContentPane().setLayout(new CardLayout(0, 0));
		
		final JPanel login_panel = new JPanel();
		login_panel.setBackground(new Color(255, 255, 204));
		frmAdvancedTimeTable.getContentPane().add(login_panel, "name_213401058356600");
		login_panel.setLayout(null);
		passwordField = new JPasswordField();
		login_panel.setVisible(true);
		 
		final JPanel main_panel = new JPanel();
		main_panel.setBackground(SystemColor.control);
		frmAdvancedTimeTable.getContentPane().add(main_panel, "name_213446603499800");
		main_panel.setLayout(null);
		main_panel.setVisible(false);
		
		
		
		final JPanel print_panel = new JPanel();
		frmAdvancedTimeTable.getContentPane().add(print_panel, "name_213449305864700");
		print_panel.setLayout(null);
		area.setFont(new Font("Monospaced", Font.PLAIN, 14));
		area.setBackground(new Color(255, 255, 255));
		area.setForeground(new Color(51, 51, 255));
		 
	
		area.setEditable(false);
		area.setBounds(39, 327, 1104, 356);
		print_panel.add(area);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(1008, 37, 9, 130);
		print_panel.add(separator_4);
		
		JButton printBtn = new JButton("Print");
		printBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					area.print();
				}
				catch(Exception e1)
				{
					
				}
			}
		});
		printBtn.setBounds(1029, 37, 97, 25);
		print_panel.add(printBtn);
		
		JButton backBtn = new JButton("Back\r\n");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agreeChckBx.setEnabled(false);
				generateBtn.setSelected(false);
				 
				main_panel.setVisible(true);
				print_panel.setVisible(false);
			}
		});
		backBtn.setBounds(1029, 80, 97, 25);
		print_panel.add(backBtn);
		
		JButton exitBtn = new JButton("Exit");
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitBtn.setBounds(1029, 118, 97, 25);
		print_panel.add(exitBtn);
		
		JLabel label_20 = new JLabel("");
		label_20.setBounds(39, 27, 532, 109);
		Image img = new ImageIcon(this.getClass().getResource("/sjceHeader.png")).getImage();
		label_20.setIcon(new ImageIcon(img));
		print_panel.add(label_20);
		
		JTextPane txtpnTeachingStaff = new JTextPane();
		txtpnTeachingStaff.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnTeachingStaff.setBackground(new Color(240, 240, 240));
		txtpnTeachingStaff.setEditable(false);
		txtpnTeachingStaff.setText("Teaching Staff : \r\nHOD : Dr. Shankaraiah N \r\n1. Dr. U B Mahadevaswamy\r\n2. Dr. M N Jayaram \r\n3. Dr. Sudarshan PatilKulkarni\r\n4. Dr. S G Gayathri Murthy\r\n5. Dr. M G Veena\r\n6. Dr. S B Rudraswamy\r\n7. Prof. Renuka B S\r\n");
		txtpnTeachingStaff.setBounds(49, 146, 183, 152);
		print_panel.add(txtpnTeachingStaff);
		
		JTextPane txtpnProfSujatha = new JTextPane();
		txtpnProfSujatha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnProfSujatha.setBackground(SystemColor.menu);
		txtpnProfSujatha.setEditable(false);
		txtpnProfSujatha.setText("8. Prof Sujatha Kumari \r\n9. Prof  Gayitri HM\r\n10. Prof. M Supreetha\r\n11. Prof. Anitha S Prasad\r\n12. Prof. D R Pavithra\r\n13. Prof. Eshwari A M \r\n14. Prof.  Kavya M K \r\n15. Prof. Ramya \r\n");
		txtpnProfSujatha.setBounds(261, 149, 161, 152);
		print_panel.add(txtpnProfSujatha);
		
		JTextPane txtpnProfVinay = new JTextPane();
		txtpnProfVinay.setBackground(SystemColor.menu);
		txtpnProfVinay.setEditable(false);
		txtpnProfVinay.setText("16. Prof. Vinay B R\r\n17. Prof. Yashwanth S D \r\n18. Prof. Halesh M R\r\n19. Prof. Puneeth \r\n20. Prof. N Shivkumar\r\n21. Prof. M S Praveen\r\n");
		txtpnProfVinay.setBounds(434, 149, 161, 152);
		print_panel.add(txtpnProfVinay);
		
		JTextPane txtpnNonTeachhing = new JTextPane();
		txtpnNonTeachhing.setBackground(SystemColor.menu);
		txtpnNonTeachhing.setEditable(false);
		txtpnNonTeachhing.setForeground(new Color(0, 0, 0));
		txtpnNonTeachhing.setText("Non - teachhing staff : \r\n1. B T Halesh\r\n2. K SJayashree\r\n3. M J Philip\r\n4. Umashankar\r\n5. Sidappa M S\r\n6. Poornima M\r\n7. Satheesha  M \r\n8. Yogesh M ");
		txtpnNonTeachhing.setBounds(607, 146, 183, 152);
		print_panel.add(txtpnNonTeachhing);
		
		JLabel lblNewLabel = new JLabel("Rooms alloted : ");
		lblNewLabel.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNewLabel.setBounds(654, 41, 128, 16);
		print_panel.add(lblNewLabel);
		roomTxtArea.setEditable(false);
		roomTxtArea.setBounds(794, 27, 202, 42);
		print_panel.add(roomTxtArea);
		
		JLabel lblLabsAlloted = new JLabel("Labs alloted : ");
		lblLabsAlloted.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblLabsAlloted.setBounds(654, 100, 128, 16);
		print_panel.add(lblLabsAlloted);
		labTextArea.setEditable(false);
		labTextArea.setBounds(794, 80, 202, 77);
		print_panel.add(labTextArea);
		
		JTextPane txtpnLabSession = new JTextPane();
		txtpnLabSession.setBackground(SystemColor.menu);
		txtpnLabSession.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnLabSession.setText("Lab session 1:  B1 B2 B3\r\nLab session 2:  B2 B3 B4\r\nLab session 3:  B3 B4 B1\r\nLab session 4:  B4 B1 B2");
		txtpnLabSession.setBounds(794, 188, 202, 77);
		print_panel.add(txtpnLabSession);
		print_panel.setVisible(false);
		
		JLabel label_3 = new JLabel("JSS Science and Technology University ( Formerly SJCE)");
		label_3.setForeground(new Color(0, 51, 255));
		label_3.setFont(new Font("SimSun", Font.BOLD, 23));
		label_3.setBackground(Color.ORANGE);
		label_3.setBounds(12, 13, 710, 34);
		main_panel.add(label_3);
		
		JLabel label_4 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/blue 1.png")).getImage();
		label_4.setIcon(new ImageIcon(img2));
		label_4.setBackground(new Color(153, 255, 255));
		label_4.setBounds(12, 26, 903, 16);
		main_panel.add(label_4);
		
		JLabel title = new JLabel("Time table generator");
		title.setForeground(new Color(255, 69, 0));
		title.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 30));
		title.setBackground(Color.BLACK);
		title.setBounds(293, 94, 376, 50);
		main_panel.add(title);
		
		JLabel label_6 = new JLabel("JSS MAHAVIDYAPEETHA");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		label_6.setBackground(new Color(102, 255, 255));
		label_6.setBounds(967, 20, 167, 28);
		main_panel.add(label_6);
		
		clockLabel.setForeground(new Color(255, 0, 0));
		clockLabel.setBackground(new Color(255, 255, 224));
		clockLabel.setFont(new Font("Tahoma", Font.BOLD, 37));
		
		clockLabel.setBounds(937, 595, 222, 50);
		main_panel.add(clockLabel);
		
		
		DateLabel.setForeground(new Color(0, 0, 255));
		DateLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		DateLabel.setBounds(937, 667, 209, 50);
		main_panel.add(DateLabel);
		
		
		mslot1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				day = GetTimeSlot1();
			}
		});
		mslot1.setBackground(new Color(204, 204, 102));
		mslot1.setBounds(192, 442, 142, 25);
		main_panel.add(mslot1);
		mslot2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				day = GetTimeSlot1();
			}
		});
		
		
		mslot2.setBackground(new Color(204, 204, 102));
		mslot2.setBounds(337, 442, 142, 25);
		main_panel.add(mslot2);
		tslot1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				day = GetTimeSlot1();
			}
		});
		
		
		tslot1.setBackground(new Color(204, 204, 102));
		tslot1.setBounds(192, 472, 142, 25);
		main_panel.add(tslot1);
		wslot1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				day = GetTimeSlot1();
			}
		});
		
		
		wslot1.setBackground(new Color(204, 204, 102));
		wslot1.setBounds(192, 502, 142, 25);
		main_panel.add(wslot1);
		thslot1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				day = GetTimeSlot1();
			}
		});
		
		
		thslot1.setBackground(new Color(204, 204, 102));
		thslot1.setBounds(192, 532, 142, 25);
		main_panel.add(thslot1);
		fslot1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				day = GetTimeSlot1();
			}
		});
		
		
		fslot1.setBackground(new Color(204, 204, 102));
		fslot1.setBounds(192, 562, 142, 25);
		main_panel.add(fslot1);
		sslot1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				day = GetTimeSlot1();
			}
		});
		
		
		sslot1.setBackground(new Color(204, 204, 102));
		sslot1.setBounds(192, 592, 142, 25);
		main_panel.add(sslot1);
		tslot2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				day = GetTimeSlot1();
			}
		});
		
		
		tslot2.setBackground(new Color(204, 204, 102));
		tslot2.setBounds(337, 472, 142, 25);
		main_panel.add(tslot2);
		wslot2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				day = GetTimeSlot1();
			}
		});
		
		
		wslot2.setBackground(new Color(204, 204, 102));
		wslot2.setBounds(337, 502, 142, 25);
		main_panel.add(wslot2);
		thslot2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				day = GetTimeSlot1();
			}
		});
		
		
		thslot2.setBackground(new Color(204, 204, 102));
		thslot2.setBounds(337, 532, 142, 25);
		main_panel.add(thslot2);
		fslot2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				day = GetTimeSlot1();
			}
		});
		
		
		fslot2.setBackground(new Color(204, 204, 102));
		fslot2.setBounds(337, 562, 142, 25);
		main_panel.add(fslot2);
		sslot2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				day = GetTimeSlot1();
			}
		});
		
		
		sslot2.setBackground(new Color(204, 204, 102));
		sslot2.setBounds(337, 592, 142, 25);
		main_panel.add(sslot2);
		
		JLabel label_7 = new JLabel("MONDAY");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_7.setBounds(61, 442, 88, 20);
		main_panel.add(label_7);
		
		JLabel label_8 = new JLabel("TUESDAY");
		label_8.setForeground(Color.WHITE);
		label_8.setBounds(61, 472, 88, 20);
		main_panel.add(label_8);
		
		JLabel label_9 = new JLabel("WEDNESDAY");
		label_9.setForeground(Color.WHITE);
		label_9.setBounds(61, 502, 88, 20);
		main_panel.add(label_9);
		
		JLabel label_10 = new JLabel("THURSDAY");
		label_10.setForeground(Color.WHITE);
		label_10.setBounds(61, 532, 88, 20);
		main_panel.add(label_10);
		
		JLabel label_11 = new JLabel("FRIDAY");
		label_11.setForeground(Color.WHITE);
		label_11.setBounds(61, 564, 88, 20);
		main_panel.add(label_11);
		
		JLabel label_12 = new JLabel("SATURDAY");
		label_12.setForeground(Color.WHITE);
		label_12.setBounds(61, 596, 88, 20);
		main_panel.add(label_12);
		
		JLabel label_13 = new JLabel("Days ");
		label_13.setForeground(Color.WHITE);
		label_13.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 17));
		label_13.setBounds(61, 399, 97, 25);
		main_panel.add(label_13);
		
		JLabel label_14 = new JLabel("Time slot selection");
		label_14.setForeground(Color.WHITE);
		label_14.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 17));
		label_14.setBounds(293, 394, 133, 34);
		main_panel.add(label_14);
		
		JLabel label_15 = new JLabel("Class # :");
		label_15.setForeground(Color.WHITE);
		label_15.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		label_15.setBounds(60, 332, 82, 34);
		main_panel.add(label_15);
		
		JComboBox clscomboBox = new JComboBox();
		clscomboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		clscomboBox.setBounds(154, 340, 56, 22);
		main_panel.add(clscomboBox);
		
		JLabel label_16 = new JLabel("Semester :");
		label_16.setForeground(Color.WHITE);
		label_16.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		label_16.setBounds(235, 333, 82, 34);
		main_panel.add(label_16);
		
		JLabel label_17 = new JLabel("Section : ");
		label_17.setForeground(Color.WHITE);
		label_17.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		label_17.setBounds(390, 340, 72, 34);
		main_panel.add(label_17);
		
		JComboBox semcomboBox = new JComboBox();
		semcomboBox.setModel(new DefaultComboBoxModel(new String[] {"6"}));
		semcomboBox.setBounds(317, 340, 41, 22);
		main_panel.add(semcomboBox);
		
		JComboBox SeccomboBox = new JComboBox();
		SeccomboBox.setModel(new DefaultComboBoxModel(new String[] {"A", "B"}));
		SeccomboBox.setBounds(467, 345, 46, 22);
		main_panel.add(SeccomboBox);
		
		JButton refreshBtn = new JButton("Refresh");
		refreshBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
			}
		});
		refreshBtn.setBounds(347, 626, 97, 25);
		main_panel.add(refreshBtn);
		
		JButton finalCheckBtn = new JButton("Submit");
		finalCheckBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 plan = Generate();
					for(int i =0; i<6;i++)
					{
						for(int j =0; j<6; j++)
						{
							System.out.print(plan[i][j] + "   ");
						}
						System.out.println();
					}
			}
		});
		finalCheckBtn.setBounds(456, 626, 97, 25);
		main_panel.add(finalCheckBtn);
		
		
		generateBtn.setEnabled(false);
		
		generateBtn.setBounds(625, 692, 97, 25);
		main_panel.add(generateBtn);
		
		JRadioButton ab104Btn = new JRadioButton("AB104");
		ab104Btn.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				allotRoom("AB104");
			}
		});
		ab104Btn.setBackground(Color.WHITE);
		ab104Btn.setBounds(767, 119, 127, 25);
		main_panel.add(ab104Btn);
		
		JLabel label_18 = new JLabel("Room :");
		label_18.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		label_18.setBounds(692, 119, 98, 25);
		main_panel.add(label_18);
		
		JRadioButton nps1Btn = new JRadioButton("NPS001");
		nps1Btn.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				allotRoom("NPS001");
			}
		});
		nps1Btn.setBackground(Color.WHITE);
		nps1Btn.setBounds(767, 158, 127, 25);
		main_panel.add(nps1Btn);
		
		JRadioButton nps2Btn = new JRadioButton("NPS002");
		nps2Btn.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				allotRoom("NPS002");
			}
		});
		nps2Btn.setBackground(new Color(204, 204, 153));
		nps2Btn.setBounds(767, 199, 127, 25);
		main_panel.add(nps2Btn);
		
		JRadioButton ev204Btn = new JRadioButton("EV204");
		ev204Btn.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				allotRoom("EV204");
			}
		});
		ev204Btn.setBackground(new Color(204, 204, 153));
		ev204Btn.setBounds(767, 234, 127, 25);
		main_panel.add(ev204Btn);
		
		JRadioButton ev205Btn = new JRadioButton("EV205");
		ev205Btn.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				allotRoom("EV205");
			}
		});
		ev205Btn.setBackground(new Color(204, 204, 153));
		ev205Btn.setBounds(767, 268, 127, 25);
		main_panel.add(ev205Btn);
		
		JLabel noSubLbl = new JLabel("No. of Subjects : ");
		noSubLbl.setForeground(new Color(255, 255, 255));
		noSubLbl.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		noSubLbl.setBounds(61, 236, 158, 16);
		main_panel.add(noSubLbl);
		
		noSubTxtFld = new JTextField();
		noSubTxtFld.setColumns(10);
		noSubTxtFld.setBounds(204, 235, 48, 22);
		main_panel.add(noSubTxtFld);
		
		JLabel condLbl = new JLabel("(Max 7)");
		condLbl.setBounds(264, 238, 56, 16);
		main_panel.add(condLbl);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(new Color(102, 0, 255));
		separator_2.setBounds(927, 25, 254, 22);
		main_panel.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(204, 0, 255));
		separator_3.setBounds(927, 658, 240, 12);
		main_panel.add(separator_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"-", "SPK", "EAM", "GHM", "SBR", "MSV", "MS"}));
		comboBox_1.setBounds(144, 182, 66, 25);
		main_panel.add(comboBox_1);
		
		JLabel label_5 = new JLabel("Faculty:");
		label_5.setForeground(new Color(0, 0, 0));
		label_5.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		label_5.setBounds(61, 175, 82, 34);
		main_panel.add(label_5);
		
		JLabel lblNewLabel_5 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/sjce.png")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img4));
		lblNewLabel_5.setBounds(929, 60, 240, 131);
		main_panel.add(lblNewLabel_5);
		
		JLabel clockLabel = new JLabel("");
		clockLabel.setForeground(Color.RED);
		clockLabel.setFont(new Font("Tahoma", Font.BOLD, 37));
		clockLabel.setBackground(new Color(255, 255, 224));
		clockLabel.setBounds(942, 563, 222, 50);
		main_panel.add(clockLabel);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(929, 197, 229, 114);
		Image img5 = new ImageIcon(this.getClass().getResource("/resized apj.png")).getImage();
		lblNewLabel_6.setIcon(new ImageIcon(img5));
		main_panel.add(lblNewLabel_6);
		
		JLabel DateLabel = new JLabel("");
		DateLabel.setForeground(Color.BLUE);
		DateLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		DateLabel.setBounds(941, 562, 209, 50);
		main_panel.add(DateLabel);
		JButton button_4 = new JButton("Exit");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_4.setBounds(769, 692, 97, 25);
		main_panel.add(button_4);
		minvi.setVisible(false);
		
		
		
		JRadioButton minvi = new JRadioButton("New radio button");
		minvi.setBounds(508, 442, 127, 25);
		main_panel.add(minvi);
		minvi.setVisible(false);
		
		JRadioButton tinvi = new JRadioButton("New radio button");
		tinvi.setBounds(508, 472, 127, 25);
		main_panel.add(tinvi);
		tinvi.setVisible(false);
		
		JRadioButton winvi = new JRadioButton("New radio button");
		winvi.setBounds(508, 502, 127, 25);
		main_panel.add(winvi);
		winvi.setVisible(false);
		
		JRadioButton thinvi = new JRadioButton("New radio button");
		thinvi.setBounds(508, 532, 127, 25);
		main_panel.add(thinvi);
		thinvi.setVisible(false);
		
		JRadioButton finvi = new JRadioButton("New radio button");
		finvi.setBounds(508, 562, 127, 25);
		main_panel.add(finvi);
		finvi.setVisible(false);
		
		JRadioButton sinvi = new JRadioButton("New radio button");
		sinvi.setBounds(508, 592, 127, 25);
		main_panel.add(sinvi);
		sinvi.setVisible(false);
		
		
		
		JCheckBox checkBox = new JCheckBox("Design and Implementation Lab");
		checkBox.setForeground(new Color(255, 255, 255));
		checkBox.setBackground(new Color(0, 0, 0));
		checkBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				labs[0] = "Design and Implementation lab";
			}
		});
		checkBox.setBounds(669, 502, 225, 25);
		main_panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("Advanced Communication lab");
		checkBox_1.setForeground(new Color(255, 255, 255));
		checkBox_1.setBackground(new Color(0, 0, 0));
		checkBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				labs[1] = "Advanced Communication lab";
			}
		});
		checkBox_1.setBounds(669, 532, 197, 25);
		main_panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("CMOS VLSI Lab");
		checkBox_2.setForeground(new Color(255, 255, 255));
		checkBox_2.setBackground(new Color(0, 0, 0));
		checkBox_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				labs[2] = "CMOS VLSI lab";
			}
		});
		checkBox_2.setBounds(669, 562, 167, 25);
		main_panel.add(checkBox_2);
		
		
		
		
		
		JButton button_1 = new JButton("Reset");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userTextField.setText("");
				passwordField.setText("");
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_1.setBackground(new Color(220, 220, 220));
		button_1.setBounds(333, 527, 107, 38);
		login_panel.add(button_1);
		
		JButton button_2 = new JButton("Exit");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_2.setForeground(Color.RED);
		button_2.setBackground(new Color(220, 220, 220));
		button_2.setBounds(735, 527, 107, 38);
		login_panel.add(button_2);
		passwordField = new JPasswordField();
		passwordField.setBounds(520, 380, 241, 22);
		login_panel.add(passwordField);
		userTextField = new JTextField();
		userTextField.setBounds(520, 280, 241, 22);
		login_panel.add(userTextField);
		userTextField.setColumns(10);
		
	
		
		
		JLabel label = new JLabel("Username : ");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		label.setBackground(Color.BLACK);
		label.setBounds(378, 278, 102, 25);
		login_panel.add(label);
		
		JLabel label_1 = new JLabel("Password : ");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		label_1.setBounds(378, 382, 86, 16);
		login_panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBackground(Color.WHITE);
		
		Image IMG = new ImageIcon(this.getClass().getResource("/title.png")).getImage();
		label_2.setIcon(new ImageIcon(IMG));
		label_2.setBounds(481, 94, 280, 135);
		login_panel.add(label_2);
		
		
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLUE);
		separator.setBounds(333, 242, 497, 25);
		login_panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.RED);
		separator_1.setBounds(333, 444, 497, 70);
		login_panel.add(separator_1);
		JButton button = new JButton("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int  attempts = 4;
				while(attempts != 0 )
				{
				String user = userTextField.getText();
				String pass = passwordField.getText(); 
				if(user.equals("admin") && pass.equals("12345"))
				{
					
					main_panel.setVisible(true);
					login_panel.setVisible(false);
					 
					
					break;
				}
				
				else
				{	
					JOptionPane.showMessageDialog(frmAdvancedTimeTable,"Sorry invalid login credentials , attempts left is " + attempts);
					
					attempts --;
				}
				
				if(attempts ==0)
				{
					JOptionPane.showMessageDialog(frmAdvancedTimeTable, "Sorry, exceeded maximum number of attempts ! , try again after sometime ");
					break;
					
				
				}
				}
				
			}
			
		});
		button.setForeground(Color.BLUE);
		button.setBackground(new Color(220, 220, 220));
		button.setBounds(542, 527, 107, 38);
		login_panel.add(button);
		
		JTextArea txtrDevelopersPannaga = new JTextArea();
		txtrDevelopersPannaga.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtrDevelopersPannaga.setBackground(new Color(255, 255, 204));
		txtrDevelopersPannaga.setText("\t\tDevelopers : \r\n\tPannaga S\t G  N Ranjan\r\n +91 94419 191976\t+91  91104 99826");
		txtrDevelopersPannaga.setBounds(424, 639, 357, 70);
		login_panel.add(txtrDevelopersPannaga);
		
		agreeChckBx.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				generateBtn.setEnabled(true);
			}
		});
		agreeChckBx.setBackground(new Color(0, 0, 0));
		agreeChckBx.setForeground(new Color(255, 255, 255));
		agreeChckBx.setBounds(692, 626, 144, 25);
		main_panel.add(agreeChckBx);
		
		JButton submitBtn =  new JButton("OK");
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String faculty_choice = comboBox_1.getSelectedItem().toString();
				String class_choice = clscomboBox.getSelectedItem().toString();
				String sem_choice = semcomboBox.getSelectedItem().toString();
				String sec_choice = SeccomboBox.getSelectedItem().toString();
				
				
				choiceSubmit(faculty_choice, class_choice, sem_choice, sec_choice);
			}
		});
		submitBtn.setBounds(235, 626, 97, 25);
		main_panel.add(submitBtn);
		
		
		generateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main_panel.setVisible(false);
				print_panel.setVisible(true);
				 printTT( plan, faculty);
				
				 // Printing the labs Alloted 
				 for(int i =0; i<3; i++)
				{	
					labTextArea.setText(labTextArea.getText() + labs[i] + "\n");	
				}
				 
				 
			}
		});
		

		JLabel lblLabs = new JLabel("Labs : ");
		lblLabs.setForeground(Color.WHITE);
		lblLabs.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblLabs.setBounds(666, 463, 72, 34);
		main_panel.add(lblLabs);
		
		
		
		
		  JLabel label_19 = new JLabel(""); label_19.setBackground(new Color(204, 204,153)); 
		  Image image5 = new ImageIcon(this.getClass().getResource("/ec3.png")).getImage();
		  label_19.setIcon(new ImageIcon(image5)); 
		  label_19.setBounds(12, 45, 918,625); 
		  main_panel.add(label_19);
		  
		  JTextPane txtpnbeAnInternational = new JTextPane();
		  txtpnbeAnInternational.setForeground(new Color(102, 51, 255));
		  txtpnbeAnInternational.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		  txtpnbeAnInternational.setBackground(new Color(255, 255, 255));
		  txtpnbeAnInternational.setText("\"Be an  international leader in engineering education,\r\nresearch and application of knowledge to benefit society globally\u201D.");
		  txtpnbeAnInternational.setEditable(false);
		  txtpnbeAnInternational.setBounds(930, 317, 237, 70);
		  main_panel.add(txtpnbeAnInternational);
		  Timer timer;
			
			
		 
		  	JLabel lblNewLabel_7 = new JLabel("");
			Image img1 = new ImageIcon(this.getClass().getResource("/yellow.png")).getImage();
			lblNewLabel_7.setIcon(new ImageIcon(img1));
			lblNewLabel_7.setBounds(12, 666, 903, 64);
			main_panel.add(lblNewLabel_7);
			
			
			JTextPane txtpntoSynergistically = new JTextPane();
			txtpntoSynergistically.setFont(new Font("Arial Narrow", Font.BOLD, 13));
			txtpntoSynergistically.setBackground(new Color(245, 255, 250));
			txtpntoSynergistically.setText("\u2022 \u201CTo synergistically develop high-quality manpower and continue to stay competitive in tomorrow\u2019s world\u201D.\r\n\u2022 \u201CTo foster and maintain mutually beneficial partnerships with our alumni, industry, state and central governments through public services assistance and collaborative research\u201D.\r\n\u2022 \u201CTo create empowered individuals with sense of identity\u201D.");
			txtpntoSynergistically.setForeground(new Color(51, 153, 51));
			txtpntoSynergistically.setBounds(929, 394, 238, 166);
			main_panel.add(txtpntoSynergistically);
			
			
			
		
		
		
		
		
	}
	/*
	 * Function name : allotRoom 
	 * Operation : It takes in a String variable, each time a room is selected from the main_panel of the GUI window, this function 
	 * is called, and it checks which button was pressed based on the string value that is taken and prints it accordingly to the
	 * room alloted text area in the print_panel.
	 */
	
	protected void allotRoom(String string) {
		
		if(string.equals("NPS001"))
			roomTxtArea.setText(roomTxtArea.getText() + "NPS001" + "\n");
		if(string.equals("NPS002"))
			roomTxtArea.setText(roomTxtArea.getText() + "NPS002" + "\n");
		if(string.equals("EV205"))
			roomTxtArea.setText(roomTxtArea.getText() + " EV205" + "\n");
		if(string.equals("EV204"))
			roomTxtArea.setText(roomTxtArea.getText() + "EV204" + "\n");
		if(string.equals("AB104"))
			roomTxtArea.setText(roomTxtArea.getText() + "AB104" + "\n");
	}

	/*
	 * Function name : choiceSubmit
	 * Operation : When we press OK in the GUI window (main_panel), then each time an ok is pressed, then this function is called.
	 * Then, it takes in the faculty name that is selected, class choice, semester choice, section (A/B). So, it goes on assigning 
	 * the choices in String format (mon1 tue2 ...) into individual 1D array for each specific teacher.	
	 */
	protected void choiceSubmit(String faculty_choice, String class_choice, String sem_choice, String sec_choice) 
	{
		
		
		
		
		System.out.println(class_choice + " " + sec_choice + "  " + sem_choice);
		int CLASS = Integer.parseInt(class_choice);
		int SEM = Integer.parseInt(sem_choice);
		if(CLASS == 1 && SEM == 6 && sec_choice.contentEquals("B") )
		{String dummy = null;
		if(faculty_choice.equals("SPK"))
		{	
			
			 spk_choice = GetTimeSlot1();
			for(int i =0; i<6; i++)
				{
					
					 spk_choice[i]=(spk_choice[i]==null)?"0":spk_choice[i].substring(spk_choice[i].length() - 1);	
					
				}
			
					
			
		}
		else if (faculty_choice.equals("GHM"))
		{	
			 ghm_choice =  GetTimeSlot1();
			for(int i =0; i<6; i++)
				{
				
					
					 ghm_choice[i]=(ghm_choice[i]==null)?"0":ghm_choice[i].substring(ghm_choice[i].length() - 1);	
					
				}
			
		}
		else if(faculty_choice.equals("MSV"))
		{	
			
		  msv_choice = GetTimeSlot1();
			for(int i =0; i<6; i++)
				{
				
				 msv_choice[i]=(msv_choice[i]==null)?"0":msv_choice[i].substring(msv_choice[i].length() - 1);	
				
			}
			
		}
		else if(faculty_choice.equals("SBR"))
		{	
			sbr_choice=GetTimeSlot1();
			for(int i =0; i<6; i++)
				{
				
				sbr_choice[i]=(sbr_choice[i]==null)?"0":sbr_choice[i].substring(sbr_choice[i].length() - 1);	
					
				}
			
		}
		else if(faculty_choice.equals("MS"))
		{	
			 ms_choice = GetTimeSlot1();
			for(int i =0; i<6; i++)
				{
				
				 ms_choice[i]=(ms_choice[i]==null)?"0":ms_choice[i].substring(ms_choice[i].length() - 1);	
				
			}
		}
		else if(faculty_choice.equals("EAM"))
		{	
			 eam_choice = GetTimeSlot1();
			for(int i =0; i<6; i++)
			{	
				
			eam_choice[i] =(eam_choice[i]==null)?"0":eam_choice[i].substring(eam_choice[i].length() - 1);	
		
		
			
		}
		
		}
		}
		
	}
	/*
	 * Function name : Generate
	 * Operation : It returns a 2D string array called choice[][] (6*6 matrix), which contains the choice of each faculty members that 
	 * is assigned by the algorithm.
	 */
	
	protected String[][] Generate() {
		String choice[][] = new String[6][6];
		for(int i=0; i<6;i++)
		{
			for(int j =0; j<6;j++)
			{	if(i==0)
					choice[i][j] = spk_choice[j];
				if(i==1)
					choice[i][j] = sbr_choice[j];
				if(i==2)
					choice[i][j] = ghm_choice[j];
				if(i==3)
					choice[i][j] = msv_choice[j];
				if(i==4)
					choice[i][j] = ms_choice[j];
				if(i==5)
					choice[i][j] = eam_choice[j];
		
			}
		}
	return choice;
	}
	
	/*
	 * Function name : clear 
	 * Operation : It clears all the radio button selection every time 'refresh' button
	 */
	
	private void clear() {
				minvi.setSelected(true);
		tinvi.setSelected(true);
		winvi.setSelected(true);
		thinvi.setSelected(true);
		finvi.setSelected(true);
		sinvi.setSelected(true);
		mslot1.setSelected(false);
		mslot2.setSelected(false);
		tslot1.setSelected(false);
		tslot2.setSelected(false);
		wslot1.setSelected(false);
		wslot2.setSelected(false);
		thslot1.setSelected(false);
		thslot2.setSelected(false);
		fslot1.setSelected(false);
		fslot2.setSelected(false);
		sslot1.setSelected(false);
		sslot2.setSelected(false);
		
	}
	
	/*
	 * Function name : GetTimeSlot1
	 * Operation : It returns a String array and in that string array, we will have the days slot (individually), such as mon1, tue2, etc.
	 */
	
	protected String[] GetTimeSlot1() {
		
		String[] days = new String[6];
		if(mslot1.isSelected()==true)
		{
			mslot2.setSelected(false);
			days[0] = "mon1";
			
		}
		 if(mslot2.isSelected())
		{
			mslot1.setSelected(false);
			days[0] = "mon2";
		}
		if(tslot1.isSelected())
		{
			tslot2.setSelected(false);
			days[1] = "tue1";
			
		}
		 if(tslot2.isSelected())
		{
			tslot1.setSelected(false);
			days[1] = "tue2";
		}
		if(wslot1.isSelected())
		{
			wslot2.setSelected(false);
			days[2] = "wed1";
			
		}
		 if(wslot2.isSelected())
		{
			wslot1.setSelected(false);
			days[2] = "wed2";
		}
		if(thslot1.isSelected())
		{
			thslot2.setSelected(false);
			days[3] = "thu1";
		}
		 if(thslot2.isSelected())
		{
			thslot1.setSelected(false);
			days[3] = "thu2";
		}
		if(fslot1.isSelected())
		{
			fslot2.setSelected(false);
			days[4] = "fri1";
		}
		 if(fslot2.isSelected())
		{
			fslot1.setSelected(false);
			days[4] = "fri2";
		}
		if(sslot1.isSelected())
		{
			sslot2.setSelected(false);
			days[5] = "sat1";
		}
		 if(sslot2.isSelected())
		{
			sslot1.setSelected(false);
			days[5] = "sat2";
		}
	return days;	
	}
	
	/*
	 * Function name : printTT
	 * Operation : It takes in two parameters, (1) a 2D string array , (2) a 1D array of list of faculties. It prints out the entire timetable
	 * based on the preferences that is input from the faculties.
	 */
	private   void  printTT(String x[][], String faculty[]) {
		String [] sub = {"EC653", "EC630", "EC640", "EC610", "EC620", "EC663"};
		String tt[][] = new String[6][9];
		
		String txtDay = "";
		txtDay = "\n\n\n\n\n";
		txtDay+= " ========================================================================================================================================" + "\n";
		txtDay+= "                              		 JSS  Science and Technology University ( Formerly SJCE ) " + "\n";
		txtDay+= " ========================================================================================================================================" + "\n\n";
		System.out.println("======================================================================");
		
		String time = "\t"+"7:30-8:30" + "\t" + "8:30-9:30" + "\t" +"9:30-10:30" + "\t"+"11:00-11:50" +"\t"+ "11:50-12:40" + "\t"+"12:40-1:30" +"\t"+ "2:30-3:30"+ "\t"+"3:30-4:30"+"\t"+"4:30-5:30";
		String time1 = "\t\t\t\t\t"+"7:30am" + "\t" + "8:30am" + "\t" +"9:30am" + "\t"+"11:00am" +"\t"+ "11:50am" + "\t"+"12:40pm" +"\t"+ "2:30pm"+ "\t"+"3:30pm"+"\t"+"4:30pm" + "\n";
		String days[] = {"\t\t\t\tMon", "\t\t\t\tTue", "\t\t\t\tWed", "\t\t\t\tThu", "\t\t\t\tFri", "\t\t\t\tSat"};	
		Random rnd = new Random();
		
		 for(int i=1;i<=4;i++)   //i<=4 because of number of batches
	        {
	            int l,m;
	            boolean boo=true;

	            while(boo)
	            {
	                l=rnd.nextInt(6);
	                m=(3*(rnd.nextInt(3)));
	                if ((tt[l][0]==null)&&(tt[l][3]==null)&&(tt[l][6]==null))
	                {
	                    tt[l][m] = "LabS" + i;
	                    tt[l][m+1] = "LabS" + i;
	                    tt[l][m+2] = "LabS" + i;
	                    boo=false;

	                }
	            }
		
	        }
	        

		 /*
		  * Filling in subjects
		  */
		boolean flag = true;
		boolean flag2 = true;
		
		
		
		
		
			for(int i =0 ; i<6; i++)
			{	
				for(int j =0 ; j<6; j++)
				{
					
					if(Integer.parseInt(x[i][j])==1)
					{	flag = true;
						 int count =10;
							while(flag && (count!=0))
						 	{	int R = rnd.nextInt(6);
						 		if(tt[j][R]== null)
						 		{	
						 				tt[j][R] = sub[i];
						 				flag = false;
						 				
						 		}
						 		count--;
						 	}	
						 
					 while(flag  && count==0)
					 {
						 int l=0,m=0;
			              boolean boo=true;

			                while(boo)
			                {	
			                	
			                    l=rnd.nextInt(6);
			                    m=rnd.nextInt(9);
			                    if (tt[l][m]==null)
			                    {
			                        tt[l][m] = sub[i];
			                        boo=false;
			                        flag = false;	
			                    }
			                }
					 }
							
					}
					else if(Integer.parseInt(x[i][j])==2)
					{
					 
						 	
						 	flag2 = true;
						 	int count2 = 10;
						 	
						 	while(flag2 && count2!=0)
						 	{
						 		int R = rnd.nextInt(6)+3;
						 		if(tt[j][R]==null)
						 		{ 
						 			tt[j][R] = sub[i];
						 			flag2= false;    
						 			
						 		}
						 		count2--;
						 	}
						 
						 	 while(flag2  && count2==0)
							 {	
								 int l=0,m=0;
					               boolean boo=true;

					                while(boo)
					                {	
					                    l=rnd.nextInt(6);
					                    m=rnd.nextInt(9);
					                    if (tt[l][m]==null)
					                    {
					                        tt[l][m] = sub[i];
					                        boo=false;
					                        flag2 = false;
					                    }
					                }
							 }
					}
					
					
					else if(Integer.parseInt(x[i][j])==0)
					{
						
					}
				}
			}
			
			
			for(int r=0; r<6; r ++)
			{
				for(int c = 0; c<9; c++)
				{
					if(tt[r][c] == null)
					{
						tt[r][c] = "FREE ";
					}
				}
			}
			

			
			
			
		txtDay+=time1;
		System.out.println(time +"\n");
		for( int i=0; i<=5; i++)
		{
			System.out.print(days[i]+"	");
			txtDay = txtDay + days[i] ;
			
			for(int j=0; j<=8; j++)
			{
				
				if(i==5 && (j==6||j==7||j==8) )
				{
					System.out.print("\t\t" + "NOCLS" );
					
					txtDay += "\t" + "NOCLS";
				}
				
				else 
				{System.out.printf("%-13s     ", tt[ i ] [ j ] );
					
					txtDay+="\t" + tt[i][j];
				}
					
			}
			System.out.printf("\n");
			
			txtDay +="\n";
		}
		
		area.setText(area.getText() + txtDay);
		
	}

	
}
