import java. lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class WelcomeWindow extends Frame implements ActionListener
{
    public Label title;
	public JLabel imgLabel;
	//private Button logInAsAdminBtn;
    public Button logInAsUserBtn;
	public ImageIcon img;
	public Font f1;
	public Font f2;
	
	public WelcomeWindow(){
		super("Wellcome Window");
		
		this.setSize(800, 600);
		//this.setBackground(Color.YELLOW);
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
		
		logInAsUserBtn = new Button("Log In As User");
        logInAsUserBtn.setBounds(280, 230, 220, 50);
        logInAsUserBtn.setBackground(new Color(88, 24, 69));
		logInAsUserBtn.setForeground(Color.WHITE);
		logInAsUserBtn.setFont(new Font("Microsoft Himalaya",Font.BOLD,14));
		logInAsUserBtn.addActionListener(this);
		add(logInAsUserBtn); 
		
		 /*logInAsAdminBtn = new Button("Log In As Admin");
		 logInAsAdminBtn.setBounds(300, 220, 220, 50);
		 logInAsAdminBtn.setBackground(Color.GREEN);
		 logInAsAdminBtn.setFont(new Font("Microsoft Himalaya",Font.BOLD,14));
		 logInAsAdminBtn.addActionListener(this);
		 add(logInAsAdminBtn);*/
		 
		img = new ImageIcon("Bus2.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(100, 330, 600, 250);
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
public void actionPerformed(ActionEvent ae)
{
	if (ae.getSource().equals(logInAsUserBtn))
	{
		this.setVisible(false);
	    new Login().setVisible(true);
	}
	/*else if (ae.getSource().equals(logInAsAdminBtn))
	{
	    this.setVisible(false);
		new Loginadmin().setVisible(true);
	}	*/
		else {}
}

}