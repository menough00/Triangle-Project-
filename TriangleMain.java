import javax.swing.JFrame;
import javax.swing.JPanel;



public class TriangleMain {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Triangle");
		JPanel panel = new TriangleUI();

		frame.add(panel);
		frame.setSize(250,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
