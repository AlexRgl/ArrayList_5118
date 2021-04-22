public class inscricoes {
    private int idFormando;
    private int idCurso;
    private String nome;
    private String nomef;
    public int getIdFormando() {
        return idFormando;
    }
    public void setIdFormando(int idFormando) {
        this.idFormando = idFormando;
    }
    public int getIdCurso() {
        return idCurso;
    }
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNomef() {
        return nomef;
    }
    public void setNomef(String nomef) {
        this.nomef = nomef;
    }
    public inscricoes() {
        this.idFormando = idFormando;
        this.idCurso = idCurso;
        this.nome = nome;
        this.nomef = nomef;
    }
    @Override
    public String toString() {
        return "inscricoes [idCurso=" + idCurso  + ", nome=" + nome +  ", idFormando=" + idFormando +", nomef=" + nomef + "]";
    }
    
   
    
}