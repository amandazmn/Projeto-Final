package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Quarto;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EdicaoQuarto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNumQuarto;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblDisponibilidadeDeBanheira;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
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
	private final ButtonGroup buttonGroupBanheira = new ButtonGroup();
	private final ButtonGroup buttonGroupFrigobar = new ButtonGroup();

	/**
	 * Create the frame.
	 */
	public EdicaoQuarto(ArrayList<Quarto> listaQuarto, Quarto quartoSelecionado, ListagemQuartos janela) {
		setFont(new Font("Ebrima", Font.PLAIN, 18));
		setTitle("Editar quarto");

		setIconImage(Toolkit.getDefaultToolkit().getImage(EdicaoQuarto.class.getResource("/images/Icone.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1420, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(217, 217, 217));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		// Labels
		JLabel lblNewLabel_1 = new JLabel("Número do quarto *");
		lblNewLabel_1.setFont(new Font("Ebrima", Font.PLAIN, 20));

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(EdicaoQuarto.class.getResource("/images/Logo.png")));

		JLabel lblIconeCadastrarQuarto = new JLabel("");
		lblIconeCadastrarQuarto.setIcon(new ImageIcon(EdicaoQuarto.class.getResource("/images/EditarQuarto.png")));

		lblNewLabel_8 = new JLabel("Andar *");
		lblNewLabel_8.setFont(new Font("Ebrima", Font.PLAIN, 20));

		lblNewLabel_3 = new JLabel("Máximo de hóspedes *");
		lblNewLabel_3.setFont(new Font("Ebrima", Font.PLAIN, 20));

		lblNewLabel_9 = new JLabel("Vista *");
		lblNewLabel_9.setFont(new Font("Ebrima", Font.PLAIN, 20));

		lblNewLabel_7 = new JLabel("Tamanho do Quarto *");
		lblNewLabel_7.setFont(new Font("Ebrima", Font.PLAIN, 20));

		lblNewLabel_6 = new JLabel("Descrição do Quarto");
		lblNewLabel_6.setFont(new Font("Ebrima", Font.PLAIN, 20));

		lblNewLabel_13 = new JLabel("Código do Quarto *");
		lblNewLabel_13.setFont(new Font("Ebrima", Font.PLAIN, 20));

		lblNewLabel_4 = new JLabel("Disponibilidade de Frigobar *");
		lblNewLabel_4.setFont(new Font("Ebrima", Font.PLAIN, 20));

		lblNewLabel_10 = new JLabel("Status do Quarto *");
		lblNewLabel_10.setFont(new Font("Ebrima", Font.PLAIN, 20));

		lblDisponibilidadeDeBanheira = new JLabel("Disponibilidade de Banheira * ");
		lblDisponibilidadeDeBanheira.setFont(new Font("Ebrima", Font.PLAIN, 20));

		JLabel lblNewLabel_13_1 = new JLabel("Tipo Cama *");
		lblNewLabel_13_1.setFont(new Font("Ebrima", Font.PLAIN, 20));

		lblNewLabel_2 = new JLabel("Comentário");
		lblNewLabel_2.setFont(new Font("Ebrima", Font.PLAIN, 20));

		lblNewLabel_5 = new JLabel("Última limpeza *");
		lblNewLabel_5.setFont(new Font("Ebrima", Font.PLAIN, 20));

		JLabel lblNewLabel_7_1 = new JLabel("Preço por noite *");
		lblNewLabel_7_1.setFont(new Font("Ebrima", Font.PLAIN, 20));

		// Text
		txtNumQuarto = new JTextField();
		txtNumQuarto.setText(String.valueOf(quartoSelecionado.getNumero()));
		txtNumQuarto.setColumns(10);

		txtMaxHospedes = new JTextField();
		txtMaxHospedes.setText(String.valueOf(quartoSelecionado.getMaxHospedes()));
		txtMaxHospedes.setColumns(10);

		txtCodigo = new JTextField();
		txtCodigo.setText(String.valueOf(quartoSelecionado.getCodigo()));
		txtCodigo.setColumns(10);

		txtTamQuarto = new JTextField();
		txtTamQuarto.setText(String.valueOf(quartoSelecionado.getTamanho()));
		txtTamQuarto.setColumns(10);

		txtPreco = new JTextField();
		txtPreco.setText(String.valueOf(quartoSelecionado.getPreco()));
		txtPreco.setColumns(10);

		txtLimpeza = new JTextField();
		txtLimpeza.setText(String.valueOf(quartoSelecionado.getDataLimpeza()));
		txtLimpeza.setColumns(10);

		// ComboBox
		JComboBox comboBoxVista = new JComboBox();
		comboBoxVista.setModel(new DefaultComboBoxModel<String>(new String[] {"Selecionar", "Mar", "Mar Parcial", "Piscina", "Jardim", "Cidade"}));
		comboBoxVista.setSelectedItem(quartoSelecionado.getVista());
		
		JComboBox comboBoxStatus = new JComboBox();
		comboBoxStatus.setModel(new DefaultComboBoxModel<String>(new String[] {"Selecionar", "Livre", "Ocupado", "Em manutenção"}));
		comboBoxStatus.setSelectedItem(quartoSelecionado.getStatus());
		
		JComboBox comboBoxTipoCama = new JComboBox();
		comboBoxTipoCama.setModel(new DefaultComboBoxModel<String>(new String[] {"Selecionar", "Cama queen size", "Cama king size", "Cama solteiro", "Bicama"}));
		comboBoxTipoCama.setSelectedItem(quartoSelecionado.getCama());
		
		JComboBox comboBoxAndar = new JComboBox();
		comboBoxAndar.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
		comboBoxAndar.setSelectedItem(quartoSelecionado.getAndar());
		

		// TextArea
		JTextArea txtaComentario = new JTextArea();
		txtaComentario.setRows(5);
		txtaComentario.setLineWrap(true);
		if(quartoSelecionado.getComentarios() != null) {
			txtaComentario.setText(String.valueOf(quartoSelecionado.getComentarios()));
		}

		JTextArea txtaDescQuarto = new JTextArea();
		txtaDescQuarto.setLineWrap(true);
		txtaDescQuarto.setRows(5);
		if(quartoSelecionado.getDescricao() != null) {
			txtaDescQuarto.setText(String.valueOf(quartoSelecionado.getDescricao()));
		}
		
		// RadioButton
		JRadioButton rdbtnSimBanheira = new JRadioButton("Sim");
		buttonGroupBanheira.add(rdbtnSimBanheira);
		rdbtnSimBanheira.setFont(new Font("Ebrima", Font.PLAIN, 20));
		rdbtnSimBanheira.setBackground(new Color(217, 217, 217));
		if(quartoSelecionado.isBanheira() == true) {
			rdbtnSimBanheira.setSelected(true);
		}

		JRadioButton rdbtnNaoBanheira = new JRadioButton("Não");
		buttonGroupBanheira.add(rdbtnNaoBanheira);
		rdbtnNaoBanheira.setFont(new Font("Ebrima", Font.PLAIN, 20));
		rdbtnNaoBanheira.setBackground(new Color(217, 217, 217));
		if(quartoSelecionado.isBanheira() == false) {
			rdbtnNaoBanheira.setSelected(true);
		}

		JRadioButton rdbtnSimFrigobar = new JRadioButton("Sim");
		buttonGroupFrigobar.add(rdbtnSimFrigobar);
		rdbtnSimFrigobar.setFont(new Font("Ebrima", Font.PLAIN, 20));
		rdbtnSimFrigobar.setBackground(new Color(217, 217, 217));
		if(quartoSelecionado.isFrigobar() == true) {
			rdbtnSimFrigobar.setSelected(true);
		}

		JRadioButton rdbtnNaoFrigobar = new JRadioButton("Não");
		buttonGroupFrigobar.add(rdbtnNaoFrigobar);
		rdbtnNaoFrigobar.setFont(new Font("Ebrima", Font.PLAIN, 20));
		rdbtnNaoFrigobar.setBackground(new Color(217, 217, 217));
		if(quartoSelecionado.isFrigobar() == false) {
			rdbtnNaoFrigobar.setSelected(true);
		}

		// Button
		lblSalvar = new JLabel("");
		lblSalvar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				boolean erro = conferirCamposObrigatorios(txtCodigo, txtLimpeza, txtMaxHospedes, txtNumQuarto, txtPreco, txtTamQuarto,
						rdbtnSimBanheira, rdbtnNaoBanheira, rdbtnSimFrigobar, rdbtnNaoFrigobar, comboBoxVista, comboBoxTipoCama, comboBoxStatus);
				if(erro == false) {
					boolean erro2 = false;
					int numQuarto = 0;
					try {
						numQuarto = Integer.parseInt(txtNumQuarto.getText());
					} catch(Exception ex) {
						JOptionPane.showMessageDialog(null, "Número do Quarto precisa ser tipo numérico inteiro");
						erro2 = true;
					}

					int maxHospedes = 0;
					try {
						maxHospedes = Integer.parseInt(txtMaxHospedes.getText());
					} catch(Exception ex) {
						JOptionPane.showMessageDialog(null, "Número máximo de hóspedes precisa ser tipo numérico inteiro");
						erro2 = true;
					}

					float preco = 0;
					try {
						preco = Float.parseFloat(txtPreco.getText());
					} catch(Exception ex) {
						JOptionPane.showMessageDialog(null, "Preço por noite precisa ser tipo numérico");
						erro2 = true;
					}

					float tamanho = 0;
					try {
						tamanho = Float.parseFloat(txtTamQuarto.getText());
					} catch(Exception ex) {
						JOptionPane.showMessageDialog(null, "Tamanho do Quarto precisa ser tipo numérico");
						erro2 = true;
					}

					LocalDate limpeza = null;
					try {
						limpeza = LocalDate.parse(txtLimpeza.getText());
					} catch(Exception ex) {
						JOptionPane.showMessageDialog(null, "Data limpeza precisa ser tipo numérico no formato aaa-mm-dd");
						erro2 = true;
					}

					String codigo = txtCodigo.getText();

					boolean banheira = false;
					if(rdbtnSimBanheira.isSelected()) {
						banheira = true;
					}
					if(rdbtnNaoBanheira.isSelected()) {
						banheira = false;
					}

					boolean frigobar = false;
					if(rdbtnSimFrigobar.isSelected()) {
						frigobar = true;
					}
					if(rdbtnNaoFrigobar.isSelected()) {
						frigobar = false;
					}

					String vista = String.valueOf(comboBoxVista.getSelectedItem());

					String status = String.valueOf(comboBoxStatus.getSelectedItem());

					String cama = String.valueOf(comboBoxTipoCama.getSelectedItem());

					int andar = Integer.parseInt(String.valueOf(comboBoxAndar.getSelectedItem()));

					if(erro2 == false) {
						
						quartoSelecionado.setAndar(andar);
						quartoSelecionado.setBanheira(banheira);
						quartoSelecionado.setCama(cama);
						quartoSelecionado.setCodigo(codigo);
						quartoSelecionado.setDataLimpeza(limpeza);
						quartoSelecionado.setFrigobar(frigobar);
						quartoSelecionado.setMaxHospedes(maxHospedes);
						quartoSelecionado.setNumero(numQuarto);
						quartoSelecionado.setPreco(preco);
						quartoSelecionado.setStatus(status);
						quartoSelecionado.setTamanho(tamanho);
						quartoSelecionado.setVista(vista);
						
						if(txtaComentario != null) {
							String comentario = String.valueOf(txtaComentario.getText());
							quartoSelecionado.setComentarios(comentario);
						}
						if(txtaDescQuarto != null) {
							String descricao = String.valueOf(txtaDescQuarto.getText());
							quartoSelecionado.setDescricao(descricao);
						}
						
						janela.atualizarJTableModel();
						dispose();
					}
				}
			}
		});
		lblSalvar.setIcon(new ImageIcon(EdicaoQuarto.class.getResource("/images/Salvar.png")));

		lblCancelar = new JLabel("");
		lblCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblCancelar.setIcon(new ImageIcon(EdicaoQuarto.class.getResource("/images/Cancelar.png")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(33)
							.addComponent(lblNewLabel)
							.addGap(43)
							.addComponent(lblIconeCadastrarQuarto))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(46)
							.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
							.addGap(172)
							.addComponent(lblNewLabel_13, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
							.addGap(162)
							.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
							.addGap(126)
							.addComponent(lblNewLabel_13_1, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
							.addGap(105))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(46)
							.addComponent(txtNumQuarto, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
							.addGap(268)
							.addComponent(txtCodigo, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
							.addGap(251)
							.addComponent(txtMaxHospedes)
							.addGap(248)
							.addComponent(comboBoxTipoCama, 0, 185, Short.MAX_VALUE)
							.addGap(81))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(46)
							.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
							.addGap(174)
							.addComponent(lblDisponibilidadeDeBanheira, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
							.addGap(87)
							.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(63)
							.addComponent(lblNewLabel_7, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
							.addGap(76))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(46)
							.addComponent(txtaDescQuarto, GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
							.addGap(113)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(rdbtnSimBanheira, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
									.addGap(2)
									.addComponent(rdbtnNaoBanheira, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(14)
									.addComponent(lblNewLabel_8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(80))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(14)
									.addComponent(comboBoxAndar, 0, 105, Short.MAX_VALUE)
									.addGap(41)))
							.addGap(134)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(36)
									.addComponent(rdbtnSimFrigobar, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
									.addGap(2)
									.addComponent(rdbtnNaoFrigobar, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
									.addGap(12))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(153))
								.addComponent(comboBoxVista, 0, 208, Short.MAX_VALUE))
							.addGap(126)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(txtTamQuarto)
									.addGap(96))
								.addComponent(lblNewLabel_7_1, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(txtPreco)
									.addGap(96)))
							.addGap(84))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(46)
							.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
							.addGap(1111))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(46)
							.addComponent(txtaComentario, GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
							.addGap(127)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(5))
								.addComponent(comboBoxStatus, 0, 168, Short.MAX_VALUE))
							.addGap(114)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(txtLimpeza)
									.addGap(64)))
							.addGap(37)
							.addComponent(lblSalvar, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
							.addGap(50)
							.addComponent(lblCancelar, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
							.addGap(27)))
					.addGap(557))
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
					.addGap(65)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addComponent(lblNewLabel_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addComponent(lblNewLabel_13))
						.addComponent(lblNewLabel_3)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addComponent(lblNewLabel_13_1)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(txtNumQuarto, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(txtCodigo, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(txtMaxHospedes, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBoxTipoCama, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(38)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_6)
						.addComponent(lblDisponibilidadeDeBanheira)
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
							.addComponent(lblCancelar, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
					.addGap(144))
		);
		contentPane.setLayout(gl_contentPane);
	}

	public boolean conferirCamposObrigatorios(JTextField txtCodigo, JTextField txtLimpeza, JTextField txtMaxHospedes, JTextField txtNumQuarto, JTextField txtPreco, JTextField txtTamQuarto,
			JRadioButton rdbtnSimBanheira, JRadioButton rdbtnNaoBanheira, JRadioButton rdbtnSimFrigobar, JRadioButton rdbtnNaoFrigobar, JComboBox comboBoxVista, JComboBox comboBoxTipoCama, JComboBox comboBoxStatus) {
		boolean erro = false;
		if(txtCodigo.equals(null)) {
			erro = true;
		}
		if(txtLimpeza.equals(null)) {
			erro = true;
		}
		if(txtMaxHospedes.equals(null)) {
			erro = true;
		}
		if(txtNumQuarto.equals(null)) {
			erro = true;
		}
		if(txtPreco.equals(null)) {
			erro = true;
		}
		if(txtTamQuarto.equals(null)) {
			erro = true;
		}
		if(rdbtnSimBanheira.isSelected() || rdbtnNaoBanheira.isSelected()) {
			erro = false;
		} else {
			erro = true;
		}
		if(rdbtnSimFrigobar.isSelected() || rdbtnNaoFrigobar.isSelected()) {
			erro = false;
		} else {
			erro = true;
		}
		if(comboBoxVista.getSelectedItem().equals("Selecionar")) {
			erro = true;
		}
		if(comboBoxTipoCama.getSelectedItem().equals("Selecionar")) {
			erro = true;
		}
		if(comboBoxStatus.getSelectedItem().equals("Selecionar")) {
			erro = true;
		}

		if(erro == true) {
			JOptionPane.showMessageDialog(null, "Preencha todos os itens obrigatórios!");
		}
		return erro;
	}
}
