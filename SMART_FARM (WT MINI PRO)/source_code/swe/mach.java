package swe;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.StyledDocument;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;

public class mach extends JFrame {

private JPanel contentPane;
private JTextField txtTractor;
private JTextField txtBaler;
private JTextField txtCost;
private JTextField txtCost_1;
private JTextField txtSoilCultivator;
private JTextField txtCost_2;
private JTextField txtSeedDrill;
private JTextField txtCost_3;
private JTextField txtPloughingMachine;
private JTextField txtCost_4;
private JTextField txtIrrigationPipes;
private JTextField txtCost_5;

public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
mach frame = new mach();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

public mach() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setPreferredSize(new Dimension(1300, 650));
pack();
   setLocationRelativeTo(null);
   setTitle("FARM MACHINARIES");
        setVisible(true);

contentPane = new JPanel();
contentPane.setBackground(new Color(189, 183, 107));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);

JLabel l1 = new JLabel("EMI CALCULATOR");
l1.setBounds(963, 65, 245, 59);
l1.setFont(new Font("Tahoma", Font.BOLD, 23));
contentPane.add(l1);

JLabel l2 = new JLabel("PRINCIPAL AMOUNT:");
l2.setBounds(965, 150, 206, 27);
l2.setFont(new Font("Tahoma", Font.PLAIN, 19));
contentPane.add(l2);

JTextPane t1 = new JTextPane();
t1.setBounds(963, 193, 154, 27);
contentPane.add(t1);

JLabel l3 = new JLabel("RATE OF INTEREST PER ANNUM:");
l3.setBounds(963, 236, 283, 27);
l3.setFont(new Font("Tahoma", Font.PLAIN, 19));
contentPane.add(l3);

JTextPane t2 = new JTextPane();
t2.setBounds(965, 274, 154, 27);
contentPane.add(t2);

JLabel l4 = new JLabel("TENURE (IN YEARS):");
l4.setBounds(965, 319, 180, 32);
l4.setFont(new Font("Tahoma", Font.PLAIN, 19));
contentPane.add(l4);

JTextPane t3 = new JTextPane();
t3.setBounds(965, 362, 154, 27);
contentPane.add(t3);

JLabel l5 = new JLabel("EMI: (RESULT)");
l5.setBounds(963, 400, 154, 27);
l5.setFont(new Font("Tahoma", Font.PLAIN, 20));
contentPane.add(l5);

JTextPane t4 = new JTextPane();
t4.setBounds(963, 438, 154, 27);
contentPane.add(t4);

JButton b1 = new JButton("SUBMIT");
b1.setBounds(963, 491, 106, 32);
b1.setFont(new Font("Tahoma", Font.PLAIN, 14));
contentPane.add(b1);

JButton b2 = new JButton("CLEAR");
b2.setBounds(1108, 491, 106, 32);
b2.setFont(new Font("Tahoma", Font.PLAIN, 14));
contentPane.add(b2);
txtTractor = new JTextField();
txtTractor.setBackground(new Color(255, 228, 181));
txtTractor.setBounds(30, 38, 161, 27);
txtTractor.setFont(new Font("Tahoma", Font.PLAIN, 22));
txtTractor.setHorizontalAlignment(SwingConstants.CENTER);
txtTractor.setText("TRACTOR");
contentPane.add(txtTractor);
txtTractor.setColumns(10);
JLabel lblNewLabel = new JLabel("New label");
lblNewLabel.setBounds(30, 76, 268, 182);
lblNewLabel.setIcon(new ImageIcon("E:\\sem 4\\WT MINI PRO\\smart_farm_pics\\images (19).jpeg"));
contentPane.add(lblNewLabel);
txtBaler = new JTextField();
txtBaler.setBackground(new Color(255, 228, 181));
txtBaler.setBounds(30, 330, 154, 27);
txtBaler.setText("BALER");
txtBaler.setHorizontalAlignment(SwingConstants.CENTER);
txtBaler.setFont(new Font("Tahoma", Font.PLAIN, 22));
contentPane.add(txtBaler);
txtBaler.setColumns(10);
JLabel lblNewLabel_1 = new JLabel("New label");
lblNewLabel_1.setBounds(30, 368, 276, 167);
lblNewLabel_1.setIcon(new ImageIcon("E:\\sem 4\\WT MINI PRO\\smart_farm_pics\\images (16).jpeg"));
contentPane.add(lblNewLabel_1);
txtCost = new JTextField();
txtCost.setBackground(new Color(255, 228, 181));
txtCost.setBounds(30, 274, 196, 27);
txtCost.setFont(new Font("Tahoma", Font.PLAIN, 22));
txtCost.setHorizontalAlignment(SwingConstants.CENTER);
txtCost.setText("COST:6,13,000");
contentPane.add(txtCost);
txtCost.setColumns(10);
txtCost_1 = new JTextField();
txtCost_1.setBackground(new Color(255, 228, 181));
txtCost_1.setBounds(30, 554, 180, 32);
txtCost_1.setHorizontalAlignment(SwingConstants.CENTER);
txtCost_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
txtCost_1.setText("COST:3,80,000");
contentPane.add(txtCost_1);
txtCost_1.setColumns(10);
txtSoilCultivator = new JTextField();
txtSoilCultivator.setBackground(new Color(255, 228, 181));
txtSoilCultivator.setBounds(344, 45, 186, 27);
txtSoilCultivator.setFont(new Font("Tahoma", Font.PLAIN, 20));
txtSoilCultivator.setHorizontalAlignment(SwingConstants.CENTER);
txtSoilCultivator.setText("SOIL CULTIVATOR");
contentPane.add(txtSoilCultivator);
txtSoilCultivator.setColumns(10);
JLabel lblNewLabel_2 = new JLabel("New label");
lblNewLabel_2.setBounds(344, 84, 257, 167);
lblNewLabel_2.setIcon(new ImageIcon("E:\\sem 4\\WT MINI PRO\\smart_farm_pics\\images (21).jpeg"));
contentPane.add(lblNewLabel_2);
txtCost_2 = new JTextField();
txtCost_2.setBackground(new Color(255, 228, 181));
txtCost_2.setBounds(344, 267, 180, 27);
txtCost_2.setHorizontalAlignment(SwingConstants.CENTER);
txtCost_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
txtCost_2.setText("COST:75,000");
contentPane.add(txtCost_2);
txtCost_2.setColumns(10);
txtSeedDrill = new JTextField();
txtSeedDrill.setBackground(new Color(255, 228, 181));
txtSeedDrill.setBounds(344, 323, 186, 27);
txtSeedDrill.setText("SEED DRILL");
txtSeedDrill.setHorizontalAlignment(SwingConstants.CENTER);
txtSeedDrill.setFont(new Font("Tahoma", Font.PLAIN, 23));
contentPane.add(txtSeedDrill);
txtSeedDrill.setColumns(10);
JLabel lblNewLabel_3 = new JLabel("New label");
lblNewLabel_3.setBounds(344, 368, 257, 167);
lblNewLabel_3.setIcon(new ImageIcon("E:\\sem 4\\WT MINI PRO\\smart_farm_pics\\images (23).jpeg"));
contentPane.add(lblNewLabel_3);
txtCost_3 = new JTextField();
txtCost_3.setBackground(new Color(255, 228, 181));
txtCost_3.setBounds(344, 554, 186, 32);
txtCost_3.setText("COST:1,11,000");
txtCost_3.setHorizontalAlignment(SwingConstants.CENTER);
txtCost_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
contentPane.add(txtCost_3);
txtCost_3.setColumns(10);
txtPloughingMachine = new JTextField();
txtPloughingMachine.setBackground(new Color(255, 228, 181));
txtPloughingMachine.setBounds(635, 45, 225, 27);
txtPloughingMachine.setHorizontalAlignment(SwingConstants.CENTER);
txtPloughingMachine.setFont(new Font("Tahoma", Font.PLAIN, 20));
txtPloughingMachine.setText("PLOUGHING MACHINE");
contentPane.add(txtPloughingMachine);
txtPloughingMachine.setColumns(10);
JLabel lblNewLabel_4 = new JLabel("New label");
lblNewLabel_4.setBounds(635, 84, 276, 167);
lblNewLabel_4.setIcon(new ImageIcon("E:\\sem 4\\WT MINI PRO\\smart_farm_pics\\images (24).jpeg"));
contentPane.add(lblNewLabel_4);
txtCost_4 = new JTextField();
txtCost_4.setBackground(new Color(255, 228, 181));
txtCost_4.setBounds(635, 267, 174, 27);
txtCost_4.setHorizontalAlignment(SwingConstants.CENTER);
txtCost_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
txtCost_4.setText("COST:90,000");
contentPane.add(txtCost_4);
txtCost_4.setColumns(10);
txtIrrigationPipes = new JTextField();
txtIrrigationPipes.setBackground(new Color(255, 228, 181));
txtIrrigationPipes.setBounds(635, 320, 225, 27);
txtIrrigationPipes.setHorizontalAlignment(SwingConstants.CENTER);
txtIrrigationPipes.setFont(new Font("Tahoma", Font.PLAIN, 22));
txtIrrigationPipes.setText("IRRIGATION SYSTEM");
contentPane.add(txtIrrigationPipes);
txtIrrigationPipes.setColumns(10);
JLabel lblNewLabel_5 = new JLabel("New label");
lblNewLabel_5.setBounds(635, 365, 253, 172);
lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_5.setIcon(new ImageIcon("E:\\sem 4\\WT MINI PRO\\smart_farm_pics\\images (28).jpeg"));
contentPane.add(lblNewLabel_5);
txtCost_5 = new JTextField();
txtCost_5.setBackground(new Color(255, 228, 181));
txtCost_5.setBounds(635, 554, 186, 32);
txtCost_5.setFont(new Font("Tahoma", Font.PLAIN, 22));
txtCost_5.setHorizontalAlignment(SwingConstants.CENTER);
txtCost_5.setText("COST:1,52,000");
contentPane.add(txtCost_5);
txtCost_5.setColumns(10);
JButton btn = new JButton("BACK");
btn.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		Home_page hp= new Home_page();
		hp.setVisible(true);
	}
});
btn.setBounds(1034, 554, 100, 32);
contentPane.add(btn);
b2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
t1.setText(null);
t2.setText(null);
t3.setText(null);
t4.setText(null);
}
});
b1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String pa,ra,ta;
pa=t1.getText();
ra=t2.getText();
ta=t3.getText();
Float p= Float.parseFloat(pa);
Float r= Float.parseFloat(ra);
Float t= Float.parseFloat(ta);
r=(r/(12*100));
t=t*12;
float d=0,emi;
d=(float) ((Math.pow(1+r,t)-1)/(Math.pow(1+r,t)*r));
emi=p/d;
String femi= Float.toString(emi);
t4.setText(femi);
}
});
}
}