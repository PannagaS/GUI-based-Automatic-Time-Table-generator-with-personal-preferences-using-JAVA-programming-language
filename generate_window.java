package timetablegui;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class generate_window {

	private JFrame frmAsdasd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					generate_window window = new generate_window();
					window.frmAsdasd.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public generate_window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAsdasd = new JFrame();
		frmAsdasd.setTitle("Print window ");
		frmAsdasd.setBounds(100, 100, 1139, 762);
		frmAsdasd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAsdasd.getContentPane().setLayout(null);
		
		JTextPane area = new JTextPane();
		area.setEditable(false);
		area.setBounds(26, 121, 1071, 562);
		frmAsdasd.getContentPane().add(area);
		
		JLabel gnrtTitleLbl = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/sjceHeader.png")).getImage();
		gnrtTitleLbl.setIcon(new ImageIcon(img));
		gnrtTitleLbl.setBounds(26, 13, 532, 109);
		frmAsdasd.getContentPane().add(gnrtTitleLbl);
		
		JLabel lblNewLabel_1 = new JLabel("Batches : B1 , B2, B3, B4");
		lblNewLabel_1.setBounds(556, 23, 403, 90);
		frmAsdasd.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Print ");
		btnNewButton.addActionListener(new ActionListener() {
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
		btnNewButton.setBounds(1000, 23, 97, 25);
		frmAsdasd.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(1000, 69, 97, 25);
		frmAsdasd.getContentPane().add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(971, 13, 138, 95);
		frmAsdasd.getContentPane().add(separator);
		
	}

	public static  void printTT(String plan[][], String faculty[]) {
		String [] sub = {"EC653", "EC630", "EC640", "EC610", "EC620", "EC663"};
		String tt[][] = new String[6][9];
		System.out.println("======================================================================");
		System.out.println("			Mon    Tue    Wed    Thur    Fri    Sat");
		String time = "        7:30-8:30	8:30-9:30  9:30-10:30  11:00-11:50  11:50-12:40  12:40-1:30  2:30-3:30  3:30-4:30   4:30-5:30";
		
		String days[] = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};	
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
	                    tt[l][m] = "Lab Session " + i;
	                    tt[l][m+1] = "Lab Session " + i;
	                    tt[l][m+2] = "Lab Session " + i;
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
					
					if(Integer.parseInt(plan[i][j])==1)
					{
					 for(int r =0; r<6;r++)
					 {
						 for(int c=0; c<6; c++)
						 {	while(flag)
						 	{
							 int R = rnd.nextInt(2);
						 		if(tt[r][c]== null)
						 			{
						 				tt[r][c] = sub[R];
						 				flag = false;
						 			}
						 	}
						 }	
						 
					 }
					}
					else if(Integer.parseInt(plan[i][j])==2)
					{for(int r =0; r<6;r++)
					 {
						 for(int c=3; c<9; c++)	
						 {	int R = rnd.nextInt(2);
						 	while(flag2)
						 	{	if(tt[r][c]==null)
						 		{	
						 			tt[r][c] = sub[R];
						 			flag2= false;
						 		}
						 	}
						 }
					 }
					}
				}
			}
		 
		 
		System.out.println(time);
		for( int i=0; i<=5; i++)
		{
			System.out.print(days[i]+"  \t");
			
			for(int j=0; j<=8; j++)
			{
				if(j == 5 && (i == 0 ||i == 3) ) {
					System.out.print("IC\t       ");
				}
				else if(i==5 && (j==6||j==7||j==8) )
						System.out.print("---------");
				
				else 
					System.out.printf("%-8s     ", tt[ i ] [ j ] );
			}
			System.out.printf("\n");
		}
		
		
	}
}
