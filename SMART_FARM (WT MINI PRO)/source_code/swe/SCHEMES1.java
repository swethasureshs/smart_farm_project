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

public class SCHEMES1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtSCHEMES1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SCHEMES1 frame = new SCHEMES1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SCHEMES1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(1300, 650));
		pack();
	    setLocationRelativeTo(null);
	    setTitle("PROGRAMES AND SCHEMES");
        setVisible(true);
		setBackground(Color.ORANGE);
	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setLayout(null);
		
		JTextArea SCHEMES1 = new JTextArea();
		SCHEMES1.setBounds(0, 0, 0, 0);
		SCHEMES1.setText("PROGRAMES AND SCHEMES");
		contentPane.add(SCHEMES1);
		
		txtSCHEMES1 = new JTextField();
		txtSCHEMES1.setBounds(401, 11, 461, 52);
		txtSCHEMES1.setBackground(new Color(238, 232, 170));
		txtSCHEMES1.setHorizontalAlignment(SwingConstants.CENTER);
		txtSCHEMES1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtSCHEMES1.setText("PROGRAMMES AND SCHEMES");
		contentPane.add(txtSCHEMES1);
		txtSCHEMES1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 89, 242, 189);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JEditorPane dtrpnSUGARCANEIsThe = new JEditorPane();
		dtrpnSUGARCANEIsThe.setBounds(20, 74, 1254, 498);
		dtrpnSUGARCANEIsThe.setBackground(new Color(173, 216, 230));
		dtrpnSUGARCANEIsThe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		dtrpnSUGARCANEIsThe.setText("\r\n=> Soil Health Card Scheme:\r\nLaunched in 2015, the scheme has been introduced to assist State Governments to issue Soil Health Cards to all farmers in the country.The Soil Health Cardsprovide information to farmers on nutrient status of their soil along with recommendation on appropriate dosage of nutrients to be applied for improving soilhealth and its fertility.\r\n\r\n=>Rainfed Area Development Programme (RADP):\r\nRainfed Area Development Programme (RADP) aims at improving life of farmer's by offering a complete package of activities.\r\n\r\n=>National Watershed Development Project for Rainfed Areas (NWDPRA):\r\nThe scheme NWDPRA was launched in 1990-91 based on twin concepts of integrated watershed management and sustainable farming systems.\r\n\r\n=>Pradhan Mantri Fasal Bima Yojana (PMFBY):\r\nPradhan Mantri Fasal Bima Yojana (PMFBY) is the government sponsored crop insurance scheme that integrates multiple stakeholders on a single platform.\r\n\r\n=>Micro Irrigation Fund (MIF):\r\nThe government approved a dedicated Rs5,000 crore fund to bring more land area under micro-irrigation as part of its objective to boost agriculture            production and farmers income.\r\n\r\n=>E-NAM:\r\nNational Agriculture Market (eNAM) is a pan-India electronic trading portal which networks the existing APMC mandis to create a unified national market for  agricultural commodities.");
		contentPane.add(dtrpnSUGARCANEIsThe);
		
		JButton bb = new JButton("BACK");
		bb.setBounds(604, 577, 89, 23);
		contentPane.add(bb);
		bb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home_page hp= new Home_page();
				hp.setVisible(true);
			}
		});
	}
}