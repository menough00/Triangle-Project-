

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class TriangleUI extends JPanel {
	private JLabel title=new JLabel(" ~~ Triangle Checker ~~");
	private JLabel  triangleMsg=new JLabel(" Enter Triangle dimensions: ");

	private JTextField sideA=new JTextField(5);
	private JTextField sideB=new JTextField(5);
	private JTextField sideC=new JTextField(5);
	private JButton checkButton = new JButton("Check");
	private JButton clearButton = new JButton("Clear"); 

	// default constructor 
	public TriangleUI() {
		super();
		CheckButtonListener cbl=new CheckButtonListener();
		checkButton.addActionListener(cbl);
		ClearButtonListener cbl2=new ClearButtonListener();
		clearButton.addActionListener(cbl2);

		JLabel labelA=new JLabel("Side A: ");
		JLabel labelB=new JLabel("Side B: ");
		JLabel labelC=new JLabel("Side C: ");
		GroupLayout layout=new GroupLayout(this);
		setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);

		layout.setVerticalGroup(
				layout.createSequentialGroup()
				.addComponent(title)
				.addComponent(triangleMsg)
				.addGroup(layout.createParallelGroup()
						.addComponent(labelA)
						.addComponent(sideA))
				.addGroup(layout.createParallelGroup()
						.addComponent(labelB)
						.addComponent(sideB))
				.addGroup(layout.createParallelGroup()
						.addComponent(labelC)
						.addComponent(sideC))
				.addGroup(layout.createParallelGroup()
						.addComponent(checkButton)
						.addComponent(clearButton))
				);
		layout.setHorizontalGroup(
				layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup()
						.addComponent(title)
						.addComponent(triangleMsg)
						.addComponent(labelA)
						.addComponent(labelB)
						.addComponent(labelC)
						.addComponent(checkButton))
				.addGroup(layout.createParallelGroup()
						.addComponent(sideA)
						.addComponent(sideB)
						.addComponent(sideC)
						.addComponent(clearButton))

				);
		/*
		add(title);
		add(triangleMsg);

		add(sideA);
		add(sideB);
		add(sideC);
		add(checkButton);
		add(clearButton);
*/
	}

	class CheckButtonListener implements ActionListener{


		@Override
		public void actionPerformed(ActionEvent e) {

			try {
				int a =Integer.parseInt(sideA.getText());
				int b =Integer.parseInt(sideB.getText());
				int c =Integer.parseInt(sideC.getText());
				Triangle t=new Triangle(a,b,c);
				if(!t.isTriangle()) {
					triangleMsg.setText("Not a triangle");
				}
				else if(t.isEquilateral()) {
					triangleMsg.setText("Equilateral");
				}
				else if(t.isScalene()) {
					triangleMsg.setText("Scalene");
				}
				else if(t.isIsosceles()) {
					triangleMsg.setText("Isosceles");
				}
				else {
					triangleMsg.setText("UNEXPECTED ERROR!");// this should never happen, an extra test 
				}

			}catch(NumberFormatException ex) {
				triangleMsg.setText("Invalid Entry! Integers only!");
			}catch(IllegalArgumentException ex) {
				triangleMsg.setText(ex.getMessage());// tell the error message 
			}

		}

	}

	class ClearButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			resetFields();
		}
	}
	public void resetFields() {
		sideA.setText("");
		sideB.setText("");
		sideC.setText("");


	}
}
