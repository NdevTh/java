import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class ModifClasseur extends JFrame {

	private Image Icon_Del = new ImageIcon(MainApp.class.getResource("img/Icon_Delete.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
	private Image Icon_Val = new ImageIcon(MainApp.class.getResource("img/Icon_Val.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
	private Image Icon_AB70F9 = new ImageIcon(MainApp.class.getResource("img/couleur/01_AB70F9.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
	private Image Icon_F4F967 = new ImageIcon(MainApp.class.getResource("img/couleur/02_F4F967.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
	private Image Icon_00F995 = new ImageIcon(MainApp.class.getResource("img/couleur/03_00F995.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
	private Image Icon_00D7F9 = new ImageIcon(MainApp.class.getResource("img/couleur/04_00D7F9.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
	private Image Icon_FB2626 = new ImageIcon(MainApp.class.getResource("img/couleur/05_FB2626.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
	private Image Icon_E553D1 = new ImageIcon(MainApp.class.getResource("img/couleur/06_E553D1.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
	private Image Icon_F8E6AC = new ImageIcon(MainApp.class.getResource("img/couleur/07_F8E6AC.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
	private Image Icon_F9BF00 = new ImageIcon(MainApp.class.getResource("img/couleur/08_F9BF00.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
	private Image Icon_AAECD2 = new ImageIcon(MainApp.class.getResource("img/couleur/09_AAECD2.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
	private Image Icon_384AE9 = new ImageIcon(MainApp.class.getResource("img/couleur/10_384AE9.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
	private Image Icon_EC669C = new ImageIcon(MainApp.class.getResource("img/couleur/11_EC669C.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
	private Image Icon_FFFFFF = new ImageIcon(MainApp.class.getResource("img/couleur/12_FFFFFF.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifClasseur frame = new ModifClasseur();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ModifClasseur() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\PERSO\\Documents\\prisDeNote\\src\\img\\Logo_tp.png"));
		setTitle("Modification");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 336, 458);
		//--------------Center la fenêtre
		setLocationRelativeTo(null);
		//--------------Center la fenêtre
		contentPane = new JPanel();
		contentPane.setBackground(new Color(170, 236, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modification Classeur");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setForeground( Color.decode("#0F9653") );// (new Color(15, 150, 83));
		lblNewLabel.setBounds(10, 22, 300, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setForeground( Color.decode("#0F9653") );// (new Color(15, 150, 83));
		lblNewLabel_1.setBounds(10, 47, 210, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Couleur");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1.setForeground( Color.decode("#0F9653") );// (new Color(15, 150, 83));
		lblNewLabel_1_1.setBounds(10, 110, 210, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Description");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_2.setForeground( Color.decode("#0F9653") );// (new Color(15, 150, 83));
		lblNewLabel_1_2.setBounds(10, 173, 210, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 135, 300, 27);
		panel.setBackground(null);
		contentPane.add(panel);
		panel.setLayout(null);
		//------>>> Début Partie Palette suivre l'ordre
		JButton btnC_AB70F9 = new JButton("");
		btnC_AB70F9.setBorder(new LineBorder(new Color(255, 255, 255)));
		btnC_AB70F9.setBounds(2, 2, 24, 23);
		btnC_AB70F9.setBorderPainted(false);
		btnC_AB70F9.setBackground(Color.decode("#AB70F9"));
		btnC_AB70F9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		//btnC_AB70F9.setIcon(new ImageIcon(Icon_AB70F9));
		panel.add(btnC_AB70F9);
		
		JButton btnC_F4F967 = new JButton("");
		btnC_F4F967.setBounds(26, 2, 24, 23);
		btnC_F4F967.setBorderPainted(false);
		btnC_F4F967.setBackground((Color) null);
		btnC_F4F967.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnC_F4F967.setIcon(new ImageIcon(Icon_F4F967));
		panel.add(btnC_F4F967);
				
		JButton btnC_00F995 = new JButton("");
		btnC_00F995.setBounds(50, 2, 24, 23);
		btnC_00F995.setBorderPainted(false);
		btnC_00F995.setBackground((Color) null);
		btnC_00F995.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnC_00F995.setIcon(new ImageIcon(Icon_00F995));
		panel.add(btnC_00F995);
		
		JButton btnC_00D7F9 = new JButton("");
		btnC_00D7F9.setBounds(74, 2, 24, 23);
		btnC_00D7F9.setBorderPainted(false);
		btnC_00D7F9.setBackground((Color) null);
		btnC_00D7F9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnC_00D7F9.setIcon(new ImageIcon(Icon_00D7F9));
		panel.add(btnC_00D7F9);
		
		JButton btnC_FB2626 = new JButton("");
		btnC_FB2626.setBounds(100, 2, 24, 23);
		btnC_FB2626.setBorderPainted(false);
		btnC_FB2626.setBackground((Color) null);
		btnC_FB2626.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnC_FB2626.setIcon(new ImageIcon(Icon_FB2626));
		panel.add(btnC_FB2626);
		
		JButton btnC_E553D1 = new JButton("");
		btnC_E553D1.setBounds(125, 2, 24, 23);
		btnC_E553D1.setBorderPainted(false);
		btnC_E553D1.setBackground((Color) null);
		btnC_E553D1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnC_E553D1.setIcon(new ImageIcon(Icon_E553D1));
		panel.add(btnC_E553D1);
		
		JButton btnC_F8E6AC = new JButton("");
		btnC_F8E6AC.setBounds(149, 2, 24, 23);
		btnC_F8E6AC.setBorderPainted(false);
		btnC_F8E6AC.setBackground((Color) null);
		btnC_F8E6AC.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnC_F8E6AC.setIcon(new ImageIcon(Icon_F8E6AC));
		panel.add(btnC_F8E6AC);
		
		JButton btnC_F9BF00 = new JButton("");
		btnC_F9BF00.setBounds(173, 2, 24, 23);
		btnC_F9BF00.setBorderPainted(false);
		btnC_F9BF00.setBackground(Color.decode("#F9BF00"));
		btnC_F9BF00.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		//btnC_F9BF00.setIcon(new ImageIcon(Icon_F9BF00));
		panel.add(btnC_F9BF00);
		
		JButton btnC_AAECD2 = new JButton("");
		btnC_AAECD2.setBounds(198, 2, 24, 23);
		btnC_AAECD2.setBorderPainted(false);
		btnC_AAECD2.setBackground(Color.decode("#AAECD2"));
		btnC_AAECD2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		//btnC_AAECD2.setIcon(new ImageIcon(Icon_AAECD2));
		panel.add(btnC_AAECD2);
		
		JButton btnC_384AE9 = new JButton("");
		btnC_384AE9.setBounds(223, 2, 24, 23);
		btnC_384AE9.setBorderPainted(false);
		btnC_384AE9.setBackground((Color) null);
		btnC_384AE9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnC_384AE9.setIcon(new ImageIcon(Icon_384AE9));
		panel.add(btnC_384AE9);
		
		JButton btnC_EC669C = new JButton("");
		btnC_EC669C.setBounds(248, 2, 24, 23);
		btnC_EC669C.setBorderPainted(false);
		btnC_EC669C.setBackground((Color) null);
		btnC_EC669C.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnC_EC669C.setIcon(new ImageIcon(Icon_EC669C));
		panel.add(btnC_EC669C);
		
		JButton btnC_FFFFFF = new JButton("");
		btnC_FFFFFF.setBounds(274, 2, 24, 23);
		btnC_FFFFFF.setBorderPainted(false);
		btnC_FFFFFF.setBackground((Color) null);
		btnC_FFFFFF.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnC_FFFFFF.setIcon(new ImageIcon(Icon_FFFFFF));
		panel.add(btnC_FFFFFF);
		
		// -----> Fin Palette
		
		
		textField_1 = new JTextField();
		textField_1.setBorder(null);
		textField_1.setBackground(null);
		textField_1.setBounds(10, 68, 300, 27);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 198, 300, 177);
		contentPane.add(textPane);
		
		JButton btnDel = new JButton("");
		btnDel.setBorder(null);
		btnDel.setBorderPainted(false);
		btnDel.setBackground(null);
		btnDel.setBounds(162, 388, 20, 20);
		contentPane.add(btnDel);
		btnDel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDel.setIcon(new ImageIcon(Icon_Del));
		
		JButton btnValid = new JButton("");
		btnValid.setBorder(null); 
		btnValid.setBorderPainted(false); 
		btnValid.setBackground(null);
		btnValid.setBounds(132, 388, 20, 20);
		contentPane.add(btnValid);
		btnValid.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnValid.setIcon(new ImageIcon(Icon_Val));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 95, 300, 1);
		contentPane.add(separator);
		btnDel.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				MainApp c = new MainApp();				
				c.setVisible(true);
			}
			});
	
		
	}
}
