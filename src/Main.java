import java.time.LocalDate;

import desafioPOOJava.dominio.Mentoria;
import desafioPOOJava.dominio.Bootcamp;
import desafioPOOJava.dominio.Curso;
import desafioPOOJava.dominio.Dev;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Jogos");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Apps");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria I");
        mentoria.setDescricao("Seja Dev");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEdineusa = new Dev();
        devEdineusa.setNome("Edineusa");
        devEdineusa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos - Edineusa: " + devEdineusa.getConteudosInscritos());
        devEdineusa.progredir();
        devEdineusa.progredir();
        devEdineusa.progredir();
        System.out.println("-----------*-----------");
        System.out.println("Conteúdos inscritos - Edineusa: " + devEdineusa.getConteudosInscritos());
        System.out.println("Conteúdos concluídos - Edineusa: " + devEdineusa.getConteudosConcluidos());
        System.out.println("XP: " + devEdineusa.calcularTotalXp());

        System.out.println("########################################");

        Dev devMario = new Dev();
        devMario.setNome("Edineusa");
        devMario.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos - Mário: " + devMario.getConteudosInscritos());
        devMario.progredir();
        System.out.println("-----------*-----------");
        System.out.println("Conteúdos inscritos - Mário: " + devMario.getConteudosInscritos());
        System.out.println("Conteúdos concluídos - Mário: " + devMario.getConteudosConcluidos());
        System.out.println("XP: " + devMario.calcularTotalXp());

    }

}
