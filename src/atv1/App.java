package atv1;

public class App {
    public static void main(String[] args) throws Exception {

        //declare uma variável do tipo da classe criada
        Jogador jogador1;
        jogador1 = new Jogador( "Jogador 1", 500, true);

        //Inserindo valores no objeto de Jogador
        //jogador1.setNome("Jogador 1");
        //jogador1.setPontuacao(500);
        //jogador1.setAtivado(true);

        System.out.println(jogador1.getNome());
        System.out.println(jogador1.getPontuacao());
        System.out.println(jogador1.isAtivado());
    }
}