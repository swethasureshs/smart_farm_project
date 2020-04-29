package swe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class signup extends JFrame {

	private JPanel contentPane;

	public signup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(1300, 650));
		pack();
	    setLocationRelativeTo(null);
	    setTitle("SMART FARM-SIGNUP");
		setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(154, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel un = new JLabel("USERNAME");
		un.setFont(new Font("Tahoma", Font.PLAIN, 17));
		un.setBounds(416, 250, 111, 23);
		contentPane.add(un);
		
		JTextArea t1 = new JTextArea();
		t1.setBounds(550, 250, 138, 22);
		contentPane.add(t1);
		
		JLabel pn = new JLabel("PASSWORD");
		pn.setFont(new Font("Tahoma", Font.PLAIN, 17));
		pn.setBounds(416, 302, 98, 14);
		contentPane.add(pn);
		
		JPasswordField t2 = new JPasswordField();
		t2.setBounds(550, 300, 138, 22);
		contentPane.add(t2);
		
		JButton rb = new JButton("SUBMIT\r\n");
		rb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rb.setBounds(458, 371, 98, 29);
		rb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==rb)
				{
					String value1=t1.getText();
				    String value2=t2.getText();
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jp","root","");
						
						
						if(value1.equals("") && value2.equals("")) {
						      JOptionPane.showMessageDialog(null,"Enter  username and password","Error",JOptionPane.ERROR_MESSAGE);}
						else if(value1.equals("")) {
						      JOptionPane.showMessageDialog(null,"Enter username","Error",JOptionPane.ERROR_MESSAGE);}
						else if(value2.equals("")) {
						      JOptionPane.showMessageDialog(null,"Enter password","Error",JOptionPane.ERROR_MESSAGE);}
						
						else {
							java.sql.PreparedStatement ps=cn.prepareStatement("insert into details values(?,?)");
							ps.setString(1,t1.getText());
							ps.setString(2,t2.getText());
							int m=ps.executeUpdate();
						    login pg = new login();
						    pg.setVisible(true);}
					}
					catch(SQLException e1)
					{
						e1.printStackTrace();
					} catch (ClassNotFoundException e1) {
						
						e1.printStackTrace();
					}
				}
			}
		});
		contentPane.add(rb);
		
		JButton bk = new JButton("BACK");
		bk.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bk.setBounds(604, 371, 98, 29);
		bk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entry ty= new entry();
				ty.setVisible(true);
			}
		});
		contentPane.add(bk);
		
		JLabel lblNewLabel = new JLabel("SIGN-UP");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(500, 165, 138, 35);
		contentPane.add(lblNewLabel);
	}
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						signup frame = new signup();
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}

