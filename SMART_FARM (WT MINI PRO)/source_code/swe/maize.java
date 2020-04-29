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

public class maize extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaize;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					maize frame = new maize();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public maize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(1300, 650));
		pack();
	    setLocationRelativeTo(null);
	    setTitle("MAIZE");
        setVisible(true);
		setBackground(Color.ORANGE);
	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(219, 112, 147));
		
		JTextArea MAIZE = new JTextArea();
		MAIZE.setBounds(0, 0, 0, 0);
		MAIZE.setText("MAIZE");
		contentPane.add(MAIZE);
		
		JTextField txtMaize = new JTextField();
		txtMaize.setBackground(new Color(255, 235, 205));
		txtMaize.setBounds(391, 34, 461, 42);
		txtMaize.setHorizontalAlignment(SwingConstants.CENTER);
		txtMaize.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtMaize.setText("MAIZE");
		contentPane.add(txtMaize);
		txtMaize.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(20, 89, 242, 203);
		lblNewLabel.setIcon(new ImageIcon("E:\\sem 4\\WT MINI PRO\\smart_farm_pics\\IMG_20200423_174127.jpg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JEditorPane dtrpnmaizeIsThe = new JEditorPane();
		dtrpnmaizeIsThe.setBackground(new Color(238, 232, 170));
		dtrpnmaizeIsThe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dtrpnmaizeIsThe.setBounds(274, 97, 972, 432);
		dtrpnmaizeIsThe.setText("\nBASIC GUIDELINES:\n\n=>Maize (Zea mays) is known as queen of cereals because it has the highest genetic yield potential among the cereals.\n\n=>Maize growing zones: AP,Karnataka,Rajasthan.\n\n=>Soil: Maize can be grown successfully in variety of soils ranging from loamy sand to clay loam.\n\n=>Industrial products: starch, oil, protein, pharmaceutical and paper industries.");
		contentPane.add(dtrpnmaizeIsThe);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home_page hp= new Home_page();
				hp.setVisible(true);
			}
		});
		btnNewButton.setBounds(609, 549, 174, 35);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\sem 4\\WT MINI PRO\\smart_farm_pics\\images (5).jpeg"));
		lblNewLabel_1.setBounds(20, 303, 242, 227);
		contentPane.add(lblNewLabel_1);
	}
}
