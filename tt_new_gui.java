package timetablegui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class tt_new_gui {

	private JFrame frame;
	private JLabel lbl9;
	JLabel clockLabel = new JLabel("");
	JLabel DateLabel = new JLabel("");
	private JTextField noSubTxtFld;
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
	String plan[][] = new String[6][6];
	String faculty[] =  {"-", "SPK", "EAM", "GHM", "SBR", "MSV", "MS"};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tt_new_gui window = new tt_new_gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tt_new_gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1199, 777);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("JSS Science and Technology University ( Formerly SJCE)");
		lblNewLabel.setForeground(new Color(0, 51, 255));
		lblNewLabel.setBackground(new Color(255, 200, 0));
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD, 23));
		lblNewLabel.setBounds(12, 0, 710, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_9 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/blue 1.png")).getImage();
		lblNewLabel_9.setIcon(new ImageIcon(img2));
		lblNewLabel_9.setBounds(12, 13, 903, 16);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel title = new JLabel("Time table generator");
		title.setBackground(new Color(0, 0, 0));
		title.setForeground(new Color(255, 69, 0));
		title.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 30));
		title.setBounds(434, 29, 376, 50);
		frame.getContentPane().add(title);
		
		JLabel lblNewLbl = new JLabel("JSS Science and Technology University ( Formerly SJCE)");
		lblNewLbl.setForeground(new Color(0, 51, 255));
		lblNewLbl.setBackground(new Color(255, 200, 0));
		lblNewLbl.setFont(new Font("SimSun", Font.BOLD, 23));
		lblNewLbl.setBounds(12, 0, 710, 34);
		frame.getContentPane().add(lblNewLbl);
		
		JComboBox comboBox_1 = new JComboBox();
		
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"-", "SPK", "EAM", "GHM", "SBR", "MSV", "MS"}));
		comboBox_1.setBounds(121, 183, 66, 25);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_1 = new JLabel("Faculty:");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(27, 175, 82, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(783, 667, 97, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.setBounds(657, 667, 97, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/sjce.png")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img4));
		lblNewLabel_5.setBounds(929, 38, 240, 131);
		frame.getContentPane().add(lblNewLabel_5);
		JLabel lblNewLabel_6 = new JLabel("New label");
		Image img5 = new ImageIcon(this.getClass().getResource("/resized apj.png")).getImage();
		lblNewLabel_6.setIcon(new ImageIcon(img5));
		lblNewLabel_6.setBounds(929, 175, 229, 114);
		frame.getContentPane().add(lblNewLabel_6);
		
		
		clockLabel.setForeground(new Color(255, 0, 0));
		clockLabel.setBackground(new Color(255, 255, 224));
		clockLabel.setFont(new Font("Tahoma", Font.BOLD, 37));
		
		clockLabel.setBounds(929, 466, 222, 50);
		frame.getContentPane().add(clockLabel);
		
		
		DateLabel.setForeground(new Color(0, 0, 255));
		DateLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		DateLabel.setBounds(943, 556, 209, 50);
		frame.getContentPane().add(DateLabel);
		
		JLabel lblNewLabel_7 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/yellow.png")).getImage();
		lblNewLabel_7.setIcon(new ImageIcon(img1));
		lblNewLabel_7.setBounds(12, 653, 903, 64);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lbl9;
		lbl9 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/blue 1.png")).getImage();
		lbl9.setIcon(new ImageIcon(img3));
		lbl9.setBounds(12, 13, 903, 16);
		frame.getContentPane().add(lbl9);
		
		JRadioButton ab104Btn = new JRadioButton("AB104");
		ab104Btn.setBackground(new Color(255, 255, 255));
		ab104Btn.setBounds(732, 105, 127, 25);
		frame.getContentPane().add(ab104Btn);
		
		JLabel RoomLbl = new JLabel("Room :");
		RoomLbl.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		RoomLbl.setBounds(657, 105, 98, 25);
		frame.getContentPane().add(RoomLbl);
		
		JRadioButton nps1Btn = new JRadioButton("NPS001");
		nps1Btn.setBackground(new Color(255, 255, 255));
		nps1Btn.setBounds(732, 144, 127, 25);
		frame.getContentPane().add(nps1Btn);
		
		JRadioButton nps2Btn = new JRadioButton("NPS002");
		nps2Btn.setBackground(new Color(204, 204, 153));
		nps2Btn.setBounds(732, 185, 127, 25);
		frame.getContentPane().add(nps2Btn);
		
		JRadioButton ev204Btn = new JRadioButton("EV204");
		ev204Btn.setBackground(new Color(204, 204, 153));
		ev204Btn.setBounds(732, 220, 127, 25);
		frame.getContentPane().add(ev204Btn);
		
		JRadioButton ev205Btn = new JRadioButton("EV205");
		ev205Btn.setBackground(new Color(204, 204, 153));
		ev205Btn.setBounds(732, 254, 127, 25);
		frame.getContentPane().add(ev205Btn);
		
		JLabel noSubLbl = new JLabel("No. of Subjects : ");
		noSubLbl.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		noSubLbl.setBounds(216, 184, 158, 16);
		frame.getContentPane().add(noSubLbl);
		
		noSubTxtFld = new JTextField();
		noSubTxtFld.setBounds(369, 184, 48, 22);
		frame.getContentPane().add(noSubTxtFld);
		noSubTxtFld.setColumns(10);
		
		JLabel condLbl = new JLabel("(Max 7)");
		condLbl.setBounds(424, 187, 56, 16);
		frame.getContentPane().add(condLbl);
		
		JLabel lblNewLabel_11 = new JLabel("JSS MAHAVIDYAPEETHA");
		lblNewLabel_11.setForeground(new Color(255, 0, 0));
		lblNewLabel_11.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblNewLabel_11.setBackground(new Color(102, 255, 255));
		lblNewLabel_11.setBounds(984, 13, 167, 28);
		frame.getContentPane().add(lblNewLabel_11);
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(102, 0, 255));
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(929, 13, 240, 22);
		frame.getContentPane().add(separator);
		
		
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(204, 0, 255));
		separator_1.setBounds(929, 526, 240, 106);
		frame.getContentPane().add(separator_1);
		mslot1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				day = GetTimeSlot1();
			}
		});
		
		
		mslot1.setBackground(new Color(204, 204, 102));
		mslot1.setBounds(183, 406, 142, 25);
		frame.getContentPane().add(mslot1);
		mslot2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				day = GetTimeSlot1();
			}
		});
		
		
		mslot2.setBackground(new Color(204, 204, 102));
		mslot2.setBounds(328, 406, 142, 25);
		frame.getContentPane().add(mslot2);
		tslot1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				day = GetTimeSlot1();
			}
		});
		
		
		tslot1.setBackground(new Color(204, 204, 102));
		tslot1.setBounds(183, 436, 142, 25);
		frame.getContentPane().add(tslot1);
		wslot1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				day = GetTimeSlot1();
			}
		});
		
		
		wslot1.setBackground(new Color(204, 204, 102));
		wslot1.setBounds(183, 466, 142, 25);
		frame.getContentPane().add(wslot1);
		thslot1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				day = GetTimeSlot1();
			}
		});
		
		
		thslot1.setBackground(new Color(204, 204, 102));
		thslot1.setBounds(183, 496, 142, 25);
		frame.getContentPane().add(thslot1);
		fslot1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				day = GetTimeSlot1();
			}
		});
		
		
		fslot1.setBackground(new Color(204, 204, 102));
		fslot1.setBounds(183, 526, 142, 25);
		frame.getContentPane().add(fslot1);
		sslot1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				day = GetTimeSlot1();
			}
		});
		
		
		sslot1.setBackground(new Color(204, 204, 102));
		sslot1.setBounds(183, 556, 142, 25);
		frame.getContentPane().add(sslot1);
		tslot2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				day = GetTimeSlot1();
			}
			
		});
		
		
		tslot2.setBackground(new Color(204, 204, 102));
		tslot2.setBounds(328, 436, 142, 25);
		frame.getContentPane().add(tslot2);
		wslot2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				day = GetTimeSlot1();
			}
		});
		
		
		wslot2.setBackground(new Color(204, 204, 102));
		wslot2.setBounds(328, 466, 142, 25);
		frame.getContentPane().add(wslot2);
		thslot2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				day = GetTimeSlot1();
			}
		});
		
		
		thslot2.setBackground(new Color(204, 204, 102));
		thslot2.setBounds(328, 496, 142, 25);
		frame.getContentPane().add(thslot2);
		fslot2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				day = GetTimeSlot1();
			}
		});
		
		
		fslot2.setBackground(new Color(204, 204, 102));
		fslot2.setBounds(328, 526, 142, 25);
		frame.getContentPane().add(fslot2);
		sslot2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				day = GetTimeSlot1();
			}
		});
		
		
		sslot2.setBackground(new Color(204, 204, 102));
		sslot2.setBounds(328, 556, 142, 25);
		frame.getContentPane().add(sslot2);
		
		JLabel lblNewLabel_3 = new JLabel("MONDAY");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(52, 406, 88, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblTuesday = new JLabel("TUESDAY");
		lblTuesday.setForeground(new Color(255, 255, 255));
		lblTuesday.setBounds(52, 436, 88, 20);
		frame.getContentPane().add(lblTuesday);
		
		JLabel lblWednesdat = new JLabel("WEDNESDAY");
		lblWednesdat.setForeground(new Color(255, 255, 255));
		lblWednesdat.setBounds(52, 466, 88, 20);
		frame.getContentPane().add(lblWednesdat);
		
		JLabel lblThursday = new JLabel("THURSDAY");
		lblThursday.setForeground(new Color(255, 255, 255));
		lblThursday.setBounds(52, 496, 88, 20);
		frame.getContentPane().add(lblThursday);
		
		JLabel lblFriday = new JLabel("FRIDAY");
		lblFriday.setForeground(new Color(255, 255, 255));
		lblFriday.setBounds(52, 528, 88, 20);
		frame.getContentPane().add(lblFriday);
		
		JLabel lblSaturday = new JLabel("SATURDAY");
		lblSaturday.setForeground(new Color(255, 255, 255));
		lblSaturday.setBounds(52, 560, 88, 20);
		frame.getContentPane().add(lblSaturday);
		
		JLabel lblNewLabel_2 = new JLabel("Days ");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_2.setBounds(52, 363, 97, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Time slot selection");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_4.setBounds(284, 358, 133, 34);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblClass = new JLabel("Class # :");
		lblClass.setForeground(new Color(255, 255, 255));
		lblClass.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblClass.setBounds(27, 254, 82, 34);
		frame.getContentPane().add(lblClass);
		
		
		clscomboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		clscomboBox.setBounds(121, 262, 56, 22);
		frame.getContentPane().add(clscomboBox);
		
		JLabel lblSemester = new JLabel("Semester :");
		lblSemester.setForeground(new Color(255, 255, 255));
		lblSemester.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblSemester.setBounds(202, 255, 82, 34);
		frame.getContentPane().add(lblSemester);
		
		JLabel lblSection = new JLabel("Section : ");
		lblSection.setForeground(new Color(255, 255, 255));
		lblSection.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblSection.setBounds(357, 262, 72, 34);
		frame.getContentPane().add(lblSection);
		
		
		semcomboBox.setModel(new DefaultComboBoxModel(new String[] {"6"}));
		semcomboBox.setBounds(284, 262, 41, 22);
		frame.getContentPane().add(semcomboBox);
		
		
		SeccomboBox.setModel(new DefaultComboBoxModel(new String[] {"A", "B"}));
		SeccomboBox.setBounds(434, 267, 46, 22);
		frame.getContentPane().add(SeccomboBox);
		
		JButton submitBtn = new JButton("OK");
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String faculty_choice = comboBox_1.getSelectedItem().toString();
				String class_choice = clscomboBox.getSelectedItem().toString();
				String sem_choice = semcomboBox.getSelectedItem().toString();
				String sec_choice = SeccomboBox.getSelectedItem().toString();
				
				
				choiceSubmit(faculty_choice, class_choice, sem_choice, sec_choice);
			}
		});
		submitBtn.setBounds(517, 607, 97, 25);
		frame.getContentPane().add(submitBtn);
		
		
		minvi.setBounds(487, 406, 127, 25);
		frame.getContentPane().add(minvi);
		
		tinvi.setBounds(487, 436, 127, 25);
		frame.getContentPane().add(tinvi);
		tinvi.setVisible(false);
		
		winvi.setBounds(487, 466, 127, 25);
		frame.getContentPane().add(winvi);
		winvi.setVisible(false);
		
		thinvi.setBounds(487, 496, 127, 25);
		frame.getContentPane().add(thinvi);
		thinvi.setVisible(false);
		
		finvi.setBounds(487, 526, 127, 25);
		frame.getContentPane().add(finvi);
		finvi.setVisible(false);
		
		sinvi.setBounds(487, 556, 127, 25);
		frame.getContentPane().add(sinvi);
		
		JButton refreshBtn = new JButton("Refresh");
		refreshBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
			}
		});
		refreshBtn.setBounds(408, 607, 97, 25);
		frame.getContentPane().add(refreshBtn);
		
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
		finalCheckBtn.setBounds(626, 607, 97, 25);
		frame.getContentPane().add(finalCheckBtn);
		sinvi.setVisible(false);
		
		//Labs
		
		
		
		JLabel maxLabel;
		maxLabel = new JLabel("(Max 3)");
		maxLabel.setForeground(new Color(255, 255, 255));
		maxLabel.setBounds(748, 413, 56, 16);
		frame.getContentPane().add(maxLabel);
		
		JCheckBox dandIchckBx = new JCheckBox("Design and Implementation Lab");
		dandIchckBx.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(dandIchckBx.isSelected())
				{
					labs[0] = "Design and Implementation lab";
				}
			}
		});
		dandIchckBx.setBounds(690, 436, 225, 25);
		frame.getContentPane().add(dandIchckBx);
		
		JCheckBox advcmnchckBx = new JCheckBox("Advanced Communication lab");
		advcmnchckBx.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(advcmnchckBx.isSelected())
				{
					labs[1] = "Advanced Communication lab";
				}
			}
		});
		advcmnchckBx.setBounds(690, 466, 197, 25);
		frame.getContentPane().add(advcmnchckBx);
		
		JCheckBox cmoschckBx = new JCheckBox("CMOS VLSI Lab");
		cmoschckBx.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				labs[2] = "CMOS VLSI Lab";
			}
		});
		cmoschckBx.setBounds(690, 491, 167, 25);
		frame.getContentPane().add(cmoschckBx);
		
		JButton btnNewButton_3 = new JButton("Generate");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				generate_window g;
				generate_window.main(null);
				generate_window.printTT(plan, faculty);
			}
		});
		btnNewButton_3.setBounds(523, 667, 97, 25);
		frame.getContentPane().add(btnNewButton_3);
		
		
		
		
		/*
		JLabel lbl4 = new JLabel("");
		lbl4.setBackground(new Color(204, 204, 153));
		Image image5 = new ImageIcon(this.getClass().getResource("/ec3.png")).getImage();
		lbl4.setIcon(new ImageIcon(image5));
		lbl4.setBounds(12, 29, 918, 625);
		frame.getContentPane().add(lbl4);
		*/
		
	
	}
	
	

	@SuppressWarnings("unused")
	protected void choiceSubmit(String faculty_choice, String class_choice, String sem_choice, String sec_choice) 
	{
		// TODO Auto-generated method stub
		
		
		
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
					//System.out.print(spk + " ");
				}
			
					
			
		}
		else if (faculty_choice.equals("GHM"))
		{	
			 ghm_choice =  GetTimeSlot1();
			for(int i =0; i<6; i++)
				{
				/*
				 * try { ghm_option = GetTimeSlotinInt(ghm_choice); } catch(NullPointerException
				 * e) { System.out.println("Null"); }
				 */
					
					 ghm_choice[i]=(ghm_choice[i]==null)?"0":ghm_choice[i].substring(ghm_choice[i].length() - 1);	
					//System.out.print(s + " ");
				}
			
		}
		else if(faculty_choice.equals("MSV"))
		{	
			
		  msv_choice = GetTimeSlot1();
			for(int i =0; i<6; i++)
				{
				/*
				 * try { msv_option= GetTimeSlotinInt(msv_choice); } catch(NullPointerException
				 * e) { System.out.println("Null"); }
				 */
				 msv_choice[i]=(msv_choice[i]==null)?"0":msv_choice[i].substring(msv_choice[i].length() - 1);	
				//System.out.print(s + " ");
			}
			
		}
		else if(faculty_choice.equals("SBR"))
		{	
			sbr_choice=GetTimeSlot1();
			for(int i =0; i<6; i++)
				{
				/*
				 * try { sbr_option = GetTimeSlotinInt(sbr_choice); } catch(NullPointerException
				 * e) { System.out.println("Null"); }
				 */
				sbr_choice[i]=(sbr_choice[i]==null)?"0":sbr_choice[i].substring(sbr_choice[i].length() - 1);	
					
				}
			
		}
		else if(faculty_choice.equals("MS"))
		{	
			 ms_choice = GetTimeSlot1();
			for(int i =0; i<6; i++)
				{
				/*
				 * try { ms_option = GetTimeSlotinInt(ms_choice); } catch(NullPointerException
				 * e) { System.out.println("Null"); }
				 */
				 ms_choice[i]=(ms_choice[i]==null)?"0":ms_choice[i].substring(ms_choice[i].length() - 1);	
				//System.out.print(s + " ");
			}
		}
		else if(faculty_choice.equals("EAM"))
		{	
			 eam_choice = GetTimeSlot1();
			for(int i =0; i<6; i++)
			{	
				/*
				 * try { eam_option = GetTimeSlotinInt(eam_choice); } catch(NullPointerException
				 * e) { System.out.println("Null");
				 * 
				 * }
				 */
			eam_choice[i] =(eam_choice[i]==null)?"0":eam_choice[i].substring(eam_choice[i].length() - 1);	
			//System.out.print(s + " ");
		
			
		}
		
		}
		}
		
	}
	protected String[][] Generate() {
		// TODO Auto-generated method stub
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
	private int[] GetTimeSlotinInt(String[] s) throws NullPointerException {
		// TODO Auto-generated method stub
		int []option = new int[6];
		String dummy = null; 
		for(int i =0; i<6; i++)
			System.out.print(s[i] + "    ");

		for(int i =0; i<6; i++)
		{	//int x= Integer.parseInt(s[i]);
			
			if(dummy.equals(s[i]))
			{
				option[i]=0;
			}
			else
			{char ch = s[i].charAt(3);
			if(ch=='1')
				option[i]=1;
			if(ch=='2')
				option[i] = 2;
			}
			
		}
		
		return option;
	}
	*/
	private void clear() {
		// TODO Auto-generated method stub
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

	protected String[] GetTimeSlot1() {
		// TODO Auto-generated method stub
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
}
