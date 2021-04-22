

public class disciplinas {
int idDisciplinas;
String nome;
int horas;
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
public int getHoras() {
    return horas;
}
public void setHoras(int horas) {
    this.horas = horas;
}
public disciplinas() {
    this.idDisciplinas = idDisciplinas;
    this.nome = nome;
    this.horas = horas;
}
@Override
public String toString() {
    return "disciplinas [horas=" + horas + ", idDisciplinas=" + idDisciplinas + ", nome=" + nome + "]";
}

}
