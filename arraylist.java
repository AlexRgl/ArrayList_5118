import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    static ArrayList<Formando> osFormandos = new ArrayList<>();
    static ArrayList<disciplinas> asDisciplinas = new ArrayList<>();
    static ArrayList<cursos> osCursos = new ArrayList<>();
    static Continuar continuar = new Continuar();
    static ArrayList<inscricoes> asinscricoes = new ArrayList<>();
    static ArrayList<cudi> ascudi = new ArrayList<>();

    public static void main(String[] args) {
        int idFormando = 1;
        int idCurso = 1;
        Scanner sc = new Scanner(System.in);
        ArrayList<Formando> lista = new ArrayList<>();
        Continuar continuar = new Continuar();
        showMenu menus = new showMenu();
        ArrayList<cursos> lista2 = new ArrayList<>();

        int escolha = 0;
        int escolhasec = 0;

        do {
            escolha = menus.showMenuPrincipal();
            switch (escolha) {
            case 1:
                do {
                    escolhasec = menus.showMenuSecundário("Formando");
                    switch (escolhasec) {
                    case 1:
                        inserirFormando();
                        break;
                    case 2:
                        modificarFormando();
                        break;
                    case 3:
                        eliminarFormando();
                        break;
                    case 4:
                        for (Formando osFormandos : osFormandos) {
                            System.out.println(osFormandos.toString());
                        }
                        break;
                    }
                } while (escolhasec != 9);
                break;
            case 2:
                do {
                    escolhasec = menus.showMenuSecundário("Curso");
                    switch (escolhasec) {
                    case 1:
                        inserirCurso();
                        break;
                    case 2:
                        modificarCurso();
                        break;
                    case 3:
                        eliminarCurso();
                        break;
                    case 4:
                        for (cursos osCursos : osCursos) {
                            System.out.println(osCursos.toString());
                        }
                        break;
                    }
                } while (escolhasec != 9);
                break;
            case 3:
                do {
                    escolhasec = menus.showMenuSecundário("Disciplina");
                    switch (escolhasec) {
                    case 1:
                        inserirDisciplina();
                        break;
                    case 2:
                        modificarDisciplina();
                        break;
                    case 3:
                        eliminarDisciplina();
                        break;
                    case 4:
                        for (disciplinas asDisciplinas : asDisciplinas) {
                            System.out.println(asDisciplinas.toString());
                        }
                        break;
                    }
                } while (escolhasec != 9);
                break;
            case 4:
                do {
                    escolhasec = menus.showMenuInscriçao("Inscrição");
                    switch (escolhasec) {
                    case 1:
                        inscriçãoFazer();
                        break;
                    case 2:
                        inscricaoeliminar();
                        break;
                    case 3:
                        for (inscricoes asinscricoes : asinscricoes) {
                            System.out.println(asinscricoes.toString());
                        }
                        break;
                    }
                } while (escolhasec != 9);
            case 5:
                do {
                    escolhasec = menus.showMenuInscriçao("Add Disciplina");
                    switch (escolhasec) {
                    case 1:
                        addDisciplina();
                        break;
                    case 2:
                        removeDisciplina();
                        break;
                    case 3:
                        for (cudi ascudi : ascudi) {
                            System.out.println(ascudi.toString());
                        }
                        break;
                    }
                } while (escolhasec != 9);
            }
        } while (escolha != 9);

    }

    private static void addDisciplina() {
        Continuar continuar = new Continuar("Queres adicionar mais um?");
        Scanner sc = new Scanner(System.in);
        do {
            cudi asdi = new cudi();
            for (cursos osCursos : osCursos) {
                System.out.println(osCursos.toString());
            }
            System.out.println("ID do Curso:");
            int id = sc.nextInt();
            asdi.setIdCurso(id);
            for (disciplinas asDisciplinas : asDisciplinas) {
                System.out.println(asDisciplinas.toString());
            }

            System.out.println("ID da Disciplina:");
            int idF = sc.nextInt();
            asdi.setIdDisciplinas(idF);
            disciplinas disci = asDisciplinas.get(id - 1);
            asdi.setNome(disci.getNome());
            ascudi.add(asdi);
        } while (continuar.perguntar());
    }

    private static void removeDisciplina() {
        disciplinas asdi = new disciplinas();
        if (asDisciplinas.size() == 0) {
            System.out.println("Não há nada para apagar!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (disciplinas asDisciplinas : asDisciplinas) {
                System.out.println(asDisciplinas.toString());
            }
            System.out.println("ID da inscriçao:");
            int id = sc.nextInt();
            if (id > 0 && id <= asDisciplinas.size()) {
                if (asDisciplinas.size() == 0) {
                    System.out.println("No Curso");
                } else {
                    ascudi.remove(id - 1);
                   
                    System.out.println("Curso com o id " + id + " foi removido");
                    for (disciplinas f : asDisciplinas) {
                        System.out.println(f.toString());
                    }
                }
            } else {
                System.out.println("Nao existe um curso com esse id");
            }
        }
    }

    private static void inscricaoeliminar() {
        inscricoes Inscricao = new inscricoes();
        if (asinscricoes.size() == 0) {
            System.out.println("Não há nada para apagar!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (inscricoes asinscricoes : asinscricoes) {
                System.out.println(asinscricoes.toString());
            }
            System.out.println("ID da inscriçao:");
            int id = sc.nextInt();
            if (id > 0 && id <= asinscricoes.size()) {
                if (asinscricoes.size() == 0) {
                    System.out.println("No Curso");
                } else {
                    asinscricoes.remove(id - 1);
                    System.out.println("Curso com o id " + id + " foi removido");
                    for (inscricoes f : asinscricoes) {
                        System.out.println(f.toString());
                    }
                }
            } else {
                System.out.println("Nao existe um curso com esse id");
            }
        }
    }

    private static void inscriçãoFazer() {
        Continuar continuar = new Continuar("Queres adicionar mais um?");
        Scanner sc = new Scanner(System.in);
        do {
            inscricoes Inscricao = new inscricoes();
            for (cursos osCursos : osCursos) {
                System.out.println(osCursos.toString());
            }
            System.out.println("ID do Curso:");
            int id = sc.nextInt();
            Inscricao.setIdCurso(id);
            for (Formando osFormandos : osFormandos) {
                System.out.println(osFormandos.toString());
            }

            System.out.println("ID do Formando:");
            int idF = sc.nextInt();
            Inscricao.setIdFormando(idF);
            cursos cursos = osCursos.get(id - 1);
            Inscricao.setNome(cursos.getNome());
            Formando formando = osFormandos.get(idF - 1);
            Inscricao.setNomef(formando.getNomef());
            asinscricoes.add(Inscricao);
        } while (continuar.perguntar());
    }

    private static void eliminarDisciplina() {
        disciplinas Disciplinas = new disciplinas();
        if (asDisciplinas.size() == 0) {
            System.out.println("Não há Disciplinas!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (disciplinas asDisciplinas : asDisciplinas) {
                System.out.println(asDisciplinas.toString());
            }
            System.out.println("ID da Disciplina:");
            int id = sc.nextInt();
            if (id > 0 && id <= asDisciplinas.size()) {
                if (asDisciplinas.size() == 0) {
                    System.out.println("No Formando");

                } else {

                    asDisciplinas.remove(id - 1);

                    iddisci = 1;
                    int j = asDisciplinas.size();
                    for (int x = 1; x < j + 1; x++) {
                        Disciplinas = asDisciplinas.get(x - 1);
                        Disciplinas.setIdDisciplinas(iddisci++);
                    }
                    System.out.println("Disciplina com o id " + id + " foi removida");
                    for (disciplinas f : asDisciplinas) {
                        System.out.println(f.toString());
                    }
                }
            } else {
                System.out.println("Nao existe um curso com esse id");
            }

        }
    }

    private static void modificarDisciplina() {
        int idDisciplinas = 1;
        if (asDisciplinas.size() == 0) {
            System.out.println("Não há Disciplinas!");
        } else {
            Scanner sc = new Scanner(System.in);

            System.out.println(asDisciplinas.toString());

            System.out.println("ID da Disciplina:");
            int id = sc.nextInt();
            try {
                disciplinas aDisciplinas = asDisciplinas.get(id - 1);
                String nome = sc.nextLine();
                System.out.println("Nome da Disciplina:");
                aDisciplinas.setNome(sc.nextLine());
                if (!nome.isEmpty())
                    aDisciplinas.setNome(sc.nextLine());

                System.out.println("Quantas horas:");
                aDisciplinas.setHoras(sc.nextInt());

            } catch (Exception e) {
                System.out.println("A Disciplinas " + id + " não existe");
            }
        }
    }

    static int iddisci = 1;

    private static void inserirDisciplina() {
        Scanner sc = new Scanner(System.in);
        disciplinas Disciplinas = new disciplinas();
        sc = new Scanner(System.in);
        Disciplinas.setIdDisciplinas(iddisci++);
        System.out.println("Nome da Disciplina:");
        Disciplinas.setNome(sc.nextLine());
        System.out.println("Quantas horas:");
        Disciplinas.setHoras(sc.nextInt());
        asDisciplinas.add(Disciplinas);
    }

    private static void eliminarCurso() {
        cursos cursos = new cursos();
        if (osCursos.size() == 0) {
            System.out.println("Não há Cursos!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (cursos oCursos : osCursos) {
                System.out.println(oCursos.toString());
            }
            System.out.println("ID do Curso:");
            int id = sc.nextInt();
            if (id > 0 && id <= osCursos.size()) {
                if (osCursos.size() == 0) {
                    System.out.println("No Curso");
                } else {
                    osCursos.remove(id - 1);
                    idCurso = 1;
                    int j = osCursos.size();
                    for (int x = 1; x < j + 1; x++) {
                        cursos = osCursos.get(x - 1);
                        cursos.setIdCurso(idCurso++);
                    }
                    System.out.println("Curso com o id " + id + " foi removido");
                    for (cursos f : osCursos) {
                        System.out.println(f.toString());
                    }
                }
            } else {
                System.out.println("Nao existe um curso com esse id");
            }

        }
    }

    private static void eliminarFormando() {
        Formando formando = new Formando();
        if (osFormandos.size() == 0) {
            System.out.println("Não há Formandos!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Formando osFormandos : osFormandos) {
                System.out.println(osFormandos.toString());
            }
            System.out.println("ID do Formando:");
            int id = sc.nextInt();
            if (id > 0 && id <= osFormandos.size()) {
                if (osFormandos.size() == 0) {
                    System.out.println("Nao Formando");

                } else {
                    osFormandos.remove(id - 1);
                    idFormando = 1;
                    int j = osFormandos.size();
                    for (int x = 1; x < j + 1; x++) {
                        formando = osFormandos.get(x - 1);
                        formando.setIdFormando(idFormando++);
                    }
                    System.out.println("Formando com o id " + id + " foi removido");
                    for (Formando f : osFormandos) {
                        System.out.println(f.toString());
                    }
                }
            } else {
                System.out.println("Nao existe um curso com esse id");
            }

        }
    }

    private static void modificarCurso() {
        int idCurso = 1;
        if (osCursos.size() == 0) {
            System.out.println("Não há Cursos!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (cursos oCursos : osCursos) {
                System.out.println(oCursos.toString());
            }

            System.out.println("ID do Curso:");
            int id = sc.nextInt();
            try {
                cursos cursos = osCursos.get(id - 1);
                String nome = sc.nextLine();
                System.out.println("Nome do Curso:");
                cursos.setNome(sc.nextLine());
                if (!nome.isEmpty())
                    cursos.setNome(sc.nextLine());

                System.out.println("Quantas horas:");
                cursos.setHoras(sc.nextInt());

            } catch (Exception e) {
                System.out.println("O formando " + id + " não existe");
            }
        }
    }

    private static void modificarFormando() {
        if (osFormandos.size() == 0) {
            System.out.println("Não há formandos!");
        } else {
            Scanner sc = new Scanner(System.in);
            for (Formando oFormando : osFormandos) {
                System.out.println(oFormando.toString());
            }

            System.out.println("ID do formando:");
            int id = sc.nextInt();
            try {
                Formando formando = osFormandos.get(id - 1);
                System.out.println("Nome do formando:");
                String nome = sc.nextLine();
                String nomeF = formando.getNomef();
                nome = sc.nextLine();
                if (!nome.isEmpty()) {
                    formando.setNomef(nome);
                } else {
                    formando.setNomef(nomeF);
                }
                System.out.println("Masculino (True/False):");
                formando.setMasculino(sc.nextBoolean());

                System.out.println("Telefone:");
                formando.setTelefones(sc.nextInt());

            } catch (Exception e) {
                System.out.println("O formando " + id + " não existe");
            }
        }
    }

    static int idCurso = 1;

    private static void inserirCurso() {
        Scanner sc = new Scanner(System.in);
        cursos cursos = new cursos();
        sc = new Scanner(System.in);
        cursos.setIdCurso(idCurso++);
        System.out.println("Nome do Curso:");
        cursos.setNome(sc.nextLine());
        System.out.println("Quantas horas:");
        cursos.setHoras(sc.nextInt());
        osCursos.add(cursos);
    }

    static int idFormando = 1;

    private static void inserirFormando() {
        Scanner sc = new Scanner(System.in);
        Formando formando = new Formando();
        sc = new Scanner(System.in);
        formando.setIdFormando(idFormando++);
        System.out.println("Nome do formando:");
        formando.setNomef(sc.nextLine());
        System.out.println("Masculino (True/False):");
        formando.setMasculino(sc.nextBoolean());
        System.out.println("Telefone:");
        formando.setTelefones(sc.nextInt());

        osFormandos.add(formando);
    }
}