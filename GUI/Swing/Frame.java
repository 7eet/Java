import javax.swing.*;
public class Frame{
	JFrame f = new JFrame();
	Frame(){
		f.setSize(500,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel l = new JLabel();
		l.setText("Label added");
		f.add(l);
	}
	public static void main(String...arg){
		new Frame();
	}
}
