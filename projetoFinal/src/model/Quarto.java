package model;

import java.util.Date;

public class Quarto {

	private int numero; 
	private String cama;
	private int maxHospedes;
	private boolean frigobar;
	private boolean banheira;
	private float preco;
	private String descricao;
	private float tamanho; 
	private int andar; 
	private String vista;
	private String status;
	private int dataLimpeza;
	private String comentarios; 
	private String codigo;
	
	
	
	public Quarto(int numero, String cama, int maxHospedes, boolean frigobar, boolean banheira, float preco,
			float tamanho, int andar, String vista, String status, int dataLimpeza, String codigo) {
		super();
		this.numero = numero;
		this.cama = cama;
		this.maxHospedes = maxHospedes;
		this.frigobar = frigobar;
		this.banheira = banheira;
		this.preco = preco;
		this.tamanho = tamanho;
		this.andar = andar;
		this.vista = vista;
		this.status = status;
		this.dataLimpeza = dataLimpeza;
		this.codigo = codigo;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getMaxHospedes() {
		return maxHospedes;
	}
	public void setMaxHospedes(int maxHospedes) {
		this.maxHospedes = maxHospedes;
	}
	public boolean isFrigobar() {
		return frigobar;
	}
	public void setFrigobar(boolean frigobar) {
		this.frigobar = frigobar;
	}
	public boolean isBanheira() {
		return banheira;
	}
	public void setBanheira(boolean banheira) {
		this.banheira = banheira;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	public int getDataLimpeza() {
		return dataLimpeza;
	}
	public void setDataLimpeza(int dataLimpeza) {
		this.dataLimpeza = dataLimpeza;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCama() {
		return cama;
	}
	public void setCama(String cama) {
		this.cama = cama;
	}
	public int getAndar() {
		return andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}
	public String getVista() {
		return vista;
	}
	public void setVista(String vista) {
		this.vista = vista;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
