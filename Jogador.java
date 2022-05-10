package atv1;
//criando a classe Jogador
public class Jogador {

    //Criando três atributos: pontuacao, do tipo double; nome, do tipo String; ativado, do tipo bool.

    private double pontuacao;
    private String nome;
    private boolean ativado;

    public Jogador(String nome, int pontuacao, boolean ativado){
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.ativado = ativado;

    }
    // Métodos getters e setters
    public double getPontuacao() {
        return pontuacao;
    }
    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean isAtivado(){
        return ativado;
    }
    public void setAtivado(boolean ativado){
        this.ativado = ativado;
    }
}