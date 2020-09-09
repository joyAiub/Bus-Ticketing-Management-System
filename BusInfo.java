import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BusInfo extends Frame implements ActionListener
{
	
	public Label label1;
	public Label label2;
	public Label label3;
	public Button Buttonb1;
	public Button Buttonb2;
	public Button Buttonb3;
	public Button Buttonb4;
	public Button Buttonb6;
	public JComboBox combo;
	
	
	public BusInfo()
	{
		super("BusInfo Window");
		this.setSize(800, 600);
        this.setTitle("BUS SELECTION");
		setBackground( new Color(214, 211, 211) );
		
        label1 = new Label("Wellcome to our service");
        label1.setBounds(30, 30, 740, 60);
		label1.setAlignment(Label.CENTER);
        label1.setFont(new Font("Open Sans", Font.BOLD, 25));
		label1.setBackground(new Color(88, 24, 69));
        label1.setForeground(Color.WHITE);
		add(label1);
		
        label2 = new Label("Choose Bus Time");
        label2.setBounds(545, 120, 300, 60);
        label2.setFont(new Font("Open Sans", Font.BOLD, 25));
		label2.setBackground(new Color(43, 30, 136));
        label2.setForeground(Color.WHITE); 
		add(label2);
		
        label3 = new Label("Choose Destination");
        label3.setBounds(60, 120, 300, 60);
        label3.setFont(new Font("Open Sans", Font.BOLD, 25));
		label3.setBackground(new Color(43, 30, 136));
        label3.setForeground(Color.WHITE);
		add(label3);
		
		String s[] = {"Dhaka to Chittagong", "Chittagong to Dhaka", "Dhaka to Bogura", "Dhaka to Maymansingh", "Dhaka  to Coxs Bazar", "Chittagong to CoxsBazar"};
		
		combo = new JComboBox(s);
		combo.setBounds(60, 200, 300, 90);
		combo.setFont(new Font("Open Sans", Font.BOLD, 20));
		combo.setForeground(Color.BLUE);
		combo.setBackground(new Color(120, 132, 229));
		combo.setForeground(Color.WHITE);
	    add(combo);
		
        Buttonb1 = new Button("Soudia:  2.30pm");
        Buttonb1.setBounds(545, 200, 200, 70);
        Buttonb1.setFont(new Font("Open Sans", Font.BOLD, 20));
        Buttonb1.setBackground(new Color(199, 0, 57));
        Buttonb1.setForeground(Color.WHITE);
		add(Buttonb1);
		
        Buttonb2 = new Button("Sohag:  5.00pm");
        Buttonb2.setBounds(545, 280, 200, 70);
        Buttonb2.setFont(new Font("Open Sans", Font.BOLD, 20));
        Buttonb2.setForeground(Color.WHITE);
        Buttonb2.setBackground(new Color(199, 0, 57));
		add(Buttonb2);
		
        Buttonb3 = new Button("GreenLine:  9.30am");
        Buttonb3.setBounds(545, 360, 200, 70);
        Buttonb3.setFont(new Font("Open Sans", Font.BOLD, 20));
        Buttonb3.setForeground(Color.WHITE);
        Buttonb3.setBackground(new Color(199, 0, 57));
		add(Buttonb3);
		
        Buttonb4 = new Button("Shaymoli:  11.30am");
        Buttonb4.setBounds(545, 440, 200, 70);
        Buttonb4.setFont(new Font("Open Sans", Font.BOLD, 20));
        Buttonb4.setForeground(Color.WHITE);
        Buttonb4.setBackground(new Color(199, 0, 57));
		add(Buttonb4);
		
		Buttonb6 = new Button("PAYMENT");
        Buttonb6.setBounds(250, 535, 130, 50);
        Buttonb6.setFont(new Font("", Font.BOLD, 15));
		Buttonb6.setBackground(new Color(88, 24, 69));
        Buttonb6.setForeground(Color.WHITE);
		Buttonb6.addActionListener(this);
		add(Buttonb6);
		
		
		setSize(800, 600);
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
		if (ae.getSource().equals(Buttonb6)) {
			this.setVisible(false);
			new Payment().setVisible(true);
		}
	
		else {}
	}
}
	
