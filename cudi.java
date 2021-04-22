
public class cudi {
    private int idCurso;
    private int idDisciplinas;
    private String nome;
    

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdDisciplinas() {
        return idDisciplinas;
    }

    public void setIdDisciplinas(int idDisciplinas) {
        this.idDisciplinas = idDisciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public cudi() {
        this.idCurso = idCurso;
        this.idDisciplinas = idDisciplinas;
        this.nome = nome;

    }

    @Override
    public String toString() {
        return ", idCurso=" + idCurso + ", idDisciplinas=" + idDisciplinas + ", nome=" + nome
                + "]";
    }
}
