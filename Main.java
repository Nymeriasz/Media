package Media;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Pamella", 20);
        Aluno a2 = new Aluno("Maria", 19);
        Aluno a3 = new Aluno("Maia", 18);

        Turma turma = new Turma();
        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);

        a1.Media(9.4,7.5);
        a2.Media(4.5,5.3);

        System.out.println("Aluno 1: " + a1.getNome() + ", " + a1.getIdade() + ", media=" + a1.getMedia());
        System.out.println("Aluno 2: " + a2.getNome() + ", " + a2.getIdade() + ", media=" + a2.getMedia());

        turma.deletatarAluno("Maia");
        turma.buscarAluno("Maria");


    }
}
