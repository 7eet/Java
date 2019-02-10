import javax.swing.*;
import java.awt.event.*;
public class Button implements ActionListener{
	JFrame frame = new JFrame();
	JButton button1 = new JButton("Click");
	JButton button2 = new JButton("Dont Click");
	JLabel l = new JLabel();
	
	Button(){
		frame.setLayout(null);
		frame.setSize(500,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		button1.setBounds(100,200,100,200);
		
		button1.addActionListener(this);
		
		button2.setBounds(200,300,200,300);
		
		button2.addActionListener(this);
		frame.add(button1);
		frame.add(button2);
		l.setBounds(200,100,200,100);
			frame.add(l);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == button1 ){
			System.out.println("click");	
			l.setText("Click");
		}
		else {
			System.out.println("dont click");
			l.setText("Dont Click");
		}
	}
	
	public static void main(String[] args){
		new Button();
	}
}
