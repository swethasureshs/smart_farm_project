package swe;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;

public class shop extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					shop frame = new shop();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public shop() {
		setBackground(new Color(188, 143, 143));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(1300, 650));
		pack();
	    setLocationRelativeTo(null);
	    setTitle("SHOP - SEEDS AND FERTILIZERS");
		setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SEEDS AND FERTILIZERS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(498, 48, 300, 62);
		contentPane.add(lblNewLabel);
		
		JCheckBox c1 = new JCheckBox("PBW 343");
		c1.setBackground(new Color(218, 165, 32));
		c1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		c1.setBounds(165, 171, 118, 62);
		contentPane.add(c1);
		
		JCheckBox c2 = new JCheckBox("HPW 42");
		c2.setBackground(new Color(218, 165, 32));
		c2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		c2.setBounds(165, 236, 118, 49);
		contentPane.add(c2);
		
		JCheckBox c3 = new JCheckBox("MDU 3");
		c3.setBackground(new Color(218, 165, 32));
		c3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		c3.setBounds(165, 288, 118, 57);
		contentPane.add(c3);
		
		JCheckBox c4 = new JCheckBox("Ganga 5");
		c4.setBackground(new Color(218, 165, 32));
		c4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		c4.setBounds(165, 348, 118, 49);
		contentPane.add(c4);
		
		JCheckBox c5 = new JCheckBox("Moong Beans");
		c5.setBackground(new Color(218, 165, 32));
		c5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		c5.setBounds(515, 174, 166, 56);
		contentPane.add(c5);
		
		JCheckBox c6 = new JCheckBox("JBO-2003H(Ira)");
		c6.setBackground(new Color(218, 165, 32));
		c6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		c6.setBounds(515, 232, 166, 57);
		contentPane.add(c6);
		
		JCheckBox c7 = new JCheckBox("Masur");
		c7.setBackground(new Color(218, 165, 32));
		c7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		c7.setBounds(515, 292, 166, 49);
		contentPane.add(c7);
		
		JCheckBox c8 = new JCheckBox("AAUOJ-1 (Tarun)");
		c8.setBackground(new Color(218, 165, 32));
		c8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		c8.setBounds(515, 344, 166, 49);
		contentPane.add(c8);
		
		JCheckBox c9 = new JCheckBox("URD");
		c9.setBackground(new Color(218, 165, 32));
		c9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		c9.setBounds(921, 178, 140, 49);
		contentPane.add(c9);
		
		JCheckBox c10 = new JCheckBox("UREA");
		c10.setBackground(new Color(218, 165, 32));
		c10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		c10.setBounds(921, 230, 140, 55);
		contentPane.add(c10);
		
		JCheckBox c11 = new JCheckBox("NPK");
		c11.setBackground(new Color(218, 165, 32));
		c11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		c11.setBounds(921, 288, 140, 46);
		contentPane.add(c11);
		
		JCheckBox c12 = new JCheckBox("MAP");
		c12.setBackground(new Color(218, 165, 32));
		c12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		c12.setBounds(921, 337, 140, 46);
		contentPane.add(c12);
		
		JButton bs = new JButton("SHOP");
		bs.setForeground(new Color(0, 0, 0));
		bs.setBackground(new Color(154, 205, 50));
		bs.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		bs.setBounds(526, 455, 155, 37);
		contentPane.add(bs);
		
		JButton bk = new JButton("BACK");
		bk.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		bk.setBounds(526, 514, 155, 37);
		contentPane.add(bk);
		bk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home_page hp= new Home_page();
				hp.setVisible(true);
			}
		});
		bs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float amt=0;
				String msg="";
				try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jp","root","");
				Statement st=(Statement)cn.createStatement();								
				if(c1.isSelected()) {
			           String q1="update shop set qty=qty-1 where id=1";
			           st.executeUpdate(q1);
					amt+=40;
					msg+="PBW 343: 40\n";
				}
				if(c2.isSelected()) {
					String q2="update shop set qty=qty-1 where id=2";
					st.executeUpdate(q2);
					amt+=150;
					msg+="HPW 42: 150\n";
				}
				if(c3.isSelected()) {
					String q3="update shop set qty=qty-1 where id=3";
					st.executeUpdate(q3);
					amt+=100;
					msg+="MDU-3: 100\n";
				}
				if(c4.isSelected()) {
					String q4="update shop set qty=qty-1 where id=4";
					st.executeUpdate(q4);
					amt+=50;
					msg+="Ganga-5: 50\n";
				}
				if(c5.isSelected()) {
					String q5="update shop set qty=qty-1 where id=5";
					st.executeUpdate(q5);
					amt+=90;
					msg+="Moong beans: 90\n";
				}
				if(c6.isSelected()) {
					String q6="update shop set qty=qty-1 where id=6";
					st.executeUpdate(q6);
					amt+=60;
					msg+="JBO-2003H(Ira): 60\n";
				}
				if(c7.isSelected()) {
					String q7="update shop set qty=qty-1 where id=7";
					st.executeUpdate(q7);
					amt+=1200;
					msg+="Masur: 1200\n";
				}
				if(c8.isSelected()) {
					String q8="update shop set qty=qty-1 where id=8";
					st.executeUpdate(q8);
					amt+=500;
					msg+="AAUOJ-1(Tarun): 500\n";
				}
				if(c9.isSelected()) {
					String q9="update shop set qty=qty-1 where id=9";
					st.executeUpdate(q9);
					amt+=100;
					msg+="Urd: 100\n";
				}
				if(c10.isSelected()) {
					String q10="update shop set qty=qty-1 where id=10";
					st.executeUpdate(q10);
					amt+=270;
					msg+="Urea: 270\n";
				}
				if(c11.isSelected()) {
					String q11="update shop set qty=qty-1 where id=11";
					st.executeUpdate(q11);
					amt+=500;
					msg+="NPK: 500\n";
				}
				if(c12.isSelected()) {
					String q12="update shop set qty=qty-1 where id=12";
					st.executeUpdate(q12);
					amt+=800;
					msg+="MAP: 800\n";
				}
				msg+="--------------------------------\n";
				JOptionPane.showMessageDialog(null,msg+"TOTAL:"+amt);
			}
				catch(Exception ep){
					ep.printStackTrace();
				}
			}
		});
	}
}
