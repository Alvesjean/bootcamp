package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		
		curso1.setTitulo("java");
		curso1.setDescricao("curso linguagem java");
		curso1.setCargaHoraria(72);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("php");
		curso2.setDescricao("curso linguagem php");
		curso2.setCargaHoraria(44);
		
		Mentoria mentoria1 = new Mentoria();
		
		mentoria1.setTitulo("mentoria java");
		mentoria1.setDescricao("tirando dúvidas sobre linguagem java");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcampJava = new Bootcamp();
		
		bootcampJava.setNome("java developer");
		bootcampJava.setDescricao("bootcamp formação completa java");
		bootcampJava.getConteudosBootcamp().add(curso1);
		bootcampJava.getConteudosBootcamp().add(curso2);
		bootcampJava.getConteudosBootcamp().add(mentoria1);
		
		Dev dev1 = new Dev();
		
		dev1.setNome("Bia");
		dev1.inscreverBootcamp(bootcampJava);
		System.out.println("conteúdos inscritos Bia " + dev1.getConteudosInscritos());
		dev1.progredir();
		System.out.println("conteúdos concluídos Bia " + dev1.getConteudosConcluidos());
		System.out.println("");
		System.out.println("");
		
		Dev dev2 = new Dev();
		
		dev2.setNome("João");
		dev2.inscreverBootcamp(bootcampJava);
		System.out.println("conteúdos inscritos João " + dev2.getConteudosInscritos());
		dev2.progredir();
		System.out.println("conteúdos concluídos João " + dev2.getConteudosConcluidos());
		dev2.progredir();
		dev2.progredir();
		System.out.println();
		System.out.println("conteúdos concluídos João " + dev2.getConteudosConcluidos());
		System.out.println("xp de João = " + dev2.calcularXpTotal());
		
		
		

	}

}
