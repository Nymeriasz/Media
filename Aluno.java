package Media;

public class Aluno {
    private String nome;
    private int idade;
    private double media;

    public Aluno(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }

    public void Media(double n1, double n2){
        this.media = (n1+n2)/2;
    }
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getMedia() {
        return media;
    }
}
