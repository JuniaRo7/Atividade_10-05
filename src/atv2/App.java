package atv2;

public class App {

    public static void main(String[] args) {
        // criar um objeto de Produto
        Produto prod1 = new Produto(111, 1200.00, "PC da Positivo");
        // criar  um objeto ItemPedido
        ItemPedido itemProd1 = new ItemPedido(5, prod1);

       
        //Imprimir dados do Projeto que está em ItemPedido
        System.out.println("Descrição: "+ itemProd1 
                                        .getProduto()     
                                        .getDescricao()       
        );

        System.out.println("Valor Total: "+ itemProd1 
                                          .getProduto()     
                                          .getValor() * 
                                          itemProd1
                                          .getQuantidade()     
);

        //criar um objeto do tipo Pedido 
        Pedido pedido = new Pedido();
        //adicionar um ItemPedido ao Pedido
        pedido.adicionarItem(itemProd1);
        //imprimir o valor total
        System.out.println("Valor total: "+ pedido.obterTotal());
    }
    
}
