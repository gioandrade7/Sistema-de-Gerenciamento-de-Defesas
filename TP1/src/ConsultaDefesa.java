import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import java.awt.CardLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class ConsultaDefesa {

	 JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaDefesa window = new ConsultaDefesa();
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
	public ConsultaDefesa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBackground(UIManager.getColor("List.dropLineColor"));
		frame.setBounds(100, 100, 641, 432);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtrResultado = new JTextArea();
		txtrResultado.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		txtrResultado.setEditable(false);
		txtrResultado.setBounds(49, 87, 533, 238);
		frame.getContentPane().add(txtrResultado);
		
		textField = new JTextField();
		textField.setBounds(207, 43, 191, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Pesquisar");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefesaDAO def  = new DefesaDAO();
				String r = def.consultarDefesas(textField.getText());
				txtrResultado.setText(r);
			}
		});
		btnNewButton.setBounds(243, 337, 155, 44);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Digite o nome do aluno cuja defesa deseja pesquisar:");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel.setBounds(56, 12, 528, 15);
		frame.getContentPane().add(lblNewLabel);
		
		
	}
}
