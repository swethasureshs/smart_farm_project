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

public class SUGARCANE extends JFrame {

	private JPanel contentPane;
	private JTextField txtSUGARCANE;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SUGARCANE frame = new SUGARCANE();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public SUGARCANE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(1300, 650));
		pack();
	    setLocationRelativeTo(null);
	    setTitle("SUGARCANE");
        setVisible(true);
		setBackground(Color.ORANGE);
	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(219, 112, 147));
		
		JTextArea SUGARCANE = new JTextArea();
		SUGARCANE.setBounds(0, 0, 0, 0);
		SUGARCANE.setText("SUGARCANE");
		contentPane.add(SUGARCANE);
		
		txtSUGARCANE = new JTextField();
		txtSUGARCANE.setBackground(new Color(255, 235, 205));
		txtSUGARCANE.setBounds(422, 41, 432, 42);
		txtSUGARCANE.setHorizontalAlignment(SwingConstants.CENTER);
		txtSUGARCANE.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtSUGARCANE.setText("SUGARCANE");
		contentPane.add(txtSUGARCANE);
		txtSUGARCANE.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\sem 4\\WT MINI PRO\\smart_farm_pics\\SUGARCANE.jpg"));
		lblNewLabel.setBounds(10, 105, 274, 218);
	
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JEditorPane dtrpnSUGARCANEIsThe = new JEditorPane();
		dtrpnSUGARCANEIsThe.setBackground(new Color(238, 232, 170));
		dtrpnSUGARCANEIsThe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dtrpnSUGARCANEIsThe.setBounds(303, 116, 946, 398);
		dtrpnSUGARCANEIsThe.setText("\nBASIC GUIDELINES:\n\n=> Sugarcane (Saccharum officinarum) is widely grown crop in India.\n=>Sugarcane cultivation zones:  TN,AP,Maharashtra.\n=>Climatic requirements: For ripening ,low temperatures in the range of 12° to 14° are desirable.\n=>Soil: thrives best on well drained soils.\n=> Seed varities:\n 1. Co 0118 \n 2. Co 0232 \n 3. Co 0237 \n 4. Co 0238 \n 5. Co 0239 \n 6. CoSe 01421 \n 7. Co 05009");
		contentPane.add(dtrpnSUGARCANEIsThe);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home_page hp= new Home_page();
				hp.setVisible(true);
			}
		});
		btnNewButton.setBounds(525, 547, 192, 42);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\sem 4\\WT MINI PRO\\smart_farm_pics\\SUGARCANE1.jpg"));
	
		lblNewLabel_1.setBounds(10, 303, 274, 204);
		contentPane.add(lblNewLabel_1);
	}
}