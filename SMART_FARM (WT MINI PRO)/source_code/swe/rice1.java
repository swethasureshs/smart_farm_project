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

public class rice1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtRice;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rice1 frame = new rice1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public rice1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(1300, 650));
		pack();
	    setLocationRelativeTo(null);
	    setTitle("RICE");
        setVisible(true);
		setBackground(Color.ORANGE);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(219, 112, 147));
		
		JTextArea RICE = new JTextArea();
		RICE.setBounds(0, 0, 0, 0);
		RICE.setText("RICE");
		contentPane.add(RICE);
		
		JTextField txtRice = new JTextField();
		txtRice.setBackground(new Color(255, 235, 205));
		txtRice.setBounds(452, 31, 409, 42);
		txtRice.setHorizontalAlignment(SwingConstants.CENTER);
		txtRice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtRice.setText("RICE");
		contentPane.add(txtRice);
		txtRice.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(31, 101, 242, 189);
		lblNewLabel.setIcon(new ImageIcon("E:\\sem 4\\WT MINI PRO\\smart_farm_pics\\download (2).jpeg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JEditorPane dtrpnriceIsThe = new JEditorPane();
		dtrpnriceIsThe.setBackground(new Color(238, 232, 170));
		dtrpnriceIsThe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dtrpnriceIsThe.setBounds(308, 101, 929, 428);
		dtrpnriceIsThe.setText("\nBASIC GUIDELINES:\n\n=>Climate requirement: Rice crop needs a hot and humid climate.\n\n=>Nutritional value: Rice is a nutritional staple food containing carbohydrate (starch).\n\n=>Medicinal value: Treats many health related maladies such as indigestion, diabetes, arthritis,           paralysis, epilepsy.\n\n=>Crop production practices:\n\n                                             a.Dry or Semi-dry upland cultivation.\n                                             b.Wet or lowland cultivation");
		contentPane.add(dtrpnriceIsThe);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home_page hp= new Home_page();
				hp.setVisible(true);
			}
		});
		btnNewButton.setBounds(542, 547, 179, 35);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\sem 4\\WT MINI PRO\\smart_farm_pics\\images (2).jpeg"));
		lblNewLabel_1.setBounds(31, 291, 242, 238);
		contentPane.add(lblNewLabel_1);
	}
}
