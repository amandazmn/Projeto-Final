package view;

import java.awt.EventQueue;

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

public class DetalhesQuarto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public DetalhesQuarto(Quarto quartoSelecionado) {
		setFont(new Font("Ebrima", Font.PLAIN, 18));
		setTitle("Detalhes do quarto");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DetalhesQuarto.class.getResource("/images/Icone.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 583, 588);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(217, 217, 217));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(DetalhesQuarto.class.getResource("/images/DetalhesQuarto.png")));
		lblNewLabel.setBounds(10, 0, 597, 132);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Número:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(74, 163, 81, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Código:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(338, 163, 81, 28);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Max. Hóspedes:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(19, 202, 136, 28);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Cama:");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(333, 202, 87, 28);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Banheira:");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1.setBounds(19, 241, 136, 28);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Frigobar:");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1.setBounds(313, 241, 106, 28);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Tamanho:");
		lblNewLabel_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(19, 319, 136, 28);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Andar:");
		lblNewLabel_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(19, 280, 136, 28);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel("Vista:");
		lblNewLabel_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1_1_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1_1_1_1.setBounds(360, 280, 59, 28);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1 = new JLabel("Descrição:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setBounds(19, 397, 136, 28);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Preço:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1.setBounds(353, 319, 66, 28);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Status:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(19, 358, 136, 28);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Última limpeza:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(283, 358, 136, 28);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Comentários:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Ebrima", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(283, 397, 136, 28);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNum = new JLabel(" ");
		lblNum.setText(String.valueOf(quartoSelecionado.getNumero()));
		lblNum.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblNum.setBounds(167, 174, 46, 14);
		contentPane.add(lblNum);
		
		JLabel lblMax = new JLabel(" ");
		lblMax.setText(String.valueOf(quartoSelecionado.getMaxHospedes()));
		lblMax.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblMax.setBounds(165, 213, 46, 14);
		contentPane.add(lblMax);
		
		JLabel lblBanheira = new JLabel(" ");
		lblBanheira.setText(String.valueOf(quartoSelecionado.isBanheira()));
		lblBanheira.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblBanheira.setBounds(165, 252, 46, 14);
		contentPane.add(lblBanheira);
		
		JLabel lblAndar = new JLabel(" ");
		lblAndar.setText(String.valueOf(quartoSelecionado.getAndar()));
		lblAndar.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblAndar.setBounds(165, 291, 46, 14);
		contentPane.add(lblAndar);
		
		JLabel lblTam = new JLabel(" ");
		lblTam.setText(String.valueOf(quartoSelecionado.getTamanho()));
		lblTam.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblTam.setBounds(165, 330, 46, 14);
		contentPane.add(lblTam);
		
		JLabel lblStatus = new JLabel(" ");
		lblStatus.setText(String.valueOf(quartoSelecionado.getStatus()));
		lblStatus.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblStatus.setBounds(165, 369, 87, 14);
		contentPane.add(lblStatus);
		
		JLabel lblDesc = new JLabel(" ");
		lblDesc.setVerticalAlignment(SwingConstants.TOP);
		lblDesc.setText(String.valueOf(quartoSelecionado.getDescricao()));
		lblDesc.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblDesc.setBounds(74, 439, 161, 76);
		contentPane.add(lblDesc);
		
		JLabel lblComentario = new JLabel(" ");
		lblComentario.setVerticalAlignment(SwingConstants.TOP);
		lblComentario.setText(String.valueOf(quartoSelecionado.getComentarios()));
		lblComentario.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblComentario.setBounds(313, 436, 161, 76);
		contentPane.add(lblComentario);
		
		JLabel lblCod = new JLabel(" ");
		lblCod.setText(String.valueOf(quartoSelecionado.getCodigo()));
		lblCod.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblCod.setBounds(428, 174, 46, 14);
		contentPane.add(lblCod);
		
		JLabel lblCama = new JLabel(" ");
		lblCama.setText(String.valueOf(quartoSelecionado.getCama()));
		lblCama.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblCama.setBounds(428, 213, 106, 14);
		contentPane.add(lblCama);
		
		JLabel lblFrigobar = new JLabel(" ");
		lblFrigobar.setText(String.valueOf(quartoSelecionado.isFrigobar()));
		lblFrigobar.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblFrigobar.setBounds(428, 252, 46, 14);
		contentPane.add(lblFrigobar);
		
		JLabel lblVista = new JLabel(" ");
		lblVista.setText(String.valueOf(quartoSelecionado.getVista()));
		lblVista.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblVista.setBounds(428, 291, 106, 14);
		contentPane.add(lblVista);
		
		JLabel lblPreco = new JLabel(" ");
		lblPreco.setText("R$" + String.valueOf(quartoSelecionado.getPreco()));
		lblPreco.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblPreco.setBounds(428, 330, 106, 14);
		contentPane.add(lblPreco);
		
		JLabel lblLimpeza = new JLabel(" ");
		lblLimpeza.setText(String.valueOf(quartoSelecionado.getDataLimpeza()));
		lblLimpeza.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblLimpeza.setBounds(428, 369, 106, 14);
		contentPane.add(lblLimpeza);
	}

}
