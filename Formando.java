
public class Formando {
    private int idFormando;
    private String nomef;
    private boolean masculino;
    private int telefones;
    public int getIdFormando() {
        return idFormando;
    }
    public void setIdFormando(int idFormando) {
        this.idFormando = idFormando;
    }
    public String getNomef() {
        return nomef;
    }
    public void setNomef(String nomef) {
        this.nomef = nomef;
    }
    public boolean isMasculino() {
        return masculino;
    }
    public void setMasculino(boolean masculino) {
        this.masculino = masculino;
    }
    public int getTelefones() {
        return telefones;
    }
    public void setTelefones(int telefones) {
        this.telefones = telefones;
    }
    public Formando() {
        this.idFormando = idFormando;
        this.nomef = nomef;
        this.masculino = masculino;
        this.telefones = telefones;
    }
    @Override
    public String toString() {
        return "Formando [idFormando=" + idFormando + ", masculino=" + masculino + ", nomef=" + nomef + ", telefones="
                + telefones + "]";
    }




}