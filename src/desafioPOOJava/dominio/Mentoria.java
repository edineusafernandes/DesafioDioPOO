package desafioPOOJava.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    @Override
    public double calcularXp() {
        return xP_PADRAO + 20;
    }

    public Mentoria() {

    }

    @Override
    public String toString() {
        return "Mentoria [Titulo = " + getTitulo() +
                ", Descrição = " + getDescricao() +
                ", Data = " + data + "]";
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

}
