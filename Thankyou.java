import java. lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Thankyou extends Frame implements ActionListener
{
    public Label title;
	public JButton imgLabel;
	public Button buttonExit;
	public Button buttonHome;
	public Label confirming;
	//public ImageIcon img;
	private Font f1;
	
	public Thankyou(){
		super("Wellcome Window");
		
		this.setSize(800, 600);
		setBackground( new Color(214, 211, 211) );
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		f1 = new Font("ARIAL", Font.BOLD, 20);
	
	    title = new Label("ONLINE BUS TICKETING SYSTEM");
		title.setBounds(30, 40, 740, 75);
		title.setFont(f1);
		title.setAlignment(Label.CENTER);
		title.setForeground(Color.WHITE);
		title.setBackground(new Color(88, 24, 69));
		add(title);
		
		
		
		confirming = new Label("Thanx For Confirming");
		confirming.setBounds(250, 250, 300, 50);
		confirming.setAlignment(Label.CENTER);
		confirming.setFont(new Font("Microsoft Himalaya",Font.BOLD,14));
		confirming.setBackground(new Color(199, 0, 57));
		confirming.setForeground(Color.WHITE);
		add(confirming);
		
		buttonExit = new Button("Exit");
        buttonExit.setBounds(320, 350, 130, 50);
        buttonExit.setBackground(new Color(88, 24, 69));
		buttonExit.setForeground(Color.WHITE);
		buttonExit.setFont(new Font("Microsoft Himalaya",Font.BOLD,14));
		buttonExit.addActionListener(this);
		add(buttonExit); 
		
		buttonHome = new Button("Home");
        buttonHome.setBounds(320, 450, 130, 50);
        buttonHome.setBackground(new Color(88, 24, 69));
		buttonHome.setForeground(Color.WHITE);
		buttonHome.setFont(new Font("Microsoft Himalaya",Font.BOLD,14));
		buttonHome.addActionListener(this);
		add(buttonHome); 
		 
		/*img = new ImageIcon("bkash.png");
		imgLabel = new JButton(img);
		imgLabel.setBounds(50, 220, 97, 50);
		add(imgLabel);*/
		
		
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
		if (ae.getSource().equals(buttonExit)) 
		{
			System.exit(0);
		}
		else if (ae.getSource().equals(buttonHome))
	{
	    this.setVisible(false);
		new WelcomeWindow().setVisible(true);
	}
		else {}
	}
}