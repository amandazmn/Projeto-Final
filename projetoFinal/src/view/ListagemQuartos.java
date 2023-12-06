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
import javax.swing.table.DefaultTableModel;
import model.Quarto;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;


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
					frame.setExtendedState(MAXIMIZED_BOTH);
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
		setBounds(100, 100, 1420, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(217, 217, 217));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ListagemQuartos.class.getResource("/images/Logo.png")));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ListagemQuartos.class.getResource("/images/Hero block (2).png")));
		
		JLabel cadastrar = new JLabel("");
		cadastrar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
	
				CadastroQuarto cadastro = new CadastroQuarto(listaQuarto, janela);
				cadastro.setVisible(true);
				
			}
		});
		cadastrar.setIcon(new ImageIcon(ListagemQuartos.class.getResource("/images/Cadastrar.png")));
		
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
		
		JScrollPane scrollPane = new JScrollPane();
		
		table = new JTable();
		table.setBackground(new Color(255, 255, 255));
		table.setFont(new Font("Ebrima", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "N\u00FAmero", "M\u00E1ximo H\u00F3spedes", "Cama", "Banheira", "Frigobar", "Vista", "Pre\u00E7o", "Status"
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
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(33)
					.addComponent(lblNewLabel)
					.addGap(28)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(451)
					.addComponent(cadastrar, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
					.addGap(29)
					.addComponent(editar, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
					.addGap(29)
					.addComponent(excluir, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(detalhar, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
					.addGap(387))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(33)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 2086, Short.MAX_VALUE)
					.addGap(280))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(33)
							.addComponent(lblNewLabel_1)))
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(cadastrar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(editar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(excluir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(detalhar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(10)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
					.addGap(32))
		);
		contentPane.setLayout(gl_contentPane);
		
		
	}
	public void atualizarJTableModel() {
		table.setModel(new QuartosJTableModel(listaQuarto));
	}
		
}
