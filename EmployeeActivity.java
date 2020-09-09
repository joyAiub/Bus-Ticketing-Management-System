import java. lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmployeeActivity extends Frame {
	//private Customer customer;
	private Button buttonLogout, buttonProfile, buttonViewCustomer, buttonViewBus;
	private Label title, header;
	private JLabel imgLabel;
	private ImageIcon img;
	private Font f1;
	private Font f2;
	public EmployeeActivity() {
		super("Dashboard - Employee");
		
		this.setSize(800, 600);
		this.setBackground(Color.WHITE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		/*employee = new Employee(userId);
		employee.fetch();*/
		
		f1 = new Font("ARIAL", Font.BOLD, 25);
		f2 = new Font("ARIAL", Font.BOLD, 15);
		
		title = new Label("Welcome E-Ticketing System");
	    title.setBounds(30, 40,400,75);
		title.setFont(f1);
		title.setAlignment(Label.CENTER);
		title.setForeground(Color.WHITE);
		title.setBackground(Color.BLUE);
		add(title);
		
		buttonLogout = new Button("Logout");
		buttonLogout.setBounds(650, 40, 120,30);
		buttonLogout.setBackground(Color.RED);
		buttonLogout.setForeground(Color.WHITE);
		//buttonLogout.addActionListener(this);
		add(buttonLogout);
		
		buttonProfile = new Button("My Profile");
		buttonProfile.setBounds(650, 80, 120,30);
		buttonProfile.setBackground(Color.RED);
		buttonProfile.setForeground(Color.WHITE);
		//buttonProfile.addActionListener(this);
		add(buttonProfile);
		
		buttonViewCustomer = new Button("View Customer");
		buttonViewCustomer.setBounds(60, 160, 200, 40);
		buttonViewCustomer.setFont(f2);
		buttonViewCustomer.setBackground(Color.YELLOW);
		buttonViewCustomer.setForeground(Color.BLACK);
		//buttonViewCustomer.addActionListener(this);
		add(buttonViewCustomer);
		
		buttonViewBus = new Button("View Bus ");
		buttonViewBus.setBounds(60, 210, 200, 40);
		buttonViewBus.setFont(f2);
		buttonViewBus.setBackground(Color.YELLOW);
		buttonViewBus.setForeground(Color.BLACK);
		//buttonViewBus.addActionListener(this);
		add(buttonViewBus);
		
		header = new Label();
		header.setBackground(Color.CYAN);
		header.setBounds(0, 40, 800, 75);
		add(header);
		
		img = new ImageIcon("Bus3.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(10, 300, 750, 250);
		add(imgLabel);
		 
		
	    setSize(800,600);
		setLocation(100,100);
		setLayout(null);
		
		WindowSensor ws=new WindowSensor();
		addWindowListener(ws);
	}
	class WindowSensor extends WindowAdapter
	{
	public void windowClosing(WindowEvent we)
	{
		System.out.println("Window closing");
		System.exit(0);
	}
}
public void actionPerformed(ActionEvent ae) {
		/*if (ae.getSource().equals(buttonProfile)) {
			this.setVisible(false);
			new MyProfileActivity(this, employee).setVisible(true);
		}*/
		if (ae.getSource().equals(buttonLogout)) {
			this.setVisible(false);
			new Login().setVisible(true);
		}
		/*else if (ae.getSource().equals(buttonViewProduct)) {
			this.setVisible(false);
			new ViewProductActivity(this, employee).setVisible(true);
		}*/
		/*else if (ae.getSource().equals(buttonViewCustomer)) {
			this.setVisible(false);
			new ViewCustomerActivity(this, employee).setVisible(true);
		}*/
		/*else if (ae.getSource().equals(buttonViewEmployee)) {
			this.setVisible(false);
			new ViewEmployeeActivity(this, employee).setVisible(true);
		}*/
		else {}
	}
}