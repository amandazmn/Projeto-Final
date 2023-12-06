package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Quarto;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;

public class DetalhesQuarto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public DetalhesQuarto(Quarto quartoSelecionado) {
		setResizable(false);
		setFont(new Font("Ebrima", Font.PLAIN, 18));
		setTitle("Detalhes do quarto");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DetalhesQuarto.class.getResource("/images/Icone.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 583, 588);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(217, 217, 217));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(DetalhesQuarto.class.getResource("/images/DetalhesQuarto.png")));
		
		JLabel lblNewLabel_1 = new JLabel("Número:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_1 = new JLabel("Código:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Max. Hóspedes:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Cama:");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Banheira:");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Frigobar:");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Tamanho:");
		lblNewLabel_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Andar:");
		lblNewLabel_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel("Vista:");
		lblNewLabel_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1_1_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1 = new JLabel("Descrição:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Preço:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Status:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Última limpeza:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Comentários:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		
		JLabel lblNum = new JLabel(" ");
		lblNum.setText(String.valueOf(quartoSelecionado.getNumero()));
		lblNum.setFont(new Font("Ebrima", Font.PLAIN, 15));
		
		JLabel lblMax = new JLabel(" ");
		lblMax.setText(String.valueOf(quartoSelecionado.getMaxHospedes()));
		lblMax.setFont(new Font("Ebrima", Font.PLAIN, 15));
		
		JLabel lblBanheira = new JLabel(" ");
		if(quartoSelecionado.isBanheira() == true) {
			lblBanheira.setText("Sim");
		} else {
			lblBanheira.setText("Não");
		}
		lblBanheira.setFont(new Font("Ebrima", Font.PLAIN, 15));
		
		JLabel lblAndar = new JLabel(" ");
		lblAndar.setText(String.valueOf(quartoSelecionado.getAndar()));
		lblAndar.setFont(new Font("Ebrima", Font.PLAIN, 15));
		
		JLabel lblTam = new JLabel(" ");
		lblTam.setText(String.valueOf(quartoSelecionado.getTamanho()));
		lblTam.setFont(new Font("Ebrima", Font.PLAIN, 15));
		
		JLabel lblStatus = new JLabel(" ");
		lblStatus.setText(String.valueOf(quartoSelecionado.getStatus()));
		lblStatus.setFont(new Font("Ebrima", Font.PLAIN, 15));
		
		JLabel lblCod = new JLabel(" ");
		lblCod.setText(String.valueOf(quartoSelecionado.getCodigo()));
		lblCod.setFont(new Font("Ebrima", Font.PLAIN, 15));
		
		JLabel lblCama = new JLabel(" ");
		lblCama.setText(String.valueOf(quartoSelecionado.getCama()));
		lblCama.setFont(new Font("Ebrima", Font.PLAIN, 15));
		
		JLabel lblFrigobar = new JLabel(" ");
		if(quartoSelecionado.isFrigobar() == true) {
			lblFrigobar.setText("Sim");
		} else {
			lblFrigobar.setText("Não");
		}
		lblFrigobar.setFont(new Font("Ebrima", Font.PLAIN, 15));
		
		JLabel lblVista = new JLabel(" ");
		lblVista.setText(String.valueOf(quartoSelecionado.getVista()));
		lblVista.setFont(new Font("Ebrima", Font.PLAIN, 15));
		
		JLabel lblPreco = new JLabel(" ");
		lblPreco.setText("R$" + String.valueOf(quartoSelecionado.getPreco()));
		lblPreco.setFont(new Font("Ebrima", Font.PLAIN, 15));
		
		JLabel lblLimpeza = new JLabel(" ");
		lblLimpeza.setText(String.valueOf(quartoSelecionado.getDataLimpeza()));
		lblLimpeza.setFont(new Font("Ebrima", Font.PLAIN, 15));
		
		JTextArea textAreaDesc = new JTextArea();
		textAreaDesc.setEditable(false);
		textAreaDesc.setRows(5);
		textAreaDesc.setLineWrap(true);
		textAreaDesc.setText(String.valueOf(quartoSelecionado.getDescricao()));
		textAreaDesc.setBackground(new Color(217, 217, 217));
		
		JTextArea textAreaComentarios = new JTextArea();
		textAreaComentarios.setEditable(false);
		textAreaComentarios.setRows(5);
		textAreaComentarios.setLineWrap(true);
		textAreaComentarios.setText(quartoSelecionado.getComentarios());
		textAreaComentarios.setBackground(new Color(217, 217, 217));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 597, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(69)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(lblNum, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(125)
					.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(lblCod, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addGap(91))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(14)
					.addComponent(lblNewLabel_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(lblBanheira, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(102)
					.addComponent(lblNewLabel_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(lblFrigobar, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(14)
					.addComponent(lblNewLabel_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(lblTam, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(142)
					.addComponent(lblNewLabel_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(lblPreco, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(14)
					.addComponent(lblNewLabel_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
					.addGap(128)
					.addComponent(lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(14)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblStatus, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addComponent(textAreaDesc, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(31)
							.addComponent(lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
							.addGap(9)
							.addComponent(lblLimpeza, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(50)
							.addComponent(textAreaComentarios, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(14)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1_1_1)
							.addGap(10)
							.addComponent(lblMax, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(122)
							.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(lblCama, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblAndar, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(149)
							.addComponent(lblNewLabel_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addGap(9)
							.addComponent(lblVista, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(31)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(11)
									.addComponent(lblNum, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_1_1)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(34)
							.addComponent(lblCod)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(11)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1_1_1)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(11)
									.addComponent(lblMax, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_1_1_1_1)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(14)
							.addComponent(lblCama)))
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1_1_1_1_1)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(11)
							.addComponent(lblBanheira, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_1_1_1_1_1_1)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(11)
							.addComponent(lblFrigobar, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(11)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1_1_1_1_1_1_1_1)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(11)
									.addComponent(lblAndar, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_1_1_1_1_1_1_1_1_1)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(14)
							.addComponent(lblVista)))
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1_1_1_1_1_1_1)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(11)
							.addComponent(lblTam, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_1_1_1_1_1_1_1_1_1_1_1)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(11)
							.addComponent(lblPreco, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(11)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1)
								.addComponent(lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(11)
									.addComponent(lblLimpeza, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
							.addGap(11)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1_1_1_1_1_1_1_1_1_1)
								.addComponent(lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1_1)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(14)
							.addComponent(lblStatus)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textAreaDesc, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
						.addComponent(textAreaComentarios, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
