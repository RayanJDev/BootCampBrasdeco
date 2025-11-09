import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        var  primeiroCurso = new Curso();
        primeiroCurso.setTitulo("Curso Java 8");
        primeiroCurso.setDecricao("Iniciante");
        primeiroCurso.setCargaHoraria(8);

        var  segundoCurso = new Curso();
        segundoCurso.setTitulo("Curso Java 11");
        segundoCurso.setDecricao("Intermediario");
        segundoCurso.setCargaHoraria(11);

        var primeiraMentoria = new Mentoria();
        primeiraMentoria.setTitulo("DIO JAVA");
        primeiraMentoria.setDecricao("Ensinando Iniciantes");
        primeiraMentoria.setData(LocalDate.now());

        /*System.out.println(primeiroCurso);
        System.out.println(segundoCurso);
        System.out.println(primeiraMentoria);*/

        var bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(primeiroCurso);
        bootcamp.getConteudos().add(segundoCurso);
        bootcamp.getConteudos().add(primeiraMentoria);

        var devRayan = new Dev();
        devRayan.setNome("Rayan");
        devRayan.inscreverBootCamp(bootcamp);
        System.out.printf("Conteúdo Inscritos Rayan: %s\n", devRayan.getConteudosInscritos());
        devRayan.progredir();
        System.out.println("***");
        System.out.printf("Conteúdo Concluidos Amanda: %s\n", devRayan.getConteudosConcluidos());
        System.out.printf("XP: %s\n", devRayan.calcularTotalXp());
        System.out.println("________________________________");
        var devAmanda = new Dev();
        devAmanda.setNome("Amanda");
        devAmanda.inscreverBootCamp(bootcamp);
        System.out.printf("Conteúdo Inscritos Amanda: %s\n", devAmanda.getConteudosInscritos());
        devAmanda.progredir();
        System.out.println("***");
        System.out.printf("Conteúdo Concluidos Amanda: %s\n", devAmanda.getConteudosConcluidos());
        System.out.printf("XP: %s\n", devAmanda.calcularTotalXp());


    }
}
