package question_one;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUIEmployee implements ActionListener {
	public JFrame frame;
	public JLabel id_lb=new JLabel("ID");
	public JLabel name_lb=new JLabel("NAME");
	public JLabel position_lb=new JLabel("POSITION");
	
	
	//Textfields
	public JTextField id_tf=new JTextField();
	public JTextField name_tf=new JTextField();
	public JTextField position_tf=new JTextField();
	//btn
	public JButton insert_btn=new JButton("INSERT");
	public JButton view_btn=new JButton("VIEW");
	public JButton update_btn=new JButton("UPDATE");
	public JButton delete_btn=new JButton("DELETE");
	//
	public GUIEmployee(){
		createWindow();
		setsizeandlocation();
		addcomponentOnFrame();
		addactionEvent();
	}
	
	
	
	

	private void addactionEvent() {
	insert_btn.addActionListener(this);
	view_btn.addActionListener(this);
	update_btn.addActionListener(this);
	delete_btn.addActionListener(this);
	}





	private void addcomponentOnFrame() {
		frame.add(id_lb);
		frame.add(name_lb);
		frame.add(position_lb);
		frame.add(id_tf);
		frame.add(name_tf);
		frame.add(position_tf);
		frame.add(insert_btn);
		frame.add(view_btn);
		frame.add(update_btn);
		frame.add(delete_btn);
		
	}





	private void setsizeandlocation() {
		id_lb.setBounds(20, 20, 120,20);
		name_lb.setBounds(20, 80, 120,20);
		position_lb.setBounds(20, 140, 120,20);
		id_tf.setBounds(200, 20, 120,20);
		name_tf.setBounds(200, 80, 120,20);
		position_tf.setBounds(200, 140, 120,20);
		insert_btn.setBounds(20, 200, 80,20);
		view_btn.setBounds(100, 200, 80,20);
		update_btn.setBounds(180, 200, 80,20);
		delete_btn.setBounds(260, 200, 80,20);
		
	}





	private void createWindow() {
		frame=new JFrame();
		frame.setTitle("employee");
		frame.setBounds(20, 20, 350, 350);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.cyan);
		
	}





	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
public static void main(String[] args){
	GUIEmployee m1=new GUIEmployee();
}
}
