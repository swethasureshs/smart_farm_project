package swe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class entry extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					entry frame = new entry();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public entry() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(1300, 650));
	    pack();
	    setLocationRelativeTo(null);
	    setTitle("SMART FARM");
		setVisible(true);
		//setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.BLACK);
		JButton b1 = new JButton("LOGIN");
		b1.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    b1.setBounds(532,255,148,44);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b1)
				{
					try {
						login l= new login();
						l.setVisible(true);
					}
					catch(Exception en)
					{}
				}	
			}
		});
	
		contentPane.add(b1);
		
		JButton b2 = new JButton("SIGNUP");
		b2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		b2.setBounds(532, 336, 148, 44);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				if(e1.getSource()==b2)
				{
					try {
						signup s= new signup();
						s.setVisible(true);
					}
					catch(Exception emn)
					{}
				}	
			}
		});

		contentPane.add(b2);
		
		JLabel lblNewLabel = new JLabel("SMART FARM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(507, 143, 202, 30);
		contentPane.add(lblNewLabel);
	}
}
