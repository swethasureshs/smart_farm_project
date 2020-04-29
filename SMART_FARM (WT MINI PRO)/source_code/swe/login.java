package swe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Font;

public class login extends JFrame {
	private JPanel contentPane;	
		public login() {
	    getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(javax.swing. WindowConstants.DISPOSE_ON_CLOSE);
		setPreferredSize(new Dimension(1300, 650));
		pack();
	    setLocationRelativeTo(null);
		setTitle("SMART FARM-LOGIN");
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(154, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel un = new JLabel("USERNAME");
		un.setFont(new Font("Tahoma", Font.PLAIN, 17));
		un.setBounds(423, 250, 104, 23);
		contentPane.add(un);
		
		JTextArea t1 = new JTextArea();
		t1.setBounds(550, 250, 138, 22);
		contentPane.add(t1);
		
		JLabel pn = new JLabel("PASSWORD");
		pn.setFont(new Font("Tahoma", Font.PLAIN, 17));
		pn.setBounds(423, 300, 97, 14);
		contentPane.add(pn);
		
		JPasswordField t2 = new JPasswordField();
		t2.setBounds(550, 300, 138, 22);
		contentPane.add(t2);
		
		JButton rb = new JButton("SUBMIT\r\n");
		rb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rb.setBounds(493, 371, 115, 33);
		rb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==rb)
				{
					String value1=t1.getText();
				    String value2=t2.getText();
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jp","root","");
						Statement st=(Statement) cn.createStatement();
				           ResultSet rs=st.executeQuery("select * from details where username='"+value1+"' and password='"+value2+"'");
				           String uname="",pass="";
				           if(rs.next()){
				               uname=rs.getString("username");
				               pass=rs.getString("password");
				           }
				 if(value1.equals("") && value2.equals("")) {
				      JOptionPane.showMessageDialog(null,"Enter login name or password","Error",JOptionPane.ERROR_MESSAGE);
				  }
				 else if(value1.equals(uname) && value2.equals(pass)) {
				    Home_page page=new Home_page();
				    page.setVisible(true);
				    }
				 else{
				     JOptionPane.showMessageDialog(null,"Invalid login name or password","Error",JOptionPane.ERROR_MESSAGE);
				     t1.setText("");
				     t2.setText("");
				  }
				    }
				    catch(Exception ep){}
				}}
				 });
		contentPane.add(rb);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(511, 139, 96, 39);
		contentPane.add(lblNewLabel);
			}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}