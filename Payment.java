import java. lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Payment extends Frame implements ActionListener
{
    public Label title;
	public JButton imgLabel;
	public JButton imgLabel2;
	public JButton imgLabel3;
	public Button buttonBack;
    public Button buttonConfirm;
	public Label pconfirm;
	public Label selectpayment;
	public ImageIcon img;
	public ImageIcon img2;
	public ImageIcon img3;
	public Font f1;
	public Font f2;
	
	public Payment(){
		super("Wellcome Window");
		
		this.setSize(800, 600);
		setBackground( new Color(214, 211, 211) );
		
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		f1 = new Font("ARIAL", Font.BOLD, 20);
		f2 = new Font("ARIAL", Font.PLAIN, 15);
	
	    title = new Label("ONLINE BUS TICKETING SYSTEM");
		title.setBounds(30, 40, 740, 75);
		title.setFont(f1);
		title.setAlignment(Label.CENTER);
		title.setForeground(Color.WHITE);
		title.setBackground(new Color(88, 24, 69));
		add(title);
		
		
		
		pconfirm = new Label("Payment To Confirm");
		pconfirm.setBounds(30, 120, 740, 30);
		pconfirm.setAlignment(Label.CENTER);
		pconfirm.setFont(new Font("Microsoft Himalaya",Font.BOLD,14));
		pconfirm.setBackground(Color.YELLOW);
		pconfirm.setForeground(Color.BLACK);
		add(pconfirm);
		
	    selectpayment = new Label("Select Any Payment Method : ");
		selectpayment.setBounds(40, 160, 220, 30);
		selectpayment.setFont(new Font("Microsoft Himalaya",Font.BOLD,14));
		selectpayment.setBackground(Color.CYAN);
		selectpayment.setForeground(Color.BLACK);
		add(selectpayment);
		
		buttonBack = new Button("Back");
        buttonBack.setBounds(250, 535, 130, 50);
        buttonBack.setBackground(new Color(88, 24, 69));
		buttonBack.setForeground(Color.WHITE);
		buttonBack.setFont(new Font("Microsoft Himalaya",Font.BOLD,14));
		buttonBack.addActionListener(this);
		add(buttonBack); 
		
		 buttonConfirm = new Button("Confirm");
		 buttonConfirm.setBounds(40, 535, 130, 50);
		 buttonConfirm.setBackground(new Color(88, 24, 69));
		 buttonConfirm.setForeground(Color.WHITE);
		 buttonConfirm.setFont(new Font("Microsoft Himalaya",Font.BOLD,14));
		 buttonConfirm.addActionListener(this);
		 add(buttonConfirm);
		 
		img = new ImageIcon("bkash.png");
		imgLabel = new JButton(img);
		imgLabel.setBounds(50, 220, 97, 50);
		add(imgLabel);
		
        img = new ImageIcon("visa.png");
		imgLabel = new JButton(img);
		imgLabel.setBounds(50, 320, 93, 50);
		add(imgLabel);		
      
	    img = new ImageIcon("mastercard.png");
		imgLabel = new JButton(img);
		imgLabel.setBounds(50, 420, 93, 50);
		add(imgLabel);	
		
		setSize(800,600);
		setLocation(100,100);
		setLayout(null);
		
		WindowSensor ws=new WindowSensor();
		addWindowListener(ws);
	}
class WindowSensor extends WindowAdapter{
	public void windowClosing(WindowEvent we){
		System.out.println("Window closing");
		System.exit(0);
	}
}
public void actionPerformed(ActionEvent ae) {
		if (ae.getSource().equals(buttonConfirm)) {
			this.setVisible(false);
			new Thankyou().setVisible(true);
		}
		else if (ae.getSource().equals(buttonBack)) {
			this.setVisible(false);
			new BusInfo().setVisible(true);
		}
		else {}
	}

}