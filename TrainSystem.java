import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.util.*;
import java.util.Date;
import java.awt.Color;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.DateFormatSymbols;

public class TrainSystem{
	
    	 JFrame frame = new 	JFrame();
		JFrame frame_aboutus = new JFrame();
		JFrame frame_help = new JFrame();
		JFrame frame_MD = new JFrame();
		JFrame frame_CD = new JFrame();
		JFrame frame_RD = new JFrame();
		boolean valid1 = true;
		ArrayList <Integer> a1 = new ArrayList<Integer>();
		ArrayList <Integer> a2 = new ArrayList<Integer>();
		 JFrame frame_contactUs = new JFrame();
		 JFrame frame_book1 = new JFrame();
		 JFrame frame_receipt = new JFrame();
		JFrame frame_book2 = new JFrame();
		int newset2 = 0;
		String newdate;
		StringBuilder p;
		int olddate = 0;
		int newdate1 = 0;
		JFrame frame_trainTicket2 = new JFrame();
	JFrame frame_trainTicket = new JFrame();
		JFrame frame_book3 = new JFrame();
		JFrame frame_book4 = new JFrame();
		JFrame frame_paymentT = new JFrame();
		JFrame frame_payment = new JFrame();
		 Customer customer1 = new Customer();
		  JFrame frame_print = new JFrame();
		  ArrayList<Integer> reserved2 = new ArrayList<Integer>();
			 JLabel home = new JLabel(new ImageIcon("home.PNG"));
			  JLabel home2 = new JLabel(new ImageIcon("home.PNG"));
		 Ticket ticket1 = new Ticket();
		 ArrayList<Integer> saveArray = new ArrayList<Integer>();
		 int newset = 0;
	 JTextField email_field = new JTextField(10);
	 JTextField name_field = new JTextField(10);
	 JTextField date_filed = new JTextField(10);
	 JTextField noofseats_filed = new JTextField(10);
	JTextField seatno1 = new JTextField(2);
	Date d4= new Date();
	JScrollPane scroll;
	 Seats[] array = new Seats[90];
	
	 String[] time = {"06:00 AM", "09:00 AM", "12:00 PM", "03:00 PM","06:30 PM"};
	
	String[] stop = {"PERLIS","KELANTAN","TERENGGANU", "PAHANG","JOHOR","MELAKA","SEMBILAN","PUTRAJAYA","SELANGOR","kL" ,"PERAK","PINANG","KEDAH"};
	 String[] start = {"PERLIS","KELANTAN","TERENGGANU", "PAHANG","JOHOR","MELAKA","SEMBILAN","PUTRAJAYA","SELANGOR","kL" ,"PERAK","PINANG","KEDAH"};
	 String[] compute = {"PERLIS","KELANTAN","TERENGGANU", "PAHANG","JOHOR","MELAKA","SEMBILAN","PUTRAJAYA","SELANGOR","kL" ,"PERAK","PINANG","KEDAH"};
	 String[] year = {"2018","2019"};
	 String[] day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
	 String[] month = {"1","2","3","4","5","6","7","8","9","10","11","12"};
	
	 JComboBox<String> combobox = new JComboBox<String>(start);
	 JComboBox<String> comboboxtime = new JComboBox<String>(time);
	 JComboBox<String> combobox1 = new JComboBox<String>(stop);
	 JComboBox<String> comboboxYear = new JComboBox<String>(year);
	 JComboBox<String> comboboxDay = new JComboBox<String>(day);
	 JComboBox<String> comboboxMonth = new JComboBox<String>(month);
	
	 boolean twoWay = false;
	
	 JLabel startlabel = new JLabel("START DESTINATION: ");
	 JLabel stoplabel = new JLabel( "STOP DESTINATION  : ");
     JLabel year_label = new JLabel("Year:");
	 JLabel date = new JLabel("Date :");
	 JLabel month_label = new JLabel("Month:");
	 JLabel day_label = new JLabel("Day:");
	 long finalprice = 0;
	 String startchose = " ";
	 String stopchose = " ";
    JLabel time_label = new JLabel("TIME :");
    JLabel noofseat_label = new JLabel("NO OF SEATS:");
	 JLabel back = new JLabel(new ImageIcon("back.PNG"));
    JLabel back1 = new JLabel(new ImageIcon("back.PNG"));
	 JLabel back2 = new JLabel(new ImageIcon("back.PNG"));
	 JLabel back7 = new JLabel(new ImageIcon("back.PNG"));
	 JLabel route = new JLabel(new ImageIcon("route.PNG"));
	 JLabel back8 = new JLabel(new ImageIcon("back.PNG"));
	 JLabel back3 = new JLabel(new ImageIcon("back.PNG"));
	 JLabel back4 = new JLabel(new ImageIcon("back.PNG"));
	 JLabel back9 = new JLabel(new ImageIcon("back.PNG"));
	 JLabel back10 = new JLabel(new ImageIcon("back.PNG"));
	 JLabel cancel = new JLabel(new ImageIcon("cancel.PNG"));
	 int testback = 0;
	
	 JLabel time1 = new JLabel();
	 JLabel L1 = new JLabel("Contact Us", JLabel.LEFT);
	 JLabel L2 = new JLabel("Help", JLabel.CENTER);
	 JLabel L3 = new JLabel("About US", JLabel.RIGHT);
		JLabel L11 = new JLabel("Contact Us", JLabel.LEFT);
	 JLabel L21 = new JLabel("Help", JLabel.CENTER);
	 JLabel L31 = new JLabel("About US", JLabel.RIGHT);
	 JLabel name = new JLabel("Name (as per IC):");
	 JLabel email_Adress = new JLabel("E-mail Address   :");
	 JLabel flightNo = new JLabel("Flight No :");
	 JLabel flightNo1 = new JLabel("FSDF10");
	 JLabel depart = new JLabel("Depart");
	 JLabel arrival = new JLabel("Arrival");
	 JLabel seatNo = new JLabel("Seat No");
	 JLabel total = new JLabel("Total Fare");
	 JLabel total1 = new JLabel();
	 JLabel departstation = new JLabel();
	 JLabel arrivalstation = new JLabel();
	 JLabel occupied = new JLabel("Occupied");
	 JLabel available = new JLabel("available");
	 JLabel selected = new JLabel("Selected");
	ArrayList <Integer> reserved = new ArrayList<>();
		 JLabel back5 = new JLabel(new ImageIcon("back.PNG"));
		 JLabel returnT = new JLabel("TWO-WAY : RETURN");
		 JLabel departT = new JLabel("TWO-WAY : DEPARTURE");
		 JFrame frame_book3T = new JFrame();
		  JLabel time_labeT = new JLabel("TIME :");
		 JLabel dateT = new JLabel("Date :");
		 JComboBox<String> comboboxtimeT = new JComboBox<String>(time);
		 JLabel day_labeT = new JLabel("Day:");
		 JComboBox<String> comboboxDayT = new JComboBox<String>(day);
		 JLabel month_labeT = new JLabel("Month:");
	 JComboBox<String> comboboxMonthT = new JComboBox<String>(month);
	 JComboBox<String> comboboxYearT = new JComboBox<String>(year);
		JLabel year_labeT = new JLabel("Year:");
		 JButton continuebtn2T = new JButton("Continue");
	
	
	 JFrame frame_book4T = new JFrame();
		JLabel back6 = new JLabel(new ImageIcon("back.PNG"));
		Seats[] array2 = new Seats[90];
		JScrollPane scrollT;
		JTextField seatno1T = new JTextField(10);
	
	
	JButton continuebtn = new JButton("Continue");
	JButton continuebtn1 = new JButton("Continue");
   JButton continuebtn2 = new JButton("Continue");
   JButton continueMD = new JButton("Continue");
    JButton continueCD = new JButton("Continue"); 
	JButton continueRD = new JButton("Continue");
	 JButton book = new JButton("Book Now");
	 JButton confirm = new JButton("Confirm");
	 JButton confirmT = new JButton("Confirm");
	 JButton red = new JButton();
	 JButton normal = new JButton();
	 JButton green = new JButton();
	
		JButton receipt = new JButton("Print Ticket Receipt");
	JButton printTicket = new JButton("Print Train Ticket");
		 JButton counter = new JButton("<html> Pay At <br/> Train Counter </html>");
	 JButton mobile = new JButton("<html> Mobile <br/> Payment </html>");
	 JButton card = new JButton("<html>Debit Card<br/> Payment </html>");
	 
	JRadioButton one_way = new JRadioButton("One Way");
	 JRadioButton two_way = new JRadioButton("Two Way");
	
	
	 ButtonGroup buttongroup = new ButtonGroup();
	
	
	 Color c = new Color(255,249,244);
	 Color g = new Color(224,224,224);
	
	String numS = "1";
			
			String nameS = "Mohammed Najib Ahamed Shaaban";
			String dif = "Mohammed Najib Ahamed Shhabannnnnnn";
			String emailS = "mohnajib1243@gmail.com";
			String startS = "salongor";
			String stopS = "Malacka";
			String dateS = "1/2/2018";
			String timeS = "10:34";
			String typeS = "one Way";
			String numberS  = "A3";
			String priceS = "30Rm";
		String num2S = "  ";
		String name2S = "";
			String dif2 = "Mohammed Najib Ahamed Shhabannnnnnn";
			String email2S = "";
			String start2S = "salongor";
			String stop2S = "Malacka";
			String date2S = "1/2/2018";
			String time2S = "10:34";
			String number2S  = "A3";
			String type2S = "       ";
			
			String price2S = "     ";
	
	public static void main(String[] args){
		
	new TrainSystem();
			
	}
	
	public TrainSystem(){
		loadDATE();
		ticket1.set_Ticket_seat1(new Seats());
		ticket1.set_Ticket_seat2(new Seats());
		customer1.set_Cust_Ticket(ticket1);
		continuebtn.addActionListener(actionlistener);
		continuebtn1.addActionListener(actionlistener);
		confirm.addActionListener(actionlistener);
		receipt.addActionListener(actionlistener);
		continuebtn2T.addActionListener(actionlistener);
		counter.addActionListener(actionlistener);
		mobile.addActionListener(actionlistener);
		continueCD.addActionListener(actionlistener);
		continueRD.addActionListener(actionlistener);
		card.addActionListener(actionlistener);
	book.addActionListener(actionlistener);
	printTicket.addActionListener(actionlistener);
	continuebtn2.addActionListener(actionlistener);
		continueMD.addActionListener(actionlistener);
	defined();
	one_way.addActionListener(actionlistener);
	one_way.setActionCommand("one_way");
	two_way.addActionListener(actionlistener);
	two_way.setActionCommand("two_way");
	
		  String dayNames[] = new DateFormatSymbols().getWeekdays();
		 Calendar date2 = Calendar.getInstance();
	  newdate = (String)dayNames[date2.get(Calendar.DAY_OF_WEEK)];
	  
	 
	  Random rand = new Random();
  	 
     int  n = rand.nextInt(15) + 1;
	 
     int  n1;
	 for(int i= 0 ; i < n; i++){
     	 n1 = rand.nextInt(55) + 1;
		 a1.add(n1);
	 }
  
  
	    int  n22 = rand.nextInt(15) + 1;
	 
	
	 
     int  n2;
	 for(int i= 0 ; i < n22; i++){
     	 n2 = rand.nextInt(55) + 1;
		 a2.add(n2);
	 }
	  
	  if(newdate == "Wednesday")
	  newdate1 = 4;
	   else if(newdate =="Sunday")
	   newdate1 = 1;
	   else if(newdate == "Monday")
		   newdate1 = 2;
	   else if(newdate == "Saturday")
		   newdate1 = 0;
	   else if(newdate == "Tuesday")
		   newdate1 = 3;
	   else if(newdate == "Thursday")
		   newdate1 = 5;
	   else if(newdate == "Friday")
		   newdate1 = 6;
	   
	   
	if(newdate1 != olddate)
		clear1();
		 recordDate();
	
		
		first_screen();
	
	}
	
	public void loadDATE(){
		java.io.File file = new java.io.File("date.txt");
		try{
			
			Scanner input1 = new Scanner (file);
	olddate = input1.nextInt();
		
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
	}
	
	public void save(){
	
		
				try {
					saveArraySize();
			File dir = new File(".");
		String loc = dir.getCanonicalPath() + File.separator + "information.txt";
		saveArray.add(1);
		numS = saveArray.size()+"";
		
		saveArraySize2();
		FileWriter fstream = new FileWriter(loc, true);
		BufferedWriter out = new BufferedWriter(fstream);
		int different = dif.length() - nameS.length();
		
		for(int i =0; i< different; i++)
			nameS = nameS +" ";
		
		name2S = "";
		 email2S = "";
		for(int i =0; i < dif.length(); i++){
			name2S = name2S + " ";
			email2S = email2S + " ";
			
		}
		
		int different2 = dif.length() - emailS.length();
		for(int i =0; i< different2; i++)
			emailS = emailS +" ";
	
		if(finalprice < 99){
			priceS = priceS+" ";
	
		}
	price2S = "";
	for(int i=0; i< priceS.length(); i++)
		price2S = price2S+" ";
	price2S = price2S + " ";
			 out.newLine();
			 
      out.write(String.format("%2s  %1s %20s %9s %15s  %7s %12s  %7s %12s %7s %8s  %2s %6s %1s %7s  %5s %6s  %5s %4s  %6s", 
	  numS,'|', nameS, '|',  emailS, '|',  startS, '|', stopS, '|',
	 dateS,'|', timeS, '|',  typeS, '|',  numberS, '|', priceS, '|'));
	 out.newLine();
	 if(twoWay == true){
		 out.write(String.format("%1s  %1s %20s %9s %15s  %7s %12s  %7s %12s %7s %8s  %2s %6s %1s %7s  %5s %6s  %5s %4s %6s", 
	  num2S,'|', name2S, '|',  email2S, '|',  start2S, '|', stop2S, '|',
	 date2S,'|', time2S, '|',  type2S, '|',  number2S, '|', price2S, '|'));
	 out.newLine();
	 }
	 out.write("----|---------------------------------------------|--------------------------------------------|"+
	 "---------------------|--------------------|------------|----------|--------------|-------------|-------------|");
		
 
		
		
 
		//close buffer writer
		out.close();
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
	
	
	 void first_screen(){
	
	
		JPanel p1 = new JPanel();
		JLabel l = new JLabel(new ImageIcon("logo.jpg"));
		p1.setLayout(new BorderLayout());
		p1.setBackground(c);
		p1.add(l, BorderLayout.CENTER);
		close(frame_book1);
		testback = 1;
		L1.setBounds(127,200, 120, 50);
		L1.setFont(new java.awt.Font("Times New Roman", 1, 24));
		

		L2.setBounds(294,200, 100, 50);
		L2.setFont(new java.awt.Font("Times New Roman", 1, 24));

		
		L3.setBounds(461,200, 100, 50);
		L3.setFont(new java.awt.Font("Times New Roman", 1, 24));
		
		book.setBackground(Color.red);
		book.setForeground(Color.white);
		book.setFont(new java.awt.Font("Times New Roman", 1, 24));
		book.setBorder(BorderFactory.createLineBorder(Color.gray, 4));
		book.setBounds(260,350, 180, 65);
	
		JLabel L4 = new JLabel(" ");
		frame.setLayout(new BorderLayout());
		frame.getContentPane().setBackground(c);
		frame.add(p1, BorderLayout.NORTH);
		frame.add(L1);
		frame.add(L2);
		frame.add(L3);
		frame.add(book);
		frame.add(L4);

		
	frame.setVisible(true);
	frame.setLocation(500,180);
	frame.setResizable(false);
		frame.setSize(700, 550);
		
	}
	
	 void close(JFrame f){
		WindowEvent winClosingEvent = new WindowEvent(f, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
	    public void saveArraySize2(){
			 try{
			BufferedWriter r = new BufferedWriter(new FileWriter("secret2.txt"));
			for(int i = 0; i < saveArray.size(); i++){
				r.write(saveArray.get(i) + " ");
		r.write("\n");
			}
			r.close();
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		 }
		 
	 void aboutus_screen(){
		  
		  JPanel p = new JPanel();
		
		JLabel logo = new JLabel(new ImageIcon("relogo.jpg"));
		p.setLayout(new BorderLayout());
		p.setBackground(c);
		p.add(logo, BorderLayout.WEST);
		JLabel head = new JLabel("       1. ABOUT US ");
		head.setFont(new java.awt.Font("Times New Roman", 1,45));
		p.add(head, BorderLayout.CENTER);
		
		testback = 2;
		  
		L1 = new JLabel("Contact Us", JLabel.LEFT);
	L2 = new JLabel("Help", JLabel.CENTER);
	L3 = new JLabel("About US", JLabel.RIGHT);
	book = new JButton("Book Now");
		 defined();
		
		  L3.setForeground(Color.red);
	  // book = new JButton(" Book Now ");
	L1.setFont(new java.awt.Font("Times New Roman", 1, 24));
	L2.setFont(new java.awt.Font("Times New Roman", 1, 24));
	L3.setFont(new java.awt.Font("Times New Roman", 1, 24));
			frame_aboutus.getContentPane().setBackground(c);
			frame_aboutus.setLayout(new BorderLayout());
			frame_aboutus.add(p, BorderLayout.NORTH);
			frame_aboutus.add(new JLabel(new ImageIcon("aboutus.PNG")), BorderLayout.CENTER);
		  JPanel p2 = new JPanel();
		  JPanel sub = new JPanel();
		   JPanel sub2 = new JPanel();
		  JPanel sub1 = new JPanel();
		  p2.setLayout(new GridLayout(7,1, 10, 10));
		 
		book.setBackground(Color.red);
		book.setForeground(Color.white);
		book.setFont(new java.awt.Font("Times New Roman", 1, 24));
		book.setBorder(BorderFactory.createLineBorder(Color.gray, 4));
		book.setMargin(new Insets(1, 1, 1, 1) );
		book.setSize(50, 30);
			
		p2.setBackground(c);
		p2.add(L1);
		p2.add(L2);
		p2.add(L3);
		p2.add(book);
		
		//  p2.add(book, BorderLayout.SOUTH);
		  frame_aboutus.add(p2, BorderLayout.WEST);
		frame_aboutus.getContentPane().setBackground(c);
		  frame_aboutus.setVisible(true);
		frame_aboutus.setSize(700, 550);
		frame_aboutus.setLocation(500, 180);
		frame_aboutus.setResizable(false);
		
	  }
	  
	  void saveArraySize(){
		  java.io.File file = new java.io.File("secret2.txt");
		  saveArray.clear();
		try{
			
			Scanner input1 = new Scanner (file);
			while(input1.hasNext())
			{
				int num2 = input1.nextInt();
				
				
				saveArray.add(num2);
			}
		
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
	  }
	  
	  
	    void help_screen(){
		  
		  JPanel p = new JPanel();
		
		JLabel logo = new JLabel(new ImageIcon("relogo.jpg"));
		p.setLayout(new BorderLayout());
		p.setBackground(c);
		p.add(logo, BorderLayout.WEST);
		JLabel head = new JLabel("         HELP ");
		head.setFont(new java.awt.Font("Times New Roman", 1,45));
		p.add(head, BorderLayout.CENTER);
		
		testback = 3;
		
			L1 = new JLabel("Contact Us", JLabel.LEFT);
	L2 = new JLabel("Help", JLabel.CENTER);
	L3 = new JLabel("About US", JLabel.RIGHT);
	book = new JButton("Book Now");
		 defined();
		 
		 L2.setForeground(Color.red);
	  // book = new JButton(" Book Now ");
	L1.setFont(new java.awt.Font("Times New Roman", 1, 24));
	L2.setFont(new java.awt.Font("Times New Roman", 1, 24));
	L3.setFont(new java.awt.Font("Times New Roman", 1, 24));
			frame_help.getContentPane().setBackground(c);
			frame_help.setLayout(new BorderLayout());
			frame_help.add(p, BorderLayout.NORTH);
			frame_help.add(new JLabel(new ImageIcon("help.PNG")), BorderLayout.CENTER);
		  JPanel p2 = new JPanel();
		  JPanel sub = new JPanel();
		   JPanel sub2 = new JPanel();
		  JPanel sub1 = new JPanel();
		  p2.setLayout(new GridLayout(7,1, 10, 10));
		 
		book.setBackground(Color.red);
		book.setForeground(Color.white);
		book.setFont(new java.awt.Font("Times New Roman", 1, 24));
		book.setBorder(BorderFactory.createLineBorder(Color.gray, 4));
		book.setMargin(new Insets(1, 1, 1, 1) );
		book.setSize(50, 30);
			
		p2.setBackground(c);
		p2.add(L1);
		p2.add(L2);
		p2.add(L3);
		p2.add(book);
		
		//  p2.add(book, BorderLayout.SOUTH);
		  frame_help.add(p2, BorderLayout.WEST);
		frame_help.getContentPane().setBackground(c);
		  frame_help.setVisible(true);
		frame_help.setSize(700, 550);
		frame_help.setLocation(500, 180);
		frame_help.setResizable(false);
		
	  }
	  
	  
	   void contactUs_screen(){
		  
		  JPanel p = new JPanel();
		
		JLabel logo = new JLabel(new ImageIcon("relogo.jpg"));
		p.setLayout(new BorderLayout());
		p.setBackground(c);
		p.add(logo, BorderLayout.WEST);
		JLabel head = new JLabel("     CONTACT US ");
		head.setFont(new java.awt.Font("Times New Roman", 1,45));
		p.add(head, BorderLayout.CENTER);
		
		testback = 4;
	
		
		 	L1 = new JLabel("Contact Us", JLabel.LEFT);
	L2 = new JLabel("Help", JLabel.CENTER);
	L3 = new JLabel("About US", JLabel.RIGHT);
	book = new JButton("Book Now");
		 defined();
		  L1.setForeground(Color.red);
	  
	L1.setFont(new java.awt.Font("Times New Roman", 1, 24));
	L2.setFont(new java.awt.Font("Times New Roman", 1, 24));
	L3.setFont(new java.awt.Font("Times New Roman", 1, 24));

			frame_contactUs.getContentPane().setBackground(c);
			frame_contactUs.setLayout(new BorderLayout());
			frame_contactUs.add(p, BorderLayout.NORTH);
			frame_contactUs.add(new JLabel(new ImageIcon("contactus.PNG")), BorderLayout.CENTER);
		  JPanel p2 = new JPanel();
		  JPanel sub = new JPanel();
		   JPanel sub2 = new JPanel();
		  JPanel sub1 = new JPanel();
		  p2.setLayout(new GridLayout(7,1, 10, 10));
		 
		book.setBackground(Color.red);
		book.setForeground(Color.white);
		book.setFont(new java.awt.Font("Times New Roman", 1, 24));
		book.setBorder(BorderFactory.createLineBorder(Color.gray, 4));
		book.setMargin(new Insets(1, 1, 1, 1) );
		book.setSize(50, 30);
			
		p2.setBackground(c);
		p2.add(L1);
		p2.add(L2);
		p2.add(L3);
		p2.add(book);
		
		//  p2.add(book, BorderLayout.SOUTH);
		  frame_contactUs.add(p2, BorderLayout.WEST);
		frame_contactUs.getContentPane().setBackground(c);
		  frame_contactUs.setVisible(true);
		frame_contactUs.setSize(700, 550);
		frame_contactUs.setLocation(500, 180);
		frame_contactUs.setResizable(false);
		
	  }
	  
	  
	  
	  
	  
	void book1(){
	
		JPanel p = new JPanel();
	finalprice = 0;
		name_field.setText(null);
	email_field.setText(null);
		JLabel logo = new JLabel(new ImageIcon("relogo.jpg"));
		p.setLayout(new BorderLayout());
		p.setBackground(c);
		JPanel west = new JPanel();
		p.add(logo, BorderLayout.WEST);
	cancel = new JLabel(new ImageIcon("cancel.PNG"));
		JLabel head = new JLabel("1. FILL IN YOUR DETAILS: ");
		head.setFont(new java.awt.Font("Times New Roman", 1,29));
		p.add(head, BorderLayout.CENTER);
		
		west.setLayout(new FlowLayout());
		if(testback != 1)
			west.add(back);
		west.add(cancel);
		west.setBackground(c);
		back.setBackground(c);
		back.setSize(200, 200);
			p.add(west, BorderLayout.EAST);
	
			frame_book1.getContentPane().setBackground(c);
			frame_book1.setLayout(new BorderLayout());
			frame_book1.add(p, BorderLayout.NORTH);
			back = new JLabel(new ImageIcon("back.PNG"));
		defined();
			name.setBounds(100, 190, 170, 100);
			
			email_Adress.setBounds(100, 240, 170, 100);
			
			
			name_field.setBounds(280, 225, 300 , 30);
		
				email_field.setBounds(280, 275, 300 , 30);
				
			JPanel p1 = new JPanel();
			name.setLabelFor(name_field);
			name.setFont(new java.awt.Font("Times New Roman", 1, 20));
			
			p1.setLayout(new BorderLayout());
			p1.add(name, BorderLayout.WEST);
			p1.add(name_field, BorderLayout.CENTER);
		
	
		continuebtn.setBackground(Color.red);
		continuebtn.setForeground(Color.white);
		continuebtn.setFont(new java.awt.Font("Times New Roman", 1, 24));
		continuebtn.setBorder(BorderFactory.createLineBorder(Color.gray, 4));
		continuebtn.setBounds(280,350, 150, 45);
			email_Adress.setFont(new java.awt.Font("Times New Roman", 1, 20));
		
		
			frame_book1.add(name);
			frame_book1.add(name_field);
			frame_book1.add(email_Adress);
			frame_book1.add(email_field);
			frame_book1.add(continuebtn);
			JLabel D = new JLabel(" ");
			frame_book1.add(D);
		  frame_book1.setVisible(true);
		frame_book1.setSize(700, 550);
		frame_book1.setResizable(false);
		frame_book1.setLocation(500, 180);
	}
	
	
	void book2(){
		
		JPanel p = new JPanel();
		
		JLabel logo = new JLabel(new ImageIcon("relogo.jpg"));
		p.setLayout(new BorderLayout());
		p.setBackground(c);
		JPanel west = new JPanel();
		back1 = new JLabel(new ImageIcon("back.PNG"));
		west.setBackground(c);
		west.setLayout(new FlowLayout());
		p.add(logo, BorderLayout.WEST);
		cancel = new JLabel(new ImageIcon("cancel.PNG"));
		valid1 = true;
		JLabel head = new JLabel("2. PICK YOUR DESTINATION ");
		head.setFont(new java.awt.Font("Times New Roman", 1,27));
		p.add(head, BorderLayout.CENTER);
		west.add(back1);
		west.add(cancel);
		defined();
		frame_book2.setLayout(new BorderLayout());
		back1.setBackground(c);
		back1.setSize(200, 200);
		
		p.add(west, BorderLayout.EAST);
		frame_book2.add(p, BorderLayout.NORTH);
		
		route = new JLabel(new ImageIcon("route.PNG"));
		route.setBounds(170, 0, 390, 350);
		frame_book2.add(route);
		
		
		
		startlabel.setBounds(70, 220, 200, 100);
		combobox.setBounds(280, 252, 300 , 30);
		
		stoplabel.setBounds(70, 270, 200, 100);
		combobox1.setBounds(280, 305, 300 , 30);
		
		startlabel.setFont(new java.awt.Font("Times New Roman", 1, 18));
		stoplabel.setFont(new java.awt.Font("Times New Roman", 1, 18));
		frame_book2.add(startlabel);
		
		frame_book2.add(combobox);
		combobox.setBackground(c);
		combobox1.setBackground(c);
		frame_book2.add(combobox1);
		frame_book2.add(stoplabel);
		
		buttongroup.add(one_way); buttongroup.add(two_way);
		one_way.setBounds(260, 355, 100 , 30);
		two_way.setBounds(360, 355, 100 , 30);
		one_way.setBackground(c);
		two_way.setBackground(c);
		continuebtn1.setBackground(Color.red);
		continuebtn1.setForeground(Color.white);
		continuebtn1.setFont(new java.awt.Font("Times New Roman", 1, 24));
		continuebtn1.setBorder(BorderFactory.createLineBorder(Color.gray, 4));
		continuebtn1.setBounds(280,410, 150, 45);
		
			frame_book2.getContentPane().setBackground(c);
			frame_book2.add(one_way);
			frame_book2.add(two_way);
			
			
			frame_book2.add(continuebtn1);
			JLabel d = new JLabel();
			frame_book2.add(d);
			
			
			 frame_book2.setVisible(true);
			 frame_book2.setResizable(false);
		frame_book2.setSize(700, 550);
		frame_book2.setLocation(500, 180);
	}
	
	 void book3(){
		frame_book3 = new JFrame();
		JPanel p = new JPanel();
		cancel = new JLabel(new ImageIcon("cancel.PNG"));
		JLabel logo = new JLabel(new ImageIcon("relogo.jpg"));
		p.setLayout(new BorderLayout());
		JPanel west = new JPanel();
		west.setLayout(new FlowLayout());
		west.setBackground(c);
		
		p.setBackground(c);
		p.add(logo, BorderLayout.WEST);
		JLabel head = new JLabel("3. PICK TIME, DATE AND NO OF SEATS ");
		head.setFont(new java.awt.Font("Times New Roman", 1,19));
		p.add(head, BorderLayout.CENTER);
		back2.setBackground(c);
		west.add(back2);
		west.add(cancel);
		defined();
		back2.setSize(200, 200);
		departT = new JLabel("TWO-WAY : DEPARTURE");
		departT.setBounds(215, 100 , 300, 50);
		departT.setFont(new java.awt.Font("Times New Roman", 1, 23));
		departT.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		if(twoWay == true)
		frame_book3.add(departT);
		
		frame_book3.add(p, BorderLayout.NORTH);
		frame_book3.setLayout(new BorderLayout());
		p.add(west, BorderLayout.EAST);
		date = new JLabel("Date :");
		date.setFont(new java.awt.Font("Times New Roman", 1, 22));
		back2 = new JLabel(new ImageIcon("back.PNG"));
		defined();
		time_label.setBounds(145, 255, 200, 100);
		time_label.setFont(new java.awt.Font("Times New Roman", 1, 18));
		comboboxtime.setBounds(220, 290, 300 , 30);
		comboboxtime.setBackground(c);
		
		

		
		date.setBounds(95, 185, 200 , 100);
		day_label.setBounds(160, 220, 200, 30);
		day_label.setFont(new java.awt.Font("Times New Roman", 1, 18));
		comboboxDay.setBounds(205, 220, 80, 30);
		frame_book3.add(date);
		month_label.setBounds(295, 220, 200, 30);
		month_label.setFont(new java.awt.Font("Times New Roman", 1, 18));
		comboboxMonth.setBounds(355, 220, 80, 30);
		comboboxDay.setBackground(c);
		comboboxMonth.setBackground(c);
		comboboxYear.setBackground(c);
		
		year_label.setBounds(445, 220, 200, 30);
		year_label.setFont(new java.awt.Font("Times New Roman", 1, 18));
		comboboxYear.setBounds(490, 220, 80, 30);
		
		
		continuebtn2.setBackground(Color.red);
		continuebtn2.setForeground(Color.white);
		continuebtn2.setFont(new java.awt.Font("Times New Roman", 1, 24));
		continuebtn2.setBorder(BorderFactory.createLineBorder(Color.gray, 4));
		continuebtn2.setBounds(285,360, 150, 55);
		
		frame_book3.add(time_label);
		frame_book3.add(continuebtn2);
		frame_book3.add(comboboxtime);
		frame_book3.add(day_label);
		frame_book3.add(comboboxDay);
		frame_book3.add(year_label);
		frame_book3.add(month_label);
		frame_book3.add(comboboxMonth);
		frame_book3.add(comboboxYear);
		JLabel d = new JLabel();
		frame_book3.add(time_label);
		
		startchose = (String)combobox.getSelectedItem();
		stopchose = (String)combobox1.getSelectedItem();
		
		int comp1 = 0;
		int comp2 = 0;
		finalprice = 0;
		for(int i =0; i < compute.length; i++){
			if(compute[i] == startchose)
				comp1 = i;
			if(compute[i] == stopchose)
				comp2 = i;
		}
	
		if(comp1 == comp2)
			finalprice = 120;
		else if(comp1 < comp2)
		{
			for(int i=comp1; i< comp2; i++)
				finalprice = finalprice + 10;
		}
		else if(comp1 > comp2){
			for(int i =comp1; i < compute.length; i++){
				finalprice = finalprice + 10;
				
			}
			
			for(int i= 0; i < comp2; i++){
				finalprice = finalprice + 10;
			}
		}
		

		
		frame_book3.add(d);
				frame_book3.add(p, BorderLayout.NORTH);
				frame_book3.getContentPane().setBackground(c);
		frame_book3.setVisible(true);
			 frame_book3.setResizable(false);
		frame_book3.setSize(700, 550);
		frame_book3.setLocation(500, 180);
	
	}
	
	
		 void book3T(){
		frame_book3T = new JFrame();
		
		JPanel p = new JPanel();
		cancel = new JLabel(new ImageIcon("cancel.PNG"));
		JLabel logo = new JLabel(new ImageIcon("relogo.jpg"));
		p.setLayout(new BorderLayout());
		JPanel west = new JPanel();
		west.setLayout(new FlowLayout());
		west.setBackground(c);
			back5 = new JLabel(new ImageIcon("back.PNG"));
		p.setBackground(c);
		p.add(logo, BorderLayout.WEST);
		JLabel head = new JLabel("3. PICK TIME, DATE AND NO OF SEATS ");
		head.setFont(new java.awt.Font("Times New Roman", 1,20));
		p.add(head, BorderLayout.CENTER);
		back5.setBackground(c);
		west.add(back5);
		west.add(cancel);
		
		back5.setSize(200, 200);
		
		frame_book3T.add(p, BorderLayout.NORTH);
		frame_book3T.setLayout(new BorderLayout());
		p.add(west, BorderLayout.EAST);
		dateT = new JLabel("Date :");
		dateT.setFont(new java.awt.Font("Times New Roman", 1, 22));
	
		
		time_labeT.setBounds(145, 255, 200, 100);
		time_labeT.setFont(new java.awt.Font("Times New Roman", 1, 18));
		comboboxtimeT.setBounds(220, 290, 300 , 30);
		comboboxtimeT.setBackground(c);
		returnT = new JLabel(" TWO-WAY : RETURN");
		returnT.setBounds(230, 100 , 270, 50);
		returnT.setFont(new java.awt.Font("Times New Roman", 1, 23));
		returnT.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		frame_book3T.add(returnT);
		

		
		dateT.setBounds(95, 185, 200 , 100);
		day_labeT.setBounds(160, 220, 200, 30);
		day_labeT.setFont(new java.awt.Font("Times New Roman", 1, 18));
		comboboxDayT.setBounds(205, 220, 80, 30);
		frame_book3T.add(dateT);
		month_labeT.setBounds(295, 220, 200, 30);
		month_labeT.setFont(new java.awt.Font("Times New Roman", 1, 18));
		comboboxMonthT.setBounds(355, 220, 80, 30);
		comboboxDayT.setBackground(c);
		comboboxMonthT.setBackground(c);
		comboboxYearT.setBackground(c);
		
		year_labeT.setBounds(445, 220, 200, 30);
		year_labeT.setFont(new java.awt.Font("Times New Roman", 1, 18));
		comboboxYearT.setBounds(490, 220, 80, 30);
		
		defined();
		continuebtn2T.setBackground(Color.red);
		continuebtn2T.setForeground(Color.white);
		continuebtn2T.setFont(new java.awt.Font("Times New Roman", 1, 24));
		continuebtn2T.setBorder(BorderFactory.createLineBorder(Color.gray, 4));
		continuebtn2T.setBounds(285,360, 150, 55);
		
		frame_book3T.add(time_labeT);
		frame_book3T.add(continuebtn2T);
		frame_book3T.add(comboboxtimeT);
		frame_book3T.add(day_labeT);
		frame_book3T.add(comboboxDayT);
		frame_book3T.add(year_labeT);
		frame_book3T.add(month_labeT);
		frame_book3T.add(comboboxMonthT);
		frame_book3T.add(comboboxYearT);
		JLabel d = new JLabel();
		frame_book3T.add(time_labeT);
		
		
		
		frame_book3T.add(d);
				frame_book3T.add(p, BorderLayout.NORTH);
				frame_book3T.getContentPane().setBackground(c);
		frame_book3T.setVisible(true);
			 frame_book3T.setResizable(false);
		frame_book3T.setSize(700, 550);
		frame_book3T.setLocation(500, 180);
	
	}
	
	
	void book4(){
		ticket1.get_Ticket_seat1(). set_Seat_Id(" ");
		frame_book4 = new JFrame();
			JPanel p = new JPanel();
		back3 = new JLabel(new ImageIcon("back.PNG"));
		confirm = new JButton("Confirm");
		JLabel logo = new JLabel(new ImageIcon("relogo.jpg"));
		p.setLayout(new BorderLayout());
		p.setBackground(c);
		JPanel west = new JPanel();
		west.setLayout(new FlowLayout());
		west.setBackground(c);
		cancel = new JLabel(new ImageIcon("cancel.PNG"));
		p.add(logo, BorderLayout.WEST);
		defined();
		JLabel head = new JLabel();
		if(twoWay == false)
		 head = new JLabel("         4. PICK SEATS [ONE-WAY] ");
	else
		 head = new JLabel("4. PICK SEATS [TWO-WAY DEPART]");
		head.setFont(new java.awt.Font("Times New Roman", 1,21));
		p.add(head, BorderLayout.CENTER);
		back3.setBackground(c);
		west.add(back3);
		west.add(cancel);
		back3.setSize(200, 200);
		JButton temp = new JButton();
		int a = 0, b = 0, c1 = 0, d = 0;
		frame_book4.setLayout(new BorderLayout());
		p.add(west, BorderLayout.EAST);
		
			frame_book4.add(p, BorderLayout.NORTH);
		frame_book4.setSize(700, 550);
		JPanel panalscroll = new JPanel();
		panalscroll.setLayout(new GridLayout(16, 5, 15,15));
	
	array = new Seats[90];
	
		
		
		int az = 0;
		 frame_book4.setResizable(false);
		 frame_book4.getContentPane().setBackground(c);
		 frame_book4.setVisible(true);
			frame_book4.setLocation(500, 180);
			JLabel window = new JLabel();
			JLabel alsle = new JLabel();
			
			
			for(int i =0 ; i < 90; i++)
				array[i] = new Seats();
		for(int i =0; i< 16; i++){
			for(int j = 0; j < 5; j++)
			{
			if(j == 0)
			{
				if(a == 0){
					window = new  JLabel ("Windows");
					window.setFont(new java.awt.Font("Times New Roman", 1,18));
					panalscroll.add(window);
				}
				else{
				array[az].setButton(new JButton("A"+a));
					array[az].getButton().setBackground(g);
				panalscroll.add(array[az].getButton());
				az++;
				}
				a++;
				
			}
			else if(j == 1){
				if(b == 0){
					alsle  = new JLabel ("      Aisle");
					alsle.setFont(new java.awt.Font("Times New Roman", 1,18));
					panalscroll.add(alsle);
				}
				else{
				array[az].setButton(new JButton("B"+b));
				panalscroll.add(array[az].getButton());
				array[az].getButton().setBackground(g);
				az++;
					
				}
				b++;
			}
			else if(j == 3){
				if(c1 == 0){
					alsle = new JLabel ("       Aisle");
					alsle.setFont(new java.awt.Font("Times New Roman", 1,18));
					panalscroll.add(alsle);
				}
				else{
				array[az].setButton(new JButton("C"+c1));
					array[az].getButton().setBackground(g);
				panalscroll.add(array[az].getButton());
				az++;
				}
				c1++;
			}
			
			else if(j == 4){
				if(d == 0){
					window = new JLabel ("Windows");
					window.setFont(new java.awt.Font("Times New Roman", 1,18));
					panalscroll.add(window);
				}
				
				else{
				array[az].setButton(new JButton("D"+d));
				array[az].getButton().setBackground(g);
				panalscroll.add(array[az].getButton());
				az++;
				}
				
				d++;
			}
			
				else if(j == 2){
					array[az].setButton(new JButton());
					array[az].getButton().setBackground(c);
					array[az].getButton().setBorderPainted(false);
					array[az].getButton().setEnabled(false);
					panalscroll.add(array[az].getButton());
					
				}
				
				panalscroll.setPreferredSize(new Dimension(10, 800));
			}
		}
	
	panalscroll.setBackground(c);
	reserved.clear();
		java.io.File file = new java.io.File("secret.txt");
		try{
			
			Scanner input1 = new Scanner (file);
			while(input1.hasNext())
			{
				reserved.add(input1.nextInt());
				
			
			}
		
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		
		
	for(int i=0; i <reserved.size(); i++){
		 array[reserved.get(i)].getButton().setBackground(Color.red);
		array[reserved.get(i)].set_Seat_State1(false);
	}
	
		
	
	 for(int i= 0 ; i < a1.size(); i++){
		 array[a1.get(i)].getButton().setBackground(Color.red);
		 array[a1.get(i)].set_Seat_State1(false);
	 }

	
    scroll = new JScrollPane(panalscroll);
		frame_book4.add(scroll, BorderLayout.CENTER);
		
		//scroll.setBorder(null);
		JPanel panalwest = new JPanel();
		 
		flightNo = new JLabel("   ");
	flightNo1 = new JLabel("    ");
	flightNo.setFont(new java.awt.Font("Times New Roman", 1,16));
	flightNo1.setFont(new java.awt.Font("Times New Roman", 1,16));
		panalwest.setLayout(new GridLayout(10,2,2,1));
		
		panalwest.add(flightNo);
		panalwest.add(flightNo1);
		
	
		depart = new JLabel("Depart :");
		panalwest.add(depart);
			departstation = new JLabel();
		depart.setFont(new java.awt.Font("Times New Roman", 1,18));
		departstation.setText((String)combobox.getSelectedItem());
		departstation.setFont(new java.awt.Font("Times New Roman", 1,14));
		panalwest.add(departstation);
		
	
	arrival = new JLabel("Arrival:");
	arrival.setFont(new java.awt.Font("Times New Roman", 1,18));
		arrivalstation.setText((String)combobox1.getSelectedItem());
	arrivalstation.setFont(new java.awt.Font("Times New Roman", 1,14));
		panalwest.add(arrival);
		panalwest.add(arrivalstation);
		
	
		arrivalstation = new JLabel();
		
	
	
	seatNo = new JLabel("Seat No:");
	seatno1 = new JTextField(2);

	seatNo.setFont(new java.awt.Font("Times New Roman", 1,18));
	seatno1.setFont(new java.awt.Font("Times New Roman", 1,18));
	panalwest.add(seatNo);
	panalwest.add(seatno1);
	
    total = new JLabel("Total Fare :");
	if(valid1 == true && twoWay == true){
    
finalprice = finalprice + finalprice;
		total1 = new JLabel("RM"+finalprice);
		valid1 = false;
	}
	else {
		total1 = new JLabel("RM"+finalprice);
	}
		
    total.setFont(new java.awt.Font("Times New Roman", 1,18));
	total1.setFont(new java.awt.Font("Times New Roman", 1,16));
	panalwest.add(total);
	panalwest.add(total1);
	
	time_label = new JLabel("TIME :");
	
	String timetemp = (String)comboboxtime.getSelectedItem();
	time1 = new JLabel(timetemp);
		time_label.setFont(new java.awt.Font("Times New Roman", 1,16));
	time1.setFont(new java.awt.Font("Times New Roman", 1,18));
	panalwest.add(time_label);
	panalwest.add(time1);
	

	
	
	
	occupied = new JLabel("Occupied");
	available = new JLabel("Available");
	selected = new JLabel("Selected ");
	occupied.setFont(new java.awt.Font("Times New Roman", 1,18));
	selected.setFont(new java.awt.Font("Times New Roman", 1,18));
	available.setFont(new java.awt.Font("Times New Roman", 1,18));
		red = new JButton();
	normal = new JButton();
	green = new JButton();
	red.setBackground(Color.red);
	normal.setBackground(g);
	green.setBackground(Color.green);
	//red.setSize(10, 10);
	
	
	panalwest.add(red);
	panalwest.add(occupied);
	panalwest.add(normal);
	panalwest.add(available);
	panalwest.add(green);
	panalwest.add(selected);
	
	
	 for (int i = 0; i < az; i++) {
      
       array[i].getButton().addActionListener(listener);
        
    }
	
	panalwest.setBackground(c);

		
		frame_book4.add(panalwest, BorderLayout.WEST);
		
		
		confirm.setBackground(Color.red);
		
		confirm.setForeground(Color.white);
		confirm.setFont(new java.awt.Font("Times New Roman", 1, 24));
		confirm.setBorder(BorderFactory.createLineBorder(Color.gray, 4));
		confirm.setSize(180, 65);
		JPanel psouth = new JPanel();
		psouth.setLayout(new GridLayout(1, 7, 3, 3));
		psouth.setBackground(c);
		JButton s2 = new JButton("   ");
		JButton s5 = new JButton("   ");
		JButton s1 = new JButton("   ");
		JButton s3 = new JButton("   ");
		JButton s4 = new JButton("   ");
		s2.setBackground(c);
		s1.setBackground(c);
		s3.setBackground(c);
		s4.setBackground(c);
		s5.setBackground(c);
		psouth.add(s1);
		psouth.add(s2);
		psouth.add(s5);
		psouth.add(confirm);
		psouth.add(s3);
		psouth.add(s4);
		s2.setEnabled(false);
		s5.setEnabled(false);
		s1.setEnabled(false);
		s3.setEnabled(false);
		s3.setEnabled(false);
		s1.setBorderPainted(false);
		s5.setBorderPainted(false);
		s2.setBorderPainted(false);
		s3.setBorderPainted(false);
		s4.setBorderPainted(false);
		frame_book4.add(psouth, BorderLayout.SOUTH);
		
	}
	
	
	
	
	
	
	
	
	
	void book4T(){
		
		
		
		ticket1.get_Ticket_seat2(). set_Seat_Id(" ");
		
		
		frame_book4T = new JFrame();
			JPanel p = new JPanel();
		back6 = new JLabel(new ImageIcon("back.PNG"));
			confirmT = new JButton("Confirm");
		JLabel logo = new JLabel(new ImageIcon("relogo.jpg"));
		p.setLayout(new BorderLayout());
		p.setBackground(c);
		JPanel west = new JPanel();
		west.setLayout(new FlowLayout());
		west.setBackground(c);
		cancel = new JLabel(new ImageIcon("cancel.PNG"));
		p.add(logo, BorderLayout.WEST);
		defined();
		JLabel head = new JLabel("4. PICK SEATS [TWO-WAY RETURN]");
		head.setFont(new java.awt.Font("Times New Roman", 1,21));
		p.add(head, BorderLayout.CENTER);
		back6.setBackground(c);
		west.add(back6);
		west.add(cancel);
		back6.setSize(200, 200);
		JButton temp = new JButton();
		int a = 0, b = 0, c1 = 0, d = 0;
		frame_book4T.setLayout(new BorderLayout());
		p.add(west, BorderLayout.EAST);
		
			frame_book4T.add(p, BorderLayout.NORTH);
		frame_book4T.setSize(700, 550);
		JPanel panalscroll = new JPanel();
		panalscroll.setLayout(new GridLayout(16, 5, 15,15));
	
	array2 = new Seats[90];
		
		int az = 0;
		 frame_book4T.setResizable(false);
		 frame_book4T.getContentPane().setBackground(c);
		 frame_book4T.setVisible(true);
			frame_book4T.setLocation(500, 180);
			JLabel window = new JLabel();
			JLabel alsle = new JLabel();
			
			
			for(int i =0 ; i < 90; i++)
				array2[i] = new Seats();
		for(int i =0; i< 16; i++){
			for(int j = 0; j < 5; j++)
			{
			if(j == 0)
			{
				if(a == 0){
					window = new  JLabel ("Windows");
					window.setFont(new java.awt.Font("Times New Roman", 1,18));
					panalscroll.add(window);
				}
				else{
				array2[az].setButton(new JButton("A"+a));
					array2[az].getButton().setBackground(g);
				panalscroll.add(array2[az].getButton());
				az++;
				}
				a++;
				
			}
			else if(j == 1){
				if(b == 0){
					alsle  = new JLabel ("      Aisle");
					alsle.setFont(new java.awt.Font("Times New Roman", 1,18));
					panalscroll.add(alsle);
				}
				else{
				array2[az].setButton(new JButton("B"+b));
				panalscroll.add(array2[az].getButton());
				array2[az].getButton().setBackground(g);
				az++;
					
				}
				b++;
			}
			else if(j == 3){
				if(c1 == 0){
					alsle = new JLabel ("       Aisle");
					alsle.setFont(new java.awt.Font("Times New Roman", 1,18));
					panalscroll.add(alsle);
				}
				else{
				array2[az].setButton(new JButton("C"+c1));
					array2[az].getButton().setBackground(g);
				panalscroll.add(array2[az].getButton());
				az++;
				}
				c1++;
			}
			
			else if(j == 4){
				if(d == 0){
					window = new JLabel ("Windows");
					window.setFont(new java.awt.Font("Times New Roman", 1,18));
					panalscroll.add(window);
				}
				
				else{
				array2[az].setButton(new JButton("D"+d));
				array2[az].getButton().setBackground(g);
				panalscroll.add(array2[az].getButton());
				az++;
				}
				
				d++;
			}
			
				else if(j == 2){
					array2[az].setButton(new JButton());
					array2[az].getButton().setBackground(c);
					array2[az].getButton().setBorderPainted(false);
					array2[az].getButton().setEnabled(false);
					panalscroll.add(array2[az].getButton());
					
				}
				
				panalscroll.setPreferredSize(new Dimension(10, 800));
			}
		}
	
	panalscroll.setBackground(c);

	
    scrollT = new JScrollPane(panalscroll);
		frame_book4T.add(scrollT, BorderLayout.CENTER);
		
		//scroll.setBorder(null);
		JPanel panalwest = new JPanel();
		 reserved2.clear();
		
	 for(int i= 0 ; i < a2.size(); i++){
     	
		 array2[a2.get(i)].getButton().setBackground(Color.red);
		 array2[a2.get(i)].set_Seat_State1(false);
	 }

		 java.io.File file = new java.io.File("secret3.txt");
		try{
			
			Scanner input1 = new Scanner (file);
			while(input1.hasNext())
			{
				reserved2.add(input1.nextInt());
				
			
			}
		
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		
		
	for(int i=0; i <reserved2.size(); i++){
		 array2[reserved2.get(i)].getButton().setBackground(Color.red);
		array2[reserved2.get(i)].set_Seat_State1(false);
	}
		 
		flightNo = new JLabel("    ");
	flightNo1 = new JLabel("     ");
	flightNo.setFont(new java.awt.Font("Times New Roman", 1,16));
	flightNo1.setFont(new java.awt.Font("Times New Roman", 1,16));
		panalwest.setLayout(new GridLayout(10,2,2,1));
		
		panalwest.add(flightNo);
		panalwest.add(flightNo1);
		
	
		depart = new JLabel("Depart :");
		panalwest.add(depart);
			departstation = new JLabel();
		depart.setFont(new java.awt.Font("Times New Roman", 1,18));
		departstation.setText((String)combobox1.getSelectedItem());
		departstation.setFont(new java.awt.Font("Times New Roman", 1,16));
		panalwest.add(departstation);
		
	arrival = new JLabel("Arrival:");
	arrival.setFont(new java.awt.Font("Times New Roman", 1,18));
	arrivalstation = new JLabel();
		arrivalstation.setText((String)combobox.getSelectedItem());
	arrivalstation.setFont(new java.awt.Font("Times New Roman", 1,16));
		panalwest.add(arrival);
		panalwest.add(arrivalstation);
		
	
		
		
	
	
	seatNo = new JLabel("Seat No:");
	seatno1T = new JTextField(2);

	seatNo.setFont(new java.awt.Font("Times New Roman", 1,18));
	seatno1T.setFont(new java.awt.Font("Times New Roman", 1,18));
	panalwest.add(seatNo);
	panalwest.add(seatno1T);
	
    total = new JLabel("Total Fare :");
    total1 = new JLabel("RM"+finalprice);
    total.setFont(new java.awt.Font("Times New Roman", 1,18));
	total1.setFont(new java.awt.Font("Times New Roman", 1,16));
	panalwest.add(total);
	panalwest.add(total1);
	
	time_label = new JLabel("TIME :");
	
	String timetemp = (String)comboboxtimeT.getSelectedItem();
	time1 = new JLabel(timetemp);
		time_label.setFont(new java.awt.Font("Times New Roman", 1,16));
	time1.setFont(new java.awt.Font("Times New Roman", 1,18));
	panalwest.add(time_label);
	panalwest.add(time1);
	

	
	
	
	occupied = new JLabel("Occupied");
	available = new JLabel("Available");
	selected = new JLabel("Selected ");
	occupied.setFont(new java.awt.Font("Times New Roman", 1,18));
	selected.setFont(new java.awt.Font("Times New Roman", 1,18));
	available.setFont(new java.awt.Font("Times New Roman", 1,18));
		red = new JButton();
	normal = new JButton();
	green = new JButton();
	red.setBackground(Color.red);
	normal.setBackground(g);
	green.setBackground(Color.green);
	//red.setSize(10, 10);
	
	
	panalwest.add(red);
	panalwest.add(occupied);
	panalwest.add(normal);
	panalwest.add(available);
	panalwest.add(green);
	panalwest.add(selected);
	
	
	
	
	 for (int i = 0; i < az; i++) {
      
       array2[i].getButton().addActionListener(listenerT);
        
    }
	
	
	

	
	panalwest.setBackground(c);

		
		frame_book4T.add(panalwest, BorderLayout.WEST);
		
	
		
		
		
		
		
		
		
		
		
		
	
		confirmT.setBackground(Color.red);
		
		confirmT.setForeground(Color.white);
		confirmT.setFont(new java.awt.Font("Times New Roman", 1, 24));
		confirmT.setBorder(BorderFactory.createLineBorder(Color.gray, 4));
		confirmT.setSize(180, 65);
		JPanel psouth = new JPanel();
		psouth.setLayout(new GridLayout(1, 5, 0, 0));
		psouth.setBackground(c);
		JButton s2 = new JButton("   ");
		JButton s1 = new JButton("   ");	
		JButton s5 = new JButton("   ");
		JButton s3 = new JButton("   ");
		JButton s4 = new JButton("   ");
		s2.setBackground(c);
		s1.setBackground(c);
		s3.setBackground(c);
		s4.setBackground(c);
		s5.setBackground(c);
		psouth.add(s1);
		psouth.add(s2);	
		psouth.add(s5);
		psouth.add(confirmT);
		psouth.add(s3);
		psouth.add(s4);
		s2.setEnabled(false);
		s1.setEnabled(false);
		s3.setEnabled(false);
		s3.setEnabled(false);
		s5.setBorderPainted(false);
		s5.setEnabled(false);
		s1.setBorderPainted(false);
		s2.setBorderPainted(false);
		s3.setBorderPainted(false);
		s4.setBorderPainted(false);
		frame_book4T.add(psouth, BorderLayout.SOUTH);
		
	}
	
	

	
	
	void payment(){
			frame_payment = new JFrame();
		JPanel p = new JPanel();
		
		JLabel logo = new JLabel(new ImageIcon("relogo.jpg"));
		p.setLayout(new BorderLayout());
		p.setBackground(c);
		JPanel west = new JPanel();
		back7 = new JLabel(new ImageIcon("back.PNG"));
		west.setBackground(c);
		west.setLayout(new FlowLayout());
		p.add(logo, BorderLayout.WEST);
		cancel = new JLabel(new ImageIcon("cancel.PNG"));
		
		JLabel head = new JLabel("      4. MAKE PAYMENT      ");
		head.setFont(new java.awt.Font("Times New Roman", 1,27));
		p.add(head, BorderLayout.CENTER);
		west.add(back7);
		west.add(cancel);
		defined();
		frame_payment.setLayout(new BorderLayout());
		back7.setBackground(c);
		back7.setSize(200, 200);
		
		p.add(west, BorderLayout.EAST);
		JLabel reivew = new JLabel("                Please Review Your Information Before Make A Payment");
		reivew.setFont(new java.awt.Font("Times New Roman", 1,23));
		p.add(reivew, BorderLayout.SOUTH);
		frame_payment.add(p, BorderLayout.NORTH);
		
		JPanel info = panal1();
			frame_payment.getContentPane().setBackground(c);
			if(twoWay == false)
			frame_payment.add(info, BorderLayout.CENTER);
		JPanel info2 = panal2();
		if(twoWay == true)
			frame_payment.add(info2, BorderLayout.CENTER);

	  
			JLabel d = new JLabel();
		
			frame_payment.add(new JLabel("                                    "), BorderLayout.WEST);
			
		frame_payment.add(new JLabel("            "), BorderLayout.EAST);
			counter.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
			mobile.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
			card.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
			JPanel pay = new JPanel();
			counter.setBackground(Color.red);
			mobile.setBackground(Color.red);
			card.setBackground(Color.red);
			pay.setBackground(c);
			
			pay.setLayout(new FlowLayout());
			counter.setBounds(285,400, 150, 55);
			mobile.setBounds(350,500, 150, 55);
			card.setBounds(400,370, 150, 55);
			counter.setFont(new java.awt.Font("Times New Roman", 1, 18));
			mobile.setFont(new java.awt.Font("Times New Roman", 1, 18));
			card.setFont(new java.awt.Font("Times New Roman", 1, 18));
			counter.setForeground(Color.white);
			card.setForeground(Color.white);
			mobile.setForeground(Color.white);
			pay.add(new JLabel());
			pay.add(counter, BorderLayout.WEST);
			pay.add(new JLabel("     "));
			pay.add(mobile, BorderLayout.CENTER);
			pay.add(new JLabel("     "));
			pay.add(card, BorderLayout.EAST);
			pay.add(new JLabel());
			JPanel pay2 = new JPanel();
			pay2.setBackground(c);
			pay2.setLayout(new BorderLayout());
			pay2.add(pay, BorderLayout.CENTER);
			JLabel select = new JLabel("                           Please Select Your Payment Method");
			select.setFont(new java.awt.Font("Times New Roman", 1, 23));
			pay2.add(select, BorderLayout.NORTH);
			pay2.add(new JLabel("   "), BorderLayout.SOUTH);
			frame_payment.add(pay2, BorderLayout.SOUTH);
			 frame_payment.setVisible(true);
			 frame_payment.setResizable(false);
		frame_payment.setSize(700, 550);
		frame_payment.setLocation(500, 180);
		
	}
	
	
	
	
	JPanel panal1(){
			JLabel name = new JLabel("       Name :");
		JLabel name1 = new JLabel(customer1.get_Cust_Name());
		name.setFont(new java.awt.Font("Times New Roman", 1,18));
		name1.setFont(new java.awt.Font("Times New Roman", 1,18));
		JPanel info = new JPanel();
		info.setLayout(new GridLayout(10,2,1,1));
	
		info.add(name);
		info.add(name1);
		
		JLabel email = new JLabel("       E-mail Adress :");
		JLabel email1 = new JLabel(customer1.get_Cust_email());
		email.setFont(new java.awt.Font("Times New Roman", 1,18));
		email1.setFont(new java.awt.Font("Times New Roman", 1,18));
		info.add(email);
		info.add(email1);
		/////////////////////
		emailS = customer1.get_Cust_email();
		nameS = customer1.get_Cust_Name();
		startS = (String)combobox.getSelectedItem();
		stopS = (String)combobox1.getSelectedItem();
		dateS = (String)comboboxDay.getSelectedItem()+"/"+(String)comboboxMonth.getSelectedItem()+"/"+(String)comboboxYear.getSelectedItem();
		timeS = (String)comboboxtime.getSelectedItem();
		if(twoWay == false){
			typeS = "One Way";
		}
		else
			typeS = "Two Way";
		numberS = ticket1.get_Ticket_seat1().get_Seat_Id();
			
		priceS = "RM"+finalprice;
	///////////////////////////////
	
	String start2S = (String)combobox1.getSelectedItem();
			stop2S = (String)combobox.getSelectedItem();
			date2S = (String)comboboxDayT.getSelectedItem()+"/"+(String)comboboxMonthT.getSelectedItem()+"/"+(String)comboboxYearT.getSelectedItem();
			time2S = (String)comboboxtimeT.getSelectedItem();
			number2S  = ticket1.get_Ticket_seat2().get_Seat_Id();
		
	
		JLabel startDestionation = new JLabel("       Sart Destination :");
		JLabel startDestionation1 = new JLabel((String)combobox.getSelectedItem());
		startDestionation.setFont(new java.awt.Font("Times New Roman", 1,18));
		startDestionation1.setFont(new java.awt.Font("Times New Roman", 1,18));
		info.add(startDestionation);
		info.add(startDestionation1);
		
		JLabel stopDestionation = new JLabel("       Stop Destination :");
		JLabel stopDestionation1 = new JLabel((String)combobox1.getSelectedItem());
		stopDestionation.setFont(new java.awt.Font("Times New Roman", 1,18));
		stopDestionation1.setFont(new java.awt.Font("Times New Roman", 1,18));
		info.add(stopDestionation);
		info.add(stopDestionation1);
	
		JLabel ticketType = new JLabel("       Ticket Type :");
		JLabel ticketType1;
		if(twoWay == false){
		ticketType1 = new JLabel("One-Way Ticket");
		
		}
	else {
		ticketType1 = new JLabel("Two-Way Ticket");
	}
	
		
		ticketType.setFont(new java.awt.Font("Times New Roman", 1,18));
		ticketType1.setFont(new java.awt.Font("Times New Roman", 1,18));
		info.add(ticketType);
		info.add(ticketType1);
		
		String dateActive = (String)comboboxDay.getSelectedItem()+"/"+(String)comboboxMonth.getSelectedItem()+"/"+(String)comboboxYear.getSelectedItem();
		JLabel date = new JLabel("       Date :");
		JLabel date1 = new JLabel(dateActive);
		date.setFont(new java.awt.Font("Times New Roman", 1,18));
		date1.setFont(new java.awt.Font("Times New Roman", 1,18));
		info.add(date);
		info.add(date1);
		
		
			JLabel time = new JLabel("       Time :");
		JLabel time1 = new JLabel((String)comboboxtime.getSelectedItem());
		time.setFont(new java.awt.Font("Times New Roman", 1,18));
		time1.setFont(new java.awt.Font("Times New Roman", 1,18));
		info.add(time);
		info.add(time1);
		
			JLabel seatnumber = new JLabel("       Seat Number :");
		JLabel seatnumber1 = new JLabel(ticket1.get_Ticket_seat1().get_Seat_Id());
		seatnumber.setFont(new java.awt.Font("Times New Roman", 1,18));
		seatnumber1.setFont(new java.awt.Font("Times New Roman", 1,18));
		info.add(seatnumber);
		info.add(seatnumber1);
		
		JLabel ticketId = new JLabel("       Ticket Id :");
		
		Random rand = new Random();

int  n = rand.nextInt(50) + 20;
		
		JLabel ticetid1 = new JLabel("KIT"+ Integer.toString(n));
		ticketId.setFont(new java.awt.Font("Times New Roman", 1,18));
		ticetid1.setFont(new java.awt.Font("Times New Roman", 1,18));
		info.add(ticketId);
		info.add(ticetid1);
		
		JLabel price = new JLabel("       Price :");
		JLabel price1;
	
		price1 = new JLabel("RM"+finalprice);
	
		price.setFont(new java.awt.Font("Times New Roman", 1,18));
		price1.setFont(new java.awt.Font("Times New Roman", 1,18));
		info.add(price);
		
		info.add(price1);
		info.setBackground(c);
		info.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		
		return info;
	}
	
	void receipt1(){
		
	
		JPanel p = new JPanel();
		JLabel logo = new JLabel(new ImageIcon("receipt.PNG"));
		p.setLayout(new BorderLayout());
		p.setBackground(Color.white);
		p.add(logo, BorderLayout.CENTER);
		Random rand = new Random();

           int  n = rand.nextInt(50) + 20;

		JLabel receiptNo = new JLabel("      Ticket Details:                     ReceiptNO:1102"+ Integer.toString(n));
		receiptNo.setFont(new java.awt.Font("Times New Roman", 1,22));
		p.add(receiptNo, BorderLayout.SOUTH);
		frame_receipt.setBackground(Color.white);
		frame_receipt.add(p, BorderLayout.NORTH);
		JPanel info = panal1();
		info.setBackground(Color.white);
		info.setBorder(null);
		
		JPanel info2 = panal2();
		info2.setBackground(Color.white);
		info2.setBorder(null);
		JPanel total = new JPanel();
		total.add(new JLabel(), BorderLayout.NORTH);
		JLabel total1 = new JLabel("                                              TOTAL: RM"+finalprice);
		total1.setFont(new java.awt.Font("Times New Roman", 1,22));
		total.add(total1, BorderLayout.WEST);
		total.setBackground(Color.white);
		frame_receipt.add(total, BorderLayout.SOUTH);
		if(twoWay == false)
		frame_receipt.add(info, BorderLayout.CENTER);
	else
		frame_receipt.add(info2, BorderLayout.CENTER);
		
		frame_receipt.setVisible(true);
			 frame_receipt.setResizable(false);
		frame_receipt.setSize(500, 600);
		frame_receipt.setLocation(500, 180);
		
	}
	
	

	JPanel panal2(){
		JLabel depart3 = new JLabel("");
		JLabel depart4 = new JLabel("                               DEPART   ");
			
			depart4.setFont(new java.awt.Font("Times New Roman", 1,18));
			JLabel name = new JLabel("       Name :");
		JLabel name1 = new JLabel(customer1.get_Cust_Name());
		name.setFont(new java.awt.Font("Times New Roman", 1,18));
		name1.setFont(new java.awt.Font("Times New Roman", 1,18));
		JPanel info = new JPanel();
		info.setLayout(new GridLayout(19,2,1,1));
			
		info.add(name);
		info.add(name1);
		
		
		
		
		JLabel email = new JLabel("       E-mail Adress :");
		JLabel email1 = new JLabel(customer1.get_Cust_email());
		email.setFont(new java.awt.Font("Times New Roman", 1,18));
		email1.setFont(new java.awt.Font("Times New Roman", 1,18));
		info.add(email);
		info.add(email1);
	
		
			JLabel ticketId = new JLabel("       Ticket Id :");
			Random rand = new Random();

			int  n = rand.nextInt(50) + 20;
		JLabel ticetid1 = new JLabel("KIT" +Integer.toString(n));
		ticketId.setFont(new java.awt.Font("Times New Roman", 1,18));
		ticetid1.setFont(new java.awt.Font("Times New Roman", 1,18));
		info.add(ticketId);
		info.add(ticetid1);
		
		JLabel price = new JLabel("       Price :");
		JLabel price1;
		
		price1 = new JLabel("RM"+finalprice );
	
	
		price.setFont(new java.awt.Font("Times New Roman", 1,18));
		price1.setFont(new java.awt.Font("Times New Roman", 1,18));
		info.add(price);
		
		info.add(price1);
		
				JLabel ticketType = new JLabel("       Ticket Type :");
		JLabel ticketType1;
		if(twoWay == false)
		ticketType1 = new JLabel("One-Way Ticket");
	else 
		ticketType1 = new JLabel("Two-Way Ticket");
		
		ticketType.setFont(new java.awt.Font("Times New Roman", 1,18));
		ticketType1.setFont(new java.awt.Font("Times New Roman", 1,18));
		info.add(ticketType);
		info.add(ticketType1);
		info.add(new JLabel(" "));
		info.add(new JLabel(" "));
		
		
		info.add(depart4);
		info.add(depart3);
		
			JLabel startDestionation = new JLabel("       Sart Destination :");
		JLabel startDestionation1 = new JLabel((String)combobox.getSelectedItem());
		startDestionation.setFont(new java.awt.Font("Times New Roman", 1,18));
		startDestionation1.setFont(new java.awt.Font("Times New Roman", 1,18));
		info.add(startDestionation);
		info.add(startDestionation1);
		
		JLabel stopDestionation = new JLabel("       Stop Destination :");
		JLabel stopDestionation1 = new JLabel((String)combobox1.getSelectedItem());
		stopDestionation.setFont(new java.awt.Font("Times New Roman", 1,18));
		stopDestionation1.setFont(new java.awt.Font("Times New Roman", 1,18));
		info.add(stopDestionation);
		info.add(stopDestionation1);
	

		
		String dateActive = (String)comboboxDay.getSelectedItem()+"/"+(String)comboboxMonth.getSelectedItem()+"/"+(String)comboboxYear.getSelectedItem();
		JLabel date = new JLabel("       Date :");
		JLabel date1 = new JLabel(dateActive);
		date.setFont(new java.awt.Font("Times New Roman", 1,18));
		date1.setFont(new java.awt.Font("Times New Roman", 1,18));
		info.add(date);
		info.add(date1);
		
		
			JLabel time = new JLabel("       Time :");
		JLabel time1 = new JLabel((String)comboboxtime.getSelectedItem());
		time.setFont(new java.awt.Font("Times New Roman", 1,18));
		time1.setFont(new java.awt.Font("Times New Roman", 1,18));
		info.add(time);
		info.add(time1);
		
			JLabel seatnumber = new JLabel("       Seat Number :");
		JLabel seatnumber1 = new JLabel(ticket1.get_Ticket_seat1().get_Seat_Id());
		seatnumber.setFont(new java.awt.Font("Times New Roman", 1,18));
		seatnumber1.setFont(new java.awt.Font("Times New Roman", 1,18));
		info.add(seatnumber);
		info.add(seatnumber1);
		
		
		
			emailS = customer1.get_Cust_email();
		nameS = customer1.get_Cust_Name();
		startS = (String)combobox.getSelectedItem();
		stopS = (String)combobox1.getSelectedItem();
		dateS = (String)comboboxDay.getSelectedItem()+"/"+(String)comboboxMonth.getSelectedItem()+"/"+(String)comboboxYear.getSelectedItem();
		timeS = (String)comboboxtime.getSelectedItem();
		if(twoWay == false){
			typeS = "One Way";
		}
		else
			typeS = "Two Way";
		numberS = ticket1.get_Ticket_seat1().get_Seat_Id();
		priceS = "RM"+finalprice;
		
		////////////////////
			 start2S = (String)combobox1.getSelectedItem();
			 stop2S = (String)combobox.getSelectedItem();
				date2S = (String)comboboxDayT.getSelectedItem()+"/"+(String)comboboxMonthT.getSelectedItem()+"/"+(String)comboboxYearT.getSelectedItem();
			 time2S = (String)comboboxtimeT.getSelectedItem();
			 number2S  = ticket1.get_Ticket_seat2().get_Seat_Id();
		
		
		JLabel return3 = new JLabel("");
		JLabel return4 = new JLabel("                               RETURN   ");
			
			return4.setFont(new java.awt.Font("Times New Roman", 1,18));
			
				info.add(new JLabel());
		info.add(new JLabel());
			info.add(return4);
		info.add(return3);
		
			JLabel startDestionationT = new JLabel("       Sart Destination :");
		JLabel startDestionation1T = new JLabel((String)combobox1.getSelectedItem());
		startDestionationT.setFont(new java.awt.Font("Times New Roman", 1,18));
		startDestionation1T.setFont(new java.awt.Font("Times New Roman", 1,18));
		info.add(startDestionationT);
		info.add(startDestionation1T);
		
		JLabel stopDestionationT = new JLabel("       Stop Destination :");
		JLabel stopDestionation1T = new JLabel((String)combobox.getSelectedItem());
		stopDestionationT.setFont(new java.awt.Font("Times New Roman", 1,18));
		stopDestionation1T.setFont(new java.awt.Font("Times New Roman", 1,18));
		info.add(stopDestionationT);
		info.add(stopDestionation1T);
	

		
		String dateActiveT = (String)comboboxDayT.getSelectedItem()+"/"+(String)comboboxMonthT.getSelectedItem()+"/"+(String)comboboxYearT.getSelectedItem();
		JLabel dateT = new JLabel("       Date :");
		JLabel date1T = new JLabel(dateActiveT);
		dateT.setFont(new java.awt.Font("Times New Roman", 1,18));
		date1T.setFont(new java.awt.Font("Times New Roman", 1,18));
		info.add(dateT);
		info.add(date1T);
		
		
			JLabel timeT = new JLabel("       Time :");
		JLabel time1T = new JLabel((String)comboboxtimeT.getSelectedItem());
		timeT.setFont(new java.awt.Font("Times New Roman", 1,18));
		time1T.setFont(new java.awt.Font("Times New Roman", 1,18));
		info.add(timeT);
		info.add(time1T);
		
			JLabel seatnumberT = new JLabel("       Seat Number :");
		JLabel seatnumber1T = new JLabel(ticket1.get_Ticket_seat2().get_Seat_Id());
		seatnumberT.setFont(new java.awt.Font("Times New Roman", 1,18));
		seatnumber1T.setFont(new java.awt.Font("Times New Roman", 1,18));
		info.add(seatnumberT);
		info.add(seatnumber1T);
					
		
		//////////
	
		info.setBackground(c);
		info.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		return info;
	}
	
		void print1(){
			
			
			 
			 
			 frame_print = new JFrame();
		JPanel p = new JPanel();
		
		JLabel logo = new JLabel(new ImageIcon("relogo.jpg"));
		p.setLayout(new BorderLayout());
		p.setBackground(c);
		
		home = new JLabel(new ImageIcon("home.PNG"));
		
		p.add(logo, BorderLayout.CENTER);
		 
		defined();
		frame_print.setLayout(new BorderLayout());
		home.setBackground(c);
		home.setSize(200, 200);
		
		
		p.add(home, BorderLayout.EAST);
		frame_print.add(p, BorderLayout.NORTH);
		
		JLabel seccess = new JLabel("Your Payment Have Been Done Successfully");
		JLabel thanks = new JLabel("Thank You For Purchasing Your Ticket Using ");
		JLabel thanks1 = new JLabel("The Self-service Ticketing System!");
		seccess.setBounds(90, 20, 600, 300);
		thanks.setBounds(80, 55, 600, 300);
		thanks1.setBounds(160, 215, 600, 50);
	seccess.setFont(new java.awt.Font("Times New Roman", 1, 24));
		thanks.setFont(new java.awt.Font("Times New Roman", 1, 24));
		thanks1.setFont(new java.awt.Font("Times New Roman", 1, 24));
	frame_print.add(thanks);
	frame_print.add(seccess);
	frame_print.add(thanks1);
		write();
	save();
		write2();
		receipt.setBackground(Color.red);
		
		receipt.setForeground(Color.white);
		receipt.setFont(new java.awt.Font("Times New Roman", 1, 24));
		receipt.setBorder(BorderFactory.createLineBorder(Color.gray, 4));
		
		receipt.setBounds(50, 295, 250, 50);
		
		printTicket.setBackground(Color.red);
		
		printTicket.setForeground(Color.white);
		printTicket.setFont(new java.awt.Font("Times New Roman", 1, 24));
		printTicket.setBorder(BorderFactory.createLineBorder(Color.gray, 4));
		printTicket.setBounds(350, 295, 250, 50);
		frame_print.add(receipt);
		frame_print.add(printTicket);
		frame_print.add(new JLabel());
		frame_print.getContentPane().setBackground(c);
		 frame_print.setVisible(true);
			 frame_print.setResizable(false);
		frame_print.setSize(650, 450);
		frame_print.setLocation(500, 180);
	}
	
	void recordDate(){
		try{
			BufferedWriter r = new BufferedWriter(new FileWriter("date.txt"));
			if(newdate == "Wednesday")
				r.write(4+"");
	   else if(newdate =="Sunday")
	   r.write(1+"");
	   else if(newdate == "Monday")
		  r.write(2+"");
	   else if(newdate == "Saturday")
		   r.write(0+"");
	   else if(newdate == "Tuesday")
		   r.write(3+"");
	   else if(newdate == "Thursday")
		   r.write(5+"");
	   else if(newdate == "Friday")
		   r.write(6+"");
			
			
			
			r.close();
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	
	
	void clear1(){
		try{
			BufferedWriter r = new BufferedWriter(new FileWriter("secret.txt"));
				r.write("");
			
			r.close();
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
			try{
			BufferedWriter r1 = new BufferedWriter(new FileWriter("secret3.txt"));
				r1.write("");
			
			r1.close();
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}
	
	
	void trainTicket1(){
		
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		JLabel head = new JLabel("TRAIN TICKET");
		head.setFont(new java.awt.Font("Times New Roman", 1, 24));
		head.setForeground(c);
		p.add(head, BorderLayout.WEST);
		p.add(new JLabel("    "), BorderLayout.NORTH);
		p.add(new JLabel("   "), BorderLayout.SOUTH);
		p.setBackground(new Color(255, 102, 0));
		frame_trainTicket.add(p, BorderLayout.NORTH);
		frame_trainTicket.getContentPane().setBackground(c);
		
		
		JLabel ticketType = new JLabel("Ticket Type: One-Way Ticket");
		ticketType.setFont(new java.awt.Font("Times New Roman", 1, 20));
		ticketType.setBounds(10, 50, 300, 50);
		frame_trainTicket.add(ticketType);
		
		JLabel seatNumber = new JLabel("Seat Number: "+ ticket1.get_Ticket_seat1().get_Seat_Id());
		seatNumber.setFont(new java.awt.Font("Times New Roman", 1, 20));
		seatNumber.setBounds(380, 50, 300, 50);
		frame_trainTicket.add(seatNumber);
		
		JLabel from = new JLabel("From : "+ combobox.getSelectedItem());
		from.setFont(new java.awt.Font("Times New Roman", 1, 24));
		from.setBounds(10, 80, 300, 50);
		frame_trainTicket.add(from);
		
			JLabel date = new JLabel("Date : "+ (String)comboboxDay.getSelectedItem()+"/"+(String)comboboxMonth.getSelectedItem()+"/"+(String)comboboxYear.getSelectedItem());
		date.setFont(new java.awt.Font("Times New Roman", 1, 20));
		date.setBounds(380, 70, 300, 50);
		frame_trainTicket.add(date);
		
		JLabel time = new JLabel("Time : "+ (String)comboboxtime.getSelectedItem());
		time.setFont(new java.awt.Font("Times New Roman", 1, 20));
		time.setBounds(380, 90, 300, 50);
		frame_trainTicket.add(time);
		
			JLabel to = new JLabel("TO     : "+ combobox1.getSelectedItem());
		to.setFont(new java.awt.Font("Times New Roman", 1, 24));
		to.setBounds(10, 105, 300, 50);
		frame_trainTicket.add(to);
		
		JLabel ticketNo = new JLabel("Ticket No: 112021");
		ticketNo.setFont(new java.awt.Font("Times New Roman", 1, 20));
		ticketNo.setBounds(380, 110, 300, 50);
		frame_trainTicket.add(ticketNo);
		
		JLabel name = new JLabel("Name: "+ customer1.get_Cust_Name());
		name.setFont(new java.awt.Font("Times New Roman", 1, 20));
		name.setBounds(10, 160, 400, 50);
		frame_trainTicket.add(name);
		
		JLabel price = new JLabel("RM"+finalprice);
		price.setFont(new java.awt.Font("Times New Roman", 1, 20));
		price.setBounds(380, 160, 300, 50);
		frame_trainTicket.add(price);
		
		
		JPanel p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		JLabel arrow = new JLabel(new ImageIcon("arrow.PNG"));
		p1.add(arrow, BorderLayout.WEST);
		
		p1.add(new JLabel("   "), BorderLayout.SOUTH);
		p1.setBackground(new Color(255, 102, 0));
		frame_trainTicket.add(p1, BorderLayout.SOUTH);
		
		
		JLabel d = new JLabel();
		frame_trainTicket.add(d);
		 frame_trainTicket.setVisible(true);
			 frame_trainTicket.setResizable(false);
		frame_trainTicket.setSize(550, 300);
		frame_trainTicket.setLocation(500, 180);
		
	}
	
	void cardDummy(){
		 frame_CD = new JFrame();
		JPanel p = new JPanel();
		cancel = new JLabel(new ImageIcon("cancel.PNG"));
		JPanel west = new JPanel(new FlowLayout());
		west.setBackground(c);
		JLabel logo = new JLabel(new ImageIcon("relogo.jpg"));
		p.setLayout(new BorderLayout());
		p.setBackground(c);
		back10 = new JLabel(new ImageIcon("back.PNG"));
		p.add(back10, BorderLayout.EAST);
		p.add(logo, BorderLayout.CENTER);
		frame_CD.add(p, BorderLayout.NORTH);
		west.add(back10);
		west.add(cancel);
		p.add(west, BorderLayout.EAST);
		defined();
		JLabel cd = new JLabel("THIS IS A DUMMY PAGE FOR DEBIT PAYMENT");
		cd.setBounds(40, 40, 600, 300);
		cd.setFont(new java.awt.Font("Times New Roman", 1, 24));
	frame_CD.add(cd);
	
		continueCD.setBackground(Color.red);
		
		continueCD.setForeground(Color.white);
		continueCD.setFont(new java.awt.Font("Times New Roman", 1, 24));
		continueCD.setBorder(BorderFactory.createLineBorder(Color.gray, 4));
		
		continueCD.setBounds(250, 270, 150, 50);
	
		frame_CD.add(continueCD);
		frame_CD.add(new JLabel());
		frame_CD.getContentPane().setBackground(c);
		 frame_CD.setVisible(true);
			 frame_CD.setResizable(false);
		frame_CD.setSize(630, 400);
		frame_CD.setLocation(500, 180);
		
		
	}
	
	void mobileDummy(){
		 frame_MD = new JFrame();
		JPanel p = new JPanel();
		cancel = new JLabel(new ImageIcon("cancel.PNG"));
		JPanel west = new JPanel(new FlowLayout());
		west.setBackground(c);
		
		JLabel logo = new JLabel(new ImageIcon("relogo.jpg"));
		p.setLayout(new BorderLayout());
		p.setBackground(c);
		back9 = new JLabel(new ImageIcon("back.PNG"));
	
		p.add(logo, BorderLayout.CENTER);
		west.add(back9);
		west.add(cancel);
		p.add(west, BorderLayout.EAST);
		frame_MD.add(p, BorderLayout.NORTH);
		
		defined();
		JLabel md = new JLabel("THIS IS A DUMMY PAGE FOR MOBILE PAYMENT");
		md.setBounds(30, 40, 600, 300);
		md.setFont(new java.awt.Font("Times New Roman", 1, 24));
	frame_MD.add(md);
	
		continueMD.setBackground(Color.red);
		
		continueMD.setForeground(Color.white);
		continueMD.setFont(new java.awt.Font("Times New Roman", 1, 24));
		continueMD.setBorder(BorderFactory.createLineBorder(Color.gray, 4));
		
		continueMD.setBounds(250, 270, 150, 50);
	
		frame_MD.add(continueMD);
		frame_MD.add(new JLabel());
		frame_MD.getContentPane().setBackground(c);
		 frame_MD.setVisible(true);
			 frame_MD.setResizable(false);
		frame_MD.setSize(630, 400);
		frame_MD.setLocation(500, 180);
		
		
	}
	
	void counterDummy(){
		 frame_RD = new JFrame();
		JPanel p = new JPanel();
		
		JLabel logo = new JLabel(new ImageIcon("relogo.jpg"));
		p.setLayout(new BorderLayout());
		
		p.setBackground(c);
	 home2 = new JLabel(new ImageIcon("home.PNG"));
	frame_RD.setLayout(new BorderLayout());
		p.add(logo, BorderLayout.CENTER);
		p.add(new JLabel("  "), BorderLayout.NORTH);
		p.add(home2, BorderLayout.EAST);
		frame_RD.add(p, BorderLayout.NORTH);
		
		defined();
		JLabel md = new JLabel("Thank you  for booking your ticket");
		JLabel md1 = new JLabel("Using the Self-Service Ticketing System");
		JLabel md2 = new JLabel("Please make your payment at train counter");
		md.setBounds(115, 45, 600, 300);
		md1.setBounds(85, 85, 600, 300);
		md2.setBounds(75, 125, 600, 300);
			write();
	save();
		write2();
		
		md.setFont(new java.awt.Font("Times New Roman", 1, 24));
		md1.setFont(new java.awt.Font("Times New Roman", 1, 24));
		md2.setFont(new java.awt.Font("Times New Roman", 1, 24));
	frame_RD.add(md);
	frame_RD.add(md1);
	frame_RD.add(md2);
	
	
		frame_RD.add(new JLabel());
		frame_RD.getContentPane().setBackground(c);
		 frame_RD.setVisible(true);
			 frame_RD.setResizable(false);
		frame_RD.setSize(600, 420);
		frame_RD.setLocation(500, 180);
		
		
	}
	
	
	void trainTicket2(){
	frame_trainTicket2 = new JFrame();
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		JLabel head = new JLabel("TRAIN TICKET");
		head.setFont(new java.awt.Font("Times New Roman", 1, 24));
		head.setForeground(c);
		p.add(head, BorderLayout.WEST);
		p.add(new JLabel("    "), BorderLayout.NORTH);
		p.add(new JLabel("   "), BorderLayout.SOUTH);
		p.setBackground(new Color(255, 102, 0));
		frame_trainTicket2.add(p, BorderLayout.NORTH);
		frame_trainTicket2.getContentPane().setBackground(c);
		
		JLabel depart5 = new JLabel("   DEPART   ");
		depart5.setFont(new java.awt.Font("Times New Roman", 1, 20));
		depart5.setBounds(10, 100, 300, 50);
		frame_trainTicket2.add(depart5);
		JLabel ticketType = new JLabel("Ticket Type: Two-Way Ticket");
		ticketType.setFont(new java.awt.Font("Times New Roman", 1, 20));
		ticketType.setBounds(10, 50, 300, 50);
		frame_trainTicket2.add(ticketType);
		
		JLabel seatNumber = new JLabel("Seat Number: "+ ticket1.get_Ticket_seat1().get_Seat_Id());
		seatNumber.setFont(new java.awt.Font("Times New Roman", 1, 20));
		seatNumber.setBounds(380, 100, 300, 50);
		frame_trainTicket2.add(seatNumber);
		
		JLabel from = new JLabel("From : "+ combobox.getSelectedItem());
		from.setFont(new java.awt.Font("Times New Roman", 1, 24));
		from.setBounds(10, 120, 300, 50);
		frame_trainTicket2.add(from);
		
			JLabel date = new JLabel("Date : "+ (String)comboboxDay.getSelectedItem()+"/"+(String)comboboxMonth.getSelectedItem()+"/"+(String)comboboxYear.getSelectedItem());
		date.setFont(new java.awt.Font("Times New Roman", 1, 20));
		date.setBounds(380, 120, 300, 50);
		frame_trainTicket2.add(date);
		
		JLabel time = new JLabel("Time : "+ (String)comboboxtime.getSelectedItem());
		time.setFont(new java.awt.Font("Times New Roman", 1, 20));
		time.setBounds(380, 140, 300, 50);
		frame_trainTicket2.add(time);
		
			JLabel to = new JLabel("TO     : "+ combobox1.getSelectedItem());
		to.setFont(new java.awt.Font("Times New Roman", 1, 24));
		to.setBounds(10, 140, 300, 50);
		frame_trainTicket2.add(to);
		
		
		Random rand = new Random();

			int  n = rand.nextInt(50) + 20;
		JLabel ticketNo = new JLabel("Ticket No: 110" + Integer.toString(n));
		ticketNo.setFont(new java.awt.Font("Times New Roman", 1, 20));
		ticketNo.setBounds(10, 70, 300, 50);
		frame_trainTicket2.add(ticketNo);
		
	////////
		
		JLabel return5 = new JLabel("   RETURN   ");
		return5.setFont(new java.awt.Font("Times New Roman", 1, 20));
		return5.setBounds(10, 180, 300, 50);
		frame_trainTicket2.add(return5);
		
		
		
			JLabel seatNumber2 = new JLabel("Seat Number: "+ ticket1.get_Ticket_seat2().get_Seat_Id());
		seatNumber2.setFont(new java.awt.Font("Times New Roman", 1, 20));
		seatNumber2.setBounds(380, 180, 300, 50);
		frame_trainTicket2.add(seatNumber2);
		
		JLabel from2 = new JLabel("From : "+ combobox1.getSelectedItem());
		from2.setFont(new java.awt.Font("Times New Roman", 1, 24));
		from2.setBounds(10, 200, 300, 50);
		frame_trainTicket2.add(from2);
		
		JLabel date2 = new JLabel("Date : "+ (String)comboboxDayT.getSelectedItem()+"/"+(String)comboboxMonthT.getSelectedItem()+"/"+(String)comboboxYearT.getSelectedItem());
		date2.setFont(new java.awt.Font("Times New Roman", 1, 20));
		date2.setBounds(380, 200, 300, 50);
		frame_trainTicket2.add(date2);
		
		JLabel time2 = new JLabel("Time : "+ (String)comboboxtimeT.getSelectedItem());
		time2.setFont(new java.awt.Font("Times New Roman", 1, 20));
		time2.setBounds(380, 220, 300, 50);
		frame_trainTicket2.add(time2);
		
			JLabel to2 = new JLabel("TO     : "+ combobox.getSelectedItem());
		to2.setFont(new java.awt.Font("Times New Roman", 1, 24));
		to2.setBounds(10, 225, 300, 50);
		frame_trainTicket2.add(to2);
		
		JLabel name = new JLabel("Name: "+ customer1.get_Cust_Name());
		name.setFont(new java.awt.Font("Times New Roman", 1, 20));
		name.setBounds(10, 265, 400, 50);
		frame_trainTicket2.add(name);
		
		JLabel price = new JLabel("RM"+finalprice);
		price.setFont(new java.awt.Font("Times New Roman", 1, 20));
		price.setBounds(380, 265, 300, 50);
		frame_trainTicket2.add(price);
		
		
		JPanel p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		JLabel arrow = new JLabel(new ImageIcon("arrow.PNG"));
		p1.add(arrow, BorderLayout.WEST);
		
		p1.add(new JLabel("   "), BorderLayout.SOUTH);
		p1.setBackground(new Color(255, 102, 0));
		frame_trainTicket2.add(p1, BorderLayout.SOUTH);
		
		
		JLabel d = new JLabel();
		frame_trainTicket2.add(d);
		 frame_trainTicket2.setVisible(true);
			 frame_trainTicket2.setResizable(false);
		frame_trainTicket2.setSize(550, 400);
		frame_trainTicket2.setLocation(500, 180);
		
	}
	
	 ActionListener actionlistener = new ActionListener(){
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == continuebtn ){
			
			customer1.set_Cust_Name(name_field.getText());
		customer1.set_Cust_Email(email_field.getText());
		if(name_field.getText().equals("") || email_field.getText().equals("")){
			JOptionPane.showMessageDialog(null," Please Enter Name and Email");
		}
		else{

		
		int t = 1;
		int try0 = 0;	
		int try1 = 1;
	
		int t1 = 1;
					for(int i = 0 ; i < customer1.get_Cust_email().length(); i++)
					{
						if(customer1.get_Cust_email().charAt(i) == '@'){
							try0 = 1;
							
						}
						
					}
					
					if((customer1.get_Cust_email().charAt(customer1.get_Cust_email().length()-1) != 'm')||(customer1.get_Cust_email().charAt(customer1.get_Cust_email().length()-2) != 'o')||
						(customer1.get_Cust_email().charAt(customer1.get_Cust_email().length()-3) != 'c')||(customer1.get_Cust_email().charAt(customer1.get_Cust_email().length()-4) != '.')){
							try1 = 0;
						}
						
						
					if((try0 == 0)||(try1 == 0))
						t = 0;
						
						for(int i = 0 ; i < customer1.get_Cust_Name().length(); i++)
						if(!(Character.isLetter(customer1.get_Cust_Name().charAt(i))))
						{
							if(!(customer1.get_Cust_Name().charAt(i) == ' '))
								t1 = 0;
								
						}
			
			if(t == 1 && t1 == 1){
		close(frame_book1);
			book2();
			}
			else if(t == 1 && t1 == 0){
				JOptionPane.showMessageDialog(null," Please Enter Valid Name");
			}
			else if(t == 0 && t1 == 1){
				JOptionPane.showMessageDialog(null," Please Enter Valid Email");
				
			}
			else {
				JOptionPane.showMessageDialog(null," Please Enter Valid Information");
			}
		}
		}
		
		
		if(e.getActionCommand().equals("one_way")){
			twoWay = false;
		}
		
		
		if(e.getActionCommand().equals("two_way")){
			twoWay = true;
		}
		

		if((e.getSource() == counter)){
			
				close(frame_payment);
				counterDummy();
			
		}
		if(e.getSource() == continueRD){
			close(frame_RD);
			print1();
		}
		if(e.getSource() == card)
		{
			close(frame_payment);
			cardDummy();
		}
		if(e.getSource() == mobile){
			close(frame_payment);
			mobileDummy();
		}
		if(e.getSource() == receipt){
			receipt1();
		}
		
		if(e.getSource() == printTicket){
			if(twoWay == false)
			trainTicket1();
		else
				trainTicket2();
		}
		
		if(e.getSource() == continueMD){
			close(frame_MD);
			print1();
		}
		if(e.getSource() ==  continueCD){
			close(frame_CD);
			print1();
		}
		
		if(e.getSource() == continuebtn1){
			ButtonModel buttonModel = buttongroup.getSelection();
			if(buttonModel != null){
			close(frame_book2);
			book3();
			}
			else{
				JOptionPane.showMessageDialog(null," Please Select Your Ticket Type");
				////System.out.println(combobox.getSelectedItem());
			}
		}
		
		if(e.getSource() == continuebtn2T){
			close(frame_book3T);
			book4();
		}
		
		if(e.getSource() == continuebtn2){
			if(twoWay == false){
			close(frame_book3);
			book4();
			}
			else{
				close(frame_book3);
				book3T();
			}
			
		
		}
		
		
		
	}
	};
	void write(){
		reserved.add(newset);
			try{
			BufferedWriter r = new BufferedWriter(new FileWriter("secret.txt"));
			for(int i = 0; i < reserved.size(); i++){
				r.write(reserved.get(i) +" ");
		r.write("\n");
			}
			r.close();
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}
	
		void write2(){
		reserved2.add(newset2);
			try{
			BufferedWriter r = new BufferedWriter(new FileWriter("secret3.txt"));
			for(int i = 0; i < reserved2.size(); i++){
				r.write(reserved2.get(i) +" ");
		r.write("\n");
			}
			r.close();
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}
	void defined(){
				cancel.addMouseListener(new MouseAdapter() { 
    public void mouseClicked(MouseEvent e)  
    {  
	close(frame_book4);
	close(frame_book1);
	close(frame_book3);
	close(frame_book2);
	close(frame_book3T);
	close(frame_book4T);
	close(frame_payment);
	
	

	
	name_field.setText("");
	email_field.setText("");
			first_screen();
    }  
	});
	
		back9.addMouseListener(new MouseAdapter() { 
    public void mouseClicked(MouseEvent e)  
    {  
	close(frame_MD);
	payment();
    }  
	});
	
		back10.addMouseListener(new MouseAdapter() { 
    public void mouseClicked(MouseEvent e)  
    {  
	close(frame_CD);
	payment();
    }  
	});
	
		back2.addMouseListener(new MouseAdapter() { 
    public void mouseClicked(MouseEvent e)  
    {  
	close(frame_book3);
			book2();
    }  
	});
	
		back1.addMouseListener(new MouseAdapter() { 
    public void mouseClicked(MouseEvent e)  
    {  
	close(frame_book2);
	book1();
    }  
	});
	
		back7.addMouseListener(new MouseAdapter() { 
    public void mouseClicked(MouseEvent e)  
    {  
	if(twoWay == false){
	close(frame_payment);
			book4();
	}
	else {
		close(frame_payment);
			book4T();
	}
    }  
	});
	
		back8.addMouseListener(new MouseAdapter() { 
    public void mouseClicked(MouseEvent e)  
    {  
	close(frame_paymentT);
			book4T();
    }  
	});
			home.addMouseListener(new MouseAdapter() { 
    public void mouseClicked(MouseEvent e)  
    {  
	close(frame_print);
	name_field.setText(null);
	email_field.setText(null);
		frame_receipt = new JFrame();
		frame_trainTicket = new JFrame();
			first_screen();
    }  
	});
	
				home2.addMouseListener(new MouseAdapter() { 
    public void mouseClicked(MouseEvent e)  
    {  
	close(frame_RD);
	name_field.setText(null);
	email_field.setText(null);
		frame_receipt = new JFrame();
		frame_trainTicket = new JFrame();
			first_screen();
    }  
	});
	
		back5.addMouseListener(new MouseAdapter() { 
    public void mouseClicked(MouseEvent e)  
    {  
	close(frame_book3T);
			book3();
    }  
	});
	
		back6.addMouseListener(new MouseAdapter() { 
    public void mouseClicked(MouseEvent e)  
    {  
	close(frame_book4T);
			book4();
    }  
	});
	
		back3.addMouseListener(new MouseAdapter() { 
    public void mouseClicked(MouseEvent e)  
    {  
	
	close(frame_book4);
	if(twoWay == false)
			book3();
		else
			book3T();
    }  
	});
	

		
		L1.addMouseListener(new MouseAdapter() { 
    public void mouseClicked(MouseEvent e)  
    {  
		close(frame);
		close(frame_aboutus);
		close(frame_help);
	contactUs_screen();
    }  
	});
	
			L2.addMouseListener(new MouseAdapter() { 
    public void mouseClicked(MouseEvent e)  
    {  
	close(frame);
	close(frame_aboutus);
	close(frame_contactUs);
	help_screen();
    }  
	});
	
	
	L3.addMouseListener(new MouseAdapter() { 
    public void mouseClicked(MouseEvent e)  
    {  
	close(frame);
	close(frame_help);
	close(frame_contactUs);
	aboutus_screen();
    }  
	});
	
	back.addMouseListener(new MouseAdapter() { 
    public void mouseClicked(MouseEvent e)  
    {  
		if(testback == 1){
	close(frame_book1);
	first_screen();
	}
	else if(testback == 2){
		close(frame_book1);
		aboutus_screen();
	}
	else if(testback == 3){
		close(frame_book1);
		help_screen();
	}
	else if(testback == 4){
		close(frame_book1);
		contactUs_screen();
	}
    }  
	});
	
	
	confirm.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
			if(ticket1.get_Ticket_seat1().get_Seat_Id() != " "){
	if(twoWay == true){
		close(frame_book4);
		book4T();
	}
	else{
			close(frame_book4);
		payment();
		
	}
			}
			else{
						JOptionPane.showMessageDialog(null," Please select a valid seat");
			}
        }
    });
	
	
	confirmT.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
			if(ticket1.get_Ticket_seat2().get_Seat_Id() != " "){
		close(frame_book4T);
		payment();
			}
			else{
						JOptionPane.showMessageDialog(null," Please select a valid seat");
			}
			
	
        }
    });
	
	
	book.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           
			close(frame);
			close(frame_aboutus);
			close(frame_help);
			close(frame_contactUs);
			
      book1();
		
		
        }
    });
	
	}
	
	
 ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
  
		for(int i =0; i < 90; i++){
			if(e.getSource() == array[i].getButton()){
				for(int j =0; j < 90; j++){
					if(array[j].getButton() != null)
						if(array[j].get_Seat_State1() == true)
								array[j].getButton().setBackground(g);
				
				}
				if(array[i].get_Seat_State1() == true){
				array[i].getButton().setBackground(Color.green);
				seatno1.setText((String)array[i].getButton().getActionCommand());
				ticket1.set_Ticket_seat1(array[i]);
				ticket1.get_Ticket_seat1().set_Seat_Id((String)array[i].getButton().getActionCommand());
				newset = i;
			}
			else{
				JOptionPane.showMessageDialog(null," Sorry This Seat Is Unavailable");
				ticket1.get_Ticket_seat1().set_Seat_Id(" ");
			}
			}
			
		
		}
		
		
        }
    };
	
	 ActionListener listenerT = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
  
		for(int i =0; i < 90; i++){
			if(e.getSource() == array2[i].getButton()){
				for(int j =0; j < 90; j++){
					if(array2[j].getButton() != null)
						if(array2[j].get_Seat_State1() == true)
								array2[j].getButton().setBackground(g);
				
				}
				if(array2[i].get_Seat_State1() == true){
				array2[i].getButton().setBackground(Color.green);
				seatno1T.setText((String)array2[i].getButton().getActionCommand());
				ticket1.set_Ticket_seat2(array2[i]);
				ticket1.get_Ticket_seat2().set_Seat_Id((String)array2[i].getButton().getActionCommand());
				newset2 = i;
				}
				else{
				JOptionPane.showMessageDialog(null," Sorry This Seat Is Unavailable");
				ticket1.get_Ticket_seat2().set_Seat_Id(" ");
			}
			}
			
		
		}
		
		
        }
    };
	
	
}






class Customer {
	private int cust_Id;
	private String cust_Name ;
	private String cust_Email;
	 Ticket cust_Ticket;
	 
	public Customer(){
	 }
	 
	 public int get_Cut_Id(){
		 return cust_Id;
	 }
	 
	 public void set_Cust_Id(int id){
		 cust_Id = id;
	 }
	 
	 public String get_Cust_Name(){
		 return cust_Name;
	 }
	 public void set_Cust_Name(String name){
		 this.cust_Name = name;
	 }
	
	public void set_Cust_Email(String email){
		this.cust_Email = email;
		
	}
	
	public String get_Cust_email(){
		return cust_Email;
	}
	
	public Ticket get_Cust_Ticket(){
		return cust_Ticket;
	}
	
	public void set_Cust_Ticket(Ticket ticket){
		cust_Ticket = ticket;
	}
	
}


class Ticket {
	private String ticket_Id = "TIk";
	private int ticket_Cust_Id;
	private Date Ticket_Booking_Date;
	private Seats ticket_seat1;
	private Seats ticket_seat2;
	
	Ticket(){
	}
	
	public void set_Ticket_Id(String id){
		ticket_Id = id;
	}
	public String get_Ticket_id(){
		return ticket_Id;
	}
	
	public Seats get_Ticket_seat1(){
		return ticket_seat1;
	}
	public void set_Ticket_seat1(Seats seat){
		ticket_seat1 = seat;
	}
	
		public Seats get_Ticket_seat2(){
		return ticket_seat2;
	}
	public void set_Ticket_seat2(Seats seat){
		ticket_seat2 = seat;
	}
	
	
	public void set_Ticket_Cust_id(int id){
		ticket_Cust_Id = id;
	}
	
	public int get_Ticket_Cust_Id(){
		return ticket_Cust_Id;
	}
	
	public void set_Ticket_Booking_Date(Date date){
		Ticket_Booking_Date = date;
	}
	
	public Date get_Ticket_Booking_Date(){
		return Ticket_Booking_Date;
	}
	

	
}

class Train{
	private int train_Id;
	private Seats[] train_seats = new Seats[20];
	
	public Train(){
	}
	
	public int get_Train_Id(){
		return train_Id;
	}
	public void set_train_Seats(int i, Seats seat){
		train_seats[i] = seat;
	}
	
	public Seats get_trian_seats(int i){
		return train_seats[i];
	}
	
}

class Seats{
	private String seat_Id = " ";
	private boolean seat_State1 = true;
	private boolean seat_State2;
	private int seat_Price = 30;
	private JButton button;
	public Seats(){
	}
	
	public String get_Seat_Id()
	{
		return seat_Id;
	}
	
	public void setButton(JButton button){
	this.button = button;
	}
	public JButton getButton(){
		return this.button;
	}
	
	public void set_Seat_Id(String id){
		this.seat_Id = id;
	}
	public int getPrice(){
		return seat_Price;
	}
	
	public void setPrice(int price){
		seat_Price = price;
	}
	
	public boolean get_Seat_State1()
	{
		return seat_State1;
	}
	public void set_Seat_State1(boolean state){
		this.seat_State1 = state;
	}
	
	public boolean get_Seat_State2()
	{
		return seat_State2;
	}
	public void set_Seat_State2(boolean state){
		this.seat_State2 = state;
	}
	
	
}