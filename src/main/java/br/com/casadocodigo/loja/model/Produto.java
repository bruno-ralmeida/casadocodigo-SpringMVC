package br.com.casadocodigo.loja.model;

public class Produto {
	private String titulo;
	private String descricao;
	private int paginas;
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public int getPaginas() {
		return paginas;
	}

	@Override
	public String toString() {
		return "Produto [titulo=" + titulo + ", descricao=" + descricao + ", paginas=" + paginas + "]";
	}
}
