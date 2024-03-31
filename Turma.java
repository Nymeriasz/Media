package Media;

import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos;

    public Turma(){
        alunos = new ArrayList<>();
    }
    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public Aluno buscarAluno(String nome){ //metodo de busca
        for (Aluno aluno:alunos) {
            if (aluno.getNome().equals(nome)){
                System.out.println("Encontrado");
                return aluno;
            }
        }
        return null; //caso o aluno não seja encontrado
    }
    public void deletatarAluno(String nome){
        Aluno aluno = buscarAluno(nome);
        if (aluno!=null){
            alunos.remove(aluno);
            System.out.println(nome+" removido");
        }else{
            System.out.println(nome+" não encontrado");
        }
    }
}
