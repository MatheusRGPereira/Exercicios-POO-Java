package br.com.generation.colections;

public class Aula {

	@Override
	public String toString() {
		return " titulo: " + titulo + " tempo: " + tempo;
	}
	private String titulo;
	private int tempo;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
}
