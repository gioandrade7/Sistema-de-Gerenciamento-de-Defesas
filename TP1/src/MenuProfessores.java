import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Menu de gerenciamento de professores.
 */
public class MenuProfessores {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuProfessores window = new MenuProfessores();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuProfessores() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(UIManager.getColor("List.dropLineColor"));
		frame.setBounds(100, 100, 666, 412);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gerenciamento de Professores");
		lblNewLabel.setBounds(209, 12, 248, 17);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastroBanca cb = new CadastroBanca();
				cb.frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton.setBounds(274, 88, 117, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Remover");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String professor = 
					      JOptionPane.showInputDialog("Digite o nome do professor:");
				
				BancaDAO bd = new BancaDAO();
				bd.deletarProfessor(professor);
				
				int confirm = 
					      JOptionPane.showConfirmDialog(null, "Tem certeza ?");
				
				JOptionPane.showMessageDialog(null, 
					      "Professor removido.", 
					      "Remover", JOptionPane.INFORMATION_MESSAGE,
					      new ImageIcon("/tmp/icomp2.png")
					      );
			}
		});
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton_1.setBounds(274, 125, 117, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Alterar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AlterarProfessor ap = new AlterarProfessor();
				ap.frame.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton_2.setBounds(274, 162, 117, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Consultar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConsultaBanca cb = new ConsultaBanca();
				cb.frame.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton_3.setBounds(274, 199, 117, 25);
		frame.getContentPane().add(btnNewButton_3);
	}
}
