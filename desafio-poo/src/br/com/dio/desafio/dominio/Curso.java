package br.com.dio.desafio.dominio;


public class Curso extends Conteudo {
	
	private int cargaHoraria;
	
	public Curso() {
		
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [cargaHoraria=" + cargaHoraria + ", calcularXp()=" + calcularXp() + ", getTitulo()=" + getTitulo()
				+ ", getDescricao()=" + getDescricao() + "]";
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}

	
	
	
	
	
	
		
	
}


	
	
	