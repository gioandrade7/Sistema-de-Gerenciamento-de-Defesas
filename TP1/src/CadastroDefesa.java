import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class CadastroDefesa {

	JFrame frame;
	private JButton btnCadastrar;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDefesa window = new CadastroDefesa();
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
	public CadastroDefesa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(UIManager.getColor("List.dropLineColor"));
		frame.setBounds(100, 100, 742, 379);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Defesas");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(251, 12, 229, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAluno = new JLabel("Aluno:");
		lblAluno.setFont(new Font("Dialog", Font.BOLD, 16));
		lblAluno.setBounds(87, 59, 70, 15);
		frame.getContentPane().add(lblAluno);
		
		JLabel lblTipoDeDefesa = new JLabel("Tipo de Defesa:");
		lblTipoDeDefesa.setFont(new Font("Dialog", Font.BOLD, 16));
		lblTipoDeDefesa.setBounds(87, 86, 158, 15);
		frame.getContentPane().add(lblTipoDeDefesa);
		
		JLabel lblTitulo = new JLabel("Título da Defesa:");
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 16));
		lblTitulo.setBounds(87, 113, 158, 15);
		frame.getContentPane().add(lblTitulo);
		
		JLabel lblDia = new JLabel("Dia:");
		lblDia.setFont(new Font("Dialog", Font.BOLD, 16));
		lblDia.setBounds(87, 140, 70, 15);
		frame.getContentPane().add(lblDia);
		
		JLabel lblLugar = new JLabel("Lugar:");
		lblLugar.setFont(new Font("Dialog", Font.BOLD, 16));
		lblLugar.setBounds(87, 167, 70, 15);
		frame.getContentPane().add(lblLugar);
		
		JLabel lblOrientador = new JLabel("Orientador:");
		lblOrientador.setFont(new Font("Dialog", Font.BOLD, 16));
		lblOrientador.setBounds(87, 194, 111, 15);
		frame.getContentPane().add(lblOrientador);
		
		JLabel lblNotaFinal = new JLabel("Nota final:");
		lblNotaFinal.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNotaFinal.setBounds(87, 221, 99, 15);
		frame.getContentPane().add(lblNotaFinal);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Dialog", Font.BOLD, 16));
		lblResultado.setBounds(87, 248, 99, 15);
		frame.getContentPane().add(lblResultado);
		
		JLabel lblObservacoes = new JLabel("Observações:");
		lblObservacoes.setFont(new Font("Dialog", Font.BOLD, 16));
		lblObservacoes.setBounds(87, 275, 134, 15);
		frame.getContentPane().add(lblObservacoes);
		
		textField = new JTextField();
		textField.setBounds(251, 58, 312, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(251, 85, 312, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(251, 112, 312, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(251, 139, 312, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(251, 166, 312, 19);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(251, 193, 312, 19);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(251, 220, 312, 19);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(251, 247, 312, 19);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(251, 274, 312, 19);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String aluno = textField.getText();
				String tipo_de_defesa = textField_1.getText();
				String titulo = textField_2.getText();
				String dia = textField_3.getText();
				String lugar = textField_4.getText();
				String orientador = textField_5.getText();
				String nota_final = (textField_6.getText());
				String resultado = textField_7.getText();
				String observacoes = textField_8.getText();
				
				
					
				Defesa d = new Defesa(aluno, tipo_de_defesa, titulo, dia, lugar, orientador,(nota_final), resultado,
						observacoes);
				
				DefesaDAO def = new DefesaDAO();
				def.adicionarDefesa(d);
				
				JOptionPane.showMessageDialog(null, 
					      "Cadastro realizado !", 
					      "Cadastro", JOptionPane.INFORMATION_MESSAGE,
					      new ImageIcon("/tmp/icomp2.png")
					      );
				
				
				
			}
				
				
			
		});
		btnCadastrar.setFont(new Font("Dialog", Font.BOLD, 16));
		btnCadastrar.setBounds(307, 305, 128, 25);
		frame.getContentPane().add(btnCadastrar);
		
	}
	

}
