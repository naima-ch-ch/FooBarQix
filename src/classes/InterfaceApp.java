package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InterfaceApp implements ActionListener {
	JFrame frame;
	JButton buttonOk;
	JButton buttonClean;
	JTextField textField;
	JTextArea ta;
	JLabel label;
	FooBarQix fooBarQix = new FooBarQix();
	JScrollPane sp;
	
	public InterfaceApp() {
		ta = new JTextArea();
		label = new JLabel("Entrer un nombre entier");
		label.setBounds(50,20, 200,50 );
		ta.setBounds(50,150, 400, 380);
		textField = new JTextField("");
		buttonOk = new JButton("OK");
		buttonOk.setBackground(Color.green);
		buttonOk.setBounds(350, 70, 100, 60);		
		textField.setBounds(50, 70, 150, 60);
		buttonClean = new JButton("Clean");
		buttonClean.setBounds(500, 450, 100, 60);
		buttonOk.addActionListener(this);
		buttonClean.addActionListener(this);
		sp = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED , JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		frame = new JFrame("FooBarQix App");
		frame.setSize(new Dimension(650,650));
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(textField);
		frame.add(buttonOk);
		frame.add(buttonClean);
		frame.add(ta);
		frame.add(sp);
		frame.add(label);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) { 
		if(e.getSource() == buttonOk) {
			int i = Integer.parseInt(textField.getText());  
			ta.append(fooBarQix.fooBarQixResult(i)+"\n");
			textField.setText("");
		}
		if(e.getSource() == buttonClean) {
			ta.setText("");
		}
	}
		
}
