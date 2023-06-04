package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// JFrame 을 사용하여 메뉴선택코딩을 가시화 d
public class MenuSelection extends JFrame{

	
	public MenuSelection() {
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("MenuSelection");
		
		JButton button1 = new JButton("Add a PTMember");
		JButton button2 = new JButton("Delete a PTMember");
		JButton button3 = new JButton("Edit a PTMember");
		JButton button4 = new JButton("Veiw PTMembers");
		JButton button5 = new JButton("Exit");
		
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		
		
		
		
	}
}
