import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlterarDefesa {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterarDefesa window = new AlterarDefesa();
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
	public AlterarDefesa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(UIManager.getColor("List.dropLineColor"));
		frame.setBounds(100, 100, 573, 386);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		String[] s = {"Aluno", "Tipo de Defesa", "Título da Defesa", "Dia", "Lugar", "Orientador", "Nota Final",
				"Resultado", "Observações"};
		JComboBox comboBox = new JComboBox(s);
		comboBox.setFont(new Font("Dialog", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Selecione o dado que deseja alterar>", "Aluno", "Tipo de Defesa", "Título da Defesa", "Dia", "Lugar", "Orientador", "Nota Final", "Resultado", "Observações"}));
		comboBox.setBounds(79, 12, 404, 24);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
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
						      JOptionPane.showInputDialog("Nome do Aluno da qual defesa deseja alterar:");
					String dado = 
						      JOptionPane.showInputDialog("Dado novo:");
					
					
					String coluna = comboBox.getSelectedItem().toString();
					if(coluna == "Aluno") {
						coluna = "aluno";
					}
					else if(coluna == "Tipo De Defesa") {
						coluna = "tipo_de_defesa";
					}
					else if(coluna == "Título da Defesa") {
						coluna = "titulo_da_defesa";
					}
					else if(coluna == "Dia") {coluna = "dia";}
					else if(coluna == "Lugar") {coluna = "lugar";}
					else if(coluna == "Orientador") {coluna = "orientador";}
					else if(coluna == "Nota Final") {coluna = "nota_final";}
					else if(coluna == "Resultado") {coluna = "resultado";}
					else if(coluna == "Observações") {coluna = "observacoes";}
					
					DefesaDAO def = new DefesaDAO();
					def.alterarDefesa(coluna, dado, aluno);


				}
				
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton.setBounds(199, 237, 175, 49);
		frame.getContentPane().add(btnNewButton);
	}
}
