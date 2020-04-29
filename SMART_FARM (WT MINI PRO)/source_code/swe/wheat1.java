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

public class wheat1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtWheat;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wheat1 frame = new wheat1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public wheat1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(1300, 650));
		pack();
	    setLocationRelativeTo(null);
	    setTitle("WHEAT");
        setVisible(true);
		setBackground(Color.ORANGE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(219, 112, 147));
		
		JTextArea WHEAT = new JTextArea();
		WHEAT.setBounds(0, 0, 0, 0);
		WHEAT.setText("WHEAT");
		contentPane.add(WHEAT);
		
		txtWheat = new JTextField();
		txtWheat.setBackground(new Color(255, 235, 205));
		txtWheat.setBounds(409, 20, 461, 42);
		txtWheat.setHorizontalAlignment(SwingConstants.CENTER);
		txtWheat.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtWheat.setText("WHEAT");
		contentPane.add(txtWheat);
		txtWheat.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(22, 89, 265, 189);
		lblNewLabel.setIcon(new ImageIcon("E:\\sem 4\\WT MINI PRO\\smart_farm_pics\\download (1).jpeg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JEditorPane dtrpnwheatIsThe = new JEditorPane();
		dtrpnwheatIsThe.setBackground(new Color(238, 232, 170));
		dtrpnwheatIsThe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dtrpnwheatIsThe.setBounds(313, 83, 882, 438);
		dtrpnwheatIsThe.setText("\nBASIC GUIDELINES:\n\n=>Wheat is the main cereal crop in India.\n=>Wheat growing zone in TN:Nilgiris & Palani Hills of Tamil Nadu.\n=>Climate requirement:The best wheat are produced in areas favoured with cool, moist weather.\n=>The optimum temperature range for ideal germination  is 20-25 deg Celsius.\n=>Soil: Soils with a clay loam ,good structure and moderate water holding capacity are ideal for wheat cultivation.\n=>Fertilizer Management: 120 kg nitrogen, 60 kg phosphorus and 30 kg potash per hectare were required for optimum productivity.\n=>Nutrient Management: strategies may include:\n                                                            a.Site specific nutrient management.\n                                                            b.Integration of crop residues.\n                                                            c.Tillage techniques like FIRBS.\n                                                            d.Remote sensing for efficient Nutrient management.");
		contentPane.add(dtrpnwheatIsThe);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home_page hp= new Home_page();
				hp.setVisible(true);
			}
		});
		btnNewButton.setBounds(533, 547, 177, 35);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\sem 4\\WT MINI PRO\\smart_farm_pics\\images.jpeg"));
		lblNewLabel_1.setBounds(22, 303, 259, 204);
		contentPane.add(lblNewLabel_1);
	}
}
