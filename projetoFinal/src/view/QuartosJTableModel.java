package view;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import model.Quarto;

public class QuartosJTableModel extends AbstractTableModel{
	
	private ArrayList<Quarto> lista;
	private String[] colunas ={"Número", "Código", "Máximo Hóspedes", "Cama", "Banheira", "Frigobar", "Vista", "Preço", "Status"};
	
	public QuartosJTableModel(ArrayList<Quarto> lista) {
		this.lista = lista;
	}
	@Override
	public int getRowCount() {
		return this.lista.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Quarto q = lista.get(rowIndex);
		if(columnIndex == 0) {
			return q.getNumero();
		} else if(columnIndex == 1) {
			return q.getCodigo();
		} else if(columnIndex == 2) {
			return q.getMaxHospedes();
		} else if(columnIndex == 3) {
			return q.getCama();
		} else if(columnIndex == 4) {
			if (q.isBanheira() == true) {
				return "sim";
			} else {
				return "não";
			}
		} else if(columnIndex == 5) {
			if (q.isFrigobar() == true) {
				return "sim";
			} else {
				return "não";
			}
		} else if(columnIndex == 6) {
			return q.getVista();
		} else if(columnIndex == 7) {
			return "R$" + q.getPreco();
		} else if(columnIndex == 8) {
			return q.getStatus();
		} 
		return null;
	}
	
	@Override
	public String getColumnName(int column) {
		return colunas[column];
	}

}
