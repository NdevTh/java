import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Frame;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.ActionEvent;

public class ModifUser extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifUser frame = new ModifUser();
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
	public ModifUser() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\PERSO\\Documents\\prisDeNote\\src\\img\\Logo_tp.png"));
		setTitle("ModifUser");
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
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new LineBorder(new Color(15, 150, 83)));
		separator.setBackground(new Color(15, 150, 83));
		separator.setBounds(70, 132, 186, 1);
		contentPane.add(separator);
		
		textField = new JTextField();
		textField.setSelectedTextColor(Color.BLACK);
		textField.setColumns(10);
		textField.setBorder(new EmptyBorder(0, 0, 3, 0));
		textField.setBackground(new Color(170, 236, 210));
		textField.setBounds(70, 259, 186, 27);
		contentPane.add(textField);
		
		Label label_1 = new Label("Identifiant");
		label_1.setForeground(new Color(15, 150, 83));
		label_1.setFont(new Font("Arial", Font.BOLD, 12));
		label_1.setBounds(70, 87, 70, 18);
		contentPane.add(label_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBorder(new LineBorder(new Color(15, 150, 83)));
		separator_1.setBackground(new Color(15, 150, 83));
		separator_1.setBounds(70, 183, 186, 1);
		contentPane.add(separator_1);
		
		textField_1 = new JTextField();
		textField_1.setSelectedTextColor(Color.BLACK);
		textField_1.setColumns(10);
		textField_1.setBorder(new EmptyBorder(0, 0, 3, 0));
		textField_1.setBackground(new Color(170, 236, 210));
		textField_1.setBounds(70, 100, 186, 27);
		contentPane.add(textField_1);
		
		Label label_1_1 = new Label("Mot de passe");
		label_1_1.setForeground(new Color(15, 150, 83));
		label_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		label_1_1.setBounds(70, 139, 186, 18);
		contentPane.add(label_1_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBorder(new LineBorder(new Color(15, 150, 83)));
		separator_2.setBackground(new Color(15, 150, 83));
		separator_2.setBounds(70, 234, 186, 1);
		contentPane.add(separator_2);
		
		textField_2 = new JTextField();
		textField_2.setSelectedTextColor(Color.BLACK);
		textField_2.setColumns(10);
		textField_2.setBorder(new EmptyBorder(0, 0, 3, 0));
		textField_2.setBackground(new Color(170, 236, 210));
		textField_2.setBounds(70, 206, 186, 27);
		contentPane.add(textField_2);
		
		Label label_1_2 = new Label("Nom");
		label_1_2.setForeground(new Color(15, 150, 83));
		label_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		label_1_2.setBounds(70, 190, 186, 18);
		contentPane.add(label_1_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBorder(new LineBorder(new Color(15, 150, 83)));
		separator_3.setBackground(new Color(15, 150, 83));
		separator_3.setBounds(70, 286, 186, 1);
		contentPane.add(separator_3);
		
		Label label_1_3 = new Label("Prénom");
		label_1_3.setForeground(new Color(15, 150, 83));
		label_1_3.setFont(new Font("Arial", Font.BOLD, 12));
		label_1_3.setBounds(70, 242, 186, 18);
		contentPane.add(label_1_3);
		
		passwordField = new JPasswordField();
		passwordField.setIgnoreRepaint(true);
		passwordField.setEchoChar('*');
		passwordField.setBorder(null);
		passwordField.setBackground(new Color(170, 236, 210));
		passwordField.setBounds(70, 156, 186, 27);
		contentPane.add(passwordField);
		
		
		JButton btnSeConnecter = new JButton("VALIDER");
		// Début de mon code 
		btnSeConnecter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connecter c = new Connecter();
				c.setVisible(true);
			}
		});
		// Fin de mon de code
		
		
				
		btnSeConnecter.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSeConnecter.setToolTipText("");
		btnSeConnecter.setForeground(new Color(15, 150, 83));
		btnSeConnecter.setFont(new Font("Arial", Font.BOLD, 22));
		btnSeConnecter.setFocusable(false);
		btnSeConnecter.setFocusCycleRoot(true);
		btnSeConnecter.setBorderPainted(false);
		btnSeConnecter.setBorder(null);
		btnSeConnecter.setBackground(new Color(170, 236, 210));
		btnSeConnecter.setBounds(0, 339, 320, 23);
		contentPane.add(btnSeConnecter);
		
		Label label_1_4 = new Label("Compte existe déjà");
		label_1_4.setVisible(false);
		label_1_4.setForeground(new Color(255, 0, 0));
		label_1_4.setFont(new Font("Arial", Font.ITALIC, 10));
		label_1_4.setBounds(146, 87, 103, 18);
		contentPane.add(label_1_4);
		
		Label label_1_3_1 = new Label("Compte User");
		label_1_3_1.setAlignment(Label.CENTER);
		label_1_3_1.setForeground(new Color(15, 150, 83));
		label_1_3_1.setFont(new Font("Arial", Font.BOLD, 16));
		label_1_3_1.setBounds(70, 30, 186, 18);
		contentPane.add(label_1_3_1);
	}
}
