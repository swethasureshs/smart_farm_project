package swe;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class JUTE extends JFrame {

	private JPanel contentPane;
	private JTextField txtJUTE;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JUTE frame = new JUTE();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public JUTE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(1300, 650));
		pack();
	    setLocationRelativeTo(null);
	    setTitle("JUTE");
        setVisible(true);
		setBackground(Color.ORANGE);
	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(219, 112, 147));
		
		JTextArea JUTE = new JTextArea();
		JUTE.setBounds(0, 0, 0, 0);
		JUTE.setText("JUTE");
		contentPane.add(JUTE);
		
		txtJUTE = new JTextField();
		txtJUTE.setBackground(new Color(255, 235, 205));
		txtJUTE.setBounds(465, 20, 397, 42);
		txtJUTE.setHorizontalAlignment(SwingConstants.CENTER);
		txtJUTE.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtJUTE.setText("JUTE");
		contentPane.add(txtJUTE);
		txtJUTE.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\sem 4\\WT MINI PRO\\smart_farm_pics\\JUTE2.jpg"));
		lblNewLabel.setBounds(10, 89, 257, 203);
	
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JEditorPane dtrpnJUTEIsThe = new JEditorPane();
		dtrpnJUTEIsThe.setBackground(new Color(238, 232, 170));
		dtrpnJUTEIsThe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dtrpnJUTEIsThe.setBounds(290, 73, 967, 456);
		dtrpnJUTEIsThe.setText("BASIC GUIDELINES:\n\n=>Jute is an important natural fibre crop in India.\n=>Jute cultivation zones:  Assam, UP, West Bengal.\n=>Climatic Requirements: The suitable climate for growing jute is warm and wet climate.\n=>Soil: The new gray alluvial soil is best for jute.\n=>Seed varities:\n1. AAUOJ-1 (Tarun) \n 2. JBO-2003H (Ira) \n 3. JRO-204 (Suren) \n 4. S-19 (Subala) \n 5. JRO-8432 (Shakti) \n 6. CO-58 (Sourav)\n=> Pest and diseases:\n1. Stem girdling beetle: Management strategy: Spray application of phosalone 0.07% or endosulfan 0.07 % at fortnightly interval. \n 2. Jute weevil:  Spray application of phosalone 0.07% or endosulfan 0.07 or cypermethrin 0.005%. \n 3. Spodoptera exigua: Management strategy: Collection and destruction of egg masses. ");
		contentPane.add(dtrpnJUTEIsThe);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home_page hp= new Home_page();
				hp.setVisible(true);
			}
		});
		btnNewButton.setBounds(539, 546, 187, 42);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\sem 4\\WT MINI PRO\\smart_farm_pics\\JUTE 1.jpg"));
	
		lblNewLabel_1.setBounds(10, 303, 257, 204);
		contentPane.add(lblNewLabel_1);
	}
}