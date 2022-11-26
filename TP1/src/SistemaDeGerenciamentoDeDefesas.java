import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
/**
 * Interface do menu principal.
 */
public class SistemaDeGerenciamentoDeDefesas {

	private JFrame frmSistemaDeGerenciamento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SistemaDeGerenciamentoDeDefesas window = new SistemaDeGerenciamentoDeDefesas();
					window.frmSistemaDeGerenciamento.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SistemaDeGerenciamentoDeDefesas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSistemaDeGerenciamento = new JFrame();
		frmSistemaDeGerenciamento.getContentPane().setFont(new Font("Chandas", Font.PLAIN, 12));
		frmSistemaDeGerenciamento.setTitle("SGD");
		frmSistemaDeGerenciamento.setResizable(false);
		frmSistemaDeGerenciamento.setBackground(UIManager.getColor("List.dropLineColor"));
		frmSistemaDeGerenciamento.setFont(new Font("Dialog", Font.BOLD, 20));
		frmSistemaDeGerenciamento.setBounds(100, 100, 641, 420);
		frmSistemaDeGerenciamento.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmSistemaDeGerenciamento.getContentPane().setLayout(null);
		
		JLabel lblSistemaDeGerenciamento = new JLabel("SGD v1.0");
		lblSistemaDeGerenciamento.setFont(new Font("Dialog", Font.BOLD, 16));
		lblSistemaDeGerenciamento.setBounds(268, 12, 105, 25);
		frmSistemaDeGerenciamento.getContentPane().add(lblSistemaDeGerenciamento);
		
		JLabel lblSistemaDeGerenciamento_1 = new JLabel("Sistema de Gerenciamento de Defesas");
		lblSistemaDeGerenciamento_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSistemaDeGerenciamento_1.setForeground(UIManager.getColor("List.foreground"));
		lblSistemaDeGerenciamento_1.setBounds(164, 38, 313, 15);
		frmSistemaDeGerenciamento.getContentPane().add(lblSistemaDeGerenciamento_1);
		
		JButton btnDefesas = new JButton("Gerenciar Professores");
		btnDefesas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				MenuProfessores mp = new MenuProfessores();
				mp.frame.setVisible(true);
			}
		});
		btnDefesas.setForeground(UIManager.getColor("Label.foreground"));
		btnDefesas.setBackground(UIManager.getColor("Menu.acceleratorForeground"));
		btnDefesas.setFont(new Font("Dialog", Font.BOLD, 14));
		btnDefesas.setBounds(204, 197, 222, 25);
		frmSistemaDeGerenciamento.getContentPane().add(btnDefesas);
		
		JButton btnGerenciarDefesas = new JButton("Gerenciar Defesas");
		btnGerenciarDefesas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MenuDefesa md = new MenuDefesa();
				md.frame.setVisible(true);
			}
		});
		btnGerenciarDefesas.setForeground(UIManager.getColor("Button.foreground"));
		btnGerenciarDefesas.setFont(new Font("Dialog", Font.BOLD, 14));
		btnGerenciarDefesas.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		btnGerenciarDefesas.setBounds(209, 132, 222, 25);
		frmSistemaDeGerenciamento.getContentPane().add(btnGerenciarDefesas);
	}
}
