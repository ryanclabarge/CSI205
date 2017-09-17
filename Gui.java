import javax.swing.JOptionPane;

public class Gui {
	public static void main(String[] args){ //public is the access modifier void is the return type
		int t = Integer.parseInt(JOptionPane.showInputDialog(null,"Please input an integer"));
		int sum = (t*(t+1))/2;
		JOptionPane.showMessageDialog(null,sum,"Sum",JOptionPane.PLAIN_MESSAGE);

	}
}
