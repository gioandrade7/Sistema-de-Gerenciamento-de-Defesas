import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlterarProfessor {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterarProfessor window = new AlterarProfessor();
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
	public AlterarProfessor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(UIManager.getColor("List.dropLineColor"));
		frame.setBounds(100, 100, 655, 416);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox.getSelectedItem().equals("<Selecione o dado que deseja alterar>")) {
					JOptionPane.showMessageDialog(null, 
						      "Opção inválida.", 
						      "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE,
						      new ImageIcon("/tmp/icomp2.png")
						      );	
				}
				else {
					String aluno = 
						      JOptionPane.showInputDialog("Nome do Professor da qual banca deseja alterar:");
					String dado = 
						      JOptionPane.showInputDialog("Dado novo:");
					
					String coluna = comboBox.getSelectedItem().toString();
					if(coluna == "Aluno") {
						coluna = "aluno_banca";
					}
					else if( coluna == "Tipo de Defesa") {
						coluna = "banca_tipo_defesa";
					}
					else if(coluna == "Professor") {
						coluna = "professor";
					}
					
					BancaDAO bd = new BancaDAO();
					if(bd.alterarProfessor(coluna, dado, aluno)) {
						JOptionPane.showMessageDialog(null, 
							      "Dado alterado com sucesso !", 
							      "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE,
							      new ImageIcon("/tmp/icomp2.png")
							      );
					}
					else {
						JOptionPane.showMessageDialog(null, 
							      "Um erro ocorreu !", 
							      "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE,
							      new ImageIcon("/tmp/icomp2.png")
							      );
					}
					
				}
			}
		});
		comboBox.setFont(new Font("Dialog", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Selecione o dado que deseja alterar>", "Aluno", "Tipo de Defesa", "Professor"}));
		comboBox.setBounds(154, 12, 337, 24);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton.setBounds(237, 232, 170, 56);
		frame.getContentPane().add(btnNewButton);
	}
}
