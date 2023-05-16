import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class MainApp extends JFrame 
{
 
	private JPanel contentPane;
	private Image Icon_UserModif = new ImageIcon(MainApp.class.getResource("img/Icon_UserModif.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
	private Image Icon_Parameter = new ImageIcon(MainApp.class.getResource("img/Icon_Parameter.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
	private Image Icon_Out = new ImageIcon(MainApp.class.getResource("img/Icon_Out.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
	private Image Icon_Searc = new ImageIcon(MainApp.class.getResource("img/Icon_Search.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
	private Image Icon_Add = new ImageIcon(MainApp.class.getResource("img/Icon_Add.png")).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
	
	// ---> début test pour panelRound
    private JTextField txtIntercalaire;
    private JTextField txtAjouter;
    private JTextField txtFeuille;
    private JTextField textField_1;
    private JTextField textField;
    //---> fin test panelRound
    
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApp frame = new MainApp();
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
	public MainApp() 
	{
		
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\PERSO\\Documents\\prisDeNote\\src\\img\\Logo_tp.png"));
		setTitle("PriseDeNote");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 465);
		//--------------Center la fenêtre
			setLocationRelativeTo(null);
		//--------------Center la fenêtre
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#F8E6AC")); //new Color(248, 230, 172));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//test arrondi
		
		

		// Début --->> listeClasseur
		Object[] Classeur = new Object[] {
				"Class1","Class2","Class3"				
		};
		
		// panel pour dessiner
			
		
		
		// panel pour dessiner
		
		
		JPanel panel = new JPanel();
		panel.setBounds(new Rectangle(5, 0, 0, 0));
		panel.setBackground(Color.decode("#E93890"));
		panel.setBounds(40, 104, 159, 311);
		contentPane.add(panel);
		panel.setLayout(null);
			
			PanelRound ArrInt_1 = new PanelRound();
			ArrInt_1.setBounds(0, 28, 138, 30);
			panel.add(ArrInt_1);
			ArrInt_1.setBackground(Color.decode("#F9BF3D"));
			ArrInt_1.setLayout(null);
			ArrInt_1.setRoundTopRight(50);
			
			JButton btnParameterInt = new JButton("");
			btnParameterInt.setBounds(108, 7, 20, 20);
			ArrInt_1.add(btnParameterInt);
			btnParameterInt.setBorderPainted(false);
			btnParameterInt.setBackground(null);
			btnParameterInt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnParameterInt.setIcon(new ImageIcon(Icon_Parameter));
			
			txtIntercalaire = new JTextField();
			txtIntercalaire.setForeground(Color.decode("#ffffff"));
			txtIntercalaire.setText("Intercalaire");
			txtIntercalaire.setBounds(12, 7, 86, 20);
			txtIntercalaire.setBackground(null);
			txtIntercalaire.setBorder(null);
			ArrInt_1.add(txtIntercalaire);
			txtIntercalaire.setColumns(10);
			PanelRound ArrInt = new PanelRound();
			ArrInt.setBounds(0, 0, 138, 30);
			panel.add(ArrInt);
			ArrInt.setBackground(new Color(255, 0, 255));
			ArrInt.setRoundTopRight(50);
			//ArrInt.setLayout(null);
			
					
					JButton btnAddInt = new JButton("");
					btnAddInt.setBorder(null);
					btnAddInt.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
						}
					});
					ArrInt.setLayout(null);
					btnAddInt.setBounds(110, 7, 20, 20);
					ArrInt.add(btnAddInt);
					btnAddInt.setBackground((Color) null);
					btnAddInt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnAddInt.setIcon(new ImageIcon(Icon_Add));
					
					txtAjouter = new JTextField();
					txtAjouter.setText("Ajouter");
					txtAjouter.setForeground(Color.WHITE);
					txtAjouter.setColumns(10);
					txtAjouter.setBorder(null);
					txtAjouter.setBackground((Color) null);
					txtAjouter.setBounds(10, 7, 86, 20);
					ArrInt.add(txtAjouter);
					
					
					// buttonParaFeul
					JButton btnParameterInt_1 = new JButton("");
					btnParameterInt_1.setBorderPainted(false);
					btnParameterInt_1.setBackground((Color) null);
					btnParameterInt_1.setBounds(771, 34, 20, 20);
					panel.add(btnParameterInt_1);					
					btnParameterInt_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnParameterInt_1.setIcon(new ImageIcon(Icon_Parameter));
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(new Rectangle(5, 0, 0, 0));
		panel_2.setBackground(Color.decode("#F8E6AC"));
		panel_2.setBounds(209, 48, 650, 378);
		contentPane.add(panel_2);
		
		JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1.setBounds(425, 24, 182, 30);
		panel_2.add(panel_1_1_1_1_1);
		
		JButton btnSear_1 = new JButton("");
		btnSear_1.setBorderPainted(false);
		btnSear_1.setBorder(null);
		btnSear_1.setBackground((Color) null);
		btnSear_1.setBounds(10, 5, 21, 21);
		panel_1_1_1_1_1.add(btnSear_1);
		btnSear_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSear_1.setIcon(new ImageIcon(Icon_Searc));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(40, 5, 132, 20);
		panel_1_1_1_1_1.add(textField_1);
		
		JButton btnParameterInt_1_1 = new JButton("");
		btnParameterInt_1_1.setBorderPainted(false);
		btnParameterInt_1_1.setBackground((Color) null);
		btnParameterInt_1_1.setBounds(771, 34, 20, 20);
		panel_2.add(btnParameterInt_1_1);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(37, 65, 569, 296);
		panel_2.add(editorPane_1);
		// test dessin
	

		//---->> navBar
		PanelRound navBar = new PanelRound();
		navBar.setBounds(0, 0, 235, 426);
		contentPane.add(navBar);
		navBar.setLayout(null);
		navBar.setBackground(Color.decode("#E93890"));
		navBar.setRoundTopRight(150);
		navBar.setBorder(null);
		// Insérer une image, logo, etc. --->Fin comment
		
		// déroulement Classeur
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(108, 19, 1, 1);
		navBar.add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JButton btnAddF = new JButton("");
		btnAddF.setBounds(10, 5, 13, 13);
		btnAddF.setBorderPainted(false);
		btnAddF.setBackground((Color) null);
		panel_1_2.add(btnAddF);
		btnAddF.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddF.setIcon(new ImageIcon(Icon_Add));
		
		JComboBox listClasseur = new JComboBox(Classeur);
		listClasseur.setAlignmentX(Component.RIGHT_ALIGNMENT);
		listClasseur.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		listClasseur.setForeground(Color.decode("#ffffff"));
		listClasseur.setBorder(null);
		listClasseur.setFont(new Font("Arial", Font.BOLD, 11));
		listClasseur.setBounds(40, 31, 81, 19);
		listClasseur.setBackground(Color.decode("#E93890")); // 
		navBar.add(listClasseur);
		
		JButton btnParameter = new JButton("");
		btnParameter.setBounds(141, 30, 20, 20);
		navBar.add(btnParameter);
		btnParameter.setBorderPainted(false);
		btnParameter.setBackground(null);
		btnParameter.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnParameter.setIcon(new ImageIcon(Icon_Parameter));
		
		JButton btnAddInt_2 = new JButton("");
		btnAddInt_2.setBorder(null);
		btnAddInt_2.setBackground((Color) null);
		btnAddInt_2.setBounds(161, 31, 20, 20);
		navBar.add(btnAddInt_2);
		btnAddInt_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddInt_2.setIcon(new ImageIcon(Icon_Add));
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setBounds(40, 57, 137, 38);
		navBar.add(textField);
		textField.setColumns(10);
		
		JButton btnOut = new JButton("");
		btnOut.setBounds(10, 395, 20, 20);
		navBar.add(btnOut);
		btnOut.setBorder(null);
		btnOut.setBorderPainted(false);
		btnOut.setBackground(null);
		btnOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOut.setIcon(new ImageIcon(Icon_Out));
		
			
			
			// Partie Button
			JButton btnUserModif = new JButton("");
			btnUserModif.setBounds(10, 371, 20, 20);
			navBar.add(btnUserModif);
			btnUserModif.setBorderPainted(false);
			btnUserModif.setBackground(null);
			btnUserModif.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnUserModif.setIcon(new ImageIcon(Icon_UserModif));
			
			JPanel panelinter = new JPanel();
			panelinter.setBackground(Color.decode("#F9BF3D"));
			panelinter.setBounds(138, 0, 721, 55);
			contentPane.add(panelinter);
			panelinter.setLayout(null);
			
			PanelRound ArrFeu_1 = new PanelRound();
			ArrFeu_1.setBounds(196, 34, 72, 21);
			panelinter.add(ArrFeu_1);
			ArrFeu_1.setBackground(new Color(255, 128, 0));
			ArrFeu_1.setLayout(null);
			ArrFeu_1.setRoundTopRight(70);
			ArrFeu_1.setRoundTopLeft(70);
			
			JButton btnAddInt_1 = new JButton("");
			btnAddInt_1.setBorder(null);
			btnAddInt_1.setBackground((Color) null);
			btnAddInt_1.setBounds(26, 0, 20, 20);
			ArrFeu_1.add(btnAddInt_1);
			btnAddInt_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnAddInt_1.setIcon(new ImageIcon(Icon_Add));
			PanelRound ArrFeu = new PanelRound();
			ArrFeu.setBounds(114, 33, 72, 22);
			panelinter.add(ArrFeu);
			ArrFeu.setBorder(null);
			ArrFeu.setBackground(Color.decode("#F8E6AC"));
			ArrFeu.setRoundTopLeft(70);
			ArrFeu.setRoundTopRight(70);
			ArrFeu.setLayout(null);
			
			
//Test
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//		PanelRoundTest ArrFeuTes = new PanelRoundTest(45,45,45,45);
//		ArrFeuTes.setBorder(null);
//		ArrFeuTes.setBackground(Color.decode("#F8E6AC"));
//		ArrFeuTes.setRoundTopLeft(70);
//		ArrFeuTes.setRoundTopRight(70);
//		ArrFeuTes.setBounds(300, 89, 72, 22);
//		contentPane.add(ArrFeuTes);
//		ArrFeuTes.setLayout(null);
//		 Test
	
			
			txtFeuille = new JTextField();
			txtFeuille.setText("Feuille1");
			txtFeuille.setForeground(Color.WHITE);
			txtFeuille.setColumns(10);
			txtFeuille.setBorder(null);
			txtFeuille.setBackground((Color) null);
			txtFeuille.setBounds(15, 4, 52, 12);
			ArrFeu.add(txtFeuille);
			
			
			// test dessin
		
			// Mon code à patir d'ici pour changer de fenêtre:		
			btnOut.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					Connecter c = new Connecter();
					c.setVisible(true);
					
					
					// Début -->>Code pour fermer MainApp
							//MainApp m = new MainApp();
							//m.setVisible(false);
					// Fin -->>Code pour fermer MainApp			
				}

			});		
			btnParameter.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					ModifClasseur c = new ModifClasseur();				
					c.setVisible(true);
				}
				});	
		

		
		
	}
}
