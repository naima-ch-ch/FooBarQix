package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
		ta.setEditable(false);
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
		sp.setBounds(50,150, 400, 380);
		
		frame = new JFrame("FooBarQix App");
		frame.setSize(new Dimension(650,650));
		frame.setResizable(false);
		frame.setBackground(new Color(0*123456));
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(textField);
		frame.add(buttonOk);
		frame.add(buttonClean);
		frame.add(sp);
		//frame.add(ta);
		frame.add(label);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) { 
		if(e.getSource() == buttonOk) {
			String s =textField.getText(); 
			if(!s.isEmpty()) {
				ta.append(s+ " => "+fooBarQix.fooBarQixResult(Integer.parseInt(s))+"\n");
				textField.setText("");
			}
		}
		if(e.getSource() == buttonClean) {
			ta.setText("");
		}
	}

 
		
}
