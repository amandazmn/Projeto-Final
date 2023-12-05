package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;

public class CadastroQuarto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNumQuarto;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblDisponibilidadeDeFrigobar;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JTextField txtMaxHospedes;
	private JLabel lblNewLabel_2;
	private JTextField txtCodigo;
	private JTextField txtTamQuarto;
	private JTextField txtPreco;
	private JLabel lblNewLabel_5;
	private JTextField txtLimpeza;
	private JLabel lblSalvar;
	private JLabel lblCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroQuarto frame = new CadastroQuarto();
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
	public CadastroQuarto() {
			        
		setIconImage(Toolkit.getDefaultToolkit().getImage(CadastroQuarto.class.getResource("/images/Group 23.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(217, 217, 217));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		lblNewLabel_8 = new JLabel("Andar ");
		lblNewLabel_8.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1 = new JLabel("Número do quarto");
		lblNewLabel_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		txtNumQuarto = new JTextField();
		txtNumQuarto.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Máximo de hóspedes");
		lblNewLabel_3.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		txtMaxHospedes = new JTextField();
		txtMaxHospedes.setColumns(10);
		
		lblNewLabel_9 = new JLabel("Vista ");
		lblNewLabel_9.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		lblNewLabel_7 = new JLabel("Tamanho do Quarto ");
		lblNewLabel_7.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		lblNewLabel_11 = new JLabel("Data da Última Limpeza");
		lblNewLabel_11.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		lblNewLabel_6 = new JLabel("Descrição do Quarto");
		lblNewLabel_6.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		lblNewLabel_13 = new JLabel("Código do Quarto");
		lblNewLabel_13.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		lblNewLabel_4 = new JLabel("Disponibilidade de Frigobar");
		lblNewLabel_4.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		lblNewLabel_10 = new JLabel("Status do Quarto");
		lblNewLabel_10.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		lblDisponibilidadeDeFrigobar = new JLabel("Disponibilidade de Banheira ");
		lblDisponibilidadeDeFrigobar.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		lblNewLabel_12 = new JLabel("Comentários ");
		lblNewLabel_12.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(CadastroQuarto.class.getResource("/images/Logo.png")));
		
		JLabel lblIconeCadastrarQuarto = new JLabel("");
		lblIconeCadastrarQuarto.setIcon(new ImageIcon(CadastroQuarto.class.getResource("/images/CadastrarQuarto.png")));
		
		JComboBox comboBoxVista = new JComboBox();
		
		JTextArea txtaDescQuarto = new JTextArea();
		
		JComboBox comboBoxStatus = new JComboBox();
		
		JLabel lblNewLabel_13_1 = new JLabel("Tipo Cama");
		lblNewLabel_13_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		JComboBox comboBoxTipoCama = new JComboBox();
		
		lblNewLabel_2 = new JLabel("Comentário");
		lblNewLabel_2.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		JTextArea txtaComentario = new JTextArea();
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		
		JRadioButton rdbtnSimBanheira = new JRadioButton("Sim");
		rdbtnSimBanheira.setFont(new Font("Ebrima", Font.PLAIN, 20));
		rdbtnSimBanheira.setBackground(new Color(217, 217, 217));
		
		JRadioButton rdbtnNaoBanheira = new JRadioButton("Não");
		rdbtnNaoBanheira.setFont(new Font("Ebrima", Font.PLAIN, 20));
		rdbtnNaoBanheira.setBackground(new Color(217, 217, 217));
		
		JRadioButton rdbtnSimFrigobar = new JRadioButton("Sim");
		rdbtnSimFrigobar.setFont(new Font("Ebrima", Font.PLAIN, 20));
		rdbtnSimFrigobar.setBackground(new Color(217, 217, 217));
		
		JRadioButton rdbtnNaoFrigobar = new JRadioButton("Não");
		rdbtnNaoFrigobar.setFont(new Font("Ebrima", Font.PLAIN, 20));
		rdbtnNaoFrigobar.setBackground(new Color(217, 217, 217));
		
		JComboBox comboBoxAndar = new JComboBox();
		
		txtTamQuarto = new JTextField();
		txtTamQuarto.setColumns(10);
		
		JLabel lblNewLabel_7_1 = new JLabel("Preço por noite");
		lblNewLabel_7_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Última limpeza");
		lblNewLabel_5.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		txtLimpeza = new JTextField();
		txtLimpeza.setColumns(10);
		
		lblSalvar = new JLabel("");
		lblSalvar.setIcon(new ImageIcon(CadastroQuarto.class.getResource("/images/Group 24.png")));
		
		lblCancelar = new JLabel("");
		lblCancelar.setIcon(new ImageIcon(CadastroQuarto.class.getResource("/images/Group 25.png")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(33)
					.addComponent(lblNewLabel)
					.addGap(43)
					.addComponent(lblIconeCadastrarQuarto))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(46)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
					.addGap(172)
					.addComponent(lblNewLabel_13)
					.addGap(175)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
					.addGap(113)
					.addComponent(lblNewLabel_13_1, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(46)
					.addComponent(txtNumQuarto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(268)
					.addComponent(txtCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(251)
					.addComponent(txtMaxHospedes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(235)
					.addComponent(comboBoxTipoCama, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(46)
					.addComponent(lblNewLabel_6)
					.addGap(174)
					.addComponent(lblDisponibilidadeDeFrigobar)
					.addGap(87)
					.addComponent(lblNewLabel_4)
					.addGap(76)
					.addComponent(lblNewLabel_7))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(46)
					.addComponent(txtaDescQuarto, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE)
					.addGap(113)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnSimBanheira, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(rdbtnNaoBanheira, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(14)
							.addComponent(lblNewLabel_8))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(14)
							.addComponent(comboBoxAndar, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)))
					.addGap(134)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(36)
							.addComponent(rdbtnSimFrigobar, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(rdbtnNaoFrigobar, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_9)
						.addComponent(comboBoxVista, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))
					.addGap(113)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtTamQuarto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_7_1, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(46)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(46)
					.addComponent(txtaComentario, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE)
					.addGap(127)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_10)
						.addComponent(comboBoxStatus, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
					.addGap(114)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtLimpeza, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addComponent(lblSalvar)
					.addGap(50)
					.addComponent(lblCancelar, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					.addGap(237)
					.addComponent(lblNewLabel_12))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(1278)
					.addComponent(lblNewLabel_11))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(33)
							.addComponent(lblIconeCadastrarQuarto)))
					.addGap(68)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_13)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_13_1))
					.addGap(3)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtNumQuarto, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCodigo, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtMaxHospedes, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(comboBoxTipoCama, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(38)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_6)
						.addComponent(lblDisponibilidadeDeFrigobar)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_7))
					.addGap(1)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(txtaDescQuarto, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnSimBanheira, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnNaoBanheira, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addGap(55)
							.addComponent(lblNewLabel_8)
							.addGap(6)
							.addComponent(comboBoxAndar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnSimFrigobar, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnNaoFrigobar, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addGap(51)
							.addComponent(lblNewLabel_9)
							.addGap(6)
							.addComponent(comboBoxVista, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtTamQuarto, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGap(55)
							.addComponent(lblNewLabel_7_1)
							.addGap(3)
							.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
					.addGap(7)
					.addComponent(lblNewLabel_2)
					.addGap(8)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(txtaComentario, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(8)
							.addComponent(lblNewLabel_10)
							.addGap(3)
							.addComponent(comboBoxStatus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_5)
							.addGap(4)
							.addComponent(txtLimpeza, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(77)
							.addComponent(lblSalvar))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(77)
							.addComponent(lblCancelar, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(77)
							.addComponent(lblNewLabel_12)))
					.addGap(116)
					.addComponent(lblNewLabel_11))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
