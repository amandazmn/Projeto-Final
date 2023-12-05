package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

import model.Quarto;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;


public class ListagemQuartos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	ArrayList<Quarto> listaQuarto = new ArrayList<Quarto>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListagemQuartos frame = new ListagemQuartos();
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
	public ListagemQuartos() {
		setFont(new Font("Ebrima", Font.PLAIN, 18));
		setTitle("Quartos");
		ListagemQuartos janela = this;
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListagemQuartos.class.getResource("/images/Icone.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(217, 217, 217));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ListagemQuartos.class.getResource("/images/Logo.png")));
		lblNewLabel.setBounds(38, 11, 144, 184);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ListagemQuartos.class.getResource("/images/Quartos.png")));
		lblNewLabel_1.setBounds(210, 44, 1117, 119);
		contentPane.add(lblNewLabel_1);
		
		JLabel cadastrar = new JLabel("");
		cadastrar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
	
				CadastroQuarto cadastro = new CadastroQuarto(listaQuarto, janela);
				cadastro.setVisible(true);
				
			}
		});
		cadastrar.setIcon(new ImageIcon(ListagemQuartos.class.getResource("/images/Cadastrar.png")));
		cadastrar.setBounds(456, 218, 120, 34);
		contentPane.add(cadastrar);
		
		JLabel editar = new JLabel("");
		editar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Quarto quartoSelecionado = listaQuarto.get(table.getSelectedRow());
				
				EdicaoQuarto edicao = new EdicaoQuarto(listaQuarto, quartoSelecionado, janela);
				edicao.setVisible(true);
				
			}
		});
		editar.setIcon(new ImageIcon(ListagemQuartos.class.getResource("/images/Editar.png")));
		editar.setBounds(605, 218, 120, 34);
		contentPane.add(editar);
		
		JLabel excluir = new JLabel("");
		excluir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Quarto quartoSelecionado = listaQuarto.get(table.getSelectedRow());
				
				String texto = "Você deseja excluir o quarto " + quartoSelecionado.getNumero() + "?";
				String titulo = "Confirmar exclusão";
				int confirmacao = JOptionPane.showConfirmDialog(null, texto, titulo, JOptionPane.YES_NO_OPTION);
				if(confirmacao == 0) {
					listaQuarto.remove(table.getSelectedRow());
					atualizarJTableModel();
					JOptionPane.showMessageDialog(null, "O quarto " + quartoSelecionado.getNumero() + " foi excluído.");
				}
				if(confirmacao == 1) {
					JOptionPane.showMessageDialog(null, "O quarto " + quartoSelecionado.getNumero() + " não foi excluído.");
				}
			}
		});
		excluir.setIcon(new ImageIcon(ListagemQuartos.class.getResource("/images/Excluir.png")));
		excluir.setBounds(754, 218, 120, 34);
		contentPane.add(excluir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 279, 1289, 402);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "N\u00FAmero", "M\u00E1ximo H\u00F3spedes", "Cama", "Banheira", "Frigobar", "Tamanho", "Andar", "Vista", "Pre\u00E7o", "Status", "\u00DAltima limpeza"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel detalhar = new JLabel("");
		detalhar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Quarto quartoSelecionado = listaQuarto.get(table.getSelectedRow());
				
				DetalhesQuarto detalhes = new DetalhesQuarto(quartoSelecionado);
				detalhes.setVisible(true);
			}
		});
		detalhar.setIcon(new ImageIcon(ListagemQuartos.class.getResource("/images/Detalhar.png")));
		detalhar.setBounds(892, 218, 120, 34);
		contentPane.add(detalhar);
		
		
	}
	public void atualizarJTableModel() {
		table.setModel(new QuartosJTableModel(listaQuarto));
	}
		
}
