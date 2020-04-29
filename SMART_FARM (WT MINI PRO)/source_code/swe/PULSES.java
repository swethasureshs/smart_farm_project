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

public class PULSES extends JFrame {

	private JPanel contentPane;
	private JTextField txtPULSES;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PULSES frame = new PULSES();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public PULSES() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(1300, 650));
		pack();
	    setLocationRelativeTo(null);
	    setTitle("PULSES");
        setVisible(true);
		setBackground(Color.ORANGE);
	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(219, 112, 147));
		
		JTextArea PULSES = new JTextArea();
		PULSES.setBounds(0, 0, 0, 0);
		PULSES.setText("PULSES");
		contentPane.add(PULSES);
		
		txtPULSES = new JTextField();
		txtPULSES.setBackground(new Color(255, 235, 205));
		txtPULSES.setBounds(394, 28, 461, 42);
		txtPULSES.setHorizontalAlignment(SwingConstants.CENTER);
		txtPULSES.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtPULSES.setText("PULSES");
		contentPane.add(txtPULSES);
		txtPULSES.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\sem 4\\WT MINI PRO\\smart_farm_pics\\PULSES2.jpg"));
		lblNewLabel.setBounds(10, 89, 242, 189);
	
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JEditorPane dtrpnPULSESIsThe = new JEditorPane();
		dtrpnPULSESIsThe.setBackground(new Color(238, 232, 170));
		dtrpnPULSESIsThe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dtrpnPULSESIsThe.setBounds(272, 91, 975, 415);
		dtrpnPULSESIsThe.setText("\nBASIC GUIDELINES:\n\n=>Pulses are  cheap source of plant protein.\n=>Pulses Growing Zones: Haryana,Punjab,Rajasthan.\n=>Climatic requirement: Pulse crops are cultivated in Kharif, Rabi and Zaid seasons of the Agricultural year.\n=>Seed varities: \n 1.chickpeas \n 2. pigeon pea \n 3. moong beans \n 4. urd \n 5.masur  \n 6.peas \n 7.various kinds of beans.");
		contentPane.add(dtrpnPULSESIsThe);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home_page hp= new Home_page();
				hp.setVisible(true);
			}
		});
		btnNewButton.setBounds(542, 545, 187, 42);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\sem 4\\WT MINI PRO\\smart_farm_pics\\PULSES1.jpg"));
	
		lblNewLabel_1.setBounds(10, 303, 242, 204);
		contentPane.add(lblNewLabel_1);
	}
}
