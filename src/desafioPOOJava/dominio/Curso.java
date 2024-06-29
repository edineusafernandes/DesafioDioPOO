package desafioPOOJava.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return xP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    @Override
    public String toString() {
        return "Curso [Titulo = " + getTitulo() +
                ", Descrição = " + getDescricao() +
                ", Carga Horaria = " + cargaHoraria + "]";
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

}
