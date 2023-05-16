import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.Toolkit;

public class errorConnexion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					errorConnexion frame = new errorConnexion();
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
	public errorConnexion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\PERSO\\Documents\\prisDeNote\\src\\img\\Logo_tp.png"));
		setTitle("ErrorConneion");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 335, 455);
		//--------------Center la fenêtre
				setLocationRelativeTo(null);
		//--------------Center la fenêtre
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground( Color.decode("#AAECD2") ); //(new Color(170, 236, 210));
		panel.setBounds(0, 0, 320, 420);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnOk = new JButton("OK");
		btnOk.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOk.setBounds(10, 213, 300, 27);
		btnOk.setToolTipText("");
		btnOk.setForeground( Color.decode("#0F9653") );// (new Color(15, 150, 83));
		btnOk.setFont(new Font("Arial", Font.BOLD, 22));
		btnOk.setFocusable(false);
		btnOk.setFocusCycleRoot(true);
		btnOk.setBorderPainted(false);
		btnOk.setBorder(null);
		btnOk.setBackground(new Color(170, 236, 210));
		panel.add(btnOk);
		
		JLabel lblNewLabel = new JLabel("Error");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground( Color.decode("#FF0000") );//(new Color(255, 0, 0));
		lblNewLabel.setBounds(10, 174, 300, 14);
		panel.add(lblNewLabel);
	}

}
