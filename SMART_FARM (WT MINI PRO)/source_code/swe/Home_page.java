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
import java.awt.EventQueue;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
public class Home_page extends JFrame {

private JPanel contentPane;


public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Home_page frame=new Home_page();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

public Home_page() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setPreferredSize(new Dimension(1300, 650));
pack();
   setLocationRelativeTo(null);
   setTitle("HOME PAGE");
   setVisible(true);

JMenuBar menuBar = new JMenuBar();
setJMenuBar(menuBar);

JMenu m1 = new JMenu("Crops");
menuBar.add(m1);

JMenuItem mm1 = new JMenuItem("Wheat");
mm1.setHorizontalAlignment(SwingConstants.LEFT);
m1.add(mm1);
mm1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
wheat1 w= new wheat1();
w.setVisible(true);
}
});

JMenuItem mm2 = new JMenuItem("Rice");
mm2.setHorizontalAlignment(SwingConstants.LEFT);
m1.add(mm2);
mm2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
rice1 r= new rice1();
r.setVisible(true);
}
});

JMenuItem mm3 = new JMenuItem("Maize");
mm3.setHorizontalAlignment(SwingConstants.LEFT);
m1.add(mm3);
mm3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
maize ma= new maize();
ma.setVisible(true);
}
});

JMenuItem mm4 = new JMenuItem("Pulses");
mm4.setHorizontalAlignment(SwingConstants.LEFT);
m1.add(mm4);
mm4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
PULSES p= new PULSES();
p.setVisible(true);
}
});

JMenuItem mm5 = new JMenuItem("Sugarcane");
mm5.setHorizontalAlignment(SwingConstants.LEFT);
m1.add(mm5);
mm5.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
SUGARCANE s= new SUGARCANE();
s.setVisible(true);
}
});

JMenuItem mm6 = new JMenuItem("Jute");
mm6.setHorizontalAlignment(SwingConstants.LEFT);
m1.add(mm6);
mm6.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
JUTE j= new JUTE();
j.setVisible(true);
}
});

JMenu m2 = new JMenu("Shop");
menuBar.add(m2);
JMenuItem ma= new JMenuItem("shop");
ma.setHorizontalAlignment(SwingConstants.LEFT);
m2.add(ma);
ma.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
shop s=new shop();
s.setVisible(true);
}
});

JMenu m3 = new JMenu("Schemes");
menuBar.add(m3);
JMenuItem mb = new JMenuItem("Programmes and Schemes");
mb.setHorizontalAlignment(SwingConstants.LEFT);
m3.add(mb);
mb.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
SCHEMES1 v=new SCHEMES1();
v.setVisible(true);
}
});

JMenu m4 = new JMenu("Machinaries");
menuBar.add(m4);
JMenuItem mc = new JMenuItem("Machinaries and EMI calculation");
mc.setHorizontalAlignment(SwingConstants.LEFT);
m4.add(mc);
mc.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
mach mac=new mach();
mac.setVisible(true);
}
});

contentPane = new JPanel();
contentPane.setBackground(new Color(154, 205, 50));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);

JLabel lblNewLabel = new JLabel("");
lblNewLabel.setBounds(10, 100, 352, 239);
lblNewLabel.setIcon(new ImageIcon("E:\\sem 4\\WT MINI PRO\\smart_farm_pics\\IMG-20200424-WA0006.jpg"));
lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
contentPane.add(lblNewLabel);

JLabel lblNewLabel_1 = new JLabel("New label");
lblNewLabel_1.setIcon(new ImageIcon("E:\\sem 4\\WT MINI PRO\\smart_farm_pics\\im1.jpg"));
lblNewLabel_1.setBounds(10, 358, 352, 204);
contentPane.add(lblNewLabel_1);

JEditorPane dtrpnSmartFarmingOr= new JEditorPane();
dtrpnSmartFarmingOr.setBounds(389, 100, 844, 478);
dtrpnSmartFarmingOr.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
dtrpnSmartFarmingOr.setText("\nSMART FARMING:\n\nKEY OF FUTURE AGRICULTURE: \n        Smart Farming is a farming management concept using modern technology to increase the quantity and quality of agricultural products.\n\nFarmers can greatly increase the crop yield and effectiveness of pesticides and fertilizers, and use      them more selectively.\n\n Farmers can explore about various topics and get benefited. \n\n     =>CROP MANAGEMENT\n     =>FERTILIZERS AND PESTICIDES\n     =>SHOP PRODUCTS\n     =>FARM MACHINARIES\n     =>PROGRAMMES AND SCHEMES\n     =>LOAN AND EMI CALCULATIONS");
dtrpnSmartFarmingOr.setBackground(new Color(240, 230, 140));
contentPane.add(dtrpnSmartFarmingOr);
JLabel lblNewLabel_2 = new JLabel("SMART FARM");
lblNewLabel_2.setBounds(550, 30, 247, 59);
lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
contentPane.add(lblNewLabel_2);


}
}