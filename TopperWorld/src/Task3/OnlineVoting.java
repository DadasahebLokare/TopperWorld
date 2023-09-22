package Task3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
class OnlineVoting {
	static HashMap<String, String> map = new HashMap<>();
	private static int PATRYA = 0;
	private static int PATRYB = 0;
	private static int PATRYC = 0;
	static String out;
	public static void main(String[] args) {
		JFrame f = new JFrame("Online Voting System");
		JPanel p = new JPanel();
		JLabel head = new JLabel("ONLINE VOTING");
		JLabel l1 = new JLabel("ENTER NAME");
		JLabel l2 = new JLabel("ENTER PHONE");
		JLabel l3 = new JLabel(" CASTE YOUR VOTE HERE");
		JTextField tf1 = new JTextField();
		JTextField tf2 = new JTextField();
		JRadioButton r1 = new JRadioButton("PATRY A");
		JRadioButton r2 = new JRadioButton("PATRY B");
		JRadioButton r3 = new JRadioButton("PATRY C");
		JButton b1 = new JButton("Submit Your vote");
		JButton b2 = new JButton("Check the results");
		ButtonGroup bg = new ButtonGroup();
		Font fs1 = new Font("AJAY", Font.PLAIN, 40);
		Font fs = new Font("SUMIT", Font.PLAIN, 30);
		Font fs2 = new Font("RAJA", Font.PLAIN, 30);
		p.add(l3, BorderLayout.CENTER);
		p.setLayout(null);
		head.setBounds(60, 0, 400, 50);
		l1.setBounds(0, 40, 220, 50);
		l2.setBounds(0, 90, 220, 50);
		l3.setBounds(0, 140, 400, 100);
		tf1.setBounds(230, 50, 300, 30);
		tf2.setBounds(230, 100, 300, 30);
		r1.setBounds(0, 220, 160, 50);
		r2.setBounds(0, 270, 160, 50);
		r3.setBounds(0, 320, 160, 50);
		b1.setBounds(170, 230, 150, 50);
		b2.setBounds(170, 310, 150, 50);
		head.setFont(fs1);l1.setFont(fs);l2.setFont(fs);l3.setFont(fs);l3.setFont(fs);r1.setFont(fs);r2.setFont(fs);
		r3.setFont(fs);tf1.setFont(fs2);tf2.setFont(fs2);bg.add(r1);bg.add(r2);bg.add(r3);p.add(head);p.add(l1);p.add(l2);
		p.add(l3);p.add(tf1);p.add(tf2);p.add(r1);p.add(r2);p.add(r3);p.add(b1);p.add(b2);
		b1.addMouseListener(new MouseListener() {
			public void mouseEntered(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseReleased(MouseEvent e) {
			}
			public void mouseClicked(MouseEvent e) {
				String s1 = tf1.getText();
				String s2 = tf2.getText();
				if (s1.isEmpty()) {
					JOptionPane.showMessageDialog(new JFrame(), "Please Enter name");
				} else if (s2.isEmpty()) {
					JOptionPane.showMessageDialog(new JFrame(), "Please Enter Mobile number");
				} else if (map.containsKey(s1) || map.containsValue(s2)) {
					JOptionPane.showMessageDialog(new JFrame(), "You have already voting!!");
				} else {
					int i = JOptionPane.showConfirmDialog(new JFrame(), "Do you want to confirm your voting?");
					if (i == 0) {
						if (r1.isSelected()) {
							PATRYA += 1;
						} else if (r2.isSelected()) {
							PATRYB += 1;
						} else if (r3.isSelected()) {
							PATRYC += 1;
						}
						map.put(s1, s2);
						tf1.setText("");
						tf2.setText("");
						bg.clearSelection();
					}
				}

			}
		});
		b2.addMouseListener(new MouseListener() {
			public void mouseEntered(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
			}

			public void mouseReleased(MouseEvent e) {
			}

			public void mouseClicked(MouseEvent e) {
				if (PATRYA > PATRYB && PATRYA > PATRYC) {
					out = "PATRY A has a lead";
				} else if (PATRYB > PATRYA && PATRYB > PATRYC) {
					out = "PATRY B has a lead";
				} else if (PATRYC > PATRYA && PATRYC > PATRYB) {
					out = "PATRY C has a lead";
				} else {
					out = "OTHER party wins";
				}
				JOptionPane.showMessageDialog(new JFrame(), "PATRY A " + PATRYA + " \nPATRY B  " + PATRYB + "\nPATRY C " + PATRYC + "\n\n" + out);
			}
		});
		f.add(p);
		f.setSize(550, 450);
		f.setLocation(310, 90);
		f.setVisible(true);
		f.setBackground(Color.BLUE);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}