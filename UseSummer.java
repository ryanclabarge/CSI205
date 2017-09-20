import javax.swing.JOptionPane;

public class UseSummer{
	public static void main(String[] args){
	int n;
	Summer sum = new Summer();
	n = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter an Integer"));
	int answer = sum.Accumulate(n);
	JOptionPane.showMessageDialog(null,answer);
	}
}
