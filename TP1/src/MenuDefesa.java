import java.awt.*;
import javax.swing.*;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Menu de gerenciamento de defesas.
 */
public class MenuDefesa {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuDefesa window = new MenuDefesa();
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
	public MenuDefesa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(UIManager.getColor("List.dropLineColor"));
		frame.setBounds(100, 100, 666, 407);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gerenciamento de Defesas");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setBounds(212, 12, 242, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroDefesa c = new CadastroDefesa();
				c.frame.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(274, 88, 117, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Remover");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String aluno = 
					      JOptionPane.showInputDialog("Digite o nome do aluno:");
				
				DefesaDAO d = new DefesaDAO();
				d.deletarDefesa(aluno);
				
				int confirm = 
					      JOptionPane.showConfirmDialog(null, "Tem certeza ?");
				
				JOptionPane.showMessageDialog(null, 
					      "Defesa apagada.", 
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
				AlterarDefesa ad = new AlterarDefesa();
				ad.frame.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton_2.setBounds(274, 162, 117, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Consultar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConsultaDefesa cd = new ConsultaDefesa();
				cd.frame.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton_3.setBounds(274, 199, 117, 25);
		frame.getContentPane().add(btnNewButton_3);
	}
}
