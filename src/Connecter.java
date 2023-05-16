
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Connecter extends  JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private Image img_User = new ImageIcon(Connecter.class.getResource("img/Icon_User.png")).getImage().getScaledInstance(90, 90,Image.SCALE_SMOOTH);
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Connecter frame = new Connecter();
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
	public Connecter() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\PERSO\\Documents\\prisDeNote\\src\\img\\Logo_tp.png"));
		setFont(new Font("Arial", Font.PLAIN, 10));
		setTitle("Login");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 333, 460);
		//--------------Center la fenêtre
		setLocationRelativeTo(null);
		//--------------Center la fenêtre
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("Arial", Font.BOLD, 16));
		panel.setBounds(0, 0, 320, 420);
		panel.setBackground(new Color(170, 236, 210));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ou");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(15, 150, 83));
		lblNewLabel.setBounds(0, 338, 320, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(170, 236, 210));
		textField.setSelectedTextColor(new Color(0, 0, 0));
		textField.setBorder(new EmptyBorder(0, 0, 3, 0));
		textField.setBounds(68, 152, 186, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("identifiant ou mdp incorrecte");
		lblNewLabel_1.setVisible(false);
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(56, 268, 186, 14);
		panel.add(lblNewLabel_1);
		//début  mon code 
		JButton btnSeConnecter = new JButton("Se connecter");
		btnSeConnecter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainApp c = new MainApp();
				c.setVisible(true);
			}
		});
		btnSeConnecter.setForeground(new Color(15, 150, 83));
		btnSeConnecter.setFocusable(false);
		btnSeConnecter.setFocusCycleRoot(true);
		btnSeConnecter.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSeConnecter.setBackground(new Color(170, 236, 210));
		btnSeConnecter.setFont(new Font("Arial", Font.BOLD, 22));
		//fin  mon code 
			
		btnSeConnecter.setToolTipText("");
		btnSeConnecter.setBorderPainted(false);
		btnSeConnecter.setBorder(null);
		btnSeConnecter.setBounds(0, 304, 320, 23);
		panel.add(btnSeConnecter);
		
		// Début---> Insérer une image, logo, etc.
		JLabel lbllUserLogo = new JLabel("");
		lbllUserLogo.setAutoscrolls(true);
		lbllUserLogo.setBackground(new Color(15, 150, 83));
		lbllUserLogo.setIconTextGap(2);
		lbllUserLogo.setMinimumSize(new Dimension(0, 0));
		lbllUserLogo.setMaximumSize(new Dimension(0, 0));
		lbllUserLogo.setForeground(new Color(15, 150, 83));
		lbllUserLogo.setBounds(120, 11, 90, 97);
		panel.add(lbllUserLogo);
		lbllUserLogo.setIcon(new ImageIcon(img_User));
		// Insérer une image, logo, etc. --->Fin comment
		
		// début de mon code 
		JButton btnCrerUnCompte = new JButton("Créer un compte");
		btnCrerUnCompte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inscription c = new Inscription();
				c.setVisible(true);
			}
		});
		
		btnCrerUnCompte.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCrerUnCompte.setToolTipText("");
		btnCrerUnCompte.setForeground(new Color(15, 150, 83));
		btnCrerUnCompte.setFont(new Font("Arial", Font.BOLD, 22));
		btnCrerUnCompte.setFocusable(false);
		btnCrerUnCompte.setFocusCycleRoot(true);
		
		btnCrerUnCompte.setBorderPainted(false);
		btnCrerUnCompte.setBorder(null);
		btnCrerUnCompte.setBackground(new Color(170, 236, 210));
		btnCrerUnCompte.setBounds(0, 363, 320, 23);
		panel.add(btnCrerUnCompte);
		// fin de mon code 
	
		
		textField_1 = new JTextField();
		textField_1.setSelectedTextColor(Color.BLACK);
		textField_1.setColumns(10);
		textField_1.setBorder(new EmptyBorder(0, 0, 3, 0));
		textField_1.setBackground(new Color(170, 236, 210));
		textField_1.setBounds(68, 152, 186, 27);
		panel.add(textField_1);
		
		Label label_1_2 = new Label("Identifiant");
		label_1_2.setForeground(new Color(15, 150, 83));
		label_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		label_1_2.setBounds(68, 128, 186, 18);
		panel.add(label_1_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBorder(new LineBorder(new Color(15, 150, 83)));
		separator_3.setBackground(new Color(15, 150, 83));
		separator_3.setBounds(68, 235, 186, 1);
		panel.add(separator_3);
		
		Label label_1_3 = new Label("Mot de passe");
		label_1_3.setForeground(new Color(15, 150, 83));
		label_1_3.setFont(new Font("Arial", Font.BOLD, 12));
		label_1_3.setBounds(68, 188, 186, 18);
		panel.add(label_1_3);
		
		passwordField = new JPasswordField();
		passwordField.setIgnoreRepaint(true);
		passwordField.setEchoChar('*');
		passwordField.setBorder(null);
		passwordField.setBackground(new Color(170, 236, 210));
		passwordField.setBounds(68, 204, 186, 27);
		panel.add(passwordField);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setBorder(new LineBorder(new Color(15, 150, 83)));
		separator_3_1.setBackground(new Color(15, 150, 83));
		separator_3_1.setBounds(68, 180, 186, 1);
		panel.add(separator_3_1);
	}
}
