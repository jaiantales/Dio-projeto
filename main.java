package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {

        //Inserção do Curso1
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição do Curso de JAVA");
        curso1.setCargaHoraria(8);

        //Inserção do Curso1
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do Curso de JavaScript ");
        curso2.setCargaHoraria(4);

        //Inserção da Metoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Descrição da mentoria de JAVA");
        mentoria.setData(LocalDate.now());

        //Criação do Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJaian = new Dev();
        devJaian.setNome("Camila");
        devJaian.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devJaian.getConteudosInscritos());
        devJaian.progredir();
        devJaian.progredir();
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Conteúdos Inscritos Camila:" + devJaian.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devJaian.getConteudosConcluidos());
        System.out.println("XP:" + devJaian.calcularTotalXp());

        System.out.println("*************************************************************************************************");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}

